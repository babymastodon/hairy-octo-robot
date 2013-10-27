package sound;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * A list of pitches to be played as a single group of notes.
 *
 * A rest is a Sound containing no pitches, a single
 * note is a Sound containing a single pitch, and a
 * chord is a sound containing several pitches.
 *
 * Immutable object.
 */
public class Sound {

    private final List<Pitch> pitch_list;

    /**
     * Construct a Sound with the given list of pitchs.
     *
     * @param pitches the list of pitches
     */
    public Sound(List<Pitch> pitches){
        // remove potential duplicates in the given list
        List<Pitch> tmp_list = new ArrayList<Pitch>(new HashSet<Pitch>(pitches));
        this.pitch_list = Collections.unmodifiableList(tmp_list);
    }


    /**
     * Construct a Sound with a single pitch.
     *
     * @param pitch a single pitch
     */
    public Sound(Pitch pitch){
        this.pitch_list = Collections.unmodifiableList(
                new ArrayList<Pitch>(Arrays.asList(pitch)));
    }


    /**
     * Construct a Sound with no pitches (a rest).
     */
    public Sound(){
        this.pitch_list = new ArrayList<Pitch>();
    }

    
    /**
     * Retrieve the list of pitches associated with this sound.
     *
     * This list will contain no duplicates.
     *
     * @return an unmodifiable list of pitches.
     */
    public List<Pitch> getPitches(){
        return pitch_list;
    }

    /**
     * Two pitches are semantically equal if they contain the
     * same pitches.
     *
     * @return an unmodifiable list of pitches.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Sound that = (Sound) obj;
        // TODO: equality should not depend on order of pitches
        return this.pitch_list.equals(that.getPitches());
    }

    /**
     * Updated to reflect the new implementation of equals().
     *
     * @return an integer hashcode
     */
    @Override
    public int hashCode() {
        return pitch_list.hashCode();
    }

}
