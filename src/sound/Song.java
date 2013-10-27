package sound;

import java.util.*;


/**
 * An Abstract Syntax Tree containing the song information
 * of a parsed abc file.
 *
 * Contains sequences of Bar objects organized by Voice (using
 * the default voice if none is specified) and additional metadata
 * from the header of the abc file.
 *
 * Immutable object.
 */
public class Song {
    /*
     * Representation invariant:
     * meterNumerator > 0
     * meterDenominator > 0
     * beatsPerMinute > 0
     */
    
    private final Map<Voice, List<Bar>> barLists;
    private final int index;
    private final String title;
    private final String composer;
    private final int meterNumerator;
    private final int meterDenominator;
    private final Duration defaultDuration;
    private final KeySignature keySignature;
    private final Duration beatDuration;
    private final int beatsPerMinute;
    
    
    /**
     * Constructs a Song object.
     * 
     * @param barLists a Map of Voice objects to Lists of Bar objects.
     * @param index track number.
     * @param title title of the song.
     * @param composer composer of the song.
     * @param meterNumerator the numerator for the meter of the song. Requires it to be greater than zero.
     * @param meterDenominator the denominator for the meter of the song. Requires it to be greater than zero.
     * @param defaultDuration the default duration of a note in the song.
     * @param keySignature the key signature of the song.
     * @param beatDuration the duration of a beat
     * @param beatsPerMinute the number of beats per minute (tempo). Requires it to be greater than zero.
     */
    public Song(Map<Voice, List<Bar>> barLists, int index, String title,
                String composer, int meterNumerator, int meterDenominator, 
                Duration defaultDuration, KeySignature keySignature,
                Duration beatDuration, int beatsPerMinute){
        
        
        this.barLists = new HashMap<Voice,List<Bar>>();
        
        // below we deep copy the barLists Map
        Set<Voice> keys = barLists.keySet();
        Iterator<Voice> iteratorOfKeys = keys.iterator();
        
        while(iteratorOfKeys.hasNext()){
            Voice voiceKey = iteratorOfKeys.next();
            List<Bar> correspondingBarList = new ArrayList<Bar>(barLists.get(voiceKey));;            
            this.barLists.put(voiceKey, correspondingBarList);
        }
        
        this.index = index;
        this.title = title;
        this.composer = composer;
        this.meterNumerator = meterNumerator;
        this.meterDenominator = meterDenominator;
        this.defaultDuration = defaultDuration;
        this.keySignature = keySignature;
        this.beatDuration = beatDuration;
        this.beatsPerMinute = beatsPerMinute;
        
        checkRep();
        
    }
    
    
    /**
     * Returns the index of the Song.
     * 
     * @return the index of the Song
     */
    public int getIndex(){
        return index;
    }
    
    
    
    /**
     * Returns the title of the Song.
     * 
     * @return the title of the Song
     */
    public String getTitle(){
        return title;
    }
    
    
    
    /**
     * Returns the composer of the Song.
     * 
     * @return the composer of the Song.
     */
    public String getComposer(){
        return composer;
    }
    
    
    
    /**
     * Returns the numerator of the meter of the Song.
     * 
     * @return the numerator of the meter of the Song.
     */
    public int getMeterNumerator(){
        return meterNumerator;
    }
    
    
    /**
     * Returns the denominator of the meter of the Song.
     * 
     * @return the denominator of the meter of the Song.
     */
    public int getMeterDenominator(){
        return meterDenominator;
    }
    
    
    /**
     * Returns the default duration of the Song.
     * 
     * @return the default duration of the Song.
     */
    public Duration getDefaultDuration(){
        return defaultDuration;
    }
    
    
    /**
     * Returns the key signature of the Song.
     * 
     * @return the key signature of the Song.
     */
    public KeySignature getKeySignature(){
        return keySignature;
    }
    
    
    /**
     * Returns the duration of a beat in the Song.
     * 
     * @return the duration of a beat in the Song.
     */
    public Duration getBeatDuration(){
        return beatDuration;
    }
    
    
    /**
     * Returns the number of beats per minute.
     * 
     * @return the number of beats per minute.
     */
    public int getBeatsPerMinute(){
        return beatsPerMinute;
    }
    
    
    
    /**
     * Returns the voices in the Song
     * 
     * @return the voices in the song.
     */
    public List<Voice> listVoices(){
        // The toArray method for Sets requires an array as the parameter
        // that has the runtime type you want returned. 
        // That is why voices is created.
        Voice[] voices = new Voice[]{};
        
        return Arrays.asList(barLists.keySet().toArray(voices));
    }
    
    
    /**
     * Returns the bars that correspond to a certain voice in the Song.
     * 
     * @param voice the voice of the bars being requested. Requires that the
     *         voice exists in the song.
     * @return the bars that go along with the voice
     */
    public List<Bar> getBars(Voice voice){
        return Collections.unmodifiableList(barLists.get(voice));
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        
        if (obj.getClass() != this.getClass()){
            return false;
        }
        
        Song that = (Song) obj;
        
        return (this.index == that.index && this.title.equals(that.title)
                && this.composer.equals(that.composer) && 
                this.meterNumerator == that.meterNumerator &&
                this.meterDenominator == that.meterDenominator &&
                this.defaultDuration.equals(that.defaultDuration) &&
                this.keySignature.equals(that.keySignature) &&
                this.beatDuration.equals(that.beatDuration) &&
                this.beatsPerMinute == that.beatsPerMinute &&
                this.barLists.equals(that.barLists));
    }


    
    
    @Override
    public int hashCode() {
        return (index + composer.hashCode() + meterNumerator + meterDenominator
                + defaultDuration.hashCode() + keySignature.hashCode() +
                beatDuration.hashCode() + beatsPerMinute + barLists.hashCode());
    }
    
    
    private void checkRep(){
        assert meterNumerator > 0;
        assert meterDenominator > 0;
        assert beatsPerMinute > 0;
    }

}
