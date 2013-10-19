package sound;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * TODO: write spec
 * TODO: write test
 */
public class Chord implements Sound {

    private final List<Pitch> pitch_list;

    public Chord(List<Pitch> pitches){
        List<Pitch> tmp_list = new ArrayList<Pitch>(pitches);
        this.pitch_list = Collections.unmodifiableList(tmp_list);
    }

    @Override
    public List<Pitch> getPitches(){
        return pitch_list;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Chord that = (Chord) obj;
        return this.pitch_list.equals(that.pitch_list);
    }

    @Override
    public int hashCode() {
        return pitch_list.hashCode();
    }

}
