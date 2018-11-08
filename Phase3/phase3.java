import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class phase3
{
    public static void main(String[] args) throws IOException {
        ANTLRInputStream reader = new ANTLRFileStream(args[0]);

        // Pass #1
        gLexer pass1Lexer = new gLexer(reader);
        CommonTokenStream pass1Tokens = new CommonTokenStream(pass1Lexer);
        gParser pass1Parser = new gParser(pass1Tokens);
        ParseTree pass1Tree = pass1Parser.program(); // Program is starting production rule
        // System.out.println(pass1Tree.toStringTree());

        // Pass #2
        reader.reset();
        g2Lexer pass2Lexer = new g2Lexer(reader);
        CommonTokenStream pass2Tokens = new CommonTokenStream(pass2Lexer);
        g2Parser pass2Parser = new g2Parser(pass2Tokens);
        ParseTree pass2Tree = pass2Parser.program();
    }
}