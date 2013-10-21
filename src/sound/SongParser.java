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

public class SongParser {
	/**
	 * TODO: spec & test
	 */
	public void parse(String abcFile) {
		runListener(abcFile);
	}

	/**
	 * Runs the listener on the given input string.
	 * 
	 * @param input
	 *            The input string.
	 */
	private void runListener(String input) {
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
	}
}
