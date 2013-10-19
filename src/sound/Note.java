package sound;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * TODO: write spec
 * TODO: write tests
 */
public class Note implements Sound {

    private final Pitch pitch;
    private final List<Pitch> pitch_list;

    public Note(Pitch pitch){
        this.pitch = pitch;
        List<Pitch> tmp_list = new ArrayList<Pitch>();
        tmp_list.add(pitch);
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
        Note that = (Note) obj;
        return this.pitch.equals(that.pitch);
    }

    @Override
    public int hashCode() {
        return pitch.hashCode();
    }

}
