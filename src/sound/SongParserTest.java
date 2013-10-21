package sound;

import org.junit.Test;

public class SongParserTest {
	@Test
	public void testParsePublic() {
		new SongParser()
				.parse("X: 32\nT:Piece No.3\nM:3/4\nL:1/8\nQ:1/8=100\nC: D. Guy \nK:C#\nz4 D2 | G4 (2BG | B4 A2 | G4 E2 | D4 D2 | G4 (2BG | B4 A2 | d6 | d2 z4 |]\nw:A-ma-zing_ grace! How sweet the sound That saved a_ wretch like me._");
	}
}
