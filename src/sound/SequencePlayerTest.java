package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @category no_didit
 */

public class SequencePlayerTest extends TestCase {
	@Test
	public void testPieceOne() {
		SequencePlayer player;
		try {
			LyricListener listener = new LyricListener() {
				public void processLyricEvent(String text) {
					System.out.println(text);
				}
			};
			player = new SequencePlayer(140, 12, listener);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 0, 12);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 12, 12);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 24, 9);
			player.addNote(new Pitch(Letter.D).toMidiNote(), 33, 3);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 36, 12);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 48, 9);
			player.addNote(new Pitch(Letter.D).toMidiNote(), 57, 3);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 60, 9);
			player.addNote(new Pitch(Letter.F).toMidiNote(), 69, 3);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 72, 24);
			player.addNote(new Pitch(Letter.C, 1).toMidiNote(), 96,
					4);
			player.addNote(new Pitch(Letter.C, 1).toMidiNote(), 100,
					4);
			player.addNote(new Pitch(Letter.C, 1).toMidiNote(), 104,
					4);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 108, 4);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 112, 4);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 116, 4);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 120, 4);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 124, 4);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 128, 4);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 132, 4);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 136, 4);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 140, 4);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 144, 9);
			player.addNote(new Pitch(Letter.F).toMidiNote(), 153, 3);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 156, 9);
			player.addNote(new Pitch(Letter.D).toMidiNote(), 165, 3);
			player.addNote(new Pitch(Letter.C).toMidiNote(), 168, 24);
			player.play();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

	}

	public void testPieceTwo() {
		SequencePlayer player;
		try {
			LyricListener listener = new LyricListener() {
				public void processLyricEvent(String text) {
					System.out.println(text);
				}
			};
			player = new SequencePlayer(200, 12, listener);

			player.addNote(new Pitch(Letter.F, Accidental.SHARP).toMidiNote(),
					0, 6);
			player.addNote(new Pitch(Letter.E, 1).toMidiNote(), 0, 6);
			player.addNote(new Pitch(Letter.F, Accidental.SHARP).toMidiNote(), 6, 6);
			player.addNote(new Pitch(Letter.E, 1).toMidiNote(), 6, 6);
			// rest 6
			player.addNote(new Pitch(Letter.F, Accidental.SHARP).toMidiNote(), 18, 6);
			player.addNote(new Pitch(Letter.E, 1).toMidiNote(), 18,
					6);
			// rest 6
			player.addNote(new Pitch(Letter.F, Accidental.SHARP).toMidiNote(), 30, 6);
			player.addNote(new Pitch(Letter.C, 1).toMidiNote(), 30,
					6);
			player.addNote(new Pitch(Letter.F, Accidental.SHARP).toMidiNote(), 36, 12);
			player.addNote(new Pitch(Letter.E, 1).toMidiNote(), 36,
					12);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 48, 12);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 48,
					12);
			player.addNote(new Pitch(Letter.G, 1).toMidiNote(), 48,
					12);
			// rest 12
			player.addNote(new Pitch(Letter.G).toMidiNote(), 72, 12);
			// rest 12
			player.addNote(new Pitch(Letter.C, 1).toMidiNote(), 96,
					18);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 114, 6);
			// rest 12
			player.addNote(new Pitch(Letter.E).toMidiNote(), 132, 12);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 144, 6);
			player.addNote(new Pitch(Letter.A).toMidiNote(), 150, 12);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 162, 12);
			player.addNote(new Pitch(Letter.B, Accidental.FLAT).toMidiNote(),
					174, 6);
			player.addNote(new Pitch(Letter.A).toMidiNote(), 180, 12);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 192, 8);
			player.addNote(new Pitch(Letter.E, 1).toMidiNote(), 200,
					8);
			player.addNote(new Pitch(Letter.G, 1).toMidiNote(), 208,
					8);
			player.addNote(new Pitch(Letter.A, 1).toMidiNote(), 216,
					12);
			player.addNote(new Pitch(Letter.F, 1).toMidiNote(), 228,
					6);
			player.addNote(new Pitch(Letter.G, 1).toMidiNote(), 234,
					6);
			// rest 6
			player.addNote(new Pitch(Letter.E, 1).toMidiNote(), 246,
					12);
			player.addNote(new Pitch(Letter.C, 1).toMidiNote(), 258,
					6);
			player.addNote(new Pitch(Letter.D, 1).toMidiNote(), 264,
					6);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 270, 9);
			player.play();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

	}

	public void testPieceThree() {
		SequencePlayer player;
		try {
			LyricListener listener = new LyricListener() {
				public void processLyricEvent(String text) {
					System.out.println(text);
				}
			};
			player = new SequencePlayer(100, 1, listener);

			// rest 4
			player.addNote(new Pitch(Letter.D).toMidiNote(), 4, 2);
			player.addLyricEvent("A-", 4);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 6, 4);
			player.addLyricEvent("ma-", 6);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 10, 1);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 11, 1);
			player.addLyricEvent("zing", 10);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 12, 4);
			player.addLyricEvent("grace!", 12);
			player.addNote(new Pitch(Letter.A).toMidiNote(), 16, 2);
			player.addLyricEvent("How", 16);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 18, 4);
			player.addLyricEvent("sweet", 18);
			player.addNote(new Pitch(Letter.E).toMidiNote(), 22, 2);
			player.addLyricEvent("the", 22);
			player.addNote(new Pitch(Letter.D).toMidiNote(), 24, 4);
			player.addLyricEvent("sound", 24);
			player.addNote(new Pitch(Letter.D).toMidiNote(), 28, 2);
			player.addLyricEvent("That", 28);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 30, 4);
			player.addLyricEvent("saved", 30);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 34, 1);
			player.addNote(new Pitch(Letter.G).toMidiNote(), 35, 1);
			player.addLyricEvent("a", 34);
			player.addNote(new Pitch(Letter.B).toMidiNote(), 36, 4);
			player.addLyricEvent("wretch", 36);
			player.addNote(new Pitch(Letter.A).toMidiNote(), 40, 2);
			player.addLyricEvent("like", 40);
			player.addNote(new Pitch(Letter.D, 1).toMidiNote(), 42,
					8);
			player.addLyricEvent("me.", 42);
			player.play();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

	}
}
