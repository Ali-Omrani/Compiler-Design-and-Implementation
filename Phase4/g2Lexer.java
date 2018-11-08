// Generated from g2.g4 by ANTLR 4.7

    import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class g2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, COMMENT=40, CONST_INT=41, CONST_STRING=42, CONST_CHAR=43, Id=44, 
		WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "COMMENT", "CONST_INT", 
		"CONST_STRING", "CONST_CHAR", "Id", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'end'", "'actor'", "'<'", "'>'", "'['", "']'", "'int'", 
		"'char'", "'='", "','", "'receiver'", "'init'", "'('", "')'", "'begin'", 
		"'break'", "'write'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", 
		"'/'", "'not'", "'{'", "'}'", "'quit'", "'sender'", "'self'", "'<<'", 
		"'read'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "CONST_INT", "CONST_STRING", "CONST_CHAR", 
		"Id", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



	    Translator mips = new Translator();

	    void print(String str){
	        System.out.println(str);
	    }

	    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
	        SymbolTableLocalVariableItem item = new SymbolTableLocalVariableItem(
	            new Variable(name,type),
	            SymbolTable.top.getOffset(Register.SP)
	        );
	        SymbolTable.resultString += item.itemToString() + '\n';
	        SymbolTable.top.put(
	            item
	        );
	    }

	    Type typeCheck(Type firstOperandType, Type secondOperandType, String operator, boolean lambda) {
	        //print("^^^^ in type check ^^^^^");
	        if (lambda)
	        {
	            //print("lambda ---> returning first type : "+ firstOperandType.toString());
	            return firstOperandType;
	        }
	        //print("firstOpernadType:"+firstOperandType.toString());
	        //print("secondOperandType:"+secondOperandType.toString());
	        //print("operator:"+operator);
	        if (operator == "="){
	            if (firstOperandType.equals(secondOperandType)) {
	                //print("assign operator with correct types");
	                return firstOperandType;
	            }
	            else if(firstOperandType.equals(NoType.getInstance())){
	                //print("assign operator with no type returning "+ secondOperandType.toString());
	                return secondOperandType;
	            }
	            else if(secondOperandType.equals(NoType.getInstance())){
	                //print("assign operator with no type returning "+ firstOperandType.toString());
	                return firstOperandType;
	            }else{
	                print("%%%%%%%%%%%%%%conflinct in operand types%%%%%%%%%%%%%");
	                //print("returning notype");
	                return NoType.getInstance();
	            }
	        }
	        else if(operator == "==" || operator == "<>") {
	            if (firstOperandType.equals(secondOperandType)) {
	                //print("equlity operator with correct types");
	                return firstOperandType;

	            }
	            else if(firstOperandType.equals(NoType.getInstance())){
	                //print("equality operator with no type returning "+ secondOperandType.toString());
	                return secondOperandType;
	            }
	            else if(secondOperandType.equals(NoType.getInstance())){
	                //print("equality operator with no type returning "+ firstOperandType.toString());
	                return firstOperandType;
	            }else{
	                print("%%%%%%%%%%%%%%conflinct in operand types%%%%%%%%%%%%%");
	                //print("returning notype");
	                return NoType.getInstance();
	            }
	        } else {
	            if (firstOperandType.equals(IntType.getInstance())) {
	                if ((secondOperandType.equals(IntType.getInstance())) || (secondOperandType.equals(NoType.getInstance()))) {
	                    //print("other operator - correct - returning int type");
	                    return IntType.getInstance();
	                }
	                else{
	                    print("%%%%%%%%%%%%%%conflinct in operand types%%%%%%%%%%%%%");
	                    //print("returning notype");
	                    return NoType.getInstance();
	                }
	            }
	            if (secondOperandType.equals(IntType.getInstance())) {
	                if ((firstOperandType.equals(IntType.getInstance())) || (firstOperandType.equals(NoType.getInstance()))) {
	                    //print("other operator - correct - returning int type");
	                    return IntType.getInstance();
	                }
	                else{
	                    print("%%%%%%%%%%%%%%%conflict in operands%%%%%%%%%%%%%%%%");
	                    //print("returning notype");
	                    return NoType.getInstance();
	                }
	            }
	            else{
	                if(!(firstOperandType.equals(NoType.getInstance()) && secondOperandType.equals(NoType.getInstance()) ))
	                    print("%%%%%%%%%%%%%%%conflict in operands%%%%%%%%%%%%%%%%");
	                //print("returning notype");
	                return NoType.getInstance();
	            }
	        }
	    }

	    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
	        SymbolTableGlobalVariableItem item = new SymbolTableGlobalVariableItem(
	              new Variable(name,type),
	              SymbolTable.top.getOffset(Register.GP)
	        );
	        SymbolTable.resultString += item.itemToString() + '\n';
	        SymbolTable.top.put(
	               item
	        );
	    }

	//    void beginScope() {
	//        SymbolTable.resultString += "--newScope-pass2--"+'\n';
	//        SymbolTable.push();
	//        mips.beginScope();
	//    }
	//
	//    void beginReceiverScope(){
	//            SymbolTable.resultString += "--newScope-pass2--"+'\n';
	//            SymbolTable.push();
	//    }

	    void beginScope() {
	        SymbolTable.resultString += "--newScope-pass2--"+'\n';
	        SymbolTable.push();
	        mips.beginScope(SymbolTable.top.firstOffset);
	    }

	    void endScope() {
	        //print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
	        SymbolTable.pop();
	        mips.endScope();
	    }

	    void printSymbolTableTop(){
	    print("printing symbol table");
	    SymbolTable.top.print();}


	public g2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3)\3)\7)\u00f5\n)\f)\16)\u00f8\13)\3)\3)\3*\6*\u00fd\n*"+
		"\r*\16*\u00fe\3+\3+\7+\u0103\n+\f+\16+\u0106\13+\3+\3+\3,\3,\3,\3,\3-"+
		"\3-\7-\u0110\n-\f-\16-\u0113\13-\3.\6.\u0116\n.\r.\16.\u0117\3.\3.\2\2"+
		"/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\t\3\2\f\f\3\2\62;\3\2$$\3\2))\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\2\u011f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13"+
		"k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23u\3\2\2\2\25z\3\2\2\2\27"+
		"|\3\2\2\2\31~\3\2\2\2\33\u0087\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2"+
		"\2!\u0090\3\2\2\2#\u0096\3\2\2\2%\u009c\3\2\2\2\'\u00a2\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a9\3\2\2\2-\u00ac\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c4\3\2\2\2A\u00cb\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d3\3\2\2\2G\u00d8\3\2\2\2I\u00db\3\2\2\2K\u00e2\3\2\2\2M\u00e7\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f2\3\2\2\2S\u00fc\3\2\2\2U\u0100\3\2\2\2W\u0109"+
		"\3\2\2\2Y\u010d\3\2\2\2[\u0115\3\2\2\2]^\7\f\2\2^\4\3\2\2\2_`\7g\2\2`"+
		"a\7p\2\2ab\7f\2\2b\6\3\2\2\2cd\7c\2\2de\7e\2\2ef\7v\2\2fg\7q\2\2gh\7t"+
		"\2\2h\b\3\2\2\2ij\7>\2\2j\n\3\2\2\2kl\7@\2\2l\f\3\2\2\2mn\7]\2\2n\16\3"+
		"\2\2\2op\7_\2\2p\20\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\22\3\2\2\2uv\7"+
		"e\2\2vw\7j\2\2wx\7c\2\2xy\7t\2\2y\24\3\2\2\2z{\7?\2\2{\26\3\2\2\2|}\7"+
		".\2\2}\30\3\2\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7e\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7k\2\2\u0083\u0084\7x\2\2\u0084\u0085\7g\2\2"+
		"\u0085\u0086\7t\2\2\u0086\32\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7"+
		"p\2\2\u0089\u008a\7k\2\2\u008a\u008b\7v\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\7*\2\2\u008d\36\3\2\2\2\u008e\u008f\7+\2\2\u008f \3\2\2\2\u0090\u0091"+
		"\7d\2\2\u0091\u0092\7g\2\2\u0092\u0093\7i\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7p\2\2\u0095\"\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7m\2\2\u009b$\3\2\2\2\u009c"+
		"\u009d\7y\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\u00a1\7g\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2"+
		"\2\u00a4(\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7"+
		"f\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab,\3\2"+
		"\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7@\2\2\u00ae.\3\2\2\2\u00af\u00b0"+
		"\7-\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\62\3\2\2\2\u00b3\u00b4"+
		"\7,\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\66\3\2\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7v\2\2\u00ba8\3\2\2\2\u00bb\u00bc"+
		"\7}\2\2\u00bc:\3\2\2\2\u00bd\u00be\7\177\2\2\u00be<\3\2\2\2\u00bf\u00c0"+
		"\7s\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		">\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7f\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7t\2\2\u00ca@\3\2\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7h\2\2"+
		"\u00cfB\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\7>\2\2\u00d2D\3\2\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7f\2\2"+
		"\u00d7F\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7h\2\2\u00daH\3\2\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7g\2\2"+
		"\u00df\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7g\2"+
		"\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6L\3\2"+
		"\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7j\2\2\u00ee"+
		"N\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1P\3\2\2\2\u00f2\u00f6"+
		"\7%\2\2\u00f3\u00f5\n\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\b)\2\2\u00faR\3\2\2\2\u00fb\u00fd\t\3\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"T\3\2\2\2\u0100\u0104\t\4\2\2\u0101\u0103\n\4\2\2\u0102\u0101\3\2\2\2"+
		"\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\t\4\2\2\u0108V\3\2\2\2\u0109"+
		"\u010a\t\5\2\2\u010a\u010b\n\5\2\2\u010b\u010c\t\5\2\2\u010cX\3\2\2\2"+
		"\u010d\u0111\t\6\2\2\u010e\u0110\t\7\2\2\u010f\u010e\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112Z\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0116\t\b\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\b.\2\2\u011a\\\3\2\2\2\b\2\u00f6\u00fe\u0104\u0111\u0117\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}