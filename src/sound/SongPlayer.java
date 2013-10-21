package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.util.*;

public class SongPlayer {
    
    PlayableSong song;
    
    
    //TODO: handle LyricListener
    public SongPlayer(PlayableSong song){
        this.song = song;
    }
    
    
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
                
                if(sound.getClass() == Rest.class){
                    startTick += soundEvent.getTicks();
                } else if(sound.getClass() == Note.class || sound.getClass() == Chord.class){
                    List<Pitch> pitchList = sound.getPitches();
                    
                    for(Pitch pitchOfSound : pitchList){
                        player.addNote(new Pitch(pitchOfSound.getLetter()).toMidiNote(),startTick,soundEvent.getTicks());
                        System.out.println("ST: " + startTick + "  TL: " + soundEvent.getTicks());
                    }
                    
                    startTick += soundEvent.getTicks();
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
