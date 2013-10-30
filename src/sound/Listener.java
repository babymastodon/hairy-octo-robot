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
 * Creates a Song object when by walking through the
 * Antlr parse tree of an ABC file.
 */
public class Listener extends ABCMusicBaseListener {

    // Song Params are filled in by the Listener as it walks through
    // the parse tree. They are used to construct the Song
    // object when the walking is complete.
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

    // Things to keep track of while
    // walking the parse tree.
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

    /**
     * Initialize the Bar booleans when entering
     * the first node of the parse tree.
     */
    @Override
    public void enterAbctune(ABCMusicParser.AbctuneContext ctx){
        resetBarBooleans();
    }

    /**
     * Change the current voice when a "V: ---" directive is
     * encountered in the body of the ABC file.
     */
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


    /**
     * Save the name of the composer with no further modification.
     */
    @Override
    public void enterComposer(ABCMusicParser.ComposerContext ctx) {
        composer = ctx.text().getText();
    }


    /**
     * Save the numerator and denominator of the meter,
     * using the default of "4/4" for common time and
     * "2/2" for cut time.
     */
    @Override
    public void enterMeter(ABCMusicParser.MeterContext ctx) {
        if (ctx.number().isEmpty()){
            if (ctx.getText().equals("C")){
                // common time
                meterNumerator = meterDenominator = 4;
            } else {
                // cut time
                meterNumerator = meterDenominator = 2;
            }
        } else {
            meterNumerator = Integer.parseInt(
                    ctx.number().get(0).getText());
            meterDenominator = Integer.parseInt(
                    ctx.number().get(1).getText());
        }
    }


    /**
     * Parse beatsPerMinute, and beatDuration, which specify
     * the song tempo.
     */
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


    /**
     * Parse the length of a note of the form "n/m", and convert
     * it to a Duration.
     */
    @Override
    public void enterNotelengthfull(ABCMusicParser.NotelengthfullContext ctx) {
        int numerator = Integer.parseInt(ctx.number().get(0).getText());
        int denominator = Integer.parseInt(ctx.number().get(1).getText());
        lastDuration = new Duration(numerator, denominator);
    }

    /**
     * Parse the length of a note of the form "n", and convert
     * it to a Duration with a denominator of 1.
     */
    @Override
    public void enterNotelengthmultiply(ABCMusicParser.NotelengthmultiplyContext ctx) {
        int numerator = Integer.parseInt(ctx.number().getText());
        int denominator = 1;
        lastDuration = new Duration(numerator, denominator);
    }


    /**
     * Parse the length of a note of the form "n/", and convert
     * it to a Duration with a denominator of 2.
     */
    @Override
    public void enterNotelengthnumerator(ABCMusicParser.NotelengthnumeratorContext ctx) {
        int numerator = Integer.parseInt(ctx.number().getText());
        int denominator = 2;
        lastDuration = new Duration(numerator, denominator);
    }


    /**
     * Parse the length of a note of the form "/m", and convert
     * it to a Duration with a numerator of 1.
     */
    @Override
    public void enterNotelengthdenominator(ABCMusicParser.NotelengthdenominatorContext ctx) {
        int numerator = 1;
        int denominator = Integer.parseInt(ctx.number().getText());
        lastDuration = new Duration(numerator, denominator);
    }


    /**
     * Parse the length of a note of the form "/", and convert
     * it to a Duration with a numerator of 1 and a denominator
     * of 2.
     */
    @Override
    public void enterNotelengthhalf(ABCMusicParser.NotelengthhalfContext ctx) {
        int numerator = 1;
        int denominator = 2;
        lastDuration = new Duration(numerator, denominator);
    }

    /** 
     * Returns the duration of the current note, and reset
     * the Duration to the default value.
     *
     * Should only be called after one of the "engerNotelength*"
     * functions has executed, or else the default value is always
     * returned.
     * 
     * @return last visited duration
     */
    private Duration getLastDuration(){
        //return 
        Duration output = lastDuration;
        lastDuration = new Duration(1,1);
        return output;
    }

    
    /**
     * Construct a SoundEvent object consisting of an optional
     * accidental, a base note, an optional octave, and
     * an optional duration.
     *
     * This function has different behavior depending on the
     * context in which it executes.
     *
     *      1) Normally, create the SoundEvent and append it to 
     *         the currentNoteList
     *      2) If inside a tuple, multiply the duration
     *         with the appropriate multiplier
     *      3) If inside a chord, add a Pitch to the multinoteList
     *         and set the multinoteDuration appropriately
     */
    @Override
    public void exitPitch(ABCMusicParser.PitchContext ctx) {
        // Get the note duration
        Duration duration = getLastDuration();

        // Get the base note
        char noteChar = ctx.basenote().getText().charAt(0);
        Letter letter = Letter.fromChar(noteChar);

        // Calculate the accidental
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

        // Calculate the octave
        int octave = 0;
        if(Character.isLowerCase(noteChar)){
            octave += 1;
        }
        if (ctx.octave() != null){
            String octaveString = ctx.octave().getText();
            if (octaveString.charAt(0) == '\''){
                octave += octaveString.length();
            } else if (octaveString.charAt(0) == ','){
                octave -= octaveString.length();
            }
        }

        // Construct the pitch object
        Pitch pitch = new Pitch(letter,accidental,octave);

        if (inTuplet){
            // If tuple, multiply the duration appropriately
            duration = duration.mul(tupletMultiplier);
        }
        if (inMultinote){
            // if in a chord, add pitch to multinote list
            if (multinoteList.size()==0){
                // save the duration if this is the first note in the chord
                multinoteDuration = duration;
            }
            multinoteList.add(pitch);
        }
        else{
            // otherwise, add pitch to the currentNoteList
            Sound sound = new Sound(pitch);
            SoundEvent note = new SoundEvent(sound,duration);
            currentNoteList.add(note);
        }
    }


    /**
     * Construct a rest with the appropriate duration
     * and add it to the currentNoteList.
     */
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


    /**
     * Before entering the chord pattern, reset the multiNoteList,
     * and set the inMultinote flag so that the exitPitch function
     * knows that the next set of notes belongs to the chord.
     */
    @Override
    public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {
        inMultinote = true;
        multinoteList = new ArrayList<Pitch>();
    }


    /**
     * Construct the chord object with the Pitches in multinoteList.
     */
    @Override
    public void exitMultinote(ABCMusicParser.MultinoteContext ctx) {
        inMultinote = false;
        Sound sound = new Sound(multinoteList);

        // Duration = chord duration * duration of first note in chord
        SoundEvent chord = new SoundEvent(sound,multinoteDuration.mul(getLastDuration()));
        currentNoteList.add(chord);
    }


    /**
     * When entering a duplet, set the duration multiplier to 3/2 --
     * duplet notes are 3/2 times longer than their normal duration.
     */
    @Override
    public void enterDuplet(ABCMusicParser.DupletContext ctx) {
        inTuplet = true;
        tupletMultiplier = new Duration(3,2);
    }


    /**
     * Triplet notes are 2/3 their normal durations.
     */
    @Override
    public void enterTriplet(ABCMusicParser.TripletContext ctx) {
        inTuplet = true;
        tupletMultiplier = new Duration(2,3);
    }


    /**
     * Quadruplet ntoes are 3/4 their normal durations.
     */
    @Override
    public void enterQuadruplet(ABCMusicParser.QuadrupletContext ctx) {
        inTuplet = true;
        tupletMultiplier = new Duration(3,4);
    }


    /**
     * Reset the inTuplet flag to disable the tuple multiplier.
     */
    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
        inTuplet = false;
    }


    /**
     * Save the song title without any modifications.
     */
    @Override
    public void enterTitle(ABCMusicParser.TitleContext ctx) {
        title = ctx.text().getText();
    }


    /**
     * Save the song number as an integer.
     */
    @Override
    public void enterSongnumber(ABCMusicParser.SongnumberContext ctx) {
        index = Integer.parseInt(ctx.getText());
    }


    /**
     * When reading a new line of notes, reset the given lists.
     *
     * These lists are used in the exitNotesline function for matching
     * up lyrics with the appropriate bars.
     */
    @Override
    public void enterNotesline(ABCMusicParser.NoteslineContext ctx) {
        curBarList = new ArrayList<Bar>();
        curLyricList = new ArrayList<Lyric>();
        curLyricBarSplits = new HashSet<Integer>();
    }

    /**
     * After reading a line of notes/bars, and the optional lyrics that
     * belong to that line, match the lyrics up with the appropriate
     * bars, and then append the completed bars to the appropriate
     * list in barMap depending on the current voice.
     */
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


    /**
     * Parse a lyrics word, and perform the necessary transformations
     * to convert it into a list of Lyric objects.
     */
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


    /**
     * A single "*" in the lyrics gets transformed to a blank Lyric object.
     */
    @Override
    public void enterLyricstar(ABCMusicParser.LyricstarContext ctx) {
        // Star translates to an empty Lyric
        curLyricList.add(new Lyric(""));
    }


    /**
     * A single "_" in the lyrics gets transformed to a blank Lyric object.
     */
    @Override
    public void enterLyricunderscore(ABCMusicParser.LyricunderscoreContext ctx) {
        // Underscore translates to an empty Lyric
        curLyricList.add(new Lyric(""));
    }


    /**
     * A single "_" in the lyrics gets transformed to a blank Lyric object.
     */
    @Override
    public void enterLyricbar(ABCMusicParser.LyricbarContext ctx) {
        // mark that the current lyric should start on a new bar
        curLyricBarSplits.add(curLyricList.size());
    }


    /**
     * When a bar token is encountered, perform the appropriate action
     * which may include:
     *      
     *      1) Creating a new Bar object with the current list of notes.
     *      2) Setting the appropriate flags for song sections and repititions.
     */
    @Override
    public void enterBarline(ABCMusicParser.BarlineContext ctx) {
        String barString = ctx.getText();
        switch (barString){
            // bar endings -- create new bar with the current list of notes
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

           // bar beginnings -- set the appropriate flags
            case "[|":
                   beginSection = true;
                   break;
            case "|:":
                    // NOTE: in certain cases, '|:' serves as a bar ending as well as a beginning
                    if(currentNoteList.size()!=0){
                        // if |: isn't at the beginning of a section, (has notes before it), add them to a bar
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
     * Convert the endRepeat and endSection booleans into the 
     * appropriate BarSuffix enum.
     * @return BarSuffix
     */
    private BarSuffix getSuffix(){
        if(endRepeat){return BarSuffix.END_REPEAT;}
        else if(endSection){return BarSuffix.END_SECTION;}
        return BarSuffix.NONE;
    }


    /**
     * Convert the firstEnding, secondEnding, beginRepeat and beginSection
     * booleans into the appropriate BarPrefix enum.
     * @return BarPrefix
     */
    private BarPrefix getPrefix(){
        if(firstEnding){return BarPrefix.FIRST_ENDING;}
        else if(secondEnding){return BarPrefix.SECOND_ENDING;}
        else if(beginRepeat){return BarPrefix.BEGIN_REPEAT;}
        else if(beginSection){return BarPrefix.BEGIN_SECTION;}
        return BarPrefix.NONE;
    }


    /**
     * At the start of each new bar, the bar booleans
     * need to be set to false.
     */
    private void resetBarBooleans(){
        //suffixes
        endRepeat = false;
        endSection = false; 
        //prefixes
        firstEnding = false;
        secondEnding = false;
        beginRepeat = false;
        beginSection = false;
    }


    /**
     * Parse the key header, and create a KeySignature object.
     */
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


    /**
     * Parse the default note length header, and create a Duration object.
     */
    @Override
    public void enterDefaultlength(ABCMusicParser.DefaultlengthContext ctx) {
        int numerator = Integer.parseInt(
                ctx.number().get(0).getText());
        int denominator = Integer.parseInt(
                ctx.number().get(1).getText());
        defaultDuration = new Duration(numerator, denominator);
    }


    /**
     * When finished walking the parse tree, use the Song parameters
     * (which were collected while walking the tree) to construct a
     * new Song object.
     */
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
     * Return the completed song object generated
     * from the ABC file.
     * 
     * @return song
     */
    public Song getSong(){
        return song;
    }
}
