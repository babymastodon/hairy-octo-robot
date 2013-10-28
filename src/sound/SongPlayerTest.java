package sound;

import org.junit.Test;
import java.util.*;

import static sound.Letter.*;

/**
 * Test basic functionality of the SongPlayer.
 *
 * Because the SequencePlayer cannot be mocked out,
 * we can't run these on the didit server. Additionally,
 * there is no way to tell whether audio was played
 * from the speakers, so these tests don't have any
 * assertions. Therefore, a human needs to be present
 * to make sure that something plays from the computer speakers.
 *
 * @category no_didit
 */
public class SongPlayerTest {

    /**
     * Simple notes should play over MIDI.
     */
    @Test
    public void testSimpleNotes(){
        System.out.println("Should play two notes for 1 second each.");

        Map<Voice, List<PlayableSoundEvent>> eventMap =
            new HashMap<Voice, List<PlayableSoundEvent>>();
        eventMap.put(
                new Voice(),
                Arrays.asList(
                    new PlayableSoundEvent(
                        new Sound(new Pitch(C)),
                        4),
                    new PlayableSoundEvent(
                        new Sound(new Pitch(G)),
                        4)));

        PlayableSong song = new PlayableSong(eventMap, 60, 4);
        new SongPlayer(song, new ConsoleLyricListener()).play();
    }


    /**
     * Chords should play over MIDI.
     */
    @Test
    public void testChord(){
        System.out.println("Should play a chord for 1 second.");

        Map<Voice, List<PlayableSoundEvent>> eventMap =
            new HashMap<Voice, List<PlayableSoundEvent>>();
        eventMap.put(
                new Voice(),
                Arrays.asList(
                    new PlayableSoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(G),
                                new Pitch(E),
                                new Pitch(C))),
                        4)));

        PlayableSong song = new PlayableSong(eventMap, 60, 4);
        new SongPlayer(song, new ConsoleLyricListener()).play();
    }


    /**
     * Voices should play over MIDI.
     */
    @Test
    public void testVoices(){
        System.out.println("Should play two melodic voices.");

        Map<Voice, List<PlayableSoundEvent>> eventMap =
            new HashMap<Voice, List<PlayableSoundEvent>>();
        eventMap.put(
                new Voice("voice1"),
                Arrays.asList(
                    new PlayableSoundEvent(
                        new Sound(new Pitch(C)),
                        4),
                    new PlayableSoundEvent(
                        new Sound(new Pitch(G)),
                        4)));
        eventMap.put(
                new Voice("voice2"),
                Arrays.asList(
                    new PlayableSoundEvent(
                        new Sound(new Pitch(C)),
                        2),
                    new PlayableSoundEvent(
                        new Sound(new Pitch(E)),
                        2),
                    new PlayableSoundEvent(
                        new Sound(new Pitch(C)),
                        2),
                    new PlayableSoundEvent(
                        new Sound(new Pitch(E)),
                        2)));

        PlayableSong song = new PlayableSong(eventMap, 60, 4);
        new SongPlayer(song, new ConsoleLyricListener()).play();
    }


    /**
     * Lyrics should be printed with the notes.
     */
    @Test
    public void testLyrics(){
        System.out.println("Should print lyrics with the notes.");

        Map<Voice, List<PlayableSoundEvent>> eventMap =
            new HashMap<Voice, List<PlayableSoundEvent>>();
        eventMap.put(
                new Voice("voice1"),
                Arrays.asList(
                    new PlayableSoundEvent(
                        new Sound(new Pitch(C)),
                        4,
                        new Lyric("Lyric1")),
                    new PlayableSoundEvent(
                        new Sound(new Pitch(G)),
                        4,
                        new Lyric("Lyric2"))));

        PlayableSong song = new PlayableSong(eventMap, 60, 4);
        new SongPlayer(song, new ConsoleLyricListener()).play();
    }
}
