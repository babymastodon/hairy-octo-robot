package sound;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Listener extends ABCMusicBaseListener {
	// TODO: Construct map
	// TODO: getSong() & set Duration objects to appropriate defaults before
	// TODO: grammar breaks on "b" for flat in K: field.
	// creating Song object
	private Map<Voice, List<Bar>> barMap = new HashMap<Voice, List<Bar>>();
	private Song song;
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
	private Voice currentVoice = new Voice(); //keeps track of applicable voice -- set up with default voice
	private ArrayList<Bar> barList = new ArrayList<Bar>(); //current list of bars
	private ArrayList<SoundEvent> currentNoteList = new ArrayList<SoundEvent>(); //Store sounds for current bar in



	@Override
	public void enterMidtunefield(ABCMusicParser.MidtunefieldContext ctx) {
		currentVoice = new Voice(ctx.fieldvoice().text().getText());
	}

	@Override
	public void enterFieldcomposer(ABCMusicParser.FieldcomposerContext ctx) {
		composer = ctx.composername().getText();
		System.out.println("Composer: " + composer);
	}

	@Override
	public void enterNotesline(ABCMusicParser.NoteslineContext ctx) {
		/*ArrayList<String> elements = new ArrayList<String>();
		for(int i=0; i<ctx.element().size()-1; i++){
			elements.add(i, ctx.element().get(i).getText());
			System.out.println(ctx.element().get(i).getText());
		}	*/
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
		int durationNumerator = 1;
		int durationDenominator = 1;
		if (ctx.notelength().isEmpty()==false){
			if(ctx.notelength().getText().matches("[0-9]++/[0-9]++")){
				durationNumerator = Integer.parseInt(ctx.notelength().DIGIT().get(0).getText());
				durationDenominator = Integer.parseInt(ctx.notelength().DIGIT().get(1).getText());
			}
			else if(ctx.notelength().getText().matches("/[0-9]++")){
				durationDenominator = Integer.parseInt(ctx.notelength().DIGIT().get(0).getText());
			}
			else if(ctx.notelength().getText().matches("[0-9]++/")){
				durationNumerator = Integer.parseInt(ctx.notelength().DIGIT().get(0).getText());
			}
			else if(ctx.notelength().getText().matches("/")){}
			else if(ctx.notelength().getText().matches("[0-9]++")){
				durationNumerator = Integer.parseInt(ctx.notelength().DIGIT().get(0).getText());
			}
		}
		if (ctx.noteorrest().pitch().basenote().isEmpty()==false){ //if pitch
			Letter letter = Letter.fromChar(ctx.noteorrest().pitch().basenote().getText().charAt(0));
			Accidental accidental = Accidental.NATURAL;;
			int octave = 0;
			if (ctx.noteorrest().pitch().accidental().isEmpty()==false){
				String accidentalString = ctx.noteorrest().pitch().accidental().get(0).getText();
				switch (accidentalString){
				case "^":
					accidental = Accidental.SHARP;
					break;
				case "^^":
					accidental = Accidental.DOUBLE_SHARP;
					break;
				case "_":
					accidental = Accidental.FLAT;
					break;
				case "__":
					accidental = Accidental.DOUBLE_FLAT;
					break;
				case "=":
					accidental = Accidental.NATURAL;
					break;
				}
			}
			if (ctx.noteorrest().pitch().octave().isEmpty()==false){
				String octaveString = ctx.noteorrest().pitch().octave().get(0).getText();
				if (octaveString == "'"){
					octave = 1;
				}
				else if(octaveString == ","){
					octave = -1;
				}
			}
			Duration duration = new Duration(durationNumerator,durationDenominator);
			Pitch pitch = new Pitch(letter,accidental,octave);
			Sound sound = new Sound(pitch);
			SoundEvent note = new SoundEvent(sound,duration);
			System.out.println(note.getDuration().getNumerator() + " " + note.getDuration().getDenominator());
			currentNoteList.add(note);
			//System.out.println("letter: " + letter + "; accidental: " + accidental + "; octave: " + octave + " ;num: " + durationNumerator + " ;denom: " + durationDenominator);
		}
	}

	@Override
	public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {
		
	}


	@Override
	public void enterFieldtitle(ABCMusicParser.FieldtitleContext ctx) {
		title = ctx.fieldtitletext().getText();
		System.out.println("Title: " + title);
	}

	@Override
	public void enterFieldnumber(ABCMusicParser.FieldnumberContext ctx) {
		index = Integer.parseInt(ctx.DIGIT().get(0).toString());
		System.out.println("Index: " + index);

	}


	@Override
	public void enterBarline(ABCMusicParser.BarlineContext ctx) {
		String barString = ctx.getText();
		switch (barString){
			case "|]":
			case "|":
				Bar bar  = new Bar(currentNoteList);
				barList.add(bar);
				currentNoteList = new ArrayList<SoundEvent>();
				break;
		}
	}

	@Override
	public void enterLyric(ABCMusicParser.LyricContext ctx) {
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
		keySignature = new KeySignature(letter, accidental, major);
		System.out.println("Key: Accidental = " + accidental.name()
				+ "; Letter = " + letter.name() + "; Major = " + major);
	}


	@Override
	public void enterTupletelement(ABCMusicParser.TupletelementContext ctx) {
		
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
	
	@Override public void exitAbctune(ABCMusicParser.AbctuneContext ctx) {
		if (barList.isEmpty()==false){
			barMap.put(currentVoice,barList);
			System.out.println("Voice and bars mapped." + barMap.keySet());
		}
		if (defaultDuration==null){ // (L) meter<0.75 default note length is
		// sixteenth note
		// meter>=.75, it is an eighth note
			float meter = meterNumerator/(float)meterDenominator;
			if (meter<.75) {
				defaultDuration = new Duration(1,16);
			}
			else if (meter>=.75){
				defaultDuration = new Duration(1,8);
			}
		}
		if (beatDuration==null){// (L): defaultDuration unless specified
			beatDuration = defaultDuration;
		}
		song = new Song( barMap, index, title,
                composer, meterNumerator, meterDenominator, 
                defaultDuration, keySignature, beatDuration, beatsPerMinute);
	}
	
	public Song getSong(){
		return song;
	}
}