package player;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import sound.*;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        String contents = readFile(file);
        Song song = new SongParser(contents).getResult();
        System.out.println("Playing " + song.getTitle() + " by " + song.getComposer());
        PlayableSong playableSong = new SongConverter(song).getResult();
        new SongPlayer(playableSong, new ConsoleLyricListener()).play();
    }

    /**
     * Play all the songs in the sample_abc directory.
     */
    public static void main(String[] args) {
        File basedir = new File("sample_abc");
        for (File file: basedir.listFiles()){
            String path = file.getPath();
            if (path.matches(".*\\.abc")){
                play(path);
            }
        }
    }

    public static String readFile(String path){
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            String contents = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(encoded)).toString();
            return contents;
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
