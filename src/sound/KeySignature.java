package sound;
import java.util.Map;
import java.util.HashMap;

/**
 * A mapping from letters to accidentals as given by
 * a standard musical key signature.
 *
 * Immutable object.
 */
public class KeySignature {

    // The order that flats appear in key signatures
    private static final Letter[] flatNotes = {Letter.B, Letter.E,
        Letter.A, Letter.D, Letter.G, Letter.C, Letter.F};

    // mapping from letters to accidentals
    private final Map<Letter, Accidental> letterMap;
    private final Letter letter;
    private final SingleAccidental accidental;
    private final boolean major;

    /**
     * Construct a KeySignature given a musical key.
     *
     * A musical key consists of a letter, a single accidental,
     * and whether the key is major or minor. For example, 
     * A flat minor is an example of a musical key.
     *
     * @param letter the letter of the musical key
     * @param accidental the accidental of the key, NATURAL if no accidental
     * @param major true if the key is major. false if minor
     */
    public KeySignature(Letter letter, SingleAccidental accidental, boolean major){
        this.letter = letter;
        this.accidental = accidental;
        this.major = major;

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
     * Get the accidental for the given letter as
     * prescribed by the key signature.
     *
     * @param letter the letter that is being queried
     */
    public Accidental getAccidental(Letter letter){
        return letterMap.get(letter);
    }


    /**
     * Two KeySignatures are equal if they were constructed
     * with the same arguments.
     *
     * @return true if the other object is semantically equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        KeySignature that = (KeySignature) obj;
        return this.letter == that.letter &&
            this.accidental == that.accidental &&
            this.major == that.major;
    }

    /**
     * Updated to match the new equals() function
     */
    @Override
    public int hashCode() {
        return this.letter.hashCode() +
            this.accidental.hashCode() +
            ((this.major) ? 1 : 0);
    }
}
