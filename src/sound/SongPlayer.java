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
