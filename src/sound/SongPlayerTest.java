package sound;

//import static org.junit.Assert.*;

//import org.junit.Test;

import java.util.*;

public class SongPlayerTest {
    
    public static void main(String[] args){
        System.out.println(new Pitch(Letter.C, 1).toMidiNote());
     
        Note n1 = new Note(new Pitch(Letter.C,Accidental.NONE));
        SoundEvent sound1 = new SoundEvent(n1,new Duration(1,1));
        
        Note n2 = new Note(new Pitch(Letter.C,Accidental.NONE));
        SoundEvent sound2 = new SoundEvent(n2,new Duration(1,1));
        
        Note n3 = new Note(new Pitch(Letter.C,Accidental.NONE));
        SoundEvent sound3 = new SoundEvent(n3,new Duration(3,4));
        
        Note n4 = new Note(new Pitch(Letter.D,Accidental.NONE));
        SoundEvent sound4 = new SoundEvent(n4,new Duration(1,4));
        
        Note n5 = new Note(new Pitch(Letter.E,Accidental.NONE));
        SoundEvent sound5 = new SoundEvent(n5,new Duration(1,1));
        
        
        
        List<SoundEvent> soundEvents1 = new ArrayList<SoundEvent>();
        soundEvents1.add(sound1);
        soundEvents1.add(sound2);
        soundEvents1.add(sound3);
        soundEvents1.add(sound4);
        soundEvents1.add(sound5);
       
        
        Note n6 = new Note(new Pitch(Letter.E,Accidental.NONE));
        SoundEvent sound6 = new SoundEvent(n6,new Duration(3,4));
        
        Note n7 = new Note(new Pitch(Letter.D,Accidental.NONE));
        SoundEvent sound7 = new SoundEvent(n7,new Duration(1,4));
        
        Note n8 = new Note(new Pitch(Letter.E,Accidental.NONE));
        SoundEvent sound8 = new SoundEvent(n8,new Duration(3,4));
        
        Note n9 = new Note(new Pitch(Letter.F,Accidental.NONE));
        SoundEvent sound9 = new SoundEvent(n9,new Duration(1,4));
        
        Note n10 = new Note(new Pitch(Letter.G,Accidental.NONE));
        SoundEvent sound10 = new SoundEvent(n10,new Duration(2,1));
        
        
        
        List<SoundEvent> soundEvents2 = new ArrayList<SoundEvent>();
        soundEvents2.add(sound6);
        soundEvents2.add(sound7);
        soundEvents2.add(sound8);
        soundEvents2.add(sound9);
        soundEvents2.add(sound10);
        
        
        Note n11 = new Note(new Pitch(Letter.C,1));
        SoundEvent sound11 = new SoundEvent(n11,new Duration(1,3));
        
        Note n12 = new Note(new Pitch(Letter.G));
        SoundEvent sound12 = new SoundEvent(n12,new Duration(1,3));
        
        Note n13 = new Note(new Pitch(Letter.E));
        SoundEvent sound13 = new SoundEvent(n13,new Duration(1,3));
        
        Note n14 = new Note(new Pitch(Letter.C));
        SoundEvent sound14 = new SoundEvent(n14,new Duration(1,3));
    
        
        List<SoundEvent> soundEvents3 = new ArrayList<SoundEvent>();
        soundEvents3.add(sound11);
        soundEvents3.add(sound11);
        soundEvents3.add(sound11);
        soundEvents3.add(sound12);
        soundEvents3.add(sound12);
        soundEvents3.add(sound12);
        soundEvents3.add(sound13);
        soundEvents3.add(sound13);
        soundEvents3.add(sound13);
        soundEvents3.add(sound14);
        soundEvents3.add(sound14);
        soundEvents3.add(sound14);
        
 
        
        Note n15 = new Note(new Pitch(Letter.G,Accidental.NONE));
        SoundEvent sound15 = new SoundEvent(n15,new Duration(3,4));
        
        Note n16 = new Note(new Pitch(Letter.F,Accidental.NONE));
        SoundEvent sound16 = new SoundEvent(n16,new Duration(1,4));
        
        Note n17= new Note(new Pitch(Letter.E,Accidental.NONE));
        SoundEvent sound17 = new SoundEvent(n17,new Duration(3,4));
        
        Note n18 = new Note(new Pitch(Letter.D,Accidental.NONE));
        SoundEvent sound18 = new SoundEvent(n18,new Duration(1,4));
        
        Note n19 = new Note(new Pitch(Letter.C,Accidental.NONE));
        SoundEvent sound19 = new SoundEvent(n19,new Duration(2,1));
             
        
        List<SoundEvent> soundEvents4 = new ArrayList<SoundEvent>();
        soundEvents4.add(sound15);
        soundEvents4.add(sound16);
        soundEvents4.add(sound17);
        soundEvents4.add(sound18);
        soundEvents4.add(sound19);
        
        List<Lyric> lyrics = new ArrayList<Lyric>();
        lyrics.add(new Lyric(""));
        
        
        Bar bar1 = new Bar(soundEvents1,lyrics,false,false,RepeatEnding.NONE);
        Bar bar2 = new Bar(soundEvents2,lyrics,false,false,RepeatEnding.NONE);
        Bar bar3 = new Bar(soundEvents3,lyrics,false,false,RepeatEnding.NONE);
        Bar bar4 = new Bar(soundEvents4,lyrics,false,false,RepeatEnding.NONE);
        
        List<Bar> barsForVoice = new ArrayList<Bar>();
        barsForVoice.add(bar1);
        barsForVoice.add(bar2);
        barsForVoice.add(bar3);
        barsForVoice.add(bar4);
         
        Map<Voice, List<Bar>> voicesToBars = new HashMap<Voice, List<Bar>>();
        voicesToBars.put(new Voice(""),barsForVoice);
        
        Song song = new Song(voicesToBars, 5, "Piece No. 2", "Me",4,4,new Duration(1,4), new KeySignature(Letter.C,SingleAccidental.NATURAL,true),
                   new Duration(1,4), 140);
        
        PlayableSong ps = new SongConverter(song).getResult();
        
        System.out.println("Ticks per beat: " + ps.getTicksPerBeat());
        
        SongPlayer songPlayer = new SongPlayer(ps);
       
        songPlayer.play();
    }
}
