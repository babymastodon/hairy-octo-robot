package sound;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * Creates a Song object when it walks through a parsed
 * Antlr tree of an ABC file.
 */
public class Listener extends ABCMusicBaseListener {
	//Song Params
	private Map<Voice, List<Bar>> barMap = new HashMap<Voice, List<Bar>>(); //barLists map
	private Song song;
	private int index; // req of abc files
	private String title; // req of abc files
	private String composer = "Unknown"; // default "Unknown"
	private int meterNumerator = 4; // default 4
	private int meterDenominator = 4; // default 4
	private Duration defaultDuration;   // (L) meter<0.75 default note length is
	// sixteenth note
	// meter>=.75, it is an eighth note
	private KeySignature keySignature; // req of abc files
	private Duration beatDuration; // (L): defaultDuration unless specified
	private int beatsPerMinute = 100; // default 100

	//Things to keep track of:
	private Voice currentVoice = new Voice(); //keeps track of applicable voice -- set up with default voice
	private List<Bar> barList = new ArrayList<Bar>(); //current list of bars
	private List<Bar> curBarList; // list of bars on the current line
	private List<Lyric> curLyricList; // list of bars on the current line
	private Set<Integer> curLyricBarSplits; // list of indices of lyrics that should start on new bars
	private ArrayList<SoundEvent> currentNoteList = new ArrayList<SoundEvent>(); //Store sounds for current bar in
	private boolean inMultinote = false;
	private ArrayList<Pitch> multinoteList; //pitches of current multinote
	private Duration multinoteDuration;
	private boolean inTuplet = false;
	private Duration tupletMultiplier; //duration to alter tuplet note durations
	private Duration lastDuration = new Duration(1,1); //stores that last duration matched in a notelength context
	//Bar booleans
	Boolean endRepeat, endSection; //suffixes
	Boolean firstEnding, secondEnding, beginRepeat, beginSection; //prefixes
	
	@Override
	public void enterAbctune(ABCMusicParser.AbctuneContext ctx){
		resetBarBooleans(); //set them to false
	}
	
	@Override
	public void enterMidtunefield(ABCMusicParser.MidtunefieldContext ctx) {
		if (barList.isEmpty()==false){ //assign barList if we have one before we get new voice
			if (barMap.containsKey(currentVoice)==true){
				List<Bar> oldBarList = barMap.get(currentVoice); //get bars previously assigned to voice
				oldBarList.addAll(barList); //merge with current working bars
				barMap.put(currentVoice, oldBarList); //put it back on the map
			}
			else{
				barMap.put(currentVoice,barList);
			}
		}
		currentVoice = new Voice(ctx.fieldvoice().voice().getText()); //new voice
		barList = new ArrayList<Bar>(); //get rid of old bars
	}

	@Override
	public void enterComposer(ABCMusicParser.ComposerContext ctx) {
		composer = ctx.text().getText();
	}


	@Override
	public void enterMeter(ABCMusicParser.MeterContext ctx) {
		if (ctx.number().isEmpty()){
			if (ctx.getText().equals("C")){
				meterNumerator = meterDenominator = 4;
			} else {
				meterNumerator = meterDenominator = 2;
			}
		} else {
			meterNumerator = Integer.parseInt(
					ctx.number().get(0).getText());
			meterDenominator = Integer.parseInt(
					ctx.number().get(1).getText());
		}
	}

	@Override
	public void enterTempo(ABCMusicParser.TempoContext ctx) {
		beatsPerMinute = Integer.parseInt(ctx.number().get(2).getText());
		int beatDurationNumerator = Integer.parseInt(
				ctx.number().get(0).getText());
		int beatDurationDenominator = Integer.parseInt(
				ctx.number().get(1).getText());
		beatDuration = new Duration(beatDurationNumerator,
				beatDurationDenominator);
	}

	@Override
	public void enterNotelengthfull(ABCMusicParser.NotelengthfullContext ctx) {
		int numerator = Integer.parseInt(ctx.number().get(0).getText());
		int denominator = Integer.parseInt(ctx.number().get(1).getText());
		lastDuration = new Duration(numerator, denominator);
	}

	@Override
	public void enterNotelengthmultiply(ABCMusicParser.NotelengthmultiplyContext ctx) {
		int numerator = Integer.parseInt(ctx.number().getText());
		int denominator = 1;
		lastDuration = new Duration(numerator, denominator);
	}

	@Override
	public void enterNotelengthnumerator(ABCMusicParser.NotelengthnumeratorContext ctx) {
		int numerator = Integer.parseInt(ctx.number().getText());
		int denominator = 2;
		lastDuration = new Duration(numerator, denominator);
	}

	@Override
	public void enterNotelengthdenominator(ABCMusicParser.NotelengthdenominatorContext ctx) {
		int numerator = 1;
		int denominator = Integer.parseInt(ctx.number().getText());
		lastDuration = new Duration(numerator, denominator);
	}

	@Override
	public void enterNotelengthhalf(ABCMusicParser.NotelengthhalfContext ctx) {
		int numerator = 1;
		int denominator = 2;
		lastDuration = new Duration(numerator, denominator);
	}
	
	/** 
	 * Returns last visited duration & resets lastDuration
	 * 
	 * @return last visited duration
	 */
	private Duration getLastDuration(){
		//return 
		Duration output = lastDuration;
		lastDuration = new Duration(1,1);
		return output;
	}

	@Override
	public void exitPitch(ABCMusicParser.PitchContext ctx) {
		Duration duration = getLastDuration();
		char noteChar = ctx.basenote().getText().charAt(0);
		int octave = 0;
		if(Character.isLowerCase(noteChar)){
			octave += 1;
		}
		Letter letter = Letter.fromChar(noteChar);
		Accidental accidental = Accidental.NONE;;
		if (ctx.accidental() != null){
			String accidentalString = ctx.accidental().getText();
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
		if (ctx.octave() != null){
			String octaveString = ctx.octave().getText();
			if (octaveString.charAt(0) == '\''){
				octave += octaveString.length();
			} else if (octaveString.charAt(0) == ','){
				octave -= octaveString.length();
			}
		}
		Pitch pitch = new Pitch(letter,accidental,octave);
		if (inTuplet){
			duration = duration.mul(tupletMultiplier);
		}
		if (inMultinote){ //if in multinote, add pitch to multinote list
			if (multinoteList.size()==0){
				multinoteDuration = duration;
			}
			multinoteList.add(pitch);
		}
		else{ //otherwise, add pitch to working note list.
			Sound sound = new Sound(pitch);
			SoundEvent note = new SoundEvent(sound,duration);
			currentNoteList.add(note);
		}
	}
	
	@Override
	public void exitRest(ABCMusicParser.RestContext ctx) {
		Duration duration = getLastDuration();
		if (inTuplet){
			duration = duration.mul(tupletMultiplier);
		}
		Sound sound = new Sound();
		SoundEvent rest = new SoundEvent(sound,duration);
		currentNoteList.add(rest);
	}

	@Override
	public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {
		inMultinote = true;
		multinoteList = new ArrayList<Pitch>();
	}

	@Override
	public void exitMultinote(ABCMusicParser.MultinoteContext ctx) {
		inMultinote = false;
		Sound sound = new Sound(multinoteList);
		SoundEvent chord = new SoundEvent(sound,multinoteDuration.mul(getLastDuration()));
		currentNoteList.add(chord);
	}

	@Override
	public void enterDuplet(ABCMusicParser.DupletContext ctx) {
		inTuplet = true;
		tupletMultiplier = new Duration(3,2);
	}

	@Override
	public void enterTriplet(ABCMusicParser.TripletContext ctx) {
		inTuplet = true;
		tupletMultiplier = new Duration(2,3);
	}

	@Override
	public void enterQuadruplet(ABCMusicParser.QuadrupletContext ctx) {
		inTuplet = true;
		tupletMultiplier = new Duration(3,4);
	}

	@Override
	public void exitTuplet(ABCMusicParser.TupletContext ctx) {
		inTuplet = false;
	}


	@Override
	public void enterTitle(ABCMusicParser.TitleContext ctx) {
		title = ctx.text().getText();
	}

	@Override
	public void enterSongnumber(ABCMusicParser.SongnumberContext ctx) {
		index = Integer.parseInt(ctx.getText());
	}

	@Override
	public void enterNotesline(ABCMusicParser.NoteslineContext ctx) {
		curBarList = new ArrayList<Bar>();
		curLyricList = new ArrayList<Lyric>();
		curLyricBarSplits = new HashSet<Integer>();
	}

	@Override
	public void exitNotesline(ABCMusicParser.NoteslineContext ctx) {
		// index into curBarList
		int barIndex=0;
		// index into curLyricList
		int lyricIndex=0;
		// index of a SoundEvent in curBar
		int eventIndex=0;
		// holds the Lyrics for the new bar
		List<Lyric> newBarLyrics = new ArrayList<Lyric>();

		// Iterate through the curLyricList and add the lyrics to the
		// Bars in curBarList
		while (barIndex < curBarList.size() && lyricIndex < curLyricList.size()){
			Bar curBar = curBarList.get(barIndex);
			if (eventIndex < curBar.getEvents().size() &&
					curBar.getEvents().get(eventIndex).getSound().getPitches().size() == 0){
				// if the note pointed to by eventIndex is a rest,
				// advance to the next soundEvent
				eventIndex += 1;
			} else if (curLyricBarSplits.contains(lyricIndex) ||
					eventIndex == curBar.getEvents().size()){
				// if the lyrics has a bar split at this location, or if the bar is full,
				// create a new bar with the collected lyrics, add it to the cumulative barList,
				// and advance to the next bar
				barList.add(new Bar(
						curBar.getEvents(),
						newBarLyrics,
						curBar.getPrefix(),
						curBar.getSuffix()));
				newBarLyrics = new ArrayList<Lyric>();
				curLyricBarSplits.remove(lyricIndex);
				barIndex += 1;
				eventIndex = 0;
			} else {
				// the current eventIndex is a note or chord, and a lyric should
				// be assigned to this bar
				newBarLyrics.add(curLyricList.get(lyricIndex));
				lyricIndex += 1;
				eventIndex += 1;
			}
		} 

		if (barIndex != curBarList.size()){
			// The previous loop exited due to the lyric list running out.
			// This means that the last bars haven't been copied over to barList
			// yet (including the last bar containing lyrics).
			Bar curBar = curBarList.get(barIndex);
			barList.add(new Bar(
					curBar.getEvents(),
					newBarLyrics,
					curBar.getPrefix(),
					curBar.getSuffix()));
			barIndex += 1;

			// Iterate through the remaining bars, and copy them over to barList
			while (barIndex < curBarList.size()){
				barList.add(curBarList.get(barIndex));
				barIndex += 1;
			}
		}
	}

	@Override
	public void enterLyricword(ABCMusicParser.LyricwordContext ctx) {
		// split apart the syllables
		String[] parts = ctx.getText().split("(?<!\\\\)-", -1);

		// Replace \- with - in all parts
		for (int i=0; i<parts.length; i++){
			parts[i] = parts[i].replaceAll("\\\\-","-");
		}

		// Replace ~ with ' ' in all parts
		for (int i=0; i<parts.length; i++){
			parts[i] = parts[i].replaceAll("~"," ");
		}

		// The dashes which were removed during the split need to be replaced
		for (int i=0; i<parts.length - 1; i++){
			parts[i] = parts[i] + "-";
		}

		// Add the new lyic to the lists
		for (String part : parts){
			curLyricList.add(new Lyric(part));
		}
	}

	@Override
	public void enterLyricstar(ABCMusicParser.LyricstarContext ctx) {
		// Star translates to an empty Lyric
		curLyricList.add(new Lyric(""));
	}

	@Override
	public void enterLyricunderscore(ABCMusicParser.LyricunderscoreContext ctx) {
		// Underscore translates to an empty Lyric
		curLyricList.add(new Lyric(""));
	}

	@Override
	public void enterLyricbar(ABCMusicParser.LyricbarContext ctx) {
		// mark that the current lyric should start on a new bar
		curLyricBarSplits.add(curLyricList.size());
	}

	@Override
	public void enterBarline(ABCMusicParser.BarlineContext ctx) {
		String barString = ctx.getText();
		// END_REPEAT, END_SECTION, NONE; suffix
		// FIRST_ENDING, SECOND_ENDING, BEGIN_REPEAT, BEGIN_SECTION, NONE; prefix
		switch (barString){
		//bar endings:
		case ":|":
			endRepeat = true;
		case "||":
		case "|]":
			endSection = true;
		case "|":
			
			Bar bar  = new Bar(currentNoteList, new ArrayList<Lyric>(), getPrefix(),getSuffix());
			curBarList.add(bar);
			currentNoteList = new ArrayList<SoundEvent>(); 
			resetBarBooleans();
			break;
		//bar beginnings:
		case "[|":
			beginSection = true;
			break;
		case "|:":
			if(currentNoteList.size()!=0){
				//if |: isn't at the beginning of a section, (has notes before it), add them to a bar
				Bar bar2  = new Bar(currentNoteList, new ArrayList<Lyric>(), getPrefix(),getSuffix());
				curBarList.add(bar2);
				currentNoteList = new ArrayList<SoundEvent>();
				resetBarBooleans();
			}
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

	/**
     * Returns BarSuffix based on 
     * Boolean endRepeat, endSection
     * @return BarSuffix
     */
	private BarSuffix getSuffix(){
		if(endRepeat){return BarSuffix.END_REPEAT;}
		else if(endSection){return BarSuffix.END_SECTION;}
		return BarSuffix.NONE;
	}
	
	/**
     * Returns BarSuffix based on 
     * Boolean firstEnding, secondEnding, beginRepeat, beginSection
     * @return BarPrefix
     */
	private BarPrefix getPrefix(){
		if(firstEnding){return BarPrefix.FIRST_ENDING;}
		else if(secondEnding){return BarPrefix.SECOND_ENDING;}
		else if(beginRepeat){return BarPrefix.BEGIN_REPEAT;}
		else if(beginSection){return BarPrefix.BEGIN_SECTION;}
		return BarPrefix.NONE;
	}
	
	private void resetBarBooleans(){//Used at the start of new bars
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
	public void enterKey(ABCMusicParser.KeyContext ctx) {
		Letter letter = Letter.fromChar(
				ctx.basenote().getText().charAt(0));
		SingleAccidental accidental = SingleAccidental.NATURAL; //Default accidental
		boolean major = true; //default
		// Accidental : SHARP(1), FLAT(-1), NATURAL(0)
		if (ctx.keyaccidental() != null) { 
			//determine key accidental
			if (ctx.keyaccidental().getText().equals("b")) {
				accidental = SingleAccidental.FLAT;
			} else {
				accidental = SingleAccidental.SHARP;
			}
		}
		if (ctx.modeminor() != null){
			//see if in minor
			if (ctx.modeminor().getText().equals("m")) {
				major = false;
			}
		}
		keySignature = new KeySignature(letter, accidental, major);
	}


	@Override
	public void enterDefaultlength(ABCMusicParser.DefaultlengthContext ctx) {
		int numerator = Integer.parseInt(
				ctx.number().get(0).getText());
		int denominator = Integer.parseInt(
				ctx.number().get(1).getText());
		defaultDuration = new Duration(numerator, denominator);
	}

	@Override 
	public void exitAbctune(ABCMusicParser.AbctuneContext ctx) {
		if (barList.isEmpty()==false){ //assign barList if we have one
			if (barMap.containsKey(currentVoice)==true){
				List<Bar> oldBarList = barMap.get(currentVoice); //get bars previously assigned to voice
				oldBarList.addAll(barList); //merge with current working bars
				barMap.put(currentVoice, oldBarList); //put it back on the map
			}
			else{
				barMap.put(currentVoice,barList);
			}
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

	/**
	 * returns Song object
	 * 
	 * @return song
	 */
	public Song getSong(){
		return song;
	}
}
