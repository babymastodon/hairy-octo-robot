package sound;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A group of one or more SoundEvents and Lyrics.
 *
 * There are different types of bars in the music. Some bars are the
 * beginning of repeated sections. Some bars end repeated sections.
 * Some bars indicate the beginning of a first repeat ending (eg. “[1”).
 *
 * The different types of bars are represented by passing
 * various arguments to the Bar constructor.
 */
public class Bar {

    private final List<SoundEvent> events;
    private final List<Lyric> lyrics;
    private final boolean beginRepeat;
    private final boolean endRepeat;
    private final RepeatEnding repeatEnding;

    /**
     * Construct a Bar with the given SoundEvents, Lyrics,
     * and type variables.
     *
     * @param events a list of sound events representing the note.
     * @param lyrics a list of lyrics to be assigned to the notes
     * @param beginRepeat true if this bar is the beginning of a
     *        repeated section
     * @param endRepeat true if this bar is the end of a
     *        repeated section
     * @param repeatEnding indicates whether this bar is the beginning
     *        of the first ending or seconding ending of a repeated
     *        segments of bars (or none at all).
     */
    public Bar(List<SoundEvent> events, List<Lyric> lyrics,
            boolean beginRepeat, boolean endRepeat, RepeatEnding repeatEnding){
        this.events = new ArrayList<SoundEvent>(events);
        this.lyrics = new ArrayList<Lyric>(lyrics);
        this.beginRepeat = beginRepeat;
        this.endRepeat = endRepeat;
        this.repeatEnding = repeatEnding;
    }

    /**
     * Return the events (notes) in this bar
     *
     * @return an unmodifiable list of events.
     */
    public List<SoundEvent> getEvents(){
        return Collections.unmodifiableList(events);
    }

    /**
     * Return the lyrics in this bar
     *
     * @return an unmodifiable list of lyrics.
     */
    public List<Lyric> getLyrics(){
        return Collections.unmodifiableList(lyrics);
    }

    /**
     * Return whether this is the beginning of
     * a repeated segment.
     *
     * @return true if beginRepeat
     */
    public boolean getBeginRepeat(){
        return beginRepeat;
    }

    /**
     * Return whether this is the end of
     * a repeated segment.
     *
     * @return true if endRepeat
     */
    public boolean getEndRepeat(){
        return endRepeat;
    }

    /**
     * Return the repeat ending if this bar is the
     * beginning of a numbered ending.
     *
     * @return FIRST if first ending, SECOND if second ending,
     *         or NONE if this is not the beginning of an
     *         ending
     */
    public RepeatEnding getRepeatEnding(){
        return repeatEnding;
    }

}
