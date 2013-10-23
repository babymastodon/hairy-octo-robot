package sound;

/**
 * Represents a single letter within the standard musical
 * scale.
 *
 * Each letter is assigned a value ranging from 0 through 11,
 * representing it's position (in semitones) in the standard
 * C scale. For example, D.getValue() == 2 since it is two semitones
 * above C.
 */
public enum Letter {
    A(9), B(11), C(0), D(2), E(4), F(5), G(7);

    private int value;

    private Letter(int value) {
        this.value = value;
    }

    /**
     * Convert the given character to a Letter object.
     *
     * Capital letters and lowercase letters are both supported.
     *
     * @param c a single character in the range [A-G], either
     *        capital or lowercase.
     */
    public static Letter fromChar(char c) {
        switch (c){
            case 'a': case 'A': return A;
            case 'b': case 'B': return B;
            case 'c': case 'C': return C;
            case 'd': case 'D': return D;
            case 'e': case 'E': return E;
            case 'f': case 'F': return F;
            case 'g': case 'G': return G;
        }
        throw new RuntimeException("Note character must be in the range A-G: " + c);
    }

    /**
     * Get the location of the letter in the standard C scale.
     *
     * @return the number of semitones above C.
     */
    public int getValue(){
        return value;
    }

}
