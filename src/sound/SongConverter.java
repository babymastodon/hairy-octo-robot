package sound;

import java.util.*;

public class SongConverter {
    
    private final Song song;

    
    public SongConverter(Song song){
        this.song = song;
    }
    
    
    private Song fillInAccidentals(){
        List<Voice> voicesList = song.listVoices();
        
        //TODO: Handle multiple voices
        
        Voice voice = voicesList.get(0);
        List<Bar> barsForVoice = song.getBars(voice);
        
        List<Bar> newBars = new ArrayList<Bar>();
        
        for(Bar bar : barsForVoice){
           List<SoundEvent> soundEventsList = bar.getEvents();
           Map<Letter, Accidental> letterToAccidental = new HashMap<Letter,Accidental>();
           List<SoundEvent> newSoundEventsList = new ArrayList<SoundEvent>();
           
           for(SoundEvent soundEventInBar : soundEventsList){
               Sound sound = soundEventInBar.getSound();

               if(sound.getClass() == Note.class || sound.getClass() == Chord.class){
                   List<Pitch> pitchList = sound.getPitches();
                   
                   for(Pitch pitchOfNote : pitchList){
                       Letter letter = pitchOfNote.getLetter();
                       letterToAccidental.put(letter, song.getKeySignature().getAccidental(letter));
                       Accidental accidentalOfNote = pitchOfNote.getAccidental();
                   
                       if(accidentalOfNote == Accidental.NONE){
                           Pitch newPitch = new Pitch(letter, letterToAccidental.get(letter), pitchOfNote.getOctave());
                           Note newNote = new Note(newPitch);
                           SoundEvent newSoundEvent = new SoundEvent(newNote,soundEventInBar.getDuration());
                           newSoundEventsList.add(newSoundEvent);
                       } else{
                           letterToAccidental.put(letter, accidentalOfNote);
                           newSoundEventsList.add(soundEventInBar);
                       }
                   }
               }else{
                   newSoundEventsList.add(soundEventInBar);
               }
              
           }

           Bar newBar = new Bar(newSoundEventsList,bar.getLyrics(),bar.getBeginRepeat(),bar.getEndRepeat(),bar.getRepeatEnding());
           newBars.add(newBar);
           
        }
   
        Map<Voice, List<Bar>> newVoicesToBars = new HashMap<Voice,List<Bar>>();
        newVoicesToBars.put(voice,newBars);
        return new Song(newVoicesToBars,song.getIndex(),song.getTitle(),song.getComposer(),song.getMeterNumerator(),
                song.getMeterDenominator(),song.getDefaultDuration(),song.getKeySignature(),song.getBeatDuration(),
                song.getBeatsPerMinute());
        
    }
    
    
    private int calcGCD(Song song){
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
        //TODO: handle multiple voices and lyrics
        int beatsPerMinute = songAccidentals.getBeatsPerMinute();
        int ticksPerBeat = gcd;
        
        Voice voice = voicesList.get(0);
        
        List<PlayableSoundEvent> playableSoundEventList = new ArrayList<PlayableSoundEvent>();

        List<Bar> barsForVoice = songAccidentals.getBars(voice);

        for(Bar bar: barsForVoice){
            List<SoundEvent> soundEventsList = bar.getEvents();
            
            for(SoundEvent soundEvent : soundEventsList){
                Duration absoluteDuration = soundEvent.getDuration().mul(songAccidentals.getDefaultDuration());
                int numTicks = (soundEvent.getDuration().getNumerator()*gcd) / soundEvent.getDuration().getDenominator();
                System.out.println("Numticks: " + numTicks);
                playableSoundEventList.add(new PlayableSoundEvent(soundEvent.getSound(),numTicks));
            }
        }
        
        return new PlayableSong(playableSoundEventList,beatsPerMinute,ticksPerBeat);
        
    }
    
    
    
    public PlayableSong getResult(){
        Song songWithFilledInAccidentals = fillInAccidentals();
        int gcd = calcGCD(songWithFilledInAccidentals);
        System.out.println("GCD: " + gcd);
        return convert(gcd,songWithFilledInAccidentals);
        
    }
}
