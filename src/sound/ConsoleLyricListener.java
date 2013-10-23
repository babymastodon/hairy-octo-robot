package sound;

/**
 * A LyricListener that prints lyrics to the console
 * as they are received.
 */
public class ConsoleLyricListener implements LyricListener {

    /**
     * Print all recieved lyrics to the console.
     */
    @Override
    public void processLyricEvent(String text) {
        System.out.println(text);
    }

}
