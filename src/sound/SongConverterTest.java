package sound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import static sound.Letter.*;
import static sound.Accidental.*;

public class SongConverterTest {

    /**
     * Accidentals should be filled in by the key signature.
     */
    @Test
    public void testAccidentalsFilledByKey() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(C)),
                            new Duration(1,1)))));
        // Note: Test song is in the key of A major
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(1, output.size());
        assertEquals(1, output.get(0).getSound().getPitches().size());
        assertEquals(SHARP, output.get(0).getSound().getPitches().get(0).getAccidental());
    }


    /**
     * Accidentals should not affect notes in later bars.
     */
    @Test
    public void testAccidentalsNotAffectLaterBars() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A, SHARP)),
                            new Duration(1,1)))),
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
        assertEquals(1, output.get(0).getSound().getPitches().size());
        assertEquals(SHARP, output.get(0).getSound().getPitches().get(0).getAccidental());
        assertEquals(1, output.get(1).getSound().getPitches().size());
        assertEquals(NATURAL, output.get(1).getSound().getPitches().get(0).getAccidental());
    }


    /**
     * Accidentals should affect subsequent notes in the bar.
     */
    @Test
    public void testAccidentalsAffectLaterNotes() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A, SHARP)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(3, output.size());
        assertEquals(1, output.get(0).getSound().getPitches().size());
        assertEquals(SHARP, output.get(0).getSound().getPitches().get(0).getAccidental());
        assertEquals(1, output.get(1).getSound().getPitches().size());
        assertEquals(SHARP, output.get(1).getSound().getPitches().get(0).getAccidental());
        assertEquals(1, output.get(2).getSound().getPitches().size());
        assertEquals(SHARP, output.get(2).getSound().getPitches().get(0).getAccidental());
    }


    /**
     * Accidentals within the same bar should override each other.
     */
    @Test
    public void testAccidentalsOverrideEachOther() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A, FLAT)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A, NATURAL)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(3, output.size());
        assertEquals(1, output.get(0).getSound().getPitches().size());
        assertEquals(FLAT, output.get(0).getSound().getPitches().get(0).getAccidental());
        assertEquals(1, output.get(1).getSound().getPitches().size());
        assertEquals(NATURAL, output.get(1).getSound().getPitches().get(0).getAccidental());
        assertEquals(1, output.get(2).getSound().getPitches().size());
        assertEquals(NATURAL, output.get(2).getSound().getPitches().get(0).getAccidental());
    }


    /**
     * Notes in chords should have accidentals filled in.
     */
    @Test
    public void testAccidentalsInChords() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A, SHARP)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(Arrays.asList(
                                    new Pitch(A),
                                    new Pitch(C))),
                            new Duration(1,1)))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
        assertEquals(1, output.get(0).getSound().getPitches().size());
        assertEquals(SHARP, output.get(0).getSound().getPitches().get(0).getAccidental());
        assertEquals(2, output.get(1).getSound().getPitches().size());
        assertEquals(SHARP, output.get(1).getSound().getPitches().get(0).getAccidental());
        assertEquals(2, output.get(1).getSound().getPitches().size());
        assertEquals(SHARP, output.get(1).getSound().getPitches().get(1).getAccidental());
    }


    /**
     * Simple bar repitition should work.
     */
    @Test
    public void testSingleRepitition() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.BEGIN_REPEAT,
                    BarSuffix.END_REPEAT));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
    }


    /**
     * Should repeat from beginning if no BEGIN_REPEAT
     * is provided.
     */
    @Test
    public void testRepeatFromBeginning() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.NONE,
                    BarSuffix.END_REPEAT));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
    }


    /**
     * Should repeat from beginning of last major section
     * if no BEGIN_REPEAT is provided.
     */
    @Test
    public void testRepeatFromMajorSection() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.NONE,
                    BarSuffix.END_SECTION),
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.NONE,
                    BarSuffix.END_REPEAT));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(3, output.size());
    }


    /**
     * Should skip the first ending on the second repeat.
     */
    @Test
    public void testRepeatSkipFirstEnding() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.FIRST_ENDING,
                    BarSuffix.END_REPEAT),
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    BarPrefix.SECOND_ENDING,
                    BarSuffix.NONE));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
    }


    /**
     * Should properly handle multiple repeats in a row.
     *
     * A |] A :| A |] A :| A |: A |[1 A :|[2 A |: A :|
     */
    @Test
    public void testRepeatMultipleRepeats() {
        BarPrefix[] prefixes = {
            BarPrefix.NONE, BarPrefix.NONE, BarPrefix.NONE,
            BarPrefix.NONE, BarPrefix.NONE, BarPrefix.BEGIN_REPEAT,
            BarPrefix.FIRST_ENDING, BarPrefix.SECOND_ENDING, BarPrefix.BEGIN_REPEAT};
        BarSuffix[] suffixes = {
            BarSuffix.END_SECTION, BarSuffix.END_REPEAT, BarSuffix.END_SECTION,
            BarSuffix.END_REPEAT, BarSuffix.NONE, BarSuffix.NONE,
            BarSuffix.END_REPEAT, BarSuffix.NONE, BarSuffix.END_REPEAT};
        List<Bar> bars = new ArrayList<Bar>();
        for (int i=0; i<9; i++){
            bars.add(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    new ArrayList<Lyric>(),
                    prefixes[i],
                    suffixes[i]));
        }
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(13, output.size());
    }


    /**
     * Should assign lyrics to the proper notes
     *
     * A z A |
     * w: blah roar
     */
    @Test
    public void testLyricAlignment() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    Arrays.asList(
                        new Lyric("blah"),
                        new Lyric("roar"))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(3, output.size());
        assertEquals("blah", output.get(0).getLyric().getText());
        assertEquals("roar", output.get(2).getLyric().getText());
    }


    /**
     * Should ignore extra lyrics in the bar.
     */
    @Test
    public void testLyricExtraLyrics() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    Arrays.asList(
                        new Lyric("a"),
                        new Lyric("b"),
                        new Lyric("c"),
                        new Lyric("d"))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
        assertEquals("a", output.get(0).getLyric().getText());
        assertEquals("b", output.get(1).getLyric().getText());
    }


    /**
     * Should not assign lyrics if there are too few in the bar.
     */
    @Test
    public void testLyricNotEnoughLyrics() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1))),
                    Arrays.asList(
                        new Lyric("a"))));
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(2, output.size());
        assertEquals("a", output.get(0).getLyric().getText());
        assertEquals(false, output.get(1).hasLyric());
    }


    /**
     * Should properly calculate ticksPerBeat, beatsPerMinute,
     * and note durations in ticks.
     */
    @Test
    public void testTempoSimple() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(1,1)))));
        PlayableSong output = makePlayableSong(bars);
        List<PlayableSoundEvent> events = output.getEvents(new Voice());

        assertEquals(100, output.getBeatsPerMinute());
        assertEquals(1, output.getTicksPerBeat());
        assertEquals(1, events.size());
        assertEquals(1, events.get(0).getTicks());
    }


    /**
     * Should properly calculate ticksPerBeat, beatsPerMinute,
     * and note durations in ticks.
     *
     * This time, the notes have non-default durations.
     */
    @Test
    public void testTempoComplex() {
        List<Bar> bars = Arrays.asList(
                new Bar(
                    Arrays.asList(
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(9,81)),
                        new SoundEvent(
                            new Sound(new Pitch(A)),
                            new Duration(2,15)))));
        PlayableSong output = makePlayableSong(bars);
        List<PlayableSoundEvent> events = output.getEvents(new Voice());

        assertEquals(100, output.getBeatsPerMinute());
        assertEquals(45, output.getTicksPerBeat());
        assertEquals(2, events.size());
        assertEquals(5, events.get(0).getTicks());
        assertEquals(6, events.get(1).getTicks());
    }


    private Song makeTestSong(List<Bar> bars){
        KeySignature key = new KeySignature(A, SingleAccidental.NATURAL, true);
        Map<Voice, List<Bar>> barmap = new HashMap<Voice, List<Bar>>();
        barmap.put(new Voice(), bars);
        return new Song(barmap, 1, "Title", "Composer", 4, 4,
                new Duration(1,4), key, new Duration(1,4), 100);
    }

    private List<PlayableSoundEvent> makeAndConvertTestSong(List<Bar> bars){
        Song song = makeTestSong(bars);
        PlayableSong output = new SongConverter(song).getResult();
        return output.getEvents(new Voice());
    }

    private PlayableSong makePlayableSong(List<Bar> bars){
        Song song = makeTestSong(bars);
        return new SongConverter(song).getResult();
    }
}
