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

        assertEquals(output.size(), 1);
        assertEquals(output.get(0).getSound().getPitches().size(), 1);
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

        assertEquals(output.size(), 2);
        assertEquals(output.get(0).getSound().getPitches().size(), 1);
        assertEquals(SHARP, output.get(0).getSound().getPitches().get(0).getAccidental());
        assertEquals(output.get(1).getSound().getPitches().size(), 1);
        assertTrue(SHARP != output.get(1).getSound().getPitches().get(0).getAccidental());
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

        assertEquals(output.size(), 3);
        assertEquals(output.get(0).getSound().getPitches().size(), 1);
        assertEquals(SHARP, output.get(0).getSound().getPitches().get(0).getAccidental());
        assertEquals(output.get(1).getSound().getPitches().size(), 1);
        assertEquals(SHARP, output.get(1).getSound().getPitches().get(0).getAccidental());
        assertEquals(output.get(2).getSound().getPitches().size(), 1);
        assertEquals(SHARP, output.get(2).getSound().getPitches().get(0).getAccidental());
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
