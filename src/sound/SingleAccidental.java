package sound;

/**
 * Represents a single accidental attached to a pitch.
 *
 * Same as the @see Accidental class, except only represents
 * the accidentals that can be found within a key signature.
 */
public enum SingleAccidental {
    SHARP(1), FLAT(-1), NATURAL(0);

    private int value;

    private SingleAccidental(int value) {
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
