package sound;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;
import static org.junit.Assert.*;


public class SongParserTest {

    // TODO: remove this function when done debugging
    @Test
    public void testParsePublic() {
        readSong("sample_abc/piece_1.abc");
    }


    /**
     * Should not crash on this set of real-world examples.
     */
    @Test
    public void testRealWorldExamples(){
        File basedir = new File("sample_abc");
        for (File file: basedir.listFiles()){
            readSong(file.getPath());
        }
    }

    /**
     * The parser should accept the optional header
     * fields in any order.
     */
    @Test
    public void testHeaderOrder(){
        File basedir = new File("test_abc/header_order");
        for (File file: basedir.listFiles()){
            Song s = readSong(file.getPath());

            assertEquals(s.getTitle(), "Simple scale");
            assertEquals(s.getIndex(), 1);
            assertEquals(s.getBeatsPerMinute(), 120);
            assertEquals(s.getMeterNumerator(), 1);
            assertEquals(s.getMeterDenominator(), 4);
            assertEquals(s.getDefaultDuration(), new Duration(1,4));
            assertEquals(s.getComposer(), "Composer Name");
        }
    }

    /**
     * Should correctly handle valid whitespace in the header.
     *
     * Includes tabs, newlines, carriage returns, and spaces.
     */
    @Test
    public void testHeaderValidSpaces(){
        Song s = readSong("test_abc/header_valid_spaces.abc");

        //the title contains two invisible tab charactes
        assertEquals(s.getTitle(), "   	Simple	scale");
        assertEquals(s.getIndex(),  1);
        assertEquals(s.getBeatsPerMinute(),  1200);
        assertEquals(s.getBeatDuration(), new Duration(1,42));
        assertEquals(s.getMeterNumerator(),  4);
        assertEquals(s.getMeterDenominator(),  4);
        assertEquals(s.getDefaultDuration(), new Duration(1,4));
        //the title contains two invisible tab charactes
        assertEquals(s.getComposer(), "   	Unknown   	");
    }


    /**
     * Should throw error on invalid whitespace in the header.
     *
     * For example:
     *      whitespace before the header identifier
     *      whitespace before the colon
     *      newlines and carriage returns within expressions
     */
    @Test
    public void testHeaderInvalidSpaces(){
        File basedir = new File("test_abc/header_invalid_spaces");
        for (File file: basedir.listFiles()){
            shouldFail(file.getPath());
        }
    }


    /**
     * Should throw error when required fields (X, T, K)
     * are missing.
     */
    @Test
    public void testHeaderMissingFields(){
        File basedir = new File("test_abc/header_missing_fields");
        for (File file: basedir.listFiles()){
            shouldFail(file.getPath());
        }
    }

    /**
     * Should use the default meter (4/4) when not provided.
     */
    @Test
    public void testHeaderDefaultM(){
        Song s = readSong("test_abc/header_defaults/default_M.abc");
        assertEquals(s.getMeterNumerator(), 4);
        assertEquals(s.getMeterDenominator(), 4);
    }

    /**
     * Should use the default note length if not provided.
     *
     * The default note length is determined by the following
     * rule:
     *      
     *      If there is no 'L' field defined, a unit note length
     *      is set based on the meter: if it is less than 0.75 the
     *      default unit note length is a sixteenth note; if it is
     *      0.75 or greater, it is an eighth note. If neither 'M' nor
     *      'L' fields are present, the default note length is an eighth.
     */
    @Test
    public void testHeaderDefaultL(){
        Song s = readSong("test_abc/header_defaults/default_L_no_M.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,8));

        s = readSong("test_abc/header_defaults/default_L_with_M=11-16.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,16));

        s = readSong("test_abc/header_defaults/default_L_with_M=12-16.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,8));

        s = readSong("test_abc/header_defaults/default_L_with_M=13-16.abc");
        assertEquals(s.getDefaultDuration(), new Duration(1,8));
    }

    /**
     * Should use the default tempo if not provided.
     *
     * The default tempo is determined by the following
     * rule:
     *
     *      When the field 'Q' is omitted, the default value
     *      is 100 default-length notes (given by field 'L')
     *      per minute.
     */
    @Test
    public void testHeaderDefaultQ(){
        Song s = readSong("test_abc/header_defaults/default_Q.abc");
        assertEquals(s.getBeatsPerMinute(), 100);
        assertEquals(s.getBeatDuration(), new Duration(1,8));
    }


    /**
     * Should use the default composer if not provided.
     *
     * The default composer is determined by the following
     * rule:
     *
     *      When the field 'C' is omitted, any reasonable
     *      string will suffice (e.g. "Unknown").
     *
     */
    @Test
    public void testHeaderDefaultC(){
        Song s = readSong("test_abc/header_defaults/default_C.abc");
        assertNotNull(s.getComposer());
    }


    private void shouldFail(String path){
        try{
            readSong(path);
        } catch (Exception e){
            return;
        }
        fail("ABC file " + path + " has syntax error, but the parser did not throw an error.");
    }

    private Song readSong(String path){
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            String contents = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(encoded)).toString();
            return new SongParser(contents).getSong();
        } catch (IOException e) {
            fail(e.toString());
        }
        return null;
    }
}
