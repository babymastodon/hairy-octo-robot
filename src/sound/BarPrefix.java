package sound;

/**
 * An enum indicating whether a bar is prefixed with a first
 * ending ‘[1’ (FIRST_ENDING), the second ending '[2’ (SECOND_ENDING), a begin
 * repeat segment ‘|:’ (BEGIN_REPEAT), a begin of major section ‘[|‘
 * (BEGIN_SECTION), or nothing at all (NONE).
 */
public enum BarPrefix {
    FIRST_ENDING, SECOND_ENDING, BEGIN_REPEAT, BEGIN_SECTION, NONE;
}
