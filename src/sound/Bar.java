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
    private final BarPrefix prefix;
    private final BarSuffix suffix;

    /**
     * Construct a Bar with the given SoundEvents, Lyrics,
     * and type variables.
     *
     * @param events a list of sound events representing the note.
     * @param lyrics a list of lyrics to be assigned to the notes
     * @param prefix the prefix of the bar @see BarPrefix
     * @param suffix the suffix of the bar @see BarSuffix
     */
    public Bar(List<SoundEvent> events, List<Lyric> lyrics,
            BarPrefix prefix, BarSuffix suffix){
        this.events = new ArrayList<SoundEvent>(events);
        this.lyrics = new ArrayList<Lyric>(lyrics);
        this.prefix = prefix;
        this.suffix = suffix;
    }

    /**
     * Shortcut constructor for a normal Bar with no lyrics.
     *
     * @param events a list of sound events representing the note.
     */
    public Bar(List<SoundEvent> events){
        this.events = new ArrayList<SoundEvent>(events);
        this.lyrics = new ArrayList<Lyric>();
        this.prefix = BarPrefix.NONE;
        this.suffix = BarSuffix.NONE;
    }

    /**
     * Shortcut constructor for a normal Bar with lyrics.
     *
     * @param events a list of sound events representing the note.
     * @param lyrics a list of lyrics to be assigned to the notes
     */
    public Bar(List<SoundEvent> events, List<Lyric> lyrics){
        this.events = new ArrayList<SoundEvent>(events);
        this.lyrics = new ArrayList<Lyric>(lyrics);
        this.prefix = BarPrefix.NONE;
        this.suffix = BarSuffix.NONE;
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
     * Return the prefix of this bar
     *
     * @return prefix
     */
    public BarPrefix getPrefix(){
        return prefix;
    }

    /**
     * Return the suffix of this bar.
     *
     * @return suffix
     */
    public BarSuffix getSuffix(){
        return suffix;
    }
}
