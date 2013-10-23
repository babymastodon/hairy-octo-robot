package sound;


/**
 * This represents a single note/rest/chord which can be 
 * played by the SequencePlayer.
 * 
 * Unlike the SoundEvent object, the pitch of the sounds in PlayableSoundEvent
 * are exact (they take into account the key signature and other accidentals).
 *
 */
public class PlayableSoundEvent {
    
    private final Sound sound;
    private final int ticks;
    private final Lyric lyric;
    private final boolean hasLyric;
    
    
    /**
     * Constructs a new PlayableSoundEvent object given a Sound,
     * number of ticks, and Lyric.
     * 
     * @param sound a Sound object
     * @param ticks the number of ticks the sound should be played for. Requires
     *        ticks > 0.
     * @param lyric a Lyric that corresponds with the sound
     */
    public PlayableSoundEvent(Sound sound, int ticks, Lyric lyric){
        this.sound = sound;
        this.ticks = ticks;
        this.lyric = lyric;
        hasLyric = true;
        
        checkRep();
    }
    
    
    /**
     * Constructs a new PlayableSoundEvent object given a Sound, and
     * number of ticks.
     * 
     * @param sound the Sound of the object
     * @param ticks the number of ticks the sound should be played for. Requires
     *        ticks > 0.
     */
    public PlayableSoundEvent(Sound sound, int ticks){
        this.sound = sound;
        this.ticks = ticks;
        this.lyric = new Lyric("");
        hasLyric = false;
        
       checkRep();
    }
    
    
    
    /**
     * Returns whether or not the object has a corresponding Lyric (i.e. was constructed
     * with a Lyric).
     * 
     * @return true if the object has a Lyric. False otherwise.
     */
    public boolean hasLyric(){
        return hasLyric;
    }
    
    
    
    /**
     * Returns the Lyric of the object. Requires
     * that hasLyric() returns true on the PlayableSoundEvent
     * object.
     * 
     * @return the Lyric of the object
     */
    public Lyric getLyric(){
        return lyric;
    }
    
    
    
    /**
     * Returns the Sound of the object.
     * 
     * @return the Sound of the object
     */
    public Sound getSound(){
        return sound;
    }
    
    
    
    /**
     * Returns the ticks of the object.
     * 
     * @return the number of ticks the Sound of the object should be played for
     */
    public int getTicks(){
        return ticks;
    }


    
    /**
     * Two playable sound events are semantically equal if they
     * have the same sound, duration (in ticks), and lyrics.
     *
     * @return true of the other object is semantically equal to this.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        
        if (obj.getClass() != this.getClass()){
            return false;
        }
        
        PlayableSoundEvent that = (PlayableSoundEvent) obj;
        
        return (this.sound.equals(that.sound) && this.ticks == that.ticks
                && this.hasLyric() == that.hasLyric() && 
                this.lyric.equals(that.lyric));
    }

    
    
    /**
     * Updated for the new equals function.
     *
     * @return an integer hashcode.
     */
    @Override
    public int hashCode() {
        return sound.hashCode() + lyric.hashCode() + ticks;
    }
    
    
    private void checkRep(){
        assert ticks > 0;
    }
    
}
