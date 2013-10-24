package sound;

import java.util.*;

/**
 * Converts the given Song object into a PlayableSong object.
 */
public class SongConverter {
    
    
    private final Song song;

    
    
    public SongConverter(Song song){
        this.song = song;
    }
    
    
    
    private Song fillInAccidentals(){
        List<Voice> voicesList = song.listVoices();
        Map<Voice, List<Bar>> newVoicesToBars = new HashMap<Voice,List<Bar>>();
      
        for(Voice voice : voicesList){
            List<Bar> barsForVoice = song.getBars(voice);
            List<Bar> newBarsForVoice = new ArrayList<Bar>();

            for(Bar bar : barsForVoice){
                List<SoundEvent> soundEventsList = bar.getEvents();
                Map<Letter, Accidental> letterToAccidental = new HashMap<Letter,Accidental>();
                List<SoundEvent> newSoundEventsList = new ArrayList<SoundEvent>();

                for(SoundEvent soundEventInBar : soundEventsList){
                    Sound sound = soundEventInBar.getSound();
                    List<Pitch> pitchList = sound.getPitches();
                    List<Pitch> newPitchList = new ArrayList<Pitch>();

                    for(Pitch pitchOfSound : pitchList){
                        Letter letter = pitchOfSound.getLetter();
                        letterToAccidental.put(letter, song.getKeySignature().getAccidental(letter));
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

                Bar newBar = new Bar(newSoundEventsList,bar.getLyrics(),bar.getBeginRepeat(),bar.getEndRepeat(),bar.getRepeatEnding());
                newBarsForVoice.add(newBar);

            }

            newVoicesToBars.put(voice,newBarsForVoice);
        }

        return new Song(newVoicesToBars,song.getIndex(),song.getTitle(),song.getComposer(),song.getMeterNumerator(),
                song.getMeterDenominator(),song.getDefaultDuration(),song.getKeySignature(),song.getBeatDuration(),
                song.getBeatsPerMinute());

    }

    
    
    private int calcTicksPerBeat(Song song){
        List<Voice> voicesList = song.listVoices();
        Set<Integer> setOfDenominators = new TreeSet<Integer>();
        setOfDenominators.add(song.getBeatDuration().getDenominator());
        
        for(Voice voice: voicesList){
            List<Bar> barsForVoice = song.getBars(voice);
            
            for(Bar bar: barsForVoice){
                List<SoundEvent> soundEventsList = bar.getEvents();
                
                for(SoundEvent soundEvent : soundEventsList){
                    setOfDenominators.add(soundEvent.getDuration().mul(song.getDefaultDuration()).getDenominator());
                }
            }
        }
        
        Integer[] a = new Integer[1];
        Integer[] denominatorsArray = setOfDenominators.toArray(a);
        Integer previousLCM = (denominatorsArray[0]*denominatorsArray[1]) / GCD(denominatorsArray[0],denominatorsArray[1]);
        int lcm = previousLCM;
        
        for(int i=2; i < denominatorsArray.length-1; i++){
            lcm = (previousLCM*denominatorsArray[i]) / GCD(previousLCM,denominatorsArray[i]);
            previousLCM = lcm;
        }
        
        return lcm;     
    }
    
    
    
    private int GCD(int a, int b) {
        if (b == 0) return (a);
        else return (GCD (b, a % b));
    }
    
    
    
    private PlayableSong convert(int gcd, Song songAccidentals){
        List<Voice> voicesList = songAccidentals.listVoices();
        //TODO: handle lyrics and repeated bars
        int beatsPerMinute = songAccidentals.getBeatsPerMinute();
        int ticksPerBeat = gcd;
        
        Map<Voice,List<PlayableSoundEvent>> newVoicesToSoundEvent = new HashMap<Voice,List<PlayableSoundEvent>>();
        
        for(Voice voice : voicesList){
            
            List<PlayableSoundEvent> playableSoundEventList = new ArrayList<PlayableSoundEvent>();
            List<Bar> barsForVoice = expandRepeats(songAccidentals.getBars(voice));
                        
           
            for(Bar currentBar: barsForVoice){
                List<SoundEvent> soundEventsList = currentBar.getEvents();
                                           
                for(SoundEvent soundEvent : soundEventsList){
                    int numTicks = (soundEvent.getDuration().getNumerator()*gcd) / soundEvent.getDuration().getDenominator();
                    playableSoundEventList.add(new PlayableSoundEvent(soundEvent.getSound(),numTicks));
                }
            }
            
            newVoicesToSoundEvent.put(voice, playableSoundEventList);
            
        }
        
        return new PlayableSong(newVoicesToSoundEvent,beatsPerMinute,ticksPerBeat);       
    }
    
    
    
    private List<Bar> expandRepeats(List<Bar> barList){
        List<Bar> newBarList = new ArrayList<Bar>(barList);
        
        List<Integer> startOfRepeats = new ArrayList<Integer>();
        Map<Integer,Integer> startIndexToEndIndex = new HashMap<Integer,Integer>();
        
        // build up a map that maps the index of a beginRepeat bar to the
        // corresponding index of an endRepeat bar
        for(int i = 0; i < barList.size(); i++){
            Bar currentBar = barList.get(i);
            if(currentBar.getBeginRepeat()){
                startOfRepeats.add(i);
            }
            if(currentBar.getEndRepeat()){
                startIndexToEndIndex.put(startOfRepeats.remove(startOfRepeats.size()-1),i);
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
            List<Bar> barsFromStartToEnd = newBarList.subList(startIndex, endIndex+1);
            List<Bar> expandedBars = new ArrayList<Bar>();
            
            // go through the sub-list of bars the first time.
            // The first time is simple, we just need to stop if we
            // reach the second repeat ending
            for(Bar bar: barsFromStartToEnd){
                if(bar.getRepeatEnding() != RepeatEnding.SECOND){
                    expandedBars.add(bar);
                } else{
                    break;
                }
            }
            
            
            boolean skippingFirstRepeatEnding = false;
            // go through the list of bars a second time.
            // The second time we must skip the first repeat ending.
            for(Bar bar: barsFromStartToEnd){
                if(bar.getRepeatEnding() == RepeatEnding.FIRST){
                    skippingFirstRepeatEnding = true;
                }
                if(bar.getRepeatEnding() == RepeatEnding.SECOND){
                    skippingFirstRepeatEnding = false;
                }
                
                if(!skippingFirstRepeatEnding){
                    expandedBars.add(bar);
                }
            }
            
            
            // we get rid of the unexpanded bars before
            // we insert the expanded ones.
            for(int i = startIndex; i <= endIndex; i++){
                newBarList.remove(i);
            }
            
            newBarList.addAll(startIndex,expandedBars);
            
            // below we must shift the ending index of any repeated unit that we have
            // not yet expanded if our inserting of expanded bars would change its index.
            int differenceInSizeExpandedUnExpanded = expandedBars.size() - barsFromStartToEnd.size();
            
            for(int otherStartIndex : startIndicesList){
                int otherEndIndex = startIndexToEndIndex.get(otherStartIndex);
                
                if(otherEndIndex > endIndex && otherStartIndex < startIndex){
                    startIndexToEndIndex.put(otherStartIndex, otherEndIndex + differenceInSizeExpandedUnExpanded);
                }
            }
            
               
        }
        
        return newBarList;
        
    }
    
    
    
    public PlayableSong getResult(){
        Song songWithFilledInAccidentals = fillInAccidentals();
        int gcd = calcTicksPerBeat(songWithFilledInAccidentals);
        return convert(gcd,songWithFilledInAccidentals);    
    }
}
