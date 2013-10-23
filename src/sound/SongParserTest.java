package sound;

import org.junit.Test;

public class SongParserTest {
    @Test
    public void testParsePublic() {
        String abcfile = "X: 32\n" +
            "T:Piece No.3\n" +
            "M: 3/4 \n" +
            "L: 1/8 \n" +
            "Q:1/8=100\n" +
            "C: D. Guy \n" +
            "K:C#\n" +
            "z4 D2 | G4 (2BG | B4 A2 | G4 E2 | D4 D2 | G4 (2BG | B4 A2 | d6 | d2 z4 |]\n" +
            "w:A-ma-zing_ grace! How sweet the sound That saved a_ wretch like me._";
        new SongParser(abcfile);
    }
}
