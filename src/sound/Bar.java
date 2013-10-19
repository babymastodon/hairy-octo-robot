package sound;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Bar {

    private final List<SoundEvent> events;
    private final List<Lyric> lyrics;
    private final boolean beginRepeat;
    private final boolean endRepeat;
    private final RepeatEnding repeatEnding;

    public Bar(List<SoundEvent> events, List<Lyric> lyrics,
            boolean beginRepeat, boolean endRepeat, RepeatEnding repeatEnding){
        this.events = new ArrayList<SoundEvent>(events);
        this.lyrics = new ArrayList<Lyric>(lyrics);
        this.beginRepeat = beginRepeat;
        this.endRepeat = endRepeat;
        this.repeatEnding = repeatEnding;
    }

    public List<SoundEvent> getEvents(){
        return Collections.unmodifiableList(events);
    }

    public List<Lyric> getLyrics(){
        return Collections.unmodifiableList(lyrics);
    }

    public boolean getBeginRepeat(){
        return beginRepeat;
    }

    public boolean getEndRepeat(){
        return endRepeat;
    }

    public RepeatEnding getRepeatEnding(){
        return repeatEnding;
    }

}
