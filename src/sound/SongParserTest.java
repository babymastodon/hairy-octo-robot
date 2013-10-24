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
                        new Duration(1,1)));
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
        assertEquals(bars.get(0).getBeginRepeat(), true);
        assertEquals(bars.get(0).getEndRepeat(), true);
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
        assertEquals(bars.get(0).getBeginRepeat(), false);
        assertEquals(bars.get(1).getEndRepeat(), false);
        assertEquals(bars.get(1).getEndRepeat(), true);
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
