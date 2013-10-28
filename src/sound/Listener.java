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
	//Song Params
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
	
	//Things to keep track of:
	private Voice currentVoice = new Voice(); //keeps track of applicable voice -- set up with default voice
	private ArrayList<Bar> barList = new ArrayList<Bar>(); //current list of bars
	private ArrayList<SoundEvent> currentNoteList = new ArrayList<SoundEvent>(); //Store sounds for current bar in
	private boolean inMultinote = false;
	private ArrayList<Pitch> multinoteList = new ArrayList<Pitch>();
	private Duration multinoteDuration;
	private boolean inTuplet = false;
	private Duration tupletMultiplier; //duration to alter tuplet note durations
	private int tupletCount = 0; //counts tuplet notes observed
	//Bar booleans
	Boolean endRepeat, endSection; //suffixes
	Boolean firstEnding, secondEnding, beginRepeat, beginSection; //prefixes

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
		if (ctx.noteorrest().pitch()!=null){ //if pitch
			char noteChar = ctx.noteorrest().pitch().BASENOTE().getText().charAt(0);
			int octave = 0;
			if(Character.isLowerCase(noteChar)){
				octave += 1;
			}
			Letter letter = Letter.fromChar(noteChar);
			Accidental accidental = Accidental.NONE;;
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
					octave += 1;
				}
				else if(octaveString == ","){
					octave -= 1;
				}
			}
			Duration duration = new Duration(durationNumerator,durationDenominator);
			Pitch pitch = new Pitch(letter,accidental,octave);
			if (inTuplet){
				duration = duration.mul(tupletMultiplier);
				tupletCount +=1;
			}
			if (inMultinote){
				if (multinoteList.size()==0){
					multinoteDuration = duration;
				}
				multinoteList.add(pitch);
				// TODO : handle when duration is longer than first of chord (multinoteDuration)
			}
			else{
				Sound sound = new Sound(pitch);
				SoundEvent note = new SoundEvent(sound,duration);
				currentNoteList.add(note);
			}
			System.out.println("letter: " + letter + "; accidental: " + accidental + "; octave: " + octave + " ;num: " + durationNumerator + " ;denom: " + durationDenominator);
		}
		else{ //if rest
			if (inMultinote){}
			else{
				Duration duration = new Duration(durationNumerator,durationDenominator); 
				if (inTuplet){
					duration = duration.mul(tupletMultiplier);
					tupletCount +=1;
				}
				Sound sound = new Sound();
				SoundEvent rest = new SoundEvent(sound,duration);
				currentNoteList.add(rest);
			}
		}
	}

	@Override
	public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {
		inMultinote = true;
	}

	@Override
	public void exitMultinote(ABCMusicParser.MultinoteContext ctx) {
		inMultinote = false;
		Sound sound = new Sound(multinoteList);
		SoundEvent chord = new SoundEvent(sound,multinoteDuration);
		currentNoteList.add(chord);
	}

	@Override
	public void enterTupletelement(ABCMusicParser.TupletelementContext ctx) {
		inTuplet = true;
		String specString = ctx.tupletspec().getText();
		switch (specString){
		case "(2":
			tupletMultiplier = new Duration(3,2);
			break;
		case "(3":
			tupletMultiplier = new Duration(2,3);
			break;
		case "(4":
			tupletMultiplier = new Duration(3,4);
			break;
		}
	}

	@Override
	public void exitTupletelement(ABCMusicParser.TupletelementContext ctx) {
		inTuplet = false;
		String specString = ctx.tupletspec().getText();
		switch (specString){
		case "(2":
			if(tupletCount!=2){throw new RuntimeException("A tuplet has wrong size.");}
			break;
		case "(3":
			if(tupletCount!=3){throw new RuntimeException("A tuplet has wrong size.");}
			break;
		case "(4":
			if(tupletCount!=4){throw new RuntimeException("A tuplet has wrong size.");}
			break;
		}
		tupletCount = 0;
	}


	@Override
	public void enterFieldtitle(ABCMusicParser.FieldtitleContext ctx) {
		title = ctx.fieldtitletext().getText();
		System.out.println("Title: " + title);
	}

	@Override
	public void enterFieldnumber(ABCMusicParser.FieldnumberContext ctx) {
		index = Integer.parseInt(ctx.DIGIT().toString());
		System.out.println("Index: " + index);

	}


	@Override
	public void enterBarline(ABCMusicParser.BarlineContext ctx) {
		String barString = ctx.getText();
		// END_REPEAT, END_SECTION, NONE; suffix
		// FIRST_ENDING, SECOND_ENDING, BEGIN_REPEAT, BEGIN_SECTION, NONE; prefix
		switch (barString){
		case ":|":
			endRepeat = true;
		case "||":
		case "|]":
			endSection = true;
		case "|":
			Bar bar  = new Bar(currentNoteList, new ArrayList<Lyric>(), getPrefix(),getSuffix());
			barList.add(bar);
			currentNoteList = new ArrayList<SoundEvent>();
			resetBarBooleans();
			break;
		case "[|":
			beginSection = true;
		case "|:":
			beginRepeat = true;
			break;
		case "[1":
			firstEnding = true;
			break;
		case "[2":
			secondEnding = true;
			break;
		}
	}

	public BarSuffix getSuffix(){
		if(endRepeat){return BarSuffix.END_REPEAT;}
		else if(endSection){return BarSuffix.END_SECTION;}
		return BarSuffix.NONE;
	}
	public BarPrefix getPrefix(){
		if(firstEnding){return BarPrefix.FIRST_ENDING;}
		else if(secondEnding){return BarPrefix.SECOND_ENDING;}
		else if(beginRepeat){return BarPrefix.BEGIN_REPEAT;}
		else if(beginSection){return BarPrefix.BEGIN_SECTION;}
		return BarPrefix.NONE;
	}
	public void resetBarBooleans(){
		//suffixes
		endRepeat = false;
		endSection = false; 
		//prefixes
		firstEnding = false;
		secondEnding = false;
		beginRepeat = false;
		beginSection = false;
	}
	@Override
	public void enterLyric(ABCMusicParser.LyricContext ctx) {
	}


	@Override
	public void enterFieldkey(ABCMusicParser.FieldkeyContext ctx) {
		Letter letter = Letter.fromChar(ctx.key().keynote().BASENOTE()
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
			else{
				throw new RuntimeException("Invalid key accidental.");
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
	public void enterAbctune(ABCMusicParser.AbctuneContext ctx){
		resetBarBooleans(); //set them to false
	}
	
	@Override 
	public void exitAbctune(ABCMusicParser.AbctuneContext ctx) {
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