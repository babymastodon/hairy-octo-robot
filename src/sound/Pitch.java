package sound;

/**
 * Pitch represents a note on the staff plus an
 * accidental. Only the 127 MIDI notes are valid
 * pitches.
 *
 * Rep Invariant:
 *   
 *   Accidental is in {SHARP, DOUBLE_SHARP, FLAT, DOUBLE_FLAT, NATURAL}.
 *   0 <= toMidiNote() <= 127
 *
 * The zeroeth octave is starts at middle C and
 * ends on the B above. Lower octaves are indexed
 * with a negative "octave" number, and higher ones are
 * indexed with a positive number.
 */
public class Pitch {
    private final Letter letter;
    private final Accidental accidental;
    private final int octave;


    public Pitch(Letter letter, Accidental accidental, int octave) {
        this.letter = letter;
        this.accidental = accidental;
        this.octave = octave;
        checkRep();
    }

    public Pitch(Letter letter, Accidental accidental) {
        this(letter, accidental, 0);
    }

    public Pitch(Letter letter, int octave) {
        this(letter, Accidental.NATURAL, octave);
    }

    public Pitch(Letter letter) {
        this(letter, Accidental.NATURAL, 0);
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

    public Letter getLetter(){
        return letter;
    }

    public Accidental getAccidental(){
        return accidental;
    }

    public int getOctave(){
        return octave;
    }

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

    @Override
    public int hashCode() {
        return letter.getValue()+ accidental.getValue();
    }

    private void checkRep(){
        assert accidental != Accidental.NONE;
        assert 0 <= toMidiNote();
        assert toMidiNote() <= 127;
    }

}
