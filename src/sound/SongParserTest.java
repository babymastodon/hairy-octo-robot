package sound;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static sound.Letter.*;
import static sound.Accidental.*;


public class SongParserTest {

    // TODO: remove this function when done debugging
    @Test
    public void testParsePublic() {
        readSong("sample_abc/piece1.abc");
    }


    /**
     * Should not crash on this set of real-world examples.
     */
    @Test
    public void testRealWorldExamples(){
        File basedir = new File("sample_abc");
        for (File file: basedir.listFiles()){
            readSong(file.getPath());
        }
    }

    /**
     * The parser should accept the optional header
     * fields in any order.
     */
    @Test
    public void testHeaderOrder(){
        File basedir = new File("test_abc/header_order");
        for (File file: basedir.listFiles()){
            Song s = readSong(file.getPath());

            assertEquals(s.getTitle(), "Simple scale");
            assertEquals(s.getIndex(), 1);
            assertEquals(s.getBeatsPerMinute(), 120);
            assertEquals(s.getMeterNumerator(), 1);
            assertEquals(s.getMeterDenominator(), 4);
            assertEquals(s.getDefaultDuration(), new Duration(1,4));
            assertEquals(s.getComposer(), "Composer Name");
        }
    }

    /**
     * Should correctly handle valid whitespace in the header.
     *
     * Includes tabs, newlines, carriage returns, and spaces.
     */
    @Test
    public void testHeaderValidSpaces(){
        Song s = readSong("test_abc/header_valid_spaces.abc");

        //the title contains two invisible tab charactes
        assertEquals(s.getTitle(), "   	Simple	scale");
        assertEquals(s.getIndex(),  1);
        assertEquals(s.getBeatsPerMinute(),  1200);
        assertEquals(s.getBeatDuration(), new Duration(1,42));
        assertEquals(s.getMeterNumerator(),  4);
        assertEquals(s.getMeterDenominator(),  4);
        assertEquals(s.getDefaultDuration(), new Duration(1,4));
        //the title contains two invisible tab charactes
        assertEquals(s.getComposer(), "   	Unknown   	");
    }


    /**
     * Should throw error on invalid whitespace in the header.
     *
     * For example:
     *      whitespace before the header identifier
     *      whitespace before the colon
     *      newlines and carriage returns within expressions
     */
    @Test
    public void testHeaderInvalidSpaces(){
        File basedir = new File("test_abc/header_invalid_spaces");
        for (File file: basedir.listFiles()){
            shouldFailToParse(file.getPath());
        }
    }


    /**
     * Should throw error when required fields (X, T, K)
     * are missing or out of order.
     */
    @Test
    public void testHeaderMissingFields(){
        File basedir = new File("test_abc/header_missing_fields");
        for (File file: basedir.listFiles()){
            shouldFailToParse(file.getPath());
        }
    }

    /**
     * Should use the default meter (4/4) when not provided.
     */
    @Test
    public void testHeaderDefaultM(){
        Song s = readSong("test_abc/header_defaults/default_M.abc");
        assertEquals(s.getMeterNumerator(), 4);
        assertEquals(s.getMeterDenominator(), 4);
    }

    /**
     * Should use the default note length if not provided.
     *
     * The default note length is determined by the following
     * rule:
     *      
     *      If there is no 'L' field defined, a unit note length
     *      is set based on the meter: if it is less than 0.75 the
     *      default unit note length is a sixteenth note; if it is
     *      0.75 or greater, it is an eighth note. If neither 'M' nor
     *      'L' fields are present, the default note length is an eighth.
     */
    @Test
    public void testHeaderDefaultL(){
        Song s = readSong("test_abc/header_defaults/default_L_no_M.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,8));

        s = readSong("test_abc/header_defaults/default_L_with_M=11-16.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,16));

        s = readSong("test_abc/header_defaults/default_L_with_M=12-16.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,8));

        s = readSong("test_abc/header_defaults/default_L_with_M=13-16.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,8));
    }

    /**
     * Should use the default tempo if not provided.
     *
     * The default tempo is determined by the following
     * rule:
     *
     *      When the field 'Q' is omitted, the default value
     *      is 100 default-length notes (given by field 'L')
     *      per minute.
     */
    @Test
    public void testHeaderDefaultQ(){
        Song s = readSong("test_abc/header_defaults/default_Q.abc");
        assertEquals(s.getBeatsPerMinute(), 100);
        assertEquals(s.getBeatDuration(), new Duration(1,8));
    }


    /**
     * Should use the default composer if not provided.
     *
     * The default composer is determined by the following
     * rule:
     *
     *      When the field 'C' is omitted, any reasonable
     *      string will suffice (e.g. "Unknown").
     *
     */
    @Test
    public void testHeaderDefaultC(){
        Song s = readSong("test_abc/header_defaults/default_C.abc");
        assertNotNull(s.getComposer());
    }


    /**
     * Should recognize octave symbols.
     *
     * Valid octave identifiers:
     *      lowercase/capital letters
     *      arbitrarily long sequences of commas or apostrophes
     *
     */
    @Test
    public void testBodyOctaves(){
        Song s = readSong("test_abc/body_octaves.abc");
        Letter[] letters = {C, G, B, E, D, C, B, B, E, D};
        int[] octaves = {0 -1, -2, 1, 2, 1, 0, -1, 2, 3};

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        for (int i=0; i<10; i++){
            events.add(
                    new SoundEvent(
                        new Sound(new Pitch(letters[i], octaves[i])),
                        new Duration(1,1)));
        }

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should correctly parse durations.
     *
     * Valid Durations: "" "/m" "n" "n/m"
     *
     */
    @Test
    public void testBodyDurations(){
        Song s = readSong("test_abc/body_durations.abc");
        int[] numerators = {1, 5, 3, 1};
        int[] denominators = {1, 1, 8, 9};

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        for (int i=0; i<4; i++){
            events.add(
                    new SoundEvent(
                        new Sound(new Pitch(C, 1)),
                        new Duration(numerators[i], denominators[i])));
        }

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should correctly parse accidentals.
     *
     * Valid Accidentals: ^^ ^ = _ __
     *
     */
    @Test
    public void testBodyAccidentals(){
        Song s = readSong("test_abc/body_accidentals.abc");
        Accidental[] accidentals = {
            DOUBLE_SHARP, SHARP, NATURAL, FLAT, DOUBLE_FLAT, NONE};

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        for (int i=0; i<6; i++){
            events.add(
                    new SoundEvent(
                        new Sound(new Pitch(C, accidentals[i], 0)),
                        new Duration(1,1)));
        }

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should correctly parse a single note with an accidental,
     * an octave, and a duration modifier.
     *
     */
    @Test
    public void testBodyComplexNote(){
        Song s = readSong("test_abc/body_complex_note.abc");

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(A,SHARP,2)),
                    new Duration(1,5)));

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should correctly parse a single rest with duration.
     */
    @Test
    public void testBodyRests(){
        Song s = readSong("test_abc/body_rests.abc");

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        events.add(
                new SoundEvent(
                    new Sound(),
                    new Duration(4,19)));

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should correctly parse a single chord with accidentals,
     * and durations.
     *
     * Note, the duration of the entire chord should be the
     * duration of the first note times the duration of
     * the bracketed group of notes.
     */
    @Test
    public void testBodyChords(){
        Song s = readSong("test_abc/body_chords.abc");

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        events.add(
                new SoundEvent(
                    new Sound(Arrays.asList(
                        new Pitch(A,SHARP,-1),
                        new Pitch(A,DOUBLE_FLAT,3),
                        new Pitch(A,NATURAL,1))),
                    new Duration(7,5)));

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should parse a duplet with the proper durations.
     *
     * The duration of a SoundEvent in a duplet is equal
     * to 3/2 times is original duration.
     */
    @Test
    public void testBodyDuplet(){
        Song s = readSong("test_abc/body_duplet.abc");

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(C,SHARP)),
                    new Duration(3,8)));
        events.add(
                new SoundEvent(
                    new Sound(Arrays.asList(
                        new Pitch(C),
                        new Pitch(G))),
                    new Duration(21,2)));

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should parse a triplet with the proper durations.
     *
     * The duration of a SoundEvent in a triplet is equal
     * to 2/3 times is original duration.
     */
    @Test
    public void testBodyTriplet(){
        Song s = readSong("test_abc/body_triplet.abc");

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(F,FLAT,-1)),
                    new Duration(10,3)));
        events.add(
                new SoundEvent(
                    new Sound(Arrays.asList(
                        new Pitch(C),
                        new Pitch(G))),
                    new Duration(2,15)));
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(F)),
                    new Duration(2,3)));

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should parse a quadruplet with the proper durations.
     *
     * The duration of a SoundEvent in a quadruplet is equal
     * to 3/4 times is original duration.
     */
    @Test
    public void testBodyQuadruplet(){
        Song s = readSong("test_abc/body_quadruplet.abc");

        List<SoundEvent> events = new ArrayList<SoundEvent>();
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(A)),
                    new Duration(3,4)));
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(F,FLAT,1)),
                    new Duration(15,4)));
        events.add(
                new SoundEvent(
                    new Sound(Arrays.asList(
                        new Pitch(C),
                        new Pitch(G))),
                    new Duration(3,20)));
        events.add(
                new SoundEvent(
                    new Sound(new Pitch(F)),
                    new Duration(3,4)));

        Bar expected = new Bar(events);
        assertEquals(s.getBars(new Voice()), Arrays.asList(expected));
    }


    /**
     * Should parse a single repeated bar.
     */
    @Test
    public void testBodySimpleRepeat(){
        Song s = readSong("test_abc/body_repeat_simple.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 1);
        assertEquals(bars.get(0).getPrefix(), BarPrefix.BEGIN_REPEAT);
        assertEquals(bars.get(0).getSuffix(), BarSuffix.END_REPEAT);
    }


    /**
     * Should parse two repeated bars, where the
     * first bar does not have a repeat begin.
     */
    @Test
    public void testBodyTwoBarRepeat(){
        Song s = readSong("test_abc/body_repeat_two_bar.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getPrefix(), BarPrefix.NONE);
        assertEquals(bars.get(1).getSuffix(), BarSuffix.END_REPEAT);
        assertEquals(bars.get(1).getPrefix(), BarPrefix.NONE);
    }


    /**
     * Should parse a repeated segment where the first bar
     * of the repeated segment comes immediately after the
     * end of a section end.
     */
    @Test
    public void testBodyRepeatSectionEnd(){
        Song s = readSong("test_abc/body_repeat_section_end.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(0).getSuffix(), BarSuffix.END_SECTION);
        assertEquals(bars.get(2).getSuffix(), BarSuffix.END_REPEAT);
    }


    /**
     * Should parse the begin section identifier.
     */
    @Test
    public void testBodySectionBegin(){
        Song s = readSong("test_abc/body_section_begin.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 1);
        assertEquals(bars.get(0).getPrefix(), BarPrefix.BEGIN_SECTION);
    }


    /**
     * Should parse the FIRST_ENDING and SECOND_ENDING
     * identifiers inside a repeat without a beginning.
     */
    @Test
    public void testBodyRepeatEndingNumber(){
        Song s = readSong("test_abc/body_repeat_ending_number.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(1).getPrefix(), BarPrefix.FIRST_ENDING);
        assertEquals(bars.get(2).getPrefix(), BarPrefix.SECOND_ENDING);
        assertEquals(bars.get(2).getSuffix(), BarSuffix.END_SECTION);
    }


    /**
     * Test that lyrics are assigned to the proper bars
     * on the previous line when here are not enough lyrics
     * to fill the bar.
     *
     * In this situation, there should be fewer lyric
     * object in the bar than there are "notes". Blank
     * lyrics should not be created.
     */
    @Test
    public void testBodyLyricsBar(){
        Song s = readSong("test_abc/body_lyrics_bar.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc");
        assertEquals(bars.get(1).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "def");
    }


    /**
     * Test that bar symbol is ignored when there are enough
     * lyrics to fill the bar.
     */
    @Test
    public void testBodyLyricsSkipBar(){
        Song s = readSong("test_abc/body_lyrics_skip_bar.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getLyrics().size(), 2);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc");
        assertEquals(bars.get(0).getLyrics().get(1).getText(), "def");
        assertEquals(bars.get(1).getLyrics().size(), 2);
    }


    /**
     * Test that the lyrics automatically advance to the next bar
     * when there are enough lyrics to fill the current bar, including 
     * in the case of the last bar, where extra lyrics are discarded.
     */
    @Test
    public void testBodyLyricsNoBars(){
        Song s = readSong("test_abc/body_lyrics_no_bars.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().size(), 2);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "def");
        assertEquals(bars.get(1).getLyrics().get(1).getText(), "abc");
    }


    /**
     * Test that lyrics within a marked bar are truncated
     * if there are too many syllables.
     */
    @Test
    public void testBodyLyricsTruncateBar(){
        Song s = readSong("test_abc/body_lyrics_truncate_bar.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().size(), 2);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "abc");
        assertEquals(bars.get(1).getLyrics().get(1).getText(), "def");
    }


    /**
     * Test lyrics containing a hyphen.
     */
    @Test
    public void testBodyLyricsHyphen(){
        Song s = readSong("test_abc/body_lyrics_hyphen.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc-");
        assertEquals(bars.get(1).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "def");
    }


    /**
     * Test lyrics containing an underscore.
     *
     * An underscore is basically the same as a blank syllable "*".
     */
    @Test
    public void testBodyLyricsUnderscore(){
        Song s = readSong("test_abc/body_lyrics_underscore.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc");
        assertEquals(bars.get(1).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "");
        assertEquals(bars.get(2).getLyrics().size(), 1);
        assertEquals(bars.get(2).getLyrics().get(0).getText(), "def");
    }


    /**
     * Test lyrics containing a star.
     */
    @Test
    public void testBodyLyricsStar(){
        Song s = readSong("test_abc/body_lyrics_star.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc");
        assertEquals(bars.get(1).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "");
        assertEquals(bars.get(2).getLyrics().size(), 1);
        assertEquals(bars.get(2).getLyrics().get(0).getText(), "def");
    }


    /**
     * Test lyrics containing a tilde.
     */
    @Test
    public void testBodyLyricsTilde(){
        Song s = readSong("test_abc/body_lyrics_tilde.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 2);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc def");
        assertEquals(bars.get(1).getLyrics().size(), 0);
    }


    /**
     * Test lyrics containing an escaped hyphen.
     */
    @Test
    public void testBodyLyricsEscapedHyphen(){
        Song s = readSong("test_abc/body_lyrics_excaped_hypen.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "-abc-def");
        assertEquals(bars.get(1).getLyrics().size(), 0);
        assertEquals(bars.get(2).getLyrics().size(), 0);
    }


    /**
     * Test lyrics containing a double hyphen.
     */
    @Test
    public void testBodyLyricsDoubleHyphen(){
        Song s = readSong("test_abc/body_lyrics_double_hypen.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc-");
        assertEquals(bars.get(1).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "-");
        assertEquals(bars.get(2).getLyrics().size(), 1);
        assertEquals(bars.get(2).getLyrics().get(0).getText(), "def");
    }


    /**
     * Test lyrics containing a hyphen followed by an underscore.
     */
    @Test
    public void testBodyLyricsHyphenUnderscore(){
        Song s = readSong("test_abc/body_lyrics_hyphen_underscore.abc");
        List<Bar> bars = s.getBars(new Voice());
        assertEquals(bars.size(), 3);
        assertEquals(bars.get(0).getLyrics().size(), 1);
        assertEquals(bars.get(0).getLyrics().get(0).getText(), "abc-");
        assertEquals(bars.get(1).getLyrics().size(), 1);
        assertEquals(bars.get(1).getLyrics().get(0).getText(), "");
        assertEquals(bars.get(2).getLyrics().size(), 1);
        assertEquals(bars.get(2).getLyrics().get(0).getText(), "def");
    }


    /**
     * Test that the voice definitions in the header are parsed.
     */
    @Test
    public void testHeaderVoices(){
        Song s = readSong("test_abc/header_voices.abc");
        assertEquals(s.listVoices().size(), 3);
        assertTrue(s.listVoices().contains(" upper"));
        assertTrue(s.listVoices().contains("middle"));
        assertTrue(s.listVoices().contains("lower"));
    }


    /**
     * Test that the voices in the body are parsed properly.
     */
    @Test
    public void testBodyVoices(){
        Song s = readSong("test_abc/body_voices.abc");
        List<Bar> v1 = s.getBars(new Voice(" upper"));
        List<Bar> v2 = s.getBars(new Voice("lower"));

        List<Bar> expected_v1 = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)))),
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(B)),
                            new Duration(1,1)))));

        List<Bar> expected_v2 = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(C)),
                            new Duration(1,1))),
                    Arrays.asList(
                        new Lyric("moo"))),
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(D)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.NONE,
                    BarSuffix.END_REPEAT));

        assertEquals(v1, expected_v1);
        assertEquals(v2, expected_v2);
    }


    private void shouldFailToParse(String path){
        try{
            readSong(path);
        } catch (Exception e){
            return;
        }
        fail("ABC file " + path + " has syntax error, but the parser did not throw an error.");
    }

    private Song readSong(String path){
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            String contents = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(encoded)).toString();
            return new SongParser(contents).getSong();
        } catch (IOException e) {
            fail(e.toString());
        }
        return null;
    }
}
