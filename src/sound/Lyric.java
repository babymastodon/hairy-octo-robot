package sound;

/**
 * A string of characters corresponding to a single
 * syllable of song lyrics.
 */
public class Lyric {

    private final String text;

    /**
     * Create a lyrics object wiht the given string as text.
     *
     * The text may contain anything.
     *
     * @param text a string representing a syllable of lyrics.
     */
    public Lyric(String text){
        this.text = text;
    }

    /**
     * Get the text associated with this lyrics object.
     *
     * @return the text used to construct this object
     */
    public String getText(){
        return text;
    }

    /**
     * Two lyrics are equal if they have the same text.
     *
     * @return true if the other object is semantically equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Lyric that = (Lyric) obj;
        return this.text.equals(that.text);
    }

    /**
     * Updated to match the new equals() function
     */
    @Override
    public int hashCode() {
        return text.hashCode();
    }

}
