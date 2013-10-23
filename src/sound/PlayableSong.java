package sound;
import java.util.*;

/**
 * Lists of PlayableSoundEvents which are to be played
 * in sequences at a particular tempo.
 *
 * More specifically, this objects contains a map from 
 * Voices to Lists of PlayableSoundEvents. The Voices are
 * expected to be played in parallel, while the PlayableSoundEvents
 * of any pariticular Voice are to be played in sequence.
 */
public class PlayableSong {
    /*
     * Rep invariant:
     * beatsPerMinute > 0
     * ticksPerBeat > 0
     */
    
    private final Map<Voice, List<PlayableSoundEvent>> voiceToEvents;
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
    public PlayableSong(Map<Voice, List<PlayableSoundEvent>> eventMap, int beatsPerMinute, int ticksPerBeat){
        this.beatsPerMinute = beatsPerMinute;
        this.ticksPerBeat = ticksPerBeat;
        
        this.voiceToEvents = new HashMap<Voice,List<PlayableSoundEvent>>();
        
        // below we deep copy the eventMap Map
        Set<Voice> keys = eventMap.keySet();
        Iterator<Voice> iteratorOfKeys = keys.iterator();
        
        while(iteratorOfKeys.hasNext()){
            Voice voiceKey = iteratorOfKeys.next();
            List<PlayableSoundEvent> soundEventList;
           
            soundEventList = (ArrayList<PlayableSoundEvent>) ((ArrayList<PlayableSoundEvent>)eventMap.get(voiceKey)).clone();
            
            this.voiceToEvents.put(voiceKey, soundEventList);
        }
        
        System.out.println("Voice size in object1: " + this.voiceToEvents.keySet().size());
        System.out.println("Voice size in object2: " +  voiceToEvents.keySet().size());
        
        checkRep();
    }
    
    
    
    /**
     * Returns the list of PlayableSoundEvent objects.
     * 
     * @return the PlayableSoundEvent list
     */
    public List<PlayableSoundEvent> getEvents(Voice voice){
        return Collections.unmodifiableList(voiceToEvents.get(voice));
    }
    
    
    
    /**
     * Returns the voices in the PlayableSong
     * 
     * @return the voices in the PlayableSong.
     */
    public List<Voice> listVoices(){
        // The toArray method for Sets requires an array as the parameter
        // that has the runtime type you want returned. 
        // That is why voices is created.
        Voice[] voices = new Voice[]{};
        
        return Arrays.asList(voiceToEvents.keySet().toArray(voices));
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
                this.voiceToEvents.equals(that.voiceToEvents));
    }

    
    
    @Override
    public int hashCode() {
        return (ticksPerBeat + beatsPerMinute + voiceToEvents.hashCode());
    }
    
    
    
    private void checkRep(){
        assert beatsPerMinute > 0;
        assert ticksPerBeat > 0;
    }
}
