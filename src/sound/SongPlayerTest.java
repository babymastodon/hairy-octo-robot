package sound;

//import static org.junit.Assert.*;

//import org.junit.Test;

import java.util.*;

public class SongPlayerTest {
    
    public static void main(String[] args){
        playMarioRepeat();
        
    }
    
    static void playRowYourBoat(){
        Sound n1 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE)));
        SoundEvent sound1 = new SoundEvent(n1,new Duration(1,1));
        
        Sound n2 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE)));
        SoundEvent sound2 = new SoundEvent(n2,new Duration(1,1));
        
        Sound n3 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE)));
        SoundEvent sound3 = new SoundEvent(n3,new Duration(3,4));
        
        Sound n4 = new Sound(Arrays.asList(new Pitch(Letter.D,Accidental.NONE)));
        SoundEvent sound4 = new SoundEvent(n4,new Duration(1,4));
        
        Sound n5 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound5 = new SoundEvent(n5,new Duration(1,1));
        
        List<SoundEvent> soundEvents1 = new ArrayList<SoundEvent>();
        soundEvents1.add(sound1);
        soundEvents1.add(sound2);
        soundEvents1.add(sound3);
        soundEvents1.add(sound4);
        soundEvents1.add(sound5);
       
        
        Sound n6 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound6 = new SoundEvent(n6,new Duration(3,4));
        
        Sound n7 = new Sound(Arrays.asList(new Pitch(Letter.D,Accidental.NONE)));
        SoundEvent sound7 = new SoundEvent(n7,new Duration(1,4));
        
        Sound n8 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound8 = new SoundEvent(n8,new Duration(3,4));
        
        Sound n9 = new Sound(Arrays.asList(new Pitch(Letter.F,Accidental.NONE)));
        SoundEvent sound9 = new SoundEvent(n9,new Duration(1,4));
        
        Sound n10 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE)));
        SoundEvent sound10 = new SoundEvent(n10,new Duration(2,1));
        
        List<SoundEvent> soundEvents2 = new ArrayList<SoundEvent>();
        soundEvents2.add(sound6);
        soundEvents2.add(sound7);
        soundEvents2.add(sound8);
        soundEvents2.add(sound9);
        soundEvents2.add(sound10);
        
        
        Sound n11 = new Sound(Arrays.asList(new Pitch(Letter.C,1)));
        SoundEvent sound11 = new SoundEvent(n11,new Duration(1,3));
        
        Sound n12 = new Sound(Arrays.asList(new Pitch(Letter.G)));
        SoundEvent sound12 = new SoundEvent(n12,new Duration(1,3));
        
        Sound n13 = new Sound(Arrays.asList(new Pitch(Letter.E)));
        SoundEvent sound13 = new SoundEvent(n13,new Duration(1,3));
        
        Sound n14 = new Sound(Arrays.asList(new Pitch(Letter.C)));
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
        
        
        Sound n15 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE)));
        SoundEvent sound15 = new SoundEvent(n15,new Duration(3,4));
        
        Sound n16 = new Sound(Arrays.asList(new Pitch(Letter.F,Accidental.NONE)));
        SoundEvent sound16 = new SoundEvent(n16,new Duration(1,4));
        
        Sound n17= new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound17 = new SoundEvent(n17,new Duration(3,4));
        
        Sound n18 = new Sound(Arrays.asList(new Pitch(Letter.D,Accidental.NONE)));
        SoundEvent sound18 = new SoundEvent(n18,new Duration(1,4));
        
        Sound n19 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE)));
        SoundEvent sound19 = new SoundEvent(n19,new Duration(2,1));
                
        List<SoundEvent> soundEvents4 = new ArrayList<SoundEvent>();
        soundEvents4.add(sound15);
        soundEvents4.add(sound16);
        soundEvents4.add(sound17);
        soundEvents4.add(sound18);
        soundEvents4.add(sound19);
        
        
        
        List<Lyric> lyrics = new ArrayList<Lyric>();
        lyrics.add(new Lyric(""));
        
        Bar bar1 = new Bar(soundEvents1,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar2 = new Bar(soundEvents2,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar3 = new Bar(soundEvents3,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar4 = new Bar(soundEvents4,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        
        List<Bar> barsForVoice = new ArrayList<Bar>();
        barsForVoice.add(bar1);
        barsForVoice.add(bar2);
        barsForVoice.add(bar3);
        barsForVoice.add(bar4);
         
        Map<Voice, List<Bar>> voicesToBars = new HashMap<Voice, List<Bar>>();
        voicesToBars.put(new Voice(""),barsForVoice);
        
        Song song = new Song(voicesToBars, 5, "Row Your Boat", "Me",4,4,new Duration(1,4), new KeySignature(Letter.C,SingleAccidental.NATURAL,true),
                   new Duration(1,4), 140);
        
        PlayableSong ps = new SongConverter(song).getResult();
        
        System.out.println("Ticks per beat: " + ps.getTicksPerBeat());
        
        SongPlayer songPlayer = new SongPlayer(ps);
       
        songPlayer.play();
    }
    
    
    
    
    static void playMario(){
        
        List<Pitch> plist1 = new ArrayList<Pitch>();
        plist1.add(new Pitch(Letter.F,Accidental.SHARP));
        plist1.add(new Pitch(Letter.E,Accidental.NONE,1));
        Sound c1 = new Sound(plist1);     
        SoundEvent sound1 = new SoundEvent(c1,new Duration(1,2));
        
        List<Pitch> plist2 = new ArrayList<Pitch>();
        plist2.add(new Pitch(Letter.F,Accidental.NONE));
        plist2.add(new Pitch(Letter.E,Accidental.NONE,1));
        Sound c2 = new Sound(plist2);     
        SoundEvent sound2 = new SoundEvent(c2,new Duration(1,2));
        
        SoundEvent sound3 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,2));
           
        SoundEvent sound4 = new SoundEvent(c2,new Duration(1,2));
        
        SoundEvent sound5 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,2));     
        
        List<Pitch> plist3 = new ArrayList<Pitch>();
        plist3.add(new Pitch(Letter.F,Accidental.NONE));
        plist3.add(new Pitch(Letter.C,Accidental.NONE,1));
        Sound c3 = new Sound(plist3);     
        SoundEvent sound6 = new SoundEvent(c3,new Duration(1,2));
        
        SoundEvent sound7 = new SoundEvent(c2,new Duration(1,1));
        
        List<SoundEvent> soundEvents1 = new ArrayList<SoundEvent>();
        soundEvents1.add(sound1);
        soundEvents1.add(sound2);
        soundEvents1.add(sound3);
        soundEvents1.add(sound4);
        soundEvents1.add(sound5);
        soundEvents1.add(sound6);
        soundEvents1.add(sound7);
        
        
        List<Pitch> plist4 = new ArrayList<Pitch>();
        plist4.add(new Pitch(Letter.G,Accidental.NONE));
        plist4.add(new Pitch(Letter.B,Accidental.NONE));
        plist4.add(new Pitch(Letter.G,Accidental.NONE,1));
        Sound c4 = new Sound(plist4);     
        SoundEvent sound8 = new SoundEvent(c4,new Duration(1,1));
        
        SoundEvent sound9 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,1));
        
        Sound n1 = new Sound(Arrays.asList((new Pitch(Letter.G,Accidental.NONE))));
        SoundEvent sound10 = new SoundEvent(n1, new Duration(1,1));
        
        SoundEvent sound11 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,1)); 
        
        List<SoundEvent> soundEvents2 = new ArrayList<SoundEvent>();
        soundEvents2.add(sound8);
        soundEvents2.add(sound9);
        soundEvents2.add(sound10);
        soundEvents2.add(sound11);
        
        
        Sound n2 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE,1)));
        SoundEvent sound12 = new SoundEvent(n2, new Duration(3,2));
        
        Sound n3 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE)));
        SoundEvent sound13 = new SoundEvent(n3, new Duration(1,2));
        
        SoundEvent sound14 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,1)); 
        
        Sound n4 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound15 = new SoundEvent(n4, new Duration(1,1));
        
        List<SoundEvent> soundEvents3 = new ArrayList<SoundEvent>();
        soundEvents3.add(sound12);
        soundEvents3.add(sound13);
        soundEvents3.add(sound14);
        soundEvents3.add(sound15);
          
        
        Sound n5 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound16 = new SoundEvent(n5, new Duration(1,2));
        
        Sound n6 = new Sound(Arrays.asList(new Pitch(Letter.A,Accidental.NONE)));
        SoundEvent sound17 = new SoundEvent(n6, new Duration(1,1));
        
        Sound n7 = new Sound(Arrays.asList(new Pitch(Letter.B,Accidental.NONE)));
        SoundEvent sound18 = new SoundEvent(n7, new Duration(1,1));
        
        Sound n8 = new Sound(Arrays.asList(new Pitch(Letter.B,Accidental.FLAT)));
        SoundEvent sound19 = new SoundEvent(n8, new Duration(1,2));
        
        Sound n9 = new Sound(Arrays.asList(new Pitch(Letter.A,Accidental.NONE)));
        SoundEvent sound20 = new SoundEvent(n9, new Duration(1,1));
        
        List<SoundEvent> soundEvents4 = new ArrayList<SoundEvent>();
        soundEvents4.add(sound16);
        soundEvents4.add(sound17);
        soundEvents4.add(sound18);
        soundEvents4.add(sound19);
        soundEvents4.add(sound20);
        
        
        Sound n10 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE)));
        SoundEvent sound21 = new SoundEvent(n10, new Duration(2,3));
        
        Sound n11 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE,1)));
        SoundEvent sound22 = new SoundEvent(n11, new Duration(2,3));
        
        Sound n12 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE,1)));
        SoundEvent sound23 = new SoundEvent(n12, new Duration(2,3));
        
        Sound n13 = new Sound(Arrays.asList(new Pitch(Letter.A,Accidental.NONE,1)));
        SoundEvent sound24 = new SoundEvent(n13, new Duration(1,1));
        
        Sound n14 = new Sound(Arrays.asList(new Pitch(Letter.F,Accidental.NONE,1)));
        SoundEvent sound25 = new SoundEvent(n14, new Duration(1,2));
        
        Sound n15 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE,1)));
        SoundEvent sound26 = new SoundEvent(n15, new Duration(1,2));
        
        List<SoundEvent> soundEvents5 = new ArrayList<SoundEvent>();
        soundEvents5.add(sound21);
        soundEvents5.add(sound22);
        soundEvents5.add(sound23);
        soundEvents5.add(sound24);
        soundEvents5.add(sound25);
        soundEvents5.add(sound26);
        
        
        SoundEvent sound27 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,2)); 
        
        Sound n16 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE,1)));
        SoundEvent sound28 = new SoundEvent(n16, new Duration(1,1));
        
        Sound n17 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE,1)));
        SoundEvent sound29 = new SoundEvent(n17, new Duration(1,2));
        
        Sound n18 = new Sound(Arrays.asList(new Pitch(Letter.D,Accidental.NONE,1)));
        SoundEvent sound30 = new SoundEvent(n18, new Duration(1,2));
        
        Sound n19 = new Sound(Arrays.asList(new Pitch(Letter.B,Accidental.NONE)));
        SoundEvent sound31 = new SoundEvent(n19, new Duration(3,4));
        
        SoundEvent sound32 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(3,4)); 
          
        List<SoundEvent> soundEvents6 = new ArrayList<SoundEvent>();
        soundEvents6.add(sound27);
        soundEvents6.add(sound28);
        soundEvents6.add(sound29);
        soundEvents6.add(sound30);
        soundEvents6.add(sound31);
        soundEvents6.add(sound32);
        
        
          
        
        List<Lyric> lyrics = new ArrayList<Lyric>();
        lyrics.add(new Lyric(""));
        
        Bar bar1 = new Bar(soundEvents1,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar2 = new Bar(soundEvents2,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar3 = new Bar(soundEvents3,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar4 = new Bar(soundEvents4,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar5 = new Bar(soundEvents5,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar6 = new Bar(soundEvents6,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        
        List<Bar> barsForVoice = new ArrayList<Bar>();
        barsForVoice.add(bar1);
        barsForVoice.add(bar2);
        barsForVoice.add(bar3);
        barsForVoice.add(bar4);
        barsForVoice.add(bar5);
        barsForVoice.add(bar6);

         
        Map<Voice, List<Bar>> voicesToBars = new HashMap<Voice, List<Bar>>();
        voicesToBars.put(new Voice(""),barsForVoice);
        
        Song song = new Song(voicesToBars, 5, "Mario", "Me",4,4,new Duration(1,4), new KeySignature(Letter.C,SingleAccidental.NATURAL,true),
                   new Duration(1,4), 200);
        
        PlayableSong ps = new SongConverter(song).getResult();
        
        System.out.println("Ticks per beat: " + ps.getTicksPerBeat());
        
        SongPlayer songPlayer = new SongPlayer(ps);
       
        songPlayer.play();
    
    }
    
    static void playMarioRepeat(){
        
        List<Pitch> plist1 = new ArrayList<Pitch>();
        plist1.add(new Pitch(Letter.F,Accidental.SHARP));
        plist1.add(new Pitch(Letter.E,Accidental.NONE,1));
        Sound c1 = new Sound(plist1);     
        SoundEvent sound1 = new SoundEvent(c1,new Duration(1,2));
        
        List<Pitch> plist2 = new ArrayList<Pitch>();
        plist2.add(new Pitch(Letter.F,Accidental.NONE));
        plist2.add(new Pitch(Letter.E,Accidental.NONE,1));
        Sound c2 = new Sound(plist2);     
        SoundEvent sound2 = new SoundEvent(c2,new Duration(1,2));
        
        SoundEvent sound3 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,2));
           
        SoundEvent sound4 = new SoundEvent(c2,new Duration(1,2));
        
        SoundEvent sound5 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,2));     
        
        List<Pitch> plist3 = new ArrayList<Pitch>();
        plist3.add(new Pitch(Letter.F,Accidental.NONE));
        plist3.add(new Pitch(Letter.C,Accidental.NONE,1));
        Sound c3 = new Sound(plist3);     
        SoundEvent sound6 = new SoundEvent(c3,new Duration(1,2));
        
        SoundEvent sound7 = new SoundEvent(c2,new Duration(1,1));
        
        List<SoundEvent> soundEvents1 = new ArrayList<SoundEvent>();
        soundEvents1.add(sound1);
        soundEvents1.add(sound2);
        soundEvents1.add(sound3);
        soundEvents1.add(sound4);
        soundEvents1.add(sound5);
        soundEvents1.add(sound6);
        soundEvents1.add(sound7);
        
        
        List<Pitch> plist4 = new ArrayList<Pitch>();
        plist4.add(new Pitch(Letter.G,Accidental.NONE));
        plist4.add(new Pitch(Letter.B,Accidental.NONE));
        plist4.add(new Pitch(Letter.G,Accidental.NONE,1));
        Sound c4 = new Sound(plist4);     
        SoundEvent sound8 = new SoundEvent(c4,new Duration(1,1));
        
        SoundEvent sound9 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,1));
        
        Sound n1 = new Sound(Arrays.asList((new Pitch(Letter.G,Accidental.NONE))));
        SoundEvent sound10 = new SoundEvent(n1, new Duration(1,1));
        
        SoundEvent sound11 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,1)); 
        
        List<SoundEvent> soundEvents2 = new ArrayList<SoundEvent>();
        soundEvents2.add(sound8);
        soundEvents2.add(sound9);
        soundEvents2.add(sound10);
        soundEvents2.add(sound11);
        
        
        Sound n2 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE,1)));
        SoundEvent sound12 = new SoundEvent(n2, new Duration(3,2));
        
        Sound n3 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE)));
        SoundEvent sound13 = new SoundEvent(n3, new Duration(1,2));
        
        SoundEvent sound14 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,1)); 
        
        Sound n4 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound15 = new SoundEvent(n4, new Duration(1,1));
        
        List<SoundEvent> soundEvents3 = new ArrayList<SoundEvent>();
        soundEvents3.add(sound12);
        soundEvents3.add(sound13);
        soundEvents3.add(sound14);
        soundEvents3.add(sound15);
          
        
        Sound n5 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE)));
        SoundEvent sound16 = new SoundEvent(n5, new Duration(1,2));
        
        Sound n6 = new Sound(Arrays.asList(new Pitch(Letter.A,Accidental.NONE)));
        SoundEvent sound17 = new SoundEvent(n6, new Duration(1,1));
        
        Sound n7 = new Sound(Arrays.asList(new Pitch(Letter.B,Accidental.NONE)));
        SoundEvent sound18 = new SoundEvent(n7, new Duration(1,1));
        
        Sound n8 = new Sound(Arrays.asList(new Pitch(Letter.B,Accidental.FLAT)));
        SoundEvent sound19 = new SoundEvent(n8, new Duration(1,2));
        
        Sound n9 = new Sound(Arrays.asList(new Pitch(Letter.A,Accidental.NONE)));
        SoundEvent sound20 = new SoundEvent(n9, new Duration(1,1));
        
        List<SoundEvent> soundEvents4 = new ArrayList<SoundEvent>();
        soundEvents4.add(sound16);
        soundEvents4.add(sound17);
        soundEvents4.add(sound18);
        soundEvents4.add(sound19);
        soundEvents4.add(sound20);
        
        
        Sound n10 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE)));
        SoundEvent sound21 = new SoundEvent(n10, new Duration(2,3));
        
        Sound n11 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE,1)));
        SoundEvent sound22 = new SoundEvent(n11, new Duration(2,3));
        
        Sound n12 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE,1)));
        SoundEvent sound23 = new SoundEvent(n12, new Duration(2,3));
        
        Sound n13 = new Sound(Arrays.asList(new Pitch(Letter.A,Accidental.NONE,1)));
        SoundEvent sound24 = new SoundEvent(n13, new Duration(1,1));
        
        Sound n14 = new Sound(Arrays.asList(new Pitch(Letter.F,Accidental.NONE,1)));
        SoundEvent sound25 = new SoundEvent(n14, new Duration(1,2));
        
        Sound n15 = new Sound(Arrays.asList(new Pitch(Letter.G,Accidental.NONE,1)));
        SoundEvent sound26 = new SoundEvent(n15, new Duration(1,2));
        
        List<SoundEvent> soundEvents5 = new ArrayList<SoundEvent>();
        soundEvents5.add(sound21);
        soundEvents5.add(sound22);
        soundEvents5.add(sound23);
        soundEvents5.add(sound24);
        soundEvents5.add(sound25);
        soundEvents5.add(sound26);
        
        
        SoundEvent sound27 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(1,2)); 
        
        Sound n16 = new Sound(Arrays.asList(new Pitch(Letter.E,Accidental.NONE,1)));
        SoundEvent sound28 = new SoundEvent(n16, new Duration(1,1));
        
        Sound n17 = new Sound(Arrays.asList(new Pitch(Letter.C,Accidental.NONE,1)));
        SoundEvent sound29 = new SoundEvent(n17, new Duration(1,2));
        
        Sound n18 = new Sound(Arrays.asList(new Pitch(Letter.D,Accidental.NONE,1)));
        SoundEvent sound30 = new SoundEvent(n18, new Duration(1,2));
        
        Sound n19 = new Sound(Arrays.asList(new Pitch(Letter.B,Accidental.NONE)));
        SoundEvent sound31 = new SoundEvent(n19, new Duration(3,4));
        
        SoundEvent sound32 = new SoundEvent(new Sound(new ArrayList<Pitch>()),new Duration(3,4)); 
          
        List<SoundEvent> soundEvents6 = new ArrayList<SoundEvent>();
        soundEvents6.add(sound27);
        soundEvents6.add(sound28);
        soundEvents6.add(sound29);
        soundEvents6.add(sound30);
        soundEvents6.add(sound31);
        soundEvents6.add(sound32);
        
        
          
        
        List<Lyric> lyrics = new ArrayList<Lyric>();
        lyrics.add(new Lyric(""));
        
        Bar bar1 = new Bar(soundEvents1,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar2 = new Bar(soundEvents2,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar3 = new Bar(soundEvents3,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar4 = new Bar(soundEvents4,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar5 = new Bar(soundEvents5,lyrics,BarPrefix.NONE,BarSuffix.NONE);
        Bar bar6 = new Bar(soundEvents6,lyrics,BarPrefix.NONE,BarSuffix.END_REPEAT);
        
        List<Bar> barsForVoice = new ArrayList<Bar>();
        barsForVoice.add(bar1);
        barsForVoice.add(bar2);
        barsForVoice.add(bar3);
        barsForVoice.add(bar4);
        barsForVoice.add(bar5);
        barsForVoice.add(bar6);

         
        Map<Voice, List<Bar>> voicesToBars = new HashMap<Voice, List<Bar>>();
        voicesToBars.put(new Voice(""),barsForVoice);
        
        Song song = new Song(voicesToBars, 5, "Mario", "Me",4,4,new Duration(1,4), new KeySignature(Letter.C,SingleAccidental.NATURAL,true),
                   new Duration(1,4), 200);
        
        PlayableSong ps = new SongConverter(song).getResult();
        
        System.out.println("Ticks per beat: " + ps.getTicksPerBeat());
        
        SongPlayer songPlayer = new SongPlayer(ps);
       
        songPlayer.play();
    
    }
}
