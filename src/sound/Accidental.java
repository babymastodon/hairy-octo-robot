package sound;

public enum Accidental {
    SHARP(1), FLAT(-1), DOUBLE_SHARP(2), DOUBLE_FLAT(-2), NATURAL(0), NONE(100);

    private int value;

    private Accidental(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
