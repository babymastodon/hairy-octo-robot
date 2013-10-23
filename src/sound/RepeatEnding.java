package sound;

/**
 * If a bar is at the beginning of a numbered ending,
 * this enum represents whether it's a first ending
 * or a second ending.
 *
 * If the bar is not the first bar of an ending, then
 * it is assigned NONE.
 */
public enum RepeatEnding {
    FIRST, SECOND, NONE;
}
