package sound;

/**
 * A unique identifier for an instrumental voice.
 *
 * Internally represented as a name string. Two voice
 * objects are equal if they have the same name.
 *
 * By convention, the "default" Voice is internally
 * represented by an empty string. Therefore, all
 * non-default user-specified voices must have non-empty
 * names.
 */
public class Voice {

    private final String name;

    /**
     * Construct a voice with the given name.
     *
     * @param name a string. Leave blank for the
     *        default Voice.
     */
    public Voice(String name){
        this.name = name;
    }

    /**
     * Construct the default voice.
     */
    public Voice(){
        this.name = "";
    }

    /**
     * @return the name of the voice.
     */
    public String getName(){
        return name;
    }

    /**
     * @return the name of the voice
     */
    @Override
    public String toString(){
        return name;
    }

    /**
     * Two voice objects are semantically equivalent
     * if they have the same name.
     *
     * @return true if the other (Voice) is semantically equivalent
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Voice that = (Voice) obj;
        return this.name.equals(that.name);
    }

    /**
     * Hashcode modified to match the equals function.
     *
     * @return an intger hashcode.
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
