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
                    System.out.print(text + " ");
                }
            };

            player = new SequencePlayer(song.getBeatsPerMinute(), song.getTicksPerBeat(), listener);
            
            for(Voice voice : song.listVoices()){
                int startTick = 0;
                List<PlayableSoundEvent> playableSoundEventsList = song.getEvents(voice);

                for(PlayableSoundEvent playableSoundEvent: playableSoundEventsList){
                    Sound sound = playableSoundEvent.getSound();

                    List<Pitch> pitchList = sound.getPitches();
                    
                    if(playableSoundEvent.hasLyric()){
                        String lyricAsString = playableSoundEvent.getLyric().getText();
                        player.addLyricEvent(lyricAsString,startTick);
                    }

                    for(Pitch pitchOfSound : pitchList){
                        player.addNote(pitchOfSound.toMidiNote(),startTick,playableSoundEvent.getTicks());
                        //System.out.println("ST: " + startTick + "  TL: " + playableSoundEvent.getTicks());
                    }

                    startTick += playableSoundEvent.getTicks();
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
