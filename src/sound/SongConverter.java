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
               
               // we only need to alter the pitches of Notes and Chords 
               if(sound.getClass() == Note.class || sound.getClass() == Chord.class){
                   List<Pitch> pitchList = sound.getPitches();
                   List<Pitch> newPitchList = new ArrayList<Pitch>();
                   
                   for(Pitch pitchOfNote : pitchList){
                       Letter letter = pitchOfNote.getLetter();
                       letterToAccidental.put(letter, song.getKeySignature().getAccidental(letter));
                       Accidental accidentalOfNote = pitchOfNote.getAccidental();
                       
                       // When there is no accidental on a note then the key signature
                       // and previous accidentals on the same note earlier in the bar can be applied.
                       // Anything that has an accidental does not get altered, instead its accidental is
                       // stored in a map so it can be applied to later notes, in the same bar, of the same letter.
                       if(accidentalOfNote == Accidental.NONE){
                           Pitch newPitch = new Pitch(letter, letterToAccidental.get(letter), pitchOfNote.getOctave());
                           newPitchList.add(newPitch);
                       } else{
                           letterToAccidental.put(letter, accidentalOfNote);
                           newPitchList.add(pitchOfNote);
                       }
                   }
                   
                   // we have to make a new Note if there was only one pitch
                   // we to make a chord otherwise because pitch list must be greater than one
                   if(newPitchList.size() == 1){
                       Note newNote = new Note(newPitchList.get(0));
                       SoundEvent newSoundEvent = new SoundEvent(newNote, soundEventInBar.getDuration());
                       newSoundEventsList.add(newSoundEvent);
                   } else{
                       Chord newChord = new Chord(newPitchList);
                       SoundEvent newSoundEvent = new SoundEvent(newChord, soundEventInBar.getDuration());
                       newSoundEventsList.add(newSoundEvent);
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
