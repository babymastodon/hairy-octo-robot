package sound;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.List;
import java.util.Map;

public class Listener extends ABCMusicBaseListener {
	// TODO: Construct map
	// TODO: getSong() & set Duration objects to appropriate defaults before
	// TODO: grammar breaks on "b" for flat in K: field.
	// creating Song object
	private Map<Voice, List<Bar>> barLists;
	private int index; // req of abc files
	private String title; // req of abc files
	private String composer = "Unknown"; // default "Unknown"
	private int meterNumerator = 4; // default 4
	private int meterDenominator = 4; // default 4
	private Duration defaultDuration; // (L) meter<0.75 default note length is
										// sixteenth note
										// meter>=.75, it is an eighth note
	private KeySignature keySignature; // req of abc files
	private Duration beatDuration; // (L): defaultDuration unless specified
	private int beatsPerMinute = 100; // default 100

	@Override
	public void enterAbctune(ABCMusicParser.AbctuneContext ctx) {
	}

	@Override
	public void enterBasenote(ABCMusicParser.BasenoteContext ctx) {
	}

	@Override
	public void enterMidtunefield(ABCMusicParser.MidtunefieldContext ctx) {
	}

	@Override
	public void enterFieldcomposer(ABCMusicParser.FieldcomposerContext ctx) {
		composer = ctx.composername().getText();
		System.out.println("Composer: " + composer);
	}

	@Override
	public void enterAbcline(ABCMusicParser.AbclineContext ctx) {
	}

	@Override
	public void enterAbcmusic(ABCMusicParser.AbcmusicContext ctx) {
	}

	@Override
	public void enterFieldvoice(ABCMusicParser.FieldvoiceContext ctx) {
	}

	@Override
	public void enterFieldmeter(ABCMusicParser.FieldmeterContext ctx) {
		meterNumerator = Integer.parseInt(ctx.meter().meterfraction().DIGIT()
				.get(0).getText());
		meterDenominator = Integer.parseInt(ctx.meter().meterfraction().DIGIT()
				.get(1).getText());
		System.out.println("Meter: " + meterNumerator + "/" + meterDenominator);
	}

	@Override
	public void enterNoteelement(ABCMusicParser.NoteelementContext ctx) {
	}

	@Override
	public void enterAccidental(ABCMusicParser.AccidentalContext ctx) {
	}

	@Override
	public void enterFieldtempo(ABCMusicParser.FieldtempoContext ctx) {
		beatsPerMinute = Integer.parseInt(ctx.tempo().DIGIT().get(0).getText());
		if (ctx.tempo().meterfraction() != null) {
			int beatDurationNumerator = Integer.parseInt(ctx.tempo()
					.meterfraction().DIGIT().get(0).getText());
			int beatDurationDenominator = Integer.parseInt(ctx.tempo()
					.meterfraction().DIGIT().get(1).getText());
			beatDuration = new Duration(beatDurationNumerator,
					beatDurationDenominator);
			System.out.println("Tempo: " + beatDuration.getNumerator() + "/"
					+ beatDuration.getDenominator() + "=" + beatsPerMinute);
		}

	}

	@Override
	public void enterNote(ABCMusicParser.NoteContext ctx) {
	}

	@Override
	public void enterElement(ABCMusicParser.ElementContext ctx) {
	}

	@Override
	public void enterText(ABCMusicParser.TextContext ctx) {
	}

	@Override
	public void enterLyrical_element(ABCMusicParser.Lyrical_elementContext ctx) {
	}

	@Override
	public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {
	}

	@Override
	public void enterModeminor(ABCMusicParser.ModeminorContext ctx) {
	}

	@Override
	public void enterFieldtitle(ABCMusicParser.FieldtitleContext ctx) {
		title = ctx.fieldtitletext().getText();
		System.out.println("Title: " + title);
	}

	@Override
	public void enterLyric_text(ABCMusicParser.Lyric_textContext ctx) {
	}

	@Override
	public void enterFieldnumber(ABCMusicParser.FieldnumberContext ctx) {
		index = Integer.parseInt(ctx.DIGIT().get(0).toString());
		System.out.println("Index: " + index);

	}

	@Override
	public void enterOctave(ABCMusicParser.OctaveContext ctx) {
	}

	@Override
	public void enterNoteorrest(ABCMusicParser.NoteorrestContext ctx) {
	}

	@Override
	public void enterBarline(ABCMusicParser.BarlineContext ctx) {
	}

	@Override
	public void enterLyric(ABCMusicParser.LyricContext ctx) {
	}

	@Override
	public void enterNotelength(ABCMusicParser.NotelengthContext ctx) {
	}

	@Override
	public void enterNthrepeat(ABCMusicParser.NthrepeatContext ctx) {
	}

	@Override
	public void enterFieldkey(ABCMusicParser.FieldkeyContext ctx) {
		Letter letter = Letter.fromChar(ctx.key().keynote().basenote()
				.getText().charAt(0));
		SingleAccidental accidental = SingleAccidental.NATURAL;
		boolean major = true;
		// Accidental : SHARP(1), FLAT(-1), NATURAL(0)
		System.out.println("ACCIDENTAL: "
				+ ctx.key().keynote().keyaccidental().get(0).getText());
		if (ctx.key().keynote().keyaccidental().size() != 0) {
			if (ctx.key().keynote().keyaccidental().get(0).getText()
					.equals("b")) {
				accidental = SingleAccidental.FLAT;
			} else if (ctx.key().keynote().keyaccidental().get(0).getText()
					.equals("#")) {
				accidental = SingleAccidental.SHARP;
			}
		}
		if (ctx.key().modeminor().size() != 0
				&& ctx.key().modeminor().get(0).getText().equals("m")) {
			major = false;
		}
		KeySignature keySignature = new KeySignature(letter, accidental, major);
		System.out.println("Key: Accidental = " + accidental.name()
				+ "; Letter = " + letter.name() + "; Major = " + major);
	}

	@Override
	public void enterAbcheader(ABCMusicParser.AbcheaderContext ctx) {
	}

	@Override
	public void enterTupletspec(ABCMusicParser.TupletspecContext ctx) {
	}

	@Override
	public void enterTupletelement(ABCMusicParser.TupletelementContext ctx) {
	}

	@Override
	public void enterRest(ABCMusicParser.RestContext ctx) {
	}

	@Override
	public void enterFielddefaultlength(
			ABCMusicParser.FielddefaultlengthContext ctx) {
		int numerator = Integer.parseInt(ctx.notelengthstrict().DIGIT().get(0)
				.getText());
		int denominator = Integer.parseInt(ctx.notelengthstrict().DIGIT()
				.get(1).getText());
		defaultDuration = new Duration(numerator, denominator);
		System.out.println("Default Duration: "
				+ defaultDuration.getNumerator() + "/"
				+ defaultDuration.getDenominator());
	}

	@Override
	public void enterKeyaccidental(ABCMusicParser.KeyaccidentalContext ctx) {
	}

	@Override
	public void enterComment(ABCMusicParser.CommentContext ctx) {
	}

	@Override
	public void enterPitch(ABCMusicParser.PitchContext ctx) {
	}

}