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

        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };

            player = new SequencePlayer(song.getBeatsPerMinute(), song.getTicksPerBeat(), listener);
            
            for(Voice voice : song.listVoices()){
                int startTick = 0;
                List<PlayableSoundEvent> playableSoundEventsList = song.getEvents(voice);

                for(PlayableSoundEvent playablSoundEvent: playableSoundEventsList){
                    Sound sound = playablSoundEvent.getSound();

                    List<Pitch> pitchList = sound.getPitches();

                    for(Pitch pitchOfSound : pitchList){
                        player.addNote(pitchOfSound.toMidiNote(),startTick,playablSoundEvent.getTicks());
                        System.out.println("ST: " + startTick + "  TL: " + playablSoundEvent.getTicks());
                    }

                    startTick += playablSoundEvent.getTicks();
                }
            }

            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
