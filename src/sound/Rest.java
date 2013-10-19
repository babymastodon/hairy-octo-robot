package sound;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * TODO: write spec
 * TODO: write test
 */
public class Rest implements Sound {

    private final List<Pitch> pitch_list;

    public Rest(){
        List<Pitch> tmp_list = new ArrayList<Pitch>();
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
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
