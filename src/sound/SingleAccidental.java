package sound;

public enum SingleAccidental {
    SHARP(1), FLAT(-1), NATURAL(0);

    private int value;

    private SingleAccidental(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
