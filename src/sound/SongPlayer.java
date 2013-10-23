package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.util.*;

/**
 * Plays the given PlayableSong object over the Java
 * MIDI interface, and prints lyrics to the given LyricListener.
 */
public class SongPlayer {
    
    PlayableSong song;
    
    
    /**
     * Construct a SongPlayer that will play the given song
     * and will pass lyrics to the given LyricListener.
     *
     * @param song the song to be played
     * @param listener the lyric listener that is to recieve the lyrics
     */
    //TODO: handle LyricListener
    public SongPlayer(PlayableSong song){
        this.song = song;
    }
    
    
    /**
     * Play the song from start to finish.
     */
    public void play(){

        SequencePlayer player;
        int startTick = 0;

        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };

            player = new SequencePlayer(song.getBeatsPerMinute(), song.getTicksPerBeat(), listener);

            List<PlayableSoundEvent> soundEventsList = song.getEvents();

            for(PlayableSoundEvent soundEvent: soundEventsList){
                Sound sound = soundEvent.getSound();

                List<Pitch> pitchList = sound.getPitches();
                System.out.println("Size of pitch list: " + pitchList.size());

                for(Pitch pitchOfSound : pitchList){
                    player.addNote(pitchOfSound.toMidiNote(),startTick,soundEvent.getTicks());
                    System.out.println("ST: " + startTick + "  TL: " + soundEvent.getTicks());
                }

                startTick += soundEvent.getTicks();
            }

            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
