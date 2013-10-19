package sound;

import java.util.Map;
import java.util.HashMap;

public class KeySignature {

    // The order that flats appear in key signatures
    private static final Letter[] flatNotes = {Letter.B, Letter.E,
        Letter.A, Letter.D, Letter.G, Letter.C, Letter.F};

    // mapping from letters to accidentals
    private final Map<Letter, Accidental> letterMap;

    /**
     * TODO: write doc
     * TODO: write tests
     */
    public KeySignature(Letter letter, SingleAccidental accidental, boolean major){
        // The number of flats in the key signature. If the number is negative,
        // then it's the number of sharps (since sharp is the opposite of flat). 
        // If the number of flats is greater than 7, then it loops around and starts
        // adding double flats to the beginning of the key signature. Likewise
        // for sharps.
        int nFlats = 0;


        // a tricky little formula for figuring out nFlats based on
        // the letter, accidental, and whether it's a major key
        switch (accidental){
            case NATURAL: nFlats = -5; break;
            case FLAT: nFlats = 2; break;
            case SHARP: nFlats = -12; break;
        }
        if (major == false){
            nFlats += 3;
        }
        for (int i=0; i<flatNotes.length; i++){
            if (letter == flatNotes[i]){
                nFlats += i;
            }
        }

        // Calculate the actual mapping from letters to accidentals
        letterMap = new HashMap<Letter, Accidental>();
        for (Letter l: Letter.values()){
            letterMap.put(l, Accidental.NATURAL);
        }
        if (nFlats > 0){
            for (int i=0; i<nFlats; i++){
                letterMap.put(flatNotes[i%7], (i<7) ? Accidental.FLAT : Accidental.DOUBLE_FLAT);
            }
        } else {
            for (int i=-1; i>=nFlats; i--){
                letterMap.put(flatNotes[(i+14)%7], (i>=-7) ? Accidental.SHARP : Accidental.DOUBLE_SHARP);
            }
        }
    }


    /**
     * TODO: write spec
     */
    public Accidental getAccidental(Letter letter){
        return letterMap.get(letter);
    }
}
