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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
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
        // Test song is in the key of A major
        List<PlayableSoundEvent> output = makeAndConvertTestSong(bars);

        assertEquals(3, output.size());
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
}
