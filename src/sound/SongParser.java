package sound;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * A helper-class for parsing strings into Song objects.
 */
public class SongParser {

    private final Song song;

    /**
     * Create a SongParser object which parses the given
     * string into a song.
     * 
     * @param input The input string.
     */
    public SongParser(String abcFile) {
        song = runListener(abcFile);
    }

    /**
     * Return the parsed AST object.
     *
     * @return a Song object containing the parsed data.
     */
    public Song getSong(){
        return song;
    }

    private Song runListener(String input) {
        // Create a stream of tokens using the lexer.
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);

        // Feed the tokens into the parser.
        ABCMusicParser parser = new ABCMusicParser(tokens);
        parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.abctune(); // "abctune" is the starter rule.

        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new Listener();
        walker.walk(listener, tree);
        // return ((Listener) listener).getSong();
        
        return null;
    }
}
