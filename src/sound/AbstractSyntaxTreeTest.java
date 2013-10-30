package sound;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;
import static sound.Letter.*;
import static sound.Accidental.*;

/**
 * Tests the constructors and equality operators
 * for the following immutable classes:
 *
 *      Bar
 *      Duration
 *      KeySignature
 *      Lyric
 *      Pitch
 *      Song
 *      Sound
 *      SoundEvent
 *      Voice
 *
 * Most other methods of these classes
 * are trivial setters and getters, so they were
 * left untested.
 */
public class AbstractSyntaxTreeTest {

    /**
     * Durations are equal if they have the same value.
     */
    @Test
    public void testDurationEquals(){
        Duration d1 = new Duration(1,3);
        Duration d2 = new Duration(3,9);
        Duration d3 = new Duration(1,4);
        assertTrue(d1.equals(d2));
        assertTrue(!d1.equals(d3));
    }


    /**
     * Pitches are equal if they have the same value.
     */
    @Test
    public void testPitchEquals(){
        Pitch p1 = new Pitch(C, SHARP, 0);
        Pitch p2 = new Pitch(C, SHARP, 0);
        Pitch p3 = new Pitch(F, SHARP, 0);
        assertTrue(p1.equals(p2));
        assertTrue(!p1.equals(p3));
    }


    /**
     * Sounds are equal if they have the same value.
     */
    @Test
    public void testSoundEquals(){
        Sound s1 = new Sound(
                Arrays.asList(
                    new Pitch(C,SHARP,0),
                    new Pitch(F,SHARP,0)));
        Sound s2 = new Sound(
                Arrays.asList(
                    new Pitch(F,SHARP,0),
                    new Pitch(C,SHARP,0)));
        Sound s3 = new Sound(
                Arrays.asList(
                    new Pitch(F,FLAT,0),
                    new Pitch(C,SHARP,0)));
        assertTrue(s1.equals(s2));
        assertTrue(!s1.equals(s3));
    }


    /**
     * Sound events are equal if they have the same
     * sounds and durations.
     */
    @Test
    public void testSoundEventEquals(){
        Sound s1 = new Sound(
                Arrays.asList(
                    new Pitch(C,SHARP,0),
                    new Pitch(F,SHARP,0)));
        Sound s2 = new Sound(
                Arrays.asList(
                    new Pitch(F,SHARP,0),
                    new Pitch(C,SHARP,0)));
        Sound s3 = new Sound(
                Arrays.asList(
                    new Pitch(F,FLAT,0),
                    new Pitch(C,SHARP,0)));
        Duration d1 = new Duration(1,3);
        Duration d2 = new Duration(3,9);
        Duration d3 = new Duration(1,4);

        SoundEvent e1 = new SoundEvent(s1, d1);
        SoundEvent e2 = new SoundEvent(s2, d2);
        SoundEvent e3 = new SoundEvent(s1, d3);
        SoundEvent e4 = new SoundEvent(s3, d1);
        assertTrue(e1.equals(e2));
        assertTrue(!e1.equals(e3));
        assertTrue(!e1.equals(e4));
    }

    /**
     * Lyrics are equal if they have the same text.
     */
    @Test
    public void testLyricsEquals(){
        Lyric l1 = new Lyric("abc");
        Lyric l2 = new Lyric("abc");
        Lyric l3 = new Lyric("def");

        assertTrue(l1.equals(l2));
        assertTrue(!l1.equals(l3));
    }


    /**
     * Bars are equal if they have the same
     * sound events, lyrics, and flags.
     */
    @Test
    public void testBarEquals(){
        Bar b1 = new Bar(
                Arrays.asList(
                    new SoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(C,SHARP,0),
                                new Pitch(F,SHARP,0))),
                        new Duration(1,3))),
                Arrays.asList(
                    new Lyric("abc")),
                BarPrefix.NONE,
                BarSuffix.NONE);
        Bar b2 = new Bar(
                Arrays.asList(
                    new SoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(C,SHARP,0),
                                new Pitch(F,SHARP,0))),
                        new Duration(1,3))),
                Arrays.asList(
                    new Lyric("abc")),
                BarPrefix.NONE,
                BarSuffix.NONE);
        Bar b3 = new Bar(
                Arrays.asList(
                    new SoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(C,SHARP,0),
                                new Pitch(F,SHARP,0))),
                        new Duration(1,3))),
                Arrays.asList(
                    new Lyric("abc")),
                BarPrefix.BEGIN_REPEAT,
                BarSuffix.NONE);
        Bar b4 = new Bar(
                Arrays.asList(
                    new SoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(C,SHARP,0),
                                new Pitch(F,SHARP,0))),
                        new Duration(1,3))),
                Arrays.asList(
                    new Lyric("def")),
                BarPrefix.NONE,
                BarSuffix.NONE);
        Bar b5 = new Bar(
                Arrays.asList(
                    new SoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(C,SHARP,0),
                                new Pitch(F,SHARP,0))),
                        new Duration(1,3))),
                Arrays.asList(
                    new Lyric("abc")),
                BarPrefix.NONE,
                BarSuffix.END_REPEAT);
        Bar b6 = new Bar(
                Arrays.asList(
                    new SoundEvent(
                        new Sound(
                            Arrays.asList(
                                new Pitch(C,NATURAL,0),
                                new Pitch(F,SHARP,0))),
                        new Duration(1,3))),
                Arrays.asList(
                    new Lyric("abc")),
                BarPrefix.NONE,
                BarSuffix.NONE);

        assertTrue(b1.equals(b2));
        assertTrue(!b1.equals(b3));
        assertTrue(!b1.equals(b4));
        assertTrue(!b1.equals(b5));
        assertTrue(!b1.equals(b6));
    }


    /**
     * KeySignatures are equal if they were constructed
     * with the same arguments.
     */
    @Test
    public void testKeySignatureEquals(){
        KeySignature k1 = new KeySignature(C, SingleAccidental.SHARP, false);
        KeySignature k2 = new KeySignature(C, SingleAccidental.SHARP, false);
        KeySignature k3 = new KeySignature(D, SingleAccidental.SHARP, false);
        KeySignature k4 = new KeySignature(C, SingleAccidental.NATURAL, false);
        KeySignature k5 = new KeySignature(C, SingleAccidental.SHARP, true);

        assertTrue(k1.equals(k2));
        assertTrue(!k1.equals(k3));
        assertTrue(!k1.equals(k4));
        assertTrue(!k1.equals(k5));
    }


    /**
     * Voices are equal if they were constructed with the same string.
     */
    @Test
    public void testVoiceEquals(){
        Voice v1 = new Voice("voice1");
        Voice v2 = new Voice("voice1");
        Voice v3 = new Voice();

        assertTrue(v1.equals(v2));
        assertTrue(!v1.equals(v3));
    }

}
