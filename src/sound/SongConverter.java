package sound;

import java.util.*;

/**
 * Converts the given Song object into a PlayableSong object.
 */
public class SongConverter {
    
    
    private final Song song;

    
    /**
     * Constructs a new SongConverter object.
     * 
     * @param song The Song to be converted
     */
    public SongConverter(Song song){
        this.song = song;
    }
    
    
    
    /**
     * Distribute the accidentals of the Song used to construct
     * the SongConverter object according
     * to the rules of key signatures and accidentals in bars.
     * 
     * @return  A new Song that is the same as the song used to construct
     *          the SongConverter object, but with the accidentals distributed.
     */
    private Song distributeInAccidentals(){
        Map<Voice, List<Bar>> newVoicesToBars = new HashMap<Voice,List<Bar>>();
      
        for(Voice voice : song.listVoices()){
            List<Bar> newBarsForVoice = new ArrayList<Bar>();

            for(Bar bar : song.getBars(voice)){
                // a mapping from letters to accidentals within
                // the context of the current bar
                Map<Letter, Accidental> letterToAccidental = new HashMap<Letter,Accidental>();

                // at the beginning of the bar, initialize the mapping
                // to the key signature
                for (Letter letter: Letter.values()){
                    letterToAccidental.put(letter, song.getKeySignature().getAccidental(letter));
                }

                List<SoundEvent> newSoundEventsList = new ArrayList<SoundEvent>();


                for(SoundEvent soundEventInBar : bar.getEvents()){
                    List<Pitch> newPitchList = new ArrayList<Pitch>();

                    for(Pitch pitchOfSound : soundEventInBar.getSound().getPitches()){
                        Letter letter = pitchOfSound.getLetter();
                        Accidental accidentalOfSound = pitchOfSound.getAccidental();

                        // When there is no accidental on a note then the key signature
                        // and previous accidentals on the same note earlier in the bar can be applied.
                        // Anything that has an accidental does not get altered, instead its accidental is
                        // stored in a map so it can be applied to later notes, in the same bar, of the same letter.
                        if(accidentalOfSound == Accidental.NONE){
                            Pitch newPitch = new Pitch(letter, letterToAccidental.get(letter), pitchOfSound.getOctave());
                            newPitchList.add(newPitch);
                        } else{
                            letterToAccidental.put(letter, accidentalOfSound);
                            newPitchList.add(pitchOfSound);
                        }
                    }

                    Sound newSound = new Sound(newPitchList);
                    SoundEvent newSoundEvent = new SoundEvent(newSound, soundEventInBar.getDuration());
                    newSoundEventsList.add(newSoundEvent);

                }

                Bar newBar = new Bar(newSoundEventsList,bar.getLyrics(),bar.getPrefix(),bar.getSuffix());
                newBarsForVoice.add(newBar);

            }

            newVoicesToBars.put(voice,newBarsForVoice);
        }

        return new Song(newVoicesToBars,song.getIndex(),song.getTitle(),song.getComposer(),song.getMeterNumerator(),
                song.getMeterDenominator(),song.getDefaultDuration(),song.getKeySignature(),song.getBeatDuration(),
                song.getBeatsPerMinute());

    }

    
    
    /**
     * Returns the number of ticks per default beat of a Song needed
     * to that are necessary to represent all the lengths of notes that 
     * appear in a piece as ticks.
     * 
     * @param song The song object that the number of ticks per beat should
     *        be calculated for.
     * @return The number of ticks per beat
     */
    private int calcGCD(Song song){
        List<Voice> voicesList = song.listVoices();
        Set<Integer> setOfDenominators = new TreeSet<Integer>();
        setOfDenominators.add(song.getBeatDuration().getDenominator());
        
        for(Voice voice: voicesList){
            for(Bar bar: song.getBars(voice)){
                for(SoundEvent soundEvent : bar.getEvents()){
                    setOfDenominators.add(soundEvent.getDuration().mul(song.getDefaultDuration()).getDenominator());
                }
            }
        }
        
        Integer[] denominatorsArray = setOfDenominators.toArray(new Integer[0]);
        Integer lcm = denominatorsArray[0];
        
        for(int i=1; i < denominatorsArray.length; i++){
            lcm = (lcm*denominatorsArray[i]) / GCD(lcm,denominatorsArray[i]);
        }
        
        return lcm;     
    }
    
    
    
    /**
     * Calculates the GCD of two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the GCD of the two
     */
    private int GCD(int a, int b) {
        // using Euclid's algorithm 
        // (http://en.wikipedia.org/wiki/Euclidean_algorithm#Implementations)
        if (b == 0) return (a);
        else return (GCD (b, a % b));
    }
    
    
    
    /**
     * Converts a Song to a PlayableSong.
     * 
     * @param gcd The number of ticks per default beat in the Song
     * @param songAccidentals The Song to be converted. Requires songAccidentals 
     *        already has its accidentals correctly applied through to each individual Sound.
     * @return A PlayableSong that represents songAccidentals.
     */
    private PlayableSong convert(int gcd, Song songAccidentals){
        List<Voice> voicesList = songAccidentals.listVoices();
        
        Map<Voice,List<PlayableSoundEvent>> newVoicesToSoundEvent = new HashMap<Voice,List<PlayableSoundEvent>>();
        
        for(Voice voice : voicesList){
            
            List<PlayableSoundEvent> playableSoundEventList = new ArrayList<PlayableSoundEvent>();
            List<Bar> barsForVoice = expandRepeats(songAccidentals.getBars(voice));
                        
           
            for(Bar currentBar: barsForVoice){
                List<SoundEvent> soundEventsList = currentBar.getEvents();
                List<Lyric> lyricsForBar = new ArrayList<Lyric>(currentBar.getLyrics());
                                           
                for(SoundEvent soundEvent : soundEventsList){
                    Duration absoluteDuration = soundEvent.getDuration().mul(song.getDefaultDuration());
                    int numTicks = (absoluteDuration.getNumerator()*gcd) / absoluteDuration.getDenominator();
                    boolean soundIsNotARest = soundEvent.getSound().getPitches().size() > 0;
                    boolean lyricsLeftToAdd = lyricsForBar.size() > 0;
                    
                    // Lyrics are only added to sounds that are not rests.
                    // When we run out of lyrics for a bar then the rest of the sounds
                    // in that bar do not get lyrics.
                    if(soundIsNotARest && lyricsLeftToAdd){
                        Lyric lyric = lyricsForBar.remove(0);
                        playableSoundEventList.add(new PlayableSoundEvent(soundEvent.getSound(),numTicks,lyric));
                    }
                    else{
                        playableSoundEventList.add(new PlayableSoundEvent(soundEvent.getSound(),numTicks));
                    }
                }
            }
            
            newVoicesToSoundEvent.put(voice, playableSoundEventList);
            
        }
        
        int beatsPerMinute = songAccidentals.getBeatsPerMinute();
        int ticksPerBeat = gcd * song.getBeatDuration().getNumerator() / song.getBeatDuration().getDenominator();
        return new PlayableSong(newVoicesToSoundEvent,beatsPerMinute,ticksPerBeat);       
    }
    
    
    
    /**
     * Takes a List of Bars that may contain Bars that are meant
     * to be repeated. Returns a new List of Bars where all 
     * Bars that were meant to be repeated in the input now actually
     * appear multiple times in the output.
     * 
     * @param barList The List of Bars to expand.
     * @return The List of expanded Bars.
     */
    private List<Bar> expandRepeats(List<Bar> barList){
        List<Bar> newBarList = new ArrayList<Bar>(barList);
        
        Map<Integer,Integer> startIndexToEndIndex = new HashMap<Integer,Integer>();
        int startRepeat = 0;
        
        // build up a map that maps the index of a beginRepeat bar to the
        // corresponding index of an endRepeat bar
        for(int i = 0; i < barList.size(); i++){
            Bar currentBar = barList.get(i);
            
            if(currentBar.getSuffix() == BarSuffix.END_SECTION){
                startRepeat = i+1;
            }
            if(currentBar.getPrefix() == BarPrefix.BEGIN_REPEAT){
                startRepeat = i;
            }
            if(currentBar.getSuffix() == BarSuffix.END_REPEAT){
                startIndexToEndIndex.put(startRepeat,i);
            }
        }
              
        Set<Integer> startIndicesSet = startIndexToEndIndex.keySet();
        
        // we need the list of start indices from greatest to least.
        // This way the inner-most/last repeated sections are expanded first.
        List<Integer> startIndicesList = new ArrayList<Integer>(startIndicesSet);
        Collections.sort(startIndicesList);
        Collections.reverse(startIndicesList);
                
        for(int startIndex : startIndicesList){
            int endIndex = startIndexToEndIndex.get(startIndex);
            List<Bar> barsFromStartToEnd = new ArrayList<Bar>(newBarList.subList(startIndex, endIndex+1));
            List<Bar> expandedBars = new ArrayList<Bar>();
            
            // go through the sub-list of bars the first time.
            // The first time is simple, we just need to stop if we
            // reach the second repeat ending
            for(Bar bar: barsFromStartToEnd){
                if(bar.getPrefix() != BarPrefix.SECOND_ENDING){
                    expandedBars.add(new Bar(bar.getEvents(),bar.getLyrics(),BarPrefix.NONE,bar.getSuffix()));
                } else{
                    break;
                }
            }         
            
            boolean skippingFirstRepeatEnding = false;
            // go through the list of bars a second time.
            // The second time we must skip the first repeat ending.
            for(Bar bar: barsFromStartToEnd){
                if(bar.getPrefix() == BarPrefix.FIRST_ENDING){
                    skippingFirstRepeatEnding = true;
                }
                if(bar.getPrefix() == BarPrefix.SECOND_ENDING){
                    skippingFirstRepeatEnding = false;
                }
                
                if(!skippingFirstRepeatEnding){
                    expandedBars.add(new Bar(bar.getEvents(),bar.getLyrics(),BarPrefix.NONE,bar.getSuffix()));
                }
            }
                       
            // we get rid of the unexpanded bars before
            // we insert the expanded ones.
            for(int i = 0; i <= endIndex - startIndex; i++){
                newBarList.remove(startIndex);
            }
            
            newBarList.addAll(startIndex,expandedBars);
                 
        }
        
        return newBarList;      
    }
    
    
    
    /**
     * Returns the result of converting a Song object into a 
     * PlayableSong object.
     * 
     * @return A PlayableSong object that represents the Song object
     *         used to construct the SongConverter.
     */
    public PlayableSong getResult(){
        Song songWithFilledInAccidentals = distributeInAccidentals();
        int gcd = calcGCD(songWithFilledInAccidentals);
        return convert(gcd,songWithFilledInAccidentals);    
    }
}
