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
     * 
     * @param sound a Sound object
     * @param ticks the number of ticks the sound should be played for. Requires
     *        ticks > 0.
     * @param lyric a lyric that corresponds with the sound
     */
    public PlayableSoundEvent(Sound sound, int ticks, Lyric lyric){
        this.sound = sound;
        this.ticks = ticks;
        this.lyric = lyric;
        hasLyric = true;
        
        checkRep();
    }
    
    
    /**
     * 
     * @param sound the sound object
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
     * Returns whether or not the object was constructed
     * with a Lyric.
     * 
     * @return true if the object was constructed with a Lyric. False otherwise.
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
     * @return the number of ticks the object should be played for
     */
    public int getTicks(){
        return ticks;
    }
    
    
    private void checkRep(){
        assert ticks > 0;
    }
    
}
