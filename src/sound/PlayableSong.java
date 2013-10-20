package sound;
import java.util.*;

public class PlayableSong {
    /*
     * Rep invariant:
     * beatsPerMinute > 0
     * ticksPerBeat > 0
     */
    
    private final ArrayList<PlayableSoundEvent> events;
    private final int beatsPerMinute;
    private final int ticksPerBeat;
    
    
    /**
     * Constructs a new PlayableSong object.
     * 
     * @param events the PlayableSoundEvent objects
     * @param beatsPerMinute the number of beats per minute (tempo). Requires
     *        beatsPerMinute > 0
     * @param ticksPerBeat the number of time ticks in each beat. Requires 
     *        ticksPerBeat > 0.
     */
    public PlayableSong(List<PlayableSoundEvent> events, int beatsPerMinute, int ticksPerBeat){
        this.beatsPerMinute = beatsPerMinute;
        this.ticksPerBeat = ticksPerBeat;
        this.events =  (ArrayList<PlayableSoundEvent>)((ArrayList<PlayableSoundEvent>)events).clone();
        
        checkRep();
    }
    
    
    
    /**
     * Returns the list of PlayableSoundEvent objects.
     * 
     * @return the PlayableSoundEvent list
     */
    public List<PlayableSoundEvent> getEvents(){
        return Collections.unmodifiableList(events);
    }
    
    
    
    /**
     * Return the beats per minute
     * 
     * @return the beats per minute
     */
    public int getBeatsPerMinute(){
        return beatsPerMinute;
    }
    
    
    
    /**
     * Returns the ticks per beat
     * 
     * @return the ticks per beat
     */
    public int getTicksPerBeat(){
        return ticksPerBeat;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        
        if (obj.getClass() != this.getClass()){
            return false;
        }
        
        PlayableSong that = (PlayableSong) obj;
        
        return (this.ticksPerBeat == that.ticksPerBeat &&
                this.beatsPerMinute == that.beatsPerMinute &&
                this.events.equals(that.events));
    }

    
    
    @Override
    public int hashCode() {
        return (ticksPerBeat + beatsPerMinute + events.hashCode());
    }
    
    
    
    private void checkRep(){
        assert beatsPerMinute > 0;
        assert ticksPerBeat > 0;
    }
}
