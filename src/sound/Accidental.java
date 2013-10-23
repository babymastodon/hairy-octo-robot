package sound;

/**
 * Represents an accidental attached to a pitch.
 *
 * Each accidental contains a "value" which represents
 * the number of semitones that it moves the pitch. For
 * example, SHARP has value == 1 because raises the pitch
 * one semitone. NATURAL and NONE both have no effect on
 * the pitch, so they have value == 0.
 */
public enum Accidental {
    SHARP(1), FLAT(-1), DOUBLE_SHARP(2), DOUBLE_FLAT(-2), NATURAL(0), NONE(0);

    private int value;

    private Accidental(int value) {
        this.value = value;
    }

    /**
     * Get the value associated with this accidental.
     *
     * @return the value (number of semitones)
     */
    public int getValue(){
        return value;
    }

}
