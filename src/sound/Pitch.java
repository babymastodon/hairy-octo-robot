package sound;

/**
 * Pitch represents a note on the staff plus an
 * accidental.
 *
 * A Pitch object is immutable. Only the 127 MIDI
 * notes are valid pitches.
 *
 * There may exist several semantically different Pitch
 * object with the same MIDI value. Two Pitch objects
 * are semantically equal only if they have the same letter,
 * accidental, and octave.
 *
 * Rep Invariant:
 *   
 *   0 <= toMidiNote() <= 127
 *
 * The zeroeth octave is starts at middle C and
 * ends on the B above. Lower octaves are indexed
 * with a negative "octave" number, and higher ones are
 * indexed with a positive number.
 */
public class Pitch implements Comparable<Pitch> {
    private final Letter letter;
    private final Accidental accidental;
    private final int octave;


    /**
     * Construct a Pitch with the given letter value, accidental,
     * and octave.
     *
     * The letter, accidental, and octave must refer to one of the
     * 127 MIDI pitches. If a Pitch object is consructed wiht a value
     * outisde this range, then the behavior of the object is undefined.
     *
     * @param letter the letter of the note
     * @param accidental the accidental of the note
     * @param octave an integer representing the octave of the note. The
     *        octave starting at middle C is represented by the number 0.
     *        The octave above has the number 1, the octave below has
     *        the number -1, etc.
     */
    public Pitch(Letter letter, Accidental accidental, int octave) {
        this.letter = letter;
        this.accidental = accidental;
        this.octave = octave;
        checkRep();
    }

    /**
     * A convenience constructor for a Pitch with octave == 0.
     *
     * @param letter the letter of the note
     * @param accidental the accidental of the note
     */
    public Pitch(Letter letter, Accidental accidental) {
        this(letter, accidental, 0);
    }

    /**
     * A convenience constructor for a Pitch with no accidentals.
     *
     * @param letter the letter of the note
     * @param octave the octave of the note
     */
    public Pitch(Letter letter, int octave) {
        this(letter, Accidental.NONE, octave);
    }

    /**
     * A convenience constructor for a Pitch with no accidentals
     * and octave == 0.
     *
     * @param letter the letter of the note
     */
    public Pitch(Letter letter) {
        this(letter, Accidental.NONE, 0);
    }

    /**
     * Convert this pitch into a MIDI note.
     *
     * @return the midi note of this pitch
     */
    public int toMidiNote() {
        return this.letter.getValue() +
               this.accidental.getValue() +
               (12 * this.octave) + 60;
    }

    /**
     * Get the letter used to construct this pitch.
     *
     * @return the letter of the pitch
     */
    public Letter getLetter(){
        return letter;
    }

    /**
     * Get the accidental used to construct this pitch.
     *
     * @return the accidental of the pitch
     */
    public Accidental getAccidental(){
        return accidental;
    }

    /**
     * Get the octave used to construct this pitch.
     *
     * @return the octave of the pitch
     */
    public int getOctave(){
        return octave;
    }

    /**
     * Two pitches are equal iff they have the same letter,
     * accidental, and octave.
     *
     * @return true if the other object is semantically equal to this
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Pitch that = (Pitch) obj;
        return this.letter == that.letter
            && this.accidental == that.accidental
            && this.octave == that.octave;
    }

    /**
     * Updated to reflect the equals() function.
     *
     * @return an integer hashcode
     */
    @Override
    public int hashCode() {
        return letter.getValue()+ accidental.getValue();
    }

    private void checkRep(){
        assert 0 <= toMidiNote();
        assert toMidiNote() <= 127;
    }

    /**
     * Return a string representation of the pitch's member variables.
     *
     * @return a string
     */
    @Override
    public String toString(){
        return "Pitch(" + letter.toString() + ", " + accidental.toString() + ", " + octave + ")";
    }


    /**
     * Pitch follows a lexographic ordering based on
     * its string representation.
     *
     * @return 1, -1, or 0 if other is greater than, less than, or equal
     */
    @Override
    public int compareTo(Pitch other){
        return toString().compareTo(other.toString());
    }

}
