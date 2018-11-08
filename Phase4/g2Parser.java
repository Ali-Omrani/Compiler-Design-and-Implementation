// Generated from g2.g4 by ANTLR 4.7

    import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class g2Parser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actorDef = 2, RULE_actorBodyStatement = 3, 
		RULE_type = 4, RULE_arrayType = 5, RULE_varType = 6, RULE_dataDef = 7, 
		RULE_receiver = 8, RULE_receiverDef = 9, RULE_argumentDef = 10, RULE_receiverBodyStatement = 11, 
		RULE_statement = 12, RULE_scopeStatement = 13, RULE_breakStatement = 14, 
		RULE_writeStatement = 15, RULE_expression = 16, RULE_assignmentExpression = 17, 
		RULE_orExpression = 18, RULE_orExpressionTmp = 19, RULE_andExpression = 20, 
		RULE_andExpressionTmp = 21, RULE_equalityCmpExpression = 22, RULE_equalityCmpExpressionTmp = 23, 
		RULE_comparisonExpression = 24, RULE_comparisonExpressionTmp = 25, RULE_addExpression = 26, 
		RULE_addExpressionTmp = 27, RULE_multExpression = 28, RULE_multExpressionTmp = 29, 
		RULE_notExpression = 30, RULE_notExpressionTmp = 31, RULE_arrayAccessExpression = 32, 
		RULE_arrayAccessExpressionTmp = 33, RULE_otherExpression = 34, RULE_quitStatement = 35, 
		RULE_sendStatement = 36, RULE_functionCall = 37, RULE_arguments = 38, 
		RULE_argument = 39, RULE_ifStatement = 40, RULE_elseIfelse = 41, RULE_elseIf = 42, 
		RULE_elseStatement = 43, RULE_forEachStatement = 44;
	public static final String[] ruleNames = {
		"program", "actor", "actorDef", "actorBodyStatement", "type", "arrayType", 
		"varType", "dataDef", "receiver", "receiverDef", "argumentDef", "receiverBodyStatement", 
		"statement", "scopeStatement", "breakStatement", "writeStatement", "expression", 
		"assignmentExpression", "orExpression", "orExpressionTmp", "andExpression", 
		"andExpressionTmp", "equalityCmpExpression", "equalityCmpExpressionTmp", 
		"comparisonExpression", "comparisonExpressionTmp", "addExpression", "addExpressionTmp", 
		"multExpression", "multExpressionTmp", "notExpression", "notExpressionTmp", 
		"arrayAccessExpression", "arrayAccessExpressionTmp", "otherExpression", 
		"quitStatement", "sendStatement", "functionCall", "arguments", "argument", 
		"ifStatement", "elseIfelse", "elseIf", "elseStatement", "forEachStatement"
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

	@Override
	public String getGrammarFileName() { return "g2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public g2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public boolean synHasActor;
		public ActorContext a;
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			       print("Pass2 started -------------------------");
			       beginScope();
			    
			((ProgramContext)_localctx).synHasActor =  false;
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(92);
					((ProgramContext)_localctx).a = actor();
					if(((ProgramContext)_localctx).a.synActorExists){((ProgramContext)_localctx).synHasActor =  true;}
					}
					break;
				case T__0:
					{
					setState(95);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        endScope();
			        print("Pass2 finished -------------------------");
			        mips.generateMainInstructions();
			        mips.putInitMessages();
			        mips.generateActorCodes();
			        mips.generateErrorInstructions();
			        mips.makeOutput();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public boolean synActorExists;
		public ActorDefContext ad;
		public ActorDefContext actorDef() {
			return getRuleContext(ActorDefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(g2Parser.EOF, 0); }
		public List<ActorBodyStatementContext> actorBodyStatement() {
			return getRuleContexts(ActorBodyStatementContext.class);
		}
		public ActorBodyStatementContext actorBodyStatement(int i) {
			return getRuleContext(ActorBodyStatementContext.class,i);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((ActorContext)_localctx).ad = actorDef();
			beginScope();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11))) != 0)) {
				{
				{
				setState(105);
				actorBodyStatement(((ActorContext)_localctx).ad.actorName);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__1);
			endScope();
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==T__0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((ActorContext)_localctx).synActorExists =  true;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorDefContext extends ParserRuleContext {
		public String actorName;
		public Token name;
		public Token CONST_INT;
		public TerminalNode CONST_INT() { return getToken(g2Parser.CONST_INT, 0); }
		public TerminalNode Id() { return getToken(g2Parser.Id, 0); }
		public ActorDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterActorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitActorDef(this);
		}
	}

	public final ActorDefContext actorDef() throws RecognitionException {
		ActorDefContext _localctx = new ActorDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actorDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__2);
			setState(117);
			((ActorDefContext)_localctx).name = match(Id);
			((ActorDefContext)_localctx).actorName =  (((ActorDefContext)_localctx).name!=null?((ActorDefContext)_localctx).name.getText():null);
			setState(119);
			match(T__3);
			setState(120);
			((ActorDefContext)_localctx).CONST_INT = match(CONST_INT);
			setState(121);
			match(T__4);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(T__0);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );

				    mips.allocateActorBuffer((((ActorDefContext)_localctx).CONST_INT!=null?Integer.valueOf(((ActorDefContext)_localctx).CONST_INT.getText()):0));
				    mips.allocateUnreadMessageSpaceForActorBuffer(_localctx.actorName);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorBodyStatementContext extends ParserRuleContext {
		public String actorName;
		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class,0);
		}
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public ActorBodyStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ActorBodyStatementContext(ParserRuleContext parent, int invokingState, String actorName) {
			super(parent, invokingState);
			this.actorName = actorName;
		}
		@Override public int getRuleIndex() { return RULE_actorBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterActorBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitActorBodyStatement(this);
		}
	}

	public final ActorBodyStatementContext actorBodyStatement(String actorName) throws RecognitionException {
		ActorBodyStatementContext _localctx = new ActorBodyStatementContext(_ctx, getState(), actorName);
		enterRule(_localctx, 6, RULE_actorBodyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(129);
				dataDef(true);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					match(T__0);
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__11:
				{
				setState(135);
				receiver(_localctx.actorName);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type dataType;
		public ArrayTypeContext array;
		public VarTypeContext variable;
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(138);
				((TypeContext)_localctx).array = arrayType();
				((TypeContext)_localctx).dataType =  ((TypeContext)_localctx).array.dataArrayType;
				}
				break;
			case 2:
				{
				setState(141);
				((TypeContext)_localctx).variable = varType();
				((TypeContext)_localctx).dataType =  ((TypeContext)_localctx).variable.dataVariableType;
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public Type dataArrayType;
		public VarTypeContext v;
		public Token CONST_INT;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> CONST_INT() { return getTokens(g2Parser.CONST_INT); }
		public TerminalNode CONST_INT(int i) {
			return getToken(g2Parser.CONST_INT, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((ArrayTypeContext)_localctx).v = varType();
			((ArrayTypeContext)_localctx).dataArrayType =  ((ArrayTypeContext)_localctx).v.dataVariableType;
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				match(T__5);
				setState(149);
				((ArrayTypeContext)_localctx).CONST_INT = match(CONST_INT);
				setState(150);
				match(T__6);
				((ArrayTypeContext)_localctx).dataArrayType =  new ArrayType((((ArrayTypeContext)_localctx).CONST_INT!=null?Integer.valueOf(((ArrayTypeContext)_localctx).CONST_INT.getText()):0),_localctx.dataArrayType);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public Type dataVariableType;
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__7);
				((VarTypeContext)_localctx).dataVariableType =  IntType.getInstance();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__8);
				((VarTypeContext)_localctx).dataVariableType =  CharType.getInstance();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDefContext extends ParserRuleContext {
		public boolean isGlobal;
		public Type dataType;
		public boolean hasExp1;
		public boolean hasExp2;
		public TypeContext t;
		public Token name;
		public ExpressionContext ex;
		public Token name2;
		public ExpressionContext ex2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(g2Parser.Id); }
		public TerminalNode Id(int i) {
			return getToken(g2Parser.Id, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DataDefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DataDefContext(ParserRuleContext parent, int invokingState, boolean isGlobal) {
			super(parent, invokingState);
			this.isGlobal = isGlobal;
		}
		@Override public int getRuleIndex() { return RULE_dataDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterDataDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitDataDef(this);
		}
	}

	public final DataDefContext dataDef(boolean isGlobal) throws RecognitionException {
		DataDefContext _localctx = new DataDefContext(_ctx, getState(), isGlobal);
		enterRule(_localctx, 14, RULE_dataDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((DataDefContext)_localctx).t = type();
			((DataDefContext)_localctx).dataType =  ((DataDefContext)_localctx).t.dataType;
			((DataDefContext)_localctx).hasExp1 =  false;
			setState(165);
			((DataDefContext)_localctx).name = match(Id);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(166);
				match(T__9);
				setState(167);
				((DataDefContext)_localctx).ex = expression();

				            if(_localctx.isGlobal){
				                print ((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getLine():0) + ")  globals can not be assigned in definition");
				            }
				            Type firstOperandType =  ((DataDefContext)_localctx).t.dataType;
				            Type secondOperandType = ((DataDefContext)_localctx).ex.expressionType;
				            typeCheck(firstOperandType, secondOperandType, "=", false);
				            ((DataDefContext)_localctx).hasExp1 =  true;
				        
				}
			}


			        if(!_localctx.hasExp1){
			            if(_localctx.isGlobal)
			            {
			                SymbolTableItem item = SymbolTable.top.get((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null));
			                if(((DataDefContext)_localctx).t.dataType instanceof ArrayType){
			                    int arrayOffset = ((SymbolTableVariableItemBase)item).getOffset();
			                    Type arrayBaseType = ((ArrayType) ((DataDefContext)_localctx).t.dataType).getBaseType();
			                    mips.addCommentToInitInstructions("-------- addind global array "+ (((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null) + "---------");
			                    for(int i=0;i<(((ArrayType)((DataDefContext)_localctx).t.dataType).getElementCount());i++){
			                        mips.addGlobalVariable(arrayOffset+(i*(arrayBaseType.size())),arrayBaseType.getDefaultValue());
			                    }
			                    mips.addCommentToInitInstructions("---------- end of addind global array "+ (((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null) + "-------");

			                }
			                else{
			                    mips.addGlobalVariable(((SymbolTableVariableItemBase)item).getOffset(), ((DataDefContext)_localctx).t.dataType.getDefaultValue());
			                }

			            }
			            else
			            {
			                if(((DataDefContext)_localctx).t.dataType instanceof ArrayType){
			                    mips.addCommentToInstructions("----------- adding local array "+(((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null)+"--------------");
			                    for(int i=0;i<(((ArrayType)((DataDefContext)_localctx).t.dataType).getElementCount());i++){
			                        mips.addToStack(((ArrayType) ((DataDefContext)_localctx).t.dataType).getBaseType().getDefaultValue());
			                    }
			                    mips.addCommentToInstructions("------------ end of adding local array "+(((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null)+" --------------");
			                }
			                else{
			                    mips.addToStack(((DataDefContext)_localctx).t.dataType.getDefaultValue());
			                }
			            }
			        }
			    
			if(!_localctx.isGlobal){SymbolTable.define();}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(174);
				match(T__10);
				setState(175);
				((DataDefContext)_localctx).name2 = match(Id);

				        ((DataDefContext)_localctx).hasExp2 =  false;
				        if(!_localctx.isGlobal){SymbolTable.define();
				        }
				    
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(177);
					match(T__9);
					setState(178);
					((DataDefContext)_localctx).ex2 = expression();

					            if(_localctx.isGlobal)
					                print ((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getLine():0) + ")  globals can not be assigned in definition");

					            Type firstOperandType = ((DataDefContext)_localctx).t.dataType;
					            Type secondOperandType = ((DataDefContext)_localctx).ex2.expressionType;
					            typeCheck(firstOperandType, secondOperandType, "=", false);
					            ((DataDefContext)_localctx).hasExp2 =  true;
					        
					}
				}


				            if(!_localctx.hasExp2){
				                if(_localctx.isGlobal)
				                {
				                    SymbolTableItem item = SymbolTable.top.get((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null));
				                    if(((DataDefContext)_localctx).t.dataType instanceof ArrayType){
				                        int arrayOffset = ((SymbolTableVariableItemBase)item).getOffset();
				                        Type arrayBaseType = ((ArrayType) ((DataDefContext)_localctx).t.dataType).getBaseType();
				                        mips.addCommentToInitInstructions("-------- addind global array "+ (((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null) + "---------");
				                        for(int i=0;i<(((ArrayType)((DataDefContext)_localctx).t.dataType).getElementCount());i++){
				                            mips.addGlobalVariable(arrayOffset+(i*(arrayBaseType.size())),arrayBaseType.getDefaultValue());
				                        }
				                        mips.addCommentToInitInstructions("---------- end of addind global array "+ (((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null) + "-------");

				                    }
				                    else{
				                        mips.addGlobalVariable(((SymbolTableVariableItemBase)item).getOffset(), ((DataDefContext)_localctx).t.dataType.getDefaultValue());
				                    }

				                }
				                else
				                {
				                    if(((DataDefContext)_localctx).t.dataType instanceof ArrayType){
				                        mips.addCommentToInstructions("----------- adding local array "+(((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null)+"--------------");
				                        for(int i=0;i<(((ArrayType)((DataDefContext)_localctx).t.dataType).getElementCount());i++){
				                            mips.addToStack(((ArrayType) ((DataDefContext)_localctx).t.dataType).getBaseType().getDefaultValue());
				                        }
				                        mips.addCommentToInstructions("------------ end of adding local array "+(((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null)+" --------------");
				                    }
				                    else{
				                        mips.addToStack(((DataDefContext)_localctx).t.dataType.getDefaultValue());
				                    }
				                }
				            }
				        
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public String actorName;
		public ReceiverDefContext recDef;
		public ReceiverDefContext receiverDef() {
			return getRuleContext(ReceiverDefContext.class,0);
		}
		public List<ReceiverBodyStatementContext> receiverBodyStatement() {
			return getRuleContexts(ReceiverBodyStatementContext.class);
		}
		public ReceiverBodyStatementContext receiverBodyStatement(int i) {
			return getRuleContext(ReceiverBodyStatementContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverContext(ParserRuleContext parent, int invokingState, String actorName) {
			super(parent, invokingState);
			this.actorName = actorName;
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver(String actorName) throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState(), actorName);
		enterRule(_localctx, 16, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((ReceiverContext)_localctx).recDef = receiverDef(_localctx.actorName);
			beginScope();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(191);
				receiverBodyStatement(_localctx.actorName, ((ReceiverContext)_localctx).recDef.isInitNoArg);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			mips.jumpToActorEnd(_localctx.actorName);
			setState(199);
			match(T__1);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				match(T__0);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverDefContext extends ParserRuleContext {
		public String actorName;
		public List<Variable> receiverArgs;
		public boolean isInitNoArg;
		public boolean isInit;
		public Token name;
		public ArgumentDefContext argumentDefVars;
		public ArgumentDefContext argumentDef() {
			return getRuleContext(ArgumentDefContext.class,0);
		}
		public TerminalNode Id() { return getToken(g2Parser.Id, 0); }
		public ReceiverDefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverDefContext(ParserRuleContext parent, int invokingState, String actorName) {
			super(parent, invokingState);
			this.actorName = actorName;
		}
		@Override public int getRuleIndex() { return RULE_receiverDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterReceiverDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitReceiverDef(this);
		}
	}

	public final ReceiverDefContext receiverDef(String actorName) throws RecognitionException {
		ReceiverDefContext _localctx = new ReceiverDefContext(_ctx, getState(), actorName);
		enterRule(_localctx, 18, RULE_receiverDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__11);
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(206);
				((ReceiverDefContext)_localctx).name = match(Id);
				((ReceiverDefContext)_localctx).isInitNoArg =  false; ((ReceiverDefContext)_localctx).isInit =  false;
				}
				break;
			case T__12:
				{
				setState(208);
				match(T__12);
				((ReceiverDefContext)_localctx).isInitNoArg =  true; ((ReceiverDefContext)_localctx).isInit =  true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			match(T__13);
			setState(213);
			((ReceiverDefContext)_localctx).argumentDefVars = argumentDef();
			((ReceiverDefContext)_localctx).receiverArgs =  ((ReceiverDefContext)_localctx).argumentDefVars.args;
			((ReceiverDefContext)_localctx).isInitNoArg =  _localctx.isInitNoArg && !((ReceiverDefContext)_localctx).argumentDefVars.hasArg;
			setState(216);
			match(T__14);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(T__0);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );

			        List<Type> types = new ArrayList<>();
			        for (Variable var : _localctx.receiverArgs){
			            types.add(var.getType());
			        }

			        String receiverToString = "receiver: ";
			        if(_localctx.isInit){
			            receiverToString += "init";
			        }
			        else{
			            receiverToString += (((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null);
			        }
			        receiverToString += "(";
			        for (Type t:types
			             ) {
			            receiverToString += t.toString()+" ";
			        }
			        receiverToString+=")";
			        int receiverId = SymbolTable.getReceiverIdBySign(_localctx.actorName, receiverToString);
			        if(_localctx.isInit){
			            SymbolTable.setActorInit(_localctx.actorName, receiverId);
			        }
			        mips.addLabel("r"+receiverId);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentDefContext extends ParserRuleContext {
		public List<Variable> args = new ArrayList<>();
		public boolean hasArg;
		public TypeContext t;
		public Token name;
		public TypeContext t2;
		public Token name2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(g2Parser.Id); }
		public TerminalNode Id(int i) {
			return getToken(g2Parser.Id, i);
		}
		public ArgumentDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterArgumentDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitArgumentDef(this);
		}
	}

	public final ArgumentDefContext argumentDef() throws RecognitionException {
		ArgumentDefContext _localctx = new ArgumentDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentDef);
		try {
			int _alt;
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						((ArgumentDefContext)_localctx).t = type();
						setState(225);
						((ArgumentDefContext)_localctx).name = match(Id);

						    Variable v = new Variable((((ArgumentDefContext)_localctx).name!=null?((ArgumentDefContext)_localctx).name.getText():null), ((ArgumentDefContext)_localctx).t.dataType);
							_localctx.args.add(v);
							SymbolTable.define();
							
						setState(227);
						match(T__10);
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(234);
				((ArgumentDefContext)_localctx).t2 = type();
				setState(235);
				((ArgumentDefContext)_localctx).name2 = match(Id);

				    Variable v2 = new Variable((((ArgumentDefContext)_localctx).name2!=null?((ArgumentDefContext)_localctx).name2.getText():null), ((ArgumentDefContext)_localctx).t2.dataType);
					_localctx.args.add(v2);
					SymbolTable.define();
					((ArgumentDefContext)_localctx).hasArg =  true;
					
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				((ArgumentDefContext)_localctx).hasArg =  false;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverBodyStatementContext extends ParserRuleContext {
		public String actorName;
		public boolean cantSend;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReceiverBodyStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverBodyStatementContext(ParserRuleContext parent, int invokingState, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_receiverBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterReceiverBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitReceiverBodyStatement(this);
		}
	}

	public final ReceiverBodyStatementContext receiverBodyStatement(String actorName,boolean cantSend) throws RecognitionException {
		ReceiverBodyStatementContext _localctx = new ReceiverBodyStatementContext(_ctx, getState(), actorName, cantSend);
		enterRule(_localctx, 22, RULE_receiverBodyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			statement(0, _localctx.actorName, _localctx.cantSend);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(T__0);
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public ScopeStatementContext scopeStatement() {
			return getRuleContext(ScopeStatementContext.class,0);
		}
		public SendStatementContext sendStatement() {
			return getRuleContext(SendStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForEachStatementContext forEachStatement() {
			return getRuleContext(ForEachStatementContext.class,0);
		}
		public QuitStatementContext quitStatement() {
			return getRuleContext(QuitStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				scopeStatement(_localctx.forEachDepth,_localctx.actorName, _localctx.cantSend);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				sendStatement(_localctx.actorName, _localctx.cantSend);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				ifStatement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				forEachStatement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				quitStatement(_localctx.actorName);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				breakStatement(_localctx.forEachDepth);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				writeStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				dataDef(false);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeStatementContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScopeStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_scopeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterScopeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitScopeStatement(this);
		}
	}

	public final ScopeStatementContext scopeStatement(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		ScopeStatementContext _localctx = new ScopeStatementContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 26, RULE_scopeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__15);
			{
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				match(T__0);
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
			beginScope();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(265);
				statement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				{
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(266);
					match(T__0);
					}
					}
					setState(269); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(277);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public int forEachDepth;
		public Token b;
		public BreakStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement(int forEachDepth) throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((BreakStatementContext)_localctx).b = match(T__16);

				mips.breakFor();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStatementContext extends ParserRuleContext {
		public Token w;
		public ExpressionContext ex;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((WriteStatementContext)_localctx).w = match(T__17);
			setState(283);
			match(T__13);
			setState(284);
			((WriteStatementContext)_localctx).ex = expression();
			setState(285);
			match(T__14);

			         if
			         (!
			                (
			                    (((WriteStatementContext)_localctx).ex.expressionType.equals(IntType.getInstance()))
			                    ||
			                    (((WriteStatementContext)_localctx).ex.expressionType.equals(CharType.getInstance()))
			                    ||
			                    (
			                    ((WriteStatementContext)_localctx).ex.expressionType instanceof ArrayType &&
			                    ((ArrayType)((WriteStatementContext)_localctx).ex.expressionType).getType().equals(CharType.getInstance())
			                    )
			                )
			            )
			         {
			             print((((WriteStatementContext)_localctx).w!=null?((WriteStatementContext)_localctx).w.getLine():0)+") write only accepts int / char / charArray but argument is of type "+((WriteStatementContext)_localctx).ex.expressionType.toString());
			         }else {
			             int addrOrValue;
			             if(((WriteStatementContext)_localctx).ex.expressionType.equals(IntType.getInstance())){
			//                if(((WriteStatementContext)_localctx).ex.isLValue)
			//                    mips.writeIndirect();
			//                else
			                    mips.write();
			             }
			             else if(((WriteStatementContext)_localctx).ex.expressionType.equals(CharType.getInstance())){
			//                if(((WriteStatementContext)_localctx).ex.isLValue)
			//                    mips.writeIndirect(1);
			//                else
			                    mips.write(1);
			             }
			             else{
			//                if(((WriteStatementContext)_localctx).ex.isLValue)
			//                    mips.writeIndirect(((ArrayType)((WriteStatementContext)_localctx).ex.expressionType).getElementCount());
			//                else
			                    mips.write(((ArrayType)((WriteStatementContext)_localctx).ex.expressionType).getElementCount());
			             }
			         }
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public boolean isLValue;
		public Type expressionType;
		public AssignmentExpressionContext ae;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ExpressionContext)_localctx).ae = assignmentExpression();
			((ExpressionContext)_localctx).isLValue =  ((ExpressionContext)_localctx).ae.isLValue;
			((ExpressionContext)_localctx).expressionType =  ((ExpressionContext)_localctx).ae.assignmentExpressionType;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public boolean isLValue;
		public Type assignmentExpressionType;
		public OrExpressionContext oe;
		public Token op;
		public AssignmentExpressionContext ae;
		public OrExpressionContext orExpr;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentExpression);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				((AssignmentExpressionContext)_localctx).oe = orExpression(true);
				setState(293);
				((AssignmentExpressionContext)_localctx).op = match(T__9);
				setState(294);
				((AssignmentExpressionContext)_localctx).ae = assignmentExpression();

				        Type firstOperandType = ((AssignmentExpressionContext)_localctx).oe.orExpressionType;
				        Type secondOperandType = ((AssignmentExpressionContext)_localctx).ae.assignmentExpressionType;
				            ((AssignmentExpressionContext)_localctx).assignmentExpressionType =  typeCheck(firstOperandType, secondOperandType, "=", false);
				    

				         if(!((AssignmentExpressionContext)_localctx).oe.isLValue)
				            print((((AssignmentExpressionContext)_localctx).op!=null?((AssignmentExpressionContext)_localctx).op.getLine():0) + ") LValue Error");
				    

				        if(firstOperandType instanceof ArrayType){
				            int count = ((ArrayType)firstOperandType).getElementCount();
				            print("khar toooooooooooleeeeeeee " + ((AssignmentExpressionContext)_localctx).oe.isLValue);
				            mips.arrayAssignCommand(count);
				        }
				        else{
				            mips.assignCommand();
				        }
				    
				((AssignmentExpressionContext)_localctx).isLValue =  false;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				((AssignmentExpressionContext)_localctx).orExpr = orExpression(false);

				        ((AssignmentExpressionContext)_localctx).assignmentExpressionType =  ((AssignmentExpressionContext)_localctx).orExpr.orExpressionType;
				        ((AssignmentExpressionContext)_localctx).isLValue =  ((AssignmentExpressionContext)_localctx).orExpr.isLValue;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type orExpressionType;
		public boolean isLValue;
		public AndExpressionContext ae;
		public OrExpressionTmpContext oet;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionTmpContext orExpressionTmp() {
			return getRuleContext(OrExpressionTmpContext.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OrExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitOrExpression(this);
		}
	}

	public final OrExpressionContext orExpression(boolean isLeft) throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 36, RULE_orExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((OrExpressionContext)_localctx).ae = andExpression(_localctx.isLeft);
			setState(306);
			((OrExpressionContext)_localctx).oet = orExpressionTmp();

			    	    Type firstOperandType = ((OrExpressionContext)_localctx).ae.andExpressionType;
			    	    Type secondOperandType = ((OrExpressionContext)_localctx).oet.orExpressionTmpType;
			    	    if(((OrExpressionContext)_localctx).oet.hasValue){
			    	        ((OrExpressionContext)_localctx).orExpressionType =  typeCheck(firstOperandType, secondOperandType, "or", !((OrExpressionContext)_localctx).oet.hasValue);
			    	    }
			    	    else{
			    	        ((OrExpressionContext)_localctx).orExpressionType =  firstOperandType;
			    	    }
			    

			        //print ("oet.hasValue : " + ((OrExpressionContext)_localctx).oet.hasValue);
			        //print ("ae.isLValue : " + ((OrExpressionContext)_localctx).ae.isLValue);
			        ((OrExpressionContext)_localctx).isLValue =  ((OrExpressionContext)_localctx).ae.isLValue && !((OrExpressionContext)_localctx).oet.hasValue;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionTmpContext extends ParserRuleContext {
		public Type orExpressionTmpType;
		public boolean hasValue;
		public Token op;
		public AndExpressionContext ae;
		public OrExpressionTmpContext oet;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionTmpContext orExpressionTmp() {
			return getRuleContext(OrExpressionTmpContext.class,0);
		}
		public OrExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterOrExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitOrExpressionTmp(this);
		}
	}

	public final OrExpressionTmpContext orExpressionTmp() throws RecognitionException {
		OrExpressionTmpContext _localctx = new OrExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orExpressionTmp);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((OrExpressionTmpContext)_localctx).op = match(T__18);
				setState(311);
				((OrExpressionTmpContext)_localctx).ae = andExpression(false);

					    mips.operationCommand((((OrExpressionTmpContext)_localctx).op!=null?((OrExpressionTmpContext)_localctx).op.getText():null));
					
				setState(313);
				((OrExpressionTmpContext)_localctx).oet = orExpressionTmp();

					    Type firstOperandType = ((OrExpressionTmpContext)_localctx).ae.andExpressionType;
					    Type secondOperandType = ((OrExpressionTmpContext)_localctx).oet.orExpressionTmpType;
					    ((OrExpressionTmpContext)_localctx).hasValue =  true;
					    String operator = (((OrExpressionTmpContext)_localctx).op!=null?((OrExpressionTmpContext)_localctx).op.getText():null);
					    ((OrExpressionTmpContext)_localctx).orExpressionTmpType =  typeCheck(firstOperandType, secondOperandType, "or", !((OrExpressionTmpContext)_localctx).oet.hasValue);
					
				}
				break;
			case T__0:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

					    ((OrExpressionTmpContext)_localctx).hasValue =  false;
					    ((OrExpressionTmpContext)_localctx).orExpressionTmpType =  NoType.getInstance();
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type andExpressionType;
		public boolean isLValue;
		public EqualityCmpExpressionContext ece;
		public AndExpressionTmpContext aet;
		public EqualityCmpExpressionContext equalityCmpExpression() {
			return getRuleContext(EqualityCmpExpressionContext.class,0);
		}
		public AndExpressionTmpContext andExpressionTmp() {
			return getRuleContext(AndExpressionTmpContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression(boolean isLeft) throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 40, RULE_andExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((AndExpressionContext)_localctx).ece = equalityCmpExpression(_localctx.isLeft);
			setState(320);
			((AndExpressionContext)_localctx).aet = andExpressionTmp();

				    Type firstOperandType = ((AndExpressionContext)_localctx).ece.equalityCmpExpressionType;
			        Type secondOperandType = ((AndExpressionContext)_localctx).aet.andExpressionTmpType;
			        if(((AndExpressionContext)_localctx).aet.hasValue){
			            ((AndExpressionContext)_localctx).andExpressionType =  typeCheck(firstOperandType, secondOperandType, "and",!((AndExpressionContext)_localctx).aet.hasValue );
			        }
			        else{
			            ((AndExpressionContext)_localctx).andExpressionType =  firstOperandType;
			        }
				
			((AndExpressionContext)_localctx).isLValue =  ((AndExpressionContext)_localctx).ece.isLValue && !((AndExpressionContext)_localctx).aet.hasValue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionTmpContext extends ParserRuleContext {
		public Type andExpressionTmpType;
		public boolean hasValue;
		public Token op;
		public EqualityCmpExpressionContext ece;
		public AndExpressionTmpContext aet;
		public EqualityCmpExpressionContext equalityCmpExpression() {
			return getRuleContext(EqualityCmpExpressionContext.class,0);
		}
		public AndExpressionTmpContext andExpressionTmp() {
			return getRuleContext(AndExpressionTmpContext.class,0);
		}
		public AndExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterAndExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitAndExpressionTmp(this);
		}
	}

	public final AndExpressionTmpContext andExpressionTmp() throws RecognitionException {
		AndExpressionTmpContext _localctx = new AndExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andExpressionTmp);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				((AndExpressionTmpContext)_localctx).op = match(T__19);
				setState(325);
				((AndExpressionTmpContext)_localctx).ece = equalityCmpExpression(false);

					    mips.operationCommand((((AndExpressionTmpContext)_localctx).op!=null?((AndExpressionTmpContext)_localctx).op.getText():null));
					
				setState(327);
				((AndExpressionTmpContext)_localctx).aet = andExpressionTmp();

					     Type firstOperandType = ((AndExpressionTmpContext)_localctx).ece.equalityCmpExpressionType;
					     Type secondOperandType = ((AndExpressionTmpContext)_localctx).aet.andExpressionTmpType;
					     ((AndExpressionTmpContext)_localctx).hasValue =  true;
					     String operator = (((AndExpressionTmpContext)_localctx).op!=null?((AndExpressionTmpContext)_localctx).op.getText():null);
					     ((AndExpressionTmpContext)_localctx).andExpressionTmpType =  typeCheck(firstOperandType, secondOperandType, "and", !((AndExpressionTmpContext)_localctx).aet.hasValue);
					
				}
				break;
			case T__0:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__18:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

					    ((AndExpressionTmpContext)_localctx).hasValue =  false;
					    ((AndExpressionTmpContext)_localctx).andExpressionTmpType =  NoType.getInstance();
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityCmpExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type equalityCmpExpressionType;
		public boolean isLValue;
		public ComparisonExpressionContext ce;
		public EqualityCmpExpressionTmpContext ecet;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public EqualityCmpExpressionTmpContext equalityCmpExpressionTmp() {
			return getRuleContext(EqualityCmpExpressionTmpContext.class,0);
		}
		public EqualityCmpExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqualityCmpExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_equalityCmpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterEqualityCmpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitEqualityCmpExpression(this);
		}
	}

	public final EqualityCmpExpressionContext equalityCmpExpression(boolean isLeft) throws RecognitionException {
		EqualityCmpExpressionContext _localctx = new EqualityCmpExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 44, RULE_equalityCmpExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((EqualityCmpExpressionContext)_localctx).ce = comparisonExpression(_localctx.isLeft);
			setState(334);
			((EqualityCmpExpressionContext)_localctx).ecet = equalityCmpExpressionTmp();

				    Type firstOperandType = ((EqualityCmpExpressionContext)_localctx).ce.comparisonExpressionType;
			        Type secondOperandType = ((EqualityCmpExpressionContext)_localctx).ecet.equalityCmpExpressionTmpType;
			        if(((EqualityCmpExpressionContext)_localctx).ecet.hasValue){
			            ((EqualityCmpExpressionContext)_localctx).equalityCmpExpressionType =  typeCheck(firstOperandType, secondOperandType, "==", !((EqualityCmpExpressionContext)_localctx).ecet.hasValue);
			            if (!_localctx.equalityCmpExpressionType.equals(NoType.getInstance())){
			                ((EqualityCmpExpressionContext)_localctx).equalityCmpExpressionType =  IntType.getInstance();
			                print("equality check -- casting return type to int");
			            }
			        }
			        else{
			            ((EqualityCmpExpressionContext)_localctx).equalityCmpExpressionType =  firstOperandType;
			        }
				
			((EqualityCmpExpressionContext)_localctx).isLValue =  ((EqualityCmpExpressionContext)_localctx).ce.isLValue && !((EqualityCmpExpressionContext)_localctx).ecet.hasValue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityCmpExpressionTmpContext extends ParserRuleContext {
		public Type equalityCmpExpressionTmpType;
		public boolean hasValue;
		public Token op;
		public ComparisonExpressionContext ce;
		public EqualityCmpExpressionTmpContext ect;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public EqualityCmpExpressionTmpContext equalityCmpExpressionTmp() {
			return getRuleContext(EqualityCmpExpressionTmpContext.class,0);
		}
		public EqualityCmpExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityCmpExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterEqualityCmpExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitEqualityCmpExpressionTmp(this);
		}
	}

	public final EqualityCmpExpressionTmpContext equalityCmpExpressionTmp() throws RecognitionException {
		EqualityCmpExpressionTmpContext _localctx = new EqualityCmpExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equalityCmpExpressionTmp);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				((EqualityCmpExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
					((EqualityCmpExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				//print("equalityCmpExpressionTmp : "+ $op.text);
					
				setState(340);
				((EqualityCmpExpressionTmpContext)_localctx).ce = comparisonExpression(false);

				                print (((EqualityCmpExpressionTmpContext)_localctx).ce.comparisonExpressionType.toString());
				    	        if (((EqualityCmpExpressionTmpContext)_localctx).ce.comparisonExpressionType instanceof ArrayType){
				//    	            print ("0-00000--09-000000--- array equality---------------");
				    	            int arraySize = ((ArrayType)((EqualityCmpExpressionTmpContext)_localctx).ce.comparisonExpressionType).getElementCount();
				        	        mips.arrayOperationCommand((((EqualityCmpExpressionTmpContext)_localctx).op!=null?((EqualityCmpExpressionTmpContext)_localctx).op.getText():null), arraySize);
				                }
				        	    else{
				//        	        print ("0-00000--09-000000--- equality mamooli ---------------");
				        	        mips.operationCommand((((EqualityCmpExpressionTmpContext)_localctx).op!=null?((EqualityCmpExpressionTmpContext)_localctx).op.getText():null));
				                }
				        
				setState(342);
				((EqualityCmpExpressionTmpContext)_localctx).ect = equalityCmpExpressionTmp();

					    Type firstOperandType = ((EqualityCmpExpressionTmpContext)_localctx).ce.comparisonExpressionType;
				        Type secondOperandType = ((EqualityCmpExpressionTmpContext)_localctx).ect.equalityCmpExpressionTmpType;
				        String operator = (((EqualityCmpExpressionTmpContext)_localctx).op!=null?((EqualityCmpExpressionTmpContext)_localctx).op.getText():null);
				        ((EqualityCmpExpressionTmpContext)_localctx).equalityCmpExpressionTmpType =  typeCheck(firstOperandType, secondOperandType, "==", !((EqualityCmpExpressionTmpContext)_localctx).ect.hasValue);
				        ((EqualityCmpExpressionTmpContext)_localctx).hasValue =  true;
					
				}
				break;
			case T__0:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__18:
			case T__19:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

					    ((EqualityCmpExpressionTmpContext)_localctx).hasValue =  false;
					    ((EqualityCmpExpressionTmpContext)_localctx).equalityCmpExpressionTmpType =  NoType.getInstance();
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type comparisonExpressionType;
		public boolean isLValue;
		public AddExpressionContext ae;
		public ComparisonExpressionTmpContext cet;
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ComparisonExpressionTmpContext comparisonExpressionTmp() {
			return getRuleContext(ComparisonExpressionTmpContext.class,0);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression(boolean isLeft) throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 48, RULE_comparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((ComparisonExpressionContext)_localctx).ae = addExpression(isLeft);
			setState(349);
			((ComparisonExpressionContext)_localctx).cet = comparisonExpressionTmp();

			        Type firstOperandType = ((ComparisonExpressionContext)_localctx).ae.addExpressionType;
			        Type secondOperandType = ((ComparisonExpressionContext)_localctx).cet.comparisonExpressionTmpType;
			        if(((ComparisonExpressionContext)_localctx).cet.hasValue){
			            ((ComparisonExpressionContext)_localctx).comparisonExpressionType =  typeCheck(firstOperandType, secondOperandType, "<", !((ComparisonExpressionContext)_localctx).cet.hasValue);
			        }
			        else{
			            ((ComparisonExpressionContext)_localctx).comparisonExpressionType =  firstOperandType;
			        }
			     
			((ComparisonExpressionContext)_localctx).isLValue =  ((ComparisonExpressionContext)_localctx).ae.isLValue && !((ComparisonExpressionContext)_localctx).cet.hasValue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionTmpContext extends ParserRuleContext {
		public Type comparisonExpressionTmpType;
		public boolean hasValue;
		public Token op;
		public AddExpressionContext ae;
		public ComparisonExpressionTmpContext cet;
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ComparisonExpressionTmpContext comparisonExpressionTmp() {
			return getRuleContext(ComparisonExpressionTmpContext.class,0);
		}
		public ComparisonExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterComparisonExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitComparisonExpressionTmp(this);
		}
	}

	public final ComparisonExpressionTmpContext comparisonExpressionTmp() throws RecognitionException {
		ComparisonExpressionTmpContext _localctx = new ComparisonExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparisonExpressionTmp);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((ComparisonExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((ComparisonExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				((ComparisonExpressionTmpContext)_localctx).ae = addExpression(false);
				mips.operationCommand((((ComparisonExpressionTmpContext)_localctx).op!=null?((ComparisonExpressionTmpContext)_localctx).op.getText():null));
				setState(356);
				((ComparisonExpressionTmpContext)_localctx).cet = comparisonExpressionTmp();

					    Type firstOperandType = ((ComparisonExpressionTmpContext)_localctx).ae.addExpressionType;
				        Type secondOperandType = ((ComparisonExpressionTmpContext)_localctx).cet.comparisonExpressionTmpType;
				        String operator = (((ComparisonExpressionTmpContext)_localctx).op!=null?((ComparisonExpressionTmpContext)_localctx).op.getText():null);
				        ((ComparisonExpressionTmpContext)_localctx).comparisonExpressionTmpType =  typeCheck(firstOperandType, secondOperandType, "<", !((ComparisonExpressionTmpContext)_localctx).cet.hasValue);
				        ((ComparisonExpressionTmpContext)_localctx).hasValue =  true;
					 
				}
				break;
			case T__0:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

					    ((ComparisonExpressionTmpContext)_localctx).comparisonExpressionTmpType =  NoType.getInstance();
					    ((ComparisonExpressionTmpContext)_localctx).hasValue =  false;
					 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type addExpressionType;
		public boolean isLValue;
		public MultExpressionContext me;
		public AddExpressionTmpContext aet;
		public MultExpressionContext multExpression() {
			return getRuleContext(MultExpressionContext.class,0);
		}
		public AddExpressionTmpContext addExpressionTmp() {
			return getRuleContext(AddExpressionTmpContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AddExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitAddExpression(this);
		}
	}

	public final AddExpressionContext addExpression(boolean isLeft) throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 52, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((AddExpressionContext)_localctx).me = multExpression(_localctx.isLeft);
			setState(363);
			((AddExpressionContext)_localctx).aet = addExpressionTmp();

				    Type firstOperandType = ((AddExpressionContext)_localctx).me.multExpressionType;
			        Type secondOperandType =  ((AddExpressionContext)_localctx).aet.addExpressionTmpType;
			        if(((AddExpressionContext)_localctx).aet.hasValue){
			            ((AddExpressionContext)_localctx).addExpressionType =  typeCheck(firstOperandType, secondOperandType, "+", !((AddExpressionContext)_localctx).aet.hasValue);
			        }
			        else{
			            ((AddExpressionContext)_localctx).addExpressionType =  firstOperandType;
			        }
				
			((AddExpressionContext)_localctx).isLValue =  ((AddExpressionContext)_localctx).me.isLValue && !((AddExpressionContext)_localctx).aet.hasValue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpressionTmpContext extends ParserRuleContext {
		public Type addExpressionTmpType;
		public boolean hasValue;
		public Token op;
		public MultExpressionContext me;
		public AddExpressionTmpContext aet;
		public MultExpressionContext multExpression() {
			return getRuleContext(MultExpressionContext.class,0);
		}
		public AddExpressionTmpContext addExpressionTmp() {
			return getRuleContext(AddExpressionTmpContext.class,0);
		}
		public AddExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterAddExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitAddExpressionTmp(this);
		}
	}

	public final AddExpressionTmpContext addExpressionTmp() throws RecognitionException {
		AddExpressionTmpContext _localctx = new AddExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_addExpressionTmp);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				((AddExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
					((AddExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(368);
				((AddExpressionTmpContext)_localctx).me = multExpression(false);

				        mips.operationCommand((((AddExpressionTmpContext)_localctx).op!=null?((AddExpressionTmpContext)_localctx).op.getText():null));
					
				setState(370);
				((AddExpressionTmpContext)_localctx).aet = addExpressionTmp();

					    Type firstOperandType = ((AddExpressionTmpContext)_localctx).me.multExpressionType;
				        Type secondOperandType =  ((AddExpressionTmpContext)_localctx).aet.addExpressionTmpType;
				        String operator = (((AddExpressionTmpContext)_localctx).op!=null?((AddExpressionTmpContext)_localctx).op.getText():null);
				        ((AddExpressionTmpContext)_localctx).addExpressionTmpType =  typeCheck(firstOperandType, secondOperandType, "+", !((AddExpressionTmpContext)_localctx).aet.hasValue);
				        ((AddExpressionTmpContext)_localctx).hasValue =  true;
					
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

					    ((AddExpressionTmpContext)_localctx).addExpressionTmpType =  NoType.getInstance();
					    ((AddExpressionTmpContext)_localctx).hasValue =  false;
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type multExpressionType;
		public boolean isLValue;
		public NotExpressionContext ne;
		public MultExpressionTmpContext met;
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public MultExpressionTmpContext multExpressionTmp() {
			return getRuleContext(MultExpressionTmpContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression(boolean isLeft) throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 56, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((MultExpressionContext)_localctx).ne = notExpression(_localctx.isLeft);
			setState(377);
			((MultExpressionContext)_localctx).met = multExpressionTmp();

				   Type firstOperandType = ((MultExpressionContext)_localctx).ne.notExpressionType;
				   Type secondOperandType =  ((MultExpressionContext)_localctx).met.multExpressionTmpType;
				   if(((MultExpressionContext)_localctx).met.hasValue){
				        ((MultExpressionContext)_localctx).multExpressionType =  typeCheck(firstOperandType, secondOperandType, "*", !((MultExpressionContext)_localctx).met.hasValue);
				   }
				   else{
				        ((MultExpressionContext)_localctx).multExpressionType =  firstOperandType;
				   }
			    
			((MultExpressionContext)_localctx).isLValue =  ((MultExpressionContext)_localctx).ne.isLValue && !((MultExpressionContext)_localctx).met.hasValue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionTmpContext extends ParserRuleContext {
		public Type multExpressionTmpType;
		public boolean hasValue;
		public Token op;
		public NotExpressionContext ne;
		public MultExpressionTmpContext met;
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public MultExpressionTmpContext multExpressionTmp() {
			return getRuleContext(MultExpressionTmpContext.class,0);
		}
		public MultExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterMultExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitMultExpressionTmp(this);
		}
	}

	public final MultExpressionTmpContext multExpressionTmp() throws RecognitionException {
		MultExpressionTmpContext _localctx = new MultExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multExpressionTmp);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				((MultExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
					((MultExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				//print("multExpressionTmp : " + $op.text);
					
				setState(383);
				((MultExpressionTmpContext)_localctx).ne = notExpression(false);

				        mips.operationCommand((((MultExpressionTmpContext)_localctx).op!=null?((MultExpressionTmpContext)_localctx).op.getText():null));
				    
				setState(385);
				((MultExpressionTmpContext)_localctx).met = multExpressionTmp();

					        Type firstOperandType = ((MultExpressionTmpContext)_localctx).ne.notExpressionType;
				            Type secondOperandType = ((MultExpressionTmpContext)_localctx).met.multExpressionTmpType;
				            String operator = (((MultExpressionTmpContext)_localctx).op!=null?((MultExpressionTmpContext)_localctx).op.getText():null);
				            ((MultExpressionTmpContext)_localctx).multExpressionTmpType =  typeCheck(firstOperandType, secondOperandType, "*", !((MultExpressionTmpContext)_localctx).met.hasValue);
				            ((MultExpressionTmpContext)_localctx).hasValue =  true;
					
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

					    ((MultExpressionTmpContext)_localctx).hasValue =  false;
					    ((MultExpressionTmpContext)_localctx).multExpressionTmpType =  NoType.getInstance();
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type notExpressionType;
		public boolean isLValue;
		public NotExpressionTmpContext net;
		public ArrayAccessExpressionContext aae;
		public NotExpressionTmpContext notExpressionTmp() {
			return getRuleContext(NotExpressionTmpContext.class,0);
		}
		public ArrayAccessExpressionContext arrayAccessExpression() {
			return getRuleContext(ArrayAccessExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NotExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression(boolean isLeft) throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 60, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((NotExpressionContext)_localctx).net = notExpressionTmp();
			setState(392);
			((NotExpressionContext)_localctx).aae = arrayAccessExpression(_localctx.isLeft);

				    if(((NotExpressionContext)_localctx).net.hasNot){
				        if(!(((NotExpressionContext)_localctx).aae.arrayAccessExpressionType.equals(IntType.getInstance()))){
				            print("-----------------------------not operand should be Integer");
				            ((NotExpressionContext)_localctx).notExpressionType =  NoType.getInstance();
				        }
				        else{
				            {
			                	    mips.operationCommand("not");
			                }
				            ((NotExpressionContext)_localctx).notExpressionType =  ((NotExpressionContext)_localctx).aae.arrayAccessExpressionType;
				        }
				    }
				    else{
				        ((NotExpressionContext)_localctx).notExpressionType =  ((NotExpressionContext)_localctx).aae.arrayAccessExpressionType;
				    }
				
			((NotExpressionContext)_localctx).isLValue =  ((NotExpressionContext)_localctx).aae.isLValue && !((NotExpressionContext)_localctx).net.hasValue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionTmpContext extends ParserRuleContext {
		public boolean hasNot;
		public boolean isBoolean;
		public boolean hasValue;
		public Token op;
		public NotExpressionTmpContext notExpressionTmp() {
			return getRuleContext(NotExpressionTmpContext.class,0);
		}
		public NotExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterNotExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitNotExpressionTmp(this);
		}
	}

	public final NotExpressionTmpContext notExpressionTmp() throws RecognitionException {
		NotExpressionTmpContext _localctx = new NotExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_notExpressionTmp);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((NotExpressionTmpContext)_localctx).op = match(T__23);
				setState(397);
				notExpressionTmp();
				((NotExpressionTmpContext)_localctx).hasNot =  true;((NotExpressionTmpContext)_localctx).isBoolean =  false; ((NotExpressionTmpContext)_localctx).hasValue =  true;
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__26);
				setState(401);
				notExpressionTmp();
				((NotExpressionTmpContext)_localctx).hasNot =  true;((NotExpressionTmpContext)_localctx).isBoolean =  true; ((NotExpressionTmpContext)_localctx).hasValue =  true;
				}
				break;
			case T__12:
			case T__13:
			case T__27:
			case T__33:
			case CONST_INT:
			case CONST_STRING:
			case CONST_CHAR:
			case Id:
				enterOuterAlt(_localctx, 3);
				{
				((NotExpressionTmpContext)_localctx).hasNot =  false;((NotExpressionTmpContext)_localctx).hasValue =  false;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type arrayAccessExpressionType;
		public boolean isLValue;
		public List<Integer> indexBoundList;
		public OtherExpressionContext oe;
		public ArrayAccessExpressionTmpContext aaet;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public ArrayAccessExpressionTmpContext arrayAccessExpressionTmp() {
			return getRuleContext(ArrayAccessExpressionTmpContext.class,0);
		}
		public ArrayAccessExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArrayAccessExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitArrayAccessExpression(this);
		}
	}

	public final ArrayAccessExpressionContext arrayAccessExpression(boolean isLeft) throws RecognitionException {
		ArrayAccessExpressionContext _localctx = new ArrayAccessExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 64, RULE_arrayAccessExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("arrayAccessExpression");

			setState(408);
			((ArrayAccessExpressionContext)_localctx).oe = otherExpression(_localctx.isLeft);

			    	    // indexOutOfBoundError
			    	    if (((ArrayAccessExpressionContext)_localctx).oe.otherExpressionType instanceof ArrayType){

			    	        ((ArrayAccessExpressionContext)_localctx).indexBoundList =  ((ArrayType)((ArrayAccessExpressionContext)_localctx).oe.otherExpressionType).getDimensionsForStack();
			    	        for (int i=0; i<_localctx.indexBoundList.size(); i++)
			    	            print(Integer.toString(_localctx.indexBoundList.get(i)));
			            }
			    
			setState(410);
			((ArrayAccessExpressionContext)_localctx).aaet = arrayAccessExpressionTmp(((ArrayAccessExpressionContext)_localctx).oe.otherExpressionType, _localctx.isLeft, ((ArrayAccessExpressionContext)_localctx).oe.offset,_localctx.indexBoundList);

				  ((ArrayAccessExpressionContext)_localctx).arrayAccessExpressionType =  ((ArrayAccessExpressionContext)_localctx).aaet.afterAccessType;
				  ((ArrayAccessExpressionContext)_localctx).isLValue =  ((ArrayAccessExpressionContext)_localctx).oe.isLValue;

				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessExpressionTmpContext extends ParserRuleContext {
		public Type beforeAccessType;
		public boolean otherIsLeft;
		public int offset;
		public List<Integer> indexBoundList;
		public Type afterAccessType;
		public int indexCount;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAccessExpressionTmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArrayAccessExpressionTmpContext(ParserRuleContext parent, int invokingState, Type beforeAccessType, boolean otherIsLeft, int offset, List<Integer> indexBoundList) {
			super(parent, invokingState);
			this.beforeAccessType = beforeAccessType;
			this.otherIsLeft = otherIsLeft;
			this.offset = offset;
			this.indexBoundList = indexBoundList;
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterArrayAccessExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitArrayAccessExpressionTmp(this);
		}
	}

	public final ArrayAccessExpressionTmpContext arrayAccessExpressionTmp(Type beforeAccessType,boolean otherIsLeft,int offset,List<Integer> indexBoundList) throws RecognitionException {
		ArrayAccessExpressionTmpContext _localctx = new ArrayAccessExpressionTmpContext(_ctx, getState(), beforeAccessType, otherIsLeft, offset, indexBoundList);
		enterRule(_localctx, 66, RULE_arrayAccessExpressionTmp);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{

				        if(_localctx.otherIsLeft == false){
				            int elementsNum = ((ArrayType) beforeAccessType).getElementCount();
				            for(int i=0; i<elementsNum; i++){
				                mips.popStack();
				            }
				        }
				        print("isLeft: "+_localctx.otherIsLeft);
				    
				((ArrayAccessExpressionTmpContext)_localctx).afterAccessType =  _localctx.beforeAccessType;

				        /*print("-----------in temp-----------");
				        for (int i=0; i<_localctx.indexBoundList.size(); i++)
				            print(Integer.toString(_localctx.indexBoundList.get(i)));
				        print("-----------end temp-----------");*/
				    
				((ArrayAccessExpressionTmpContext)_localctx).indexCount =  0;
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(417);
					match(T__5);
					setState(418);
					((ArrayAccessExpressionTmpContext)_localctx).e = expression();
					setState(419);
					match(T__6);
					((ArrayAccessExpressionTmpContext)_localctx).afterAccessType =  ((ArrayType)_localctx.afterAccessType).getType(); mips.checkIndex(_localctx.indexBoundList.get(_localctx.indexCount)); _localctx.indexCount++; 
					}
					}
					setState(424); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );

				        print("after access type:"+_localctx.afterAccessType.toString());
				        if(_localctx.otherIsLeft){
				            List<Integer> dimensions = ((ArrayType)_localctx.beforeAccessType).getDimensionsForStack();
				            for(int i=0; i<dimensions.size(); i++){
				                print("-"+dimensions.get(i)+"-");
				            }
				            mips.leftArrayAccess(_localctx.indexCount, dimensions);
				        }
				        else{
				            List<Integer> dimensions = ((ArrayType)_localctx.beforeAccessType).getDimensionsForStack();
				                for(int i=0; i<dimensions.size(); i++){
				                print("-"+dimensions.get(i)+"-");
				            }
				            int accessCount = 1;
				            for(int i=0; i<(dimensions.size() - _localctx.indexCount); i++){
				                accessCount = accessCount* dimensions.get(dimensions.size()-(i+1));
				            }
				            mips.rightArrayAccess(_localctx.indexCount,dimensions,accessCount,_localctx.offset);

				        }
				    
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__6:
			case T__9:
			case T__10:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{

				        ((ArrayAccessExpressionTmpContext)_localctx).afterAccessType =  _localctx.beforeAccessType;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherExpressionContext extends ParserRuleContext {
		public boolean isLeft;
		public Type otherExpressionType;
		public boolean isLValue;
		public int offset;
		public FunctionCallContext fc;
		public Token CONST_INT;
		public Token CONST_STRING;
		public Token CONST_CHAR;
		public Token id;
		public ExpressionContext exp;
		public ExpressionContext ex;
		public TerminalNode CONST_INT() { return getToken(g2Parser.CONST_INT, 0); }
		public TerminalNode CONST_STRING() { return getToken(g2Parser.CONST_STRING, 0); }
		public TerminalNode CONST_CHAR() { return getToken(g2Parser.CONST_CHAR, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Id() { return getToken(g2Parser.Id, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OtherExpressionContext(ParserRuleContext parent, int invokingState, boolean isLeft) {
			super(parent, invokingState);
			this.isLeft = isLeft;
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitOtherExpression(this);
		}
	}

	public final OtherExpressionContext otherExpression(boolean isLeft) throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState(), isLeft);
		enterRule(_localctx, 68, RULE_otherExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(431);
				((OtherExpressionContext)_localctx).fc = functionCall();
				/* TODO : add expression type for functioncall*/

				        ((OtherExpressionContext)_localctx).otherExpressionType =  new ArrayType(((OtherExpressionContext)_localctx).fc.readSize, CharType.getInstance());
				        ((OtherExpressionContext)_localctx).offset =  -1;

				    
				}
				break;
			case 2:
				{
				setState(435);
				((OtherExpressionContext)_localctx).CONST_INT = match(CONST_INT);
				 ((OtherExpressionContext)_localctx).otherExpressionType =  IntType.getInstance();
				        print("otherExpression CONST_INT: " + (((OtherExpressionContext)_localctx).CONST_INT!=null?((OtherExpressionContext)_localctx).CONST_INT.getText():null) + " ---- " + _localctx.otherExpressionType.toString() );
				        ((OtherExpressionContext)_localctx).isLValue =  false;

				            mips.addToStack((((OtherExpressionContext)_localctx).CONST_INT!=null?((OtherExpressionContext)_localctx).CONST_INT.getText():null));
				            ((OtherExpressionContext)_localctx).offset =  -1;
				        
				}
				break;
			case 3:
				{
				setState(438);
				((OtherExpressionContext)_localctx).CONST_STRING = match(CONST_STRING);

				        int stringSize = ((((OtherExpressionContext)_localctx).CONST_STRING!=null?((OtherExpressionContext)_localctx).CONST_STRING.getText():null).length()) - 2;
				        ((OtherExpressionContext)_localctx).otherExpressionType =  new ArrayType(stringSize, CharType.getInstance());
				        print("otherExpression CONST_STRING: " + (((OtherExpressionContext)_localctx).CONST_STRING!=null?((OtherExpressionContext)_localctx).CONST_STRING.getText():null) + " ---- " + _localctx.otherExpressionType.toString() );
				        ((OtherExpressionContext)_localctx).isLValue =  false;

				            for(int i=0;i<(((((OtherExpressionContext)_localctx).CONST_STRING!=null?((OtherExpressionContext)_localctx).CONST_STRING.getText():null).length()) - 2);i++){
				                mips.addToStack("'"+Character.toString((((OtherExpressionContext)_localctx).CONST_STRING!=null?((OtherExpressionContext)_localctx).CONST_STRING.getText():null).charAt(i+1))+"'");
				            }
				            ((OtherExpressionContext)_localctx).offset =  -1;
				        
				}
				break;
			case 4:
				{
				setState(441);
				((OtherExpressionContext)_localctx).CONST_CHAR = match(CONST_CHAR);
				 ((OtherExpressionContext)_localctx).otherExpressionType =  CharType.getInstance();
				        print("otherExpression CONST_CHAR: " + (((OtherExpressionContext)_localctx).CONST_CHAR!=null?((OtherExpressionContext)_localctx).CONST_CHAR.getText():null) + " ---- " + _localctx.otherExpressionType.toString() );
				        ((OtherExpressionContext)_localctx).isLValue =  false;

				            mips.addToStack((((OtherExpressionContext)_localctx).CONST_CHAR!=null?((OtherExpressionContext)_localctx).CONST_CHAR.getText():null));
				            ((OtherExpressionContext)_localctx).offset =  -1;
				        
				}
				break;
			case 5:
				{
				setState(444);
				((OtherExpressionContext)_localctx).id = match(Id);

				         SymbolTableItem item = SymbolTable.top.get((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null));
				         if(item == null) {
				             print((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getLine():0) + ") Item " + (((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null) + " doesnt exist.");
				             ((OtherExpressionContext)_localctx).otherExpressionType =  NoType.getInstance();
				         }
				         else {
				             SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
				            // print((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getLine():0) + ") Variable " + (((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null) + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
				             ((OtherExpressionContext)_localctx).otherExpressionType =  var.getVariable().getType();
				             if (var.getBaseRegister() == Register.SP){
				                 if (_localctx.isLeft == false){
				                    if(_localctx.otherExpressionType instanceof ArrayType){
				                        mips.addCommentToInstructions("---------------RValue array pushing to stack------");
				                        int elementsCount = ((ArrayType)_localctx.otherExpressionType).getElementCount();
				                        for(int i=0;i<elementsCount;i++){
				                            mips.addToStack((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null), (var.getOffset()*-1)-(4*i));
				                        }
				                        mips.addCommentToInstructions("---------------end of RValue array pushing to stack------");
				            		}
				            		else{
				                        mips.addToStack((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null), var.getOffset()*-1);
				                    }
				                 }
				                 else{
				                    mips.addAddressToStack((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null), var.getOffset()*-1);
				                 }
				                 ((OtherExpressionContext)_localctx).offset =  var.getOffset();
				             }
				             else {
				                 if(_localctx.isLeft == false){
				                    if(_localctx.otherExpressionType instanceof ArrayType){
				                        int elementsCount = ((ArrayType)_localctx.otherExpressionType).getElementCount();
				                        for(int i=0;i<elementsCount;i++){
				                            mips.addGlobalToStack((var.getOffset()*-1)-(4*i));
				                        }
				                    }
				                    else{
				                        mips.addGlobalToStack(var.getOffset());
				                    }
				                 }
				                 else{
				                    mips.addGlobalAddressToStack((((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null), var.getOffset());
				                 }
				                 ((OtherExpressionContext)_localctx).offset =  var.getOffset();
				             }
				         }
				         ((OtherExpressionContext)_localctx).isLValue =  true;
				    

				        print("otherExpression Id: " + (((OtherExpressionContext)_localctx).id!=null?((OtherExpressionContext)_localctx).id.getText():null) + " ---- " + _localctx.otherExpressionType.toString());
				    
				}
				break;
			case 6:
				{
				setState(447);
				match(T__27);
				setState(448);
				((OtherExpressionContext)_localctx).exp = expression();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(449);
					match(T__10);
					setState(450);
					expression();
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(T__28);

				            ((OtherExpressionContext)_localctx).isLValue =  false;
				            ((OtherExpressionContext)_localctx).otherExpressionType =  ((OtherExpressionContext)_localctx).exp.expressionType;
				            ((OtherExpressionContext)_localctx).offset =  -1;
				         
				}
				break;
			case 7:
				{
				//print("otherExpression : ()");
				    
				setState(460);
				match(T__13);
				setState(461);
				((OtherExpressionContext)_localctx).ex = expression();
				setState(462);
				match(T__14);

				        ((OtherExpressionContext)_localctx).isLValue =  ((OtherExpressionContext)_localctx).ex.isLValue;
				        ((OtherExpressionContext)_localctx).otherExpressionType =  ((OtherExpressionContext)_localctx).ex.expressionType;
				        ((OtherExpressionContext)_localctx).offset =  -1;
				    
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuitStatementContext extends ParserRuleContext {
		public String actorName;
		public QuitStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public QuitStatementContext(ParserRuleContext parent, int invokingState, String actorName) {
			super(parent, invokingState);
			this.actorName = actorName;
		}
		@Override public int getRuleIndex() { return RULE_quitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterQuitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitQuitStatement(this);
		}
	}

	public final QuitStatementContext quitStatement(String actorName) throws RecognitionException {
		QuitStatementContext _localctx = new QuitStatementContext(_ctx, getState(), actorName);
		enterRule(_localctx, 70, RULE_quitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("quit");
				
			setState(468);
			match(T__29);

				    mips.jumpToActorEnd(_localctx.actorName);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SendStatementContext extends ParserRuleContext {
		public String actorName;
		public boolean cantSend;
		public boolean isSelf;
		public boolean isSender;
		public Token se;
		public Token self;
		public Token id;
		public Token sendOp;
		public FunctionCallContext fc;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Id() { return getToken(g2Parser.Id, 0); }
		public SendStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SendStatementContext(ParserRuleContext parent, int invokingState, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_sendStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterSendStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitSendStatement(this);
		}
	}

	public final SendStatementContext sendStatement(String actorName,boolean cantSend) throws RecognitionException {
		SendStatementContext _localctx = new SendStatementContext(_ctx, getState(), actorName, cantSend);
		enterRule(_localctx, 72, RULE_sendStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("sendStatement");
				
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(472);
				((SendStatementContext)_localctx).se = match(T__30);

					    //print ("00000 in sendStatement , sender , cantSend = " + _localctx.cantSend);
					    ((SendStatementContext)_localctx).isSender =  true; ((SendStatementContext)_localctx).isSelf =  false;
					    if (_localctx.cantSend)
					        print ((((SendStatementContext)_localctx).se!=null?((SendStatementContext)_localctx).se.getLine():0) + ") init has no args cant use send");

					
				}
				break;
			case T__31:
				{
				setState(474);
				((SendStatementContext)_localctx).self = match(T__31);
				((SendStatementContext)_localctx).isSelf =  true; ((SendStatementContext)_localctx).isSender = false;
				}
				break;
			case Id:
				{
				setState(476);
				((SendStatementContext)_localctx).id = match(Id);

					   ((SendStatementContext)_localctx).isSender =  false;
					   ((SendStatementContext)_localctx).isSelf =  false;
				       SymbolTableItem item = SymbolTable.top.get((((SendStatementContext)_localctx).id!=null?((SendStatementContext)_localctx).id.getText():null));
				       if(item == null || !(item instanceof SymbolTableActorItem)){
				            print((((SendStatementContext)_localctx).id!=null?((SendStatementContext)_localctx).id.getLine():0) +") #### actor with name "+(((SendStatementContext)_localctx).id!=null?((SendStatementContext)_localctx).id.getText():null)+" not found for send statement ####");
				       }
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(480);
			((SendStatementContext)_localctx).sendOp = match(T__32);
			setState(481);
			((SendStatementContext)_localctx).fc = functionCall();

				    if(!_localctx.isSender){
			            String receiverActorName;
			            int lineNum;
			            if(_localctx.isSelf){
			                receiverActorName = _localctx.actorName;
			                lineNum = (((SendStatementContext)_localctx).self!=null?((SendStatementContext)_localctx).self.getLine():0);
			            }
			            else{
			                receiverActorName = (((SendStatementContext)_localctx).id!=null?((SendStatementContext)_localctx).id.getText():null);
			                lineNum = (((SendStatementContext)_localctx).id!=null?((SendStatementContext)_localctx).id.getLine():0);

			            }
			            SymbolTableItem item = SymbolTable.top.get(receiverActorName);
			            if(item != null && item instanceof SymbolTableActorItem){
			                 SymbolTableActorItem actorItem = (SymbolTableActorItem) item;
			                 if(!actorItem.hasReceiver(((SendStatementContext)_localctx).fc.receiverSign)){
			                        print(lineNum +") receiver "+((SendStatementContext)_localctx).fc.receiverSign+" not found for actor "+receiverActorName);
			                 }
			            }
			            mips.sendMessage(receiverActorName, ((SendStatementContext)_localctx).fc.receiverSign, (((SendStatementContext)_localctx).sendOp!=null?((SendStatementContext)_localctx).sendOp.getLine():0) );
			        }
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public String receiverSign;
		public boolean isRead;
		public int readSize;
		public Token id;
		public ArgumentsContext ar;
		public Token CONST_INT;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Id() { return getToken(g2Parser.Id, 0); }
		public TerminalNode CONST_INT() { return getToken(g2Parser.CONST_INT, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionCall);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Id:
					{
					setState(484);
					((FunctionCallContext)_localctx).id = match(Id);
					((FunctionCallContext)_localctx).receiverSign =  (((FunctionCallContext)_localctx).id!=null?((FunctionCallContext)_localctx).id.getText():null) + "(";
					}
					break;
				case T__12:
					{
					setState(486);
					match(T__12);
					((FunctionCallContext)_localctx).receiverSign =  "init" + "(";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(490);
				match(T__13);
				setState(491);
				((FunctionCallContext)_localctx).ar = arguments();
				_localctx.receiverSign += ((FunctionCallContext)_localctx).ar.argumentsTypeString +")";
				setState(493);
				match(T__14);
				((FunctionCallContext)_localctx).isRead =  false; ((FunctionCallContext)_localctx).readSize =  0;
				print("^%^%^%^%^"+_localctx.receiverSign+"&^&^&^&^&^&");
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(T__33);
				setState(498);
				match(T__13);
				setState(499);
				((FunctionCallContext)_localctx).CONST_INT = match(CONST_INT);
				setState(500);
				match(T__14);
				((FunctionCallContext)_localctx).isRead =  true; ((FunctionCallContext)_localctx).readSize =  (((FunctionCallContext)_localctx).CONST_INT!=null?Integer.valueOf(((FunctionCallContext)_localctx).CONST_INT.getText()):0); mips.read((((FunctionCallContext)_localctx).CONST_INT!=null?Integer.valueOf(((FunctionCallContext)_localctx).CONST_INT.getText()):0));
				print("^%^%^%^%^"+_localctx.receiverSign+"&^&^&^&^&^&");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public String argumentsTypeString = "";
		public ArgumentContext a1;
		public ArgumentContext a2;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arguments);
		try {
			int _alt;
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__23:
			case T__26:
			case T__27:
			case T__33:
			case CONST_INT:
			case CONST_STRING:
			case CONST_CHAR:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				//print("arguments");
					
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(506);
						((ArgumentsContext)_localctx).a1 = argument();
						setState(507);
						match(T__10);
						_localctx.argumentsTypeString += (((ArgumentsContext)_localctx).a1.argumentTypeString + " ");
						}
						} 
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(515);
				((ArgumentsContext)_localctx).a2 = argument();
				_localctx.argumentsTypeString += (((ArgumentsContext)_localctx).a2.argumentTypeString + " ");
				print("injaaaaaaam");
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				((ArgumentsContext)_localctx).argumentsTypeString =  "";
				print("oooonjaaaaaam");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public String argumentTypeString;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("argument");
				
			setState(524);
			((ArgumentContext)_localctx).e = expression();
			((ArgumentContext)_localctx).argumentTypeString =  (((ArgumentContext)_localctx).e.expressionType).toString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public Token i;
		public ExpressionContext ex;
		public Token n;
		public ElseIfelseContext eif;
		public Token endStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseIfelseContext elseIfelse() {
			return getRuleContext(ElseIfelseContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 80, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("ifStatement");
				
			setState(528);
			((IfStatementContext)_localctx).i = match(T__34);
			beginScope();
			setState(530);
			((IfStatementContext)_localctx).ex = expression();

				        if(!((IfStatementContext)_localctx).ex.expressionType.equals(IntType.getInstance())){
				            print((((IfStatementContext)_localctx).i!=null?((IfStatementContext)_localctx).i.getLine():0) +") error in if expression: type should be int but it is "+((IfStatementContext)_localctx).ex.expressionType.toString());
				        }
				

				    mips.addCommentToInstructions("--------if begin -------");
				    mips.jz();
				    mips.addCommentToInstructions("--------if end -------");
				
			setState(534); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(533);
				match(T__0);
				}
				}
				setState(536); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(538);
				statement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				{
				setState(540); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(539);
					((IfStatementContext)_localctx).n = match(T__0);
					}
					}
					setState(542); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        endScope();
			        mips.addCommentToInstructions("--------if exit begin -------");
			        mips.getNewExitListAndPush();
			        mips.addJumpExit();
			        mips.addCommentToInstructions("--------if exit end -------");
			    
			setState(550);
			((IfStatementContext)_localctx).eif = elseIfelse(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
			setState(551);
			((IfStatementContext)_localctx).endStatement = match(T__1);

				    if(!((IfStatementContext)_localctx).eif.hasElse)
				    {
				        mips.addCommentToInstructions("--------no else begin -------");
			            mips.compjpz("line"+Integer.toString((((IfStatementContext)_localctx).endStatement!=null?((IfStatementContext)_localctx).endStatement.getLine():0)));
			            mips.compJumpExitAndPop("line"+Integer.toString((((IfStatementContext)_localctx).endStatement!=null?((IfStatementContext)_localctx).endStatement.getLine():0)));
			            mips.addCommentToInstructions("--------no else end -------");

				    }
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfelseContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public boolean hasElse;
		public ElseStatementContext es;
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ElseIfelseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseIfelseContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_elseIfelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterElseIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitElseIfelse(this);
		}
	}

	public final ElseIfelseContext elseIfelse(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		ElseIfelseContext _localctx = new ElseIfelseContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 82, RULE_elseIfelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(554);
				elseIf(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(560);
			((ElseIfelseContext)_localctx).es = elseStatement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
			((ElseIfelseContext)_localctx).hasElse =  ((ElseIfelseContext)_localctx).es.hasElse;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public Token ei;
		public Token n;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseIfContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitElseIf(this);
		}
	}

	public final ElseIfContext elseIf(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 84, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			((ElseIfContext)_localctx).ei = match(T__35);

			            mips.addCommentToInstructions("--------elseif before expression begin -------");
			            mips.compjpz("line"+Integer.toString((((ElseIfContext)_localctx).ei!=null?((ElseIfContext)_localctx).ei.getLine():0)));
			            mips.addCommentToInstructions("--------elseif before expression end -------");
			    
			beginScope();
			setState(566);
			expression();

			    	    mips.addCommentToInstructions("--------elseif1 begin -------");
			    	    //mips.elseIfjcompjpz("line"+Integer.toString((((ElseIfContext)_localctx).ei!=null?((ElseIfContext)_localctx).ei.getLine():0)));
			    	    mips.jz();
			    	    mips.addCommentToInstructions("--------elseif1 end -------");
			    
			setState(569); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(568);
				match(T__0);
				}
				}
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(573);
				statement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				{
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(574);
					((ElseIfContext)_localctx).n = match(T__0);
					}
					}
					setState(577); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();

			            mips.addCommentToInstructions("--------elseif exit begin -------");
			            mips.addJumpExit();
			            mips.addCommentToInstructions("--------elseif exit end -------");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public boolean hasElse;
		public Token e;
		public Token n;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 86, RULE_elseStatement);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				((ElseStatementContext)_localctx).e = match(T__36);

					    mips.addCommentToInstructions("--------else1 begin -------");
					    mips.jcompjpz("line"+Integer.toString((((ElseStatementContext)_localctx).e!=null?((ElseStatementContext)_localctx).e.getLine():0)));
					    mips.addCommentToInstructions("--------else1 end -------");
					    ((ElseStatementContext)_localctx).hasElse =  true;

					
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(589);
					match(T__0);
					}
					}
					setState(592); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				beginScope();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
					{
					{
					setState(595);
					statement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
					{
					setState(597); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(596);
						((ElseStatementContext)_localctx).n = match(T__0);
						}
						}
						setState(599); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				endScope();

				        mips.addCommentToInstructions("--------else2 begin -------");
				        mips.compjp("line"+Integer.toString((((ElseStatementContext)_localctx).n!=null?((ElseStatementContext)_localctx).n.getLine():0)));
				        mips.addCommentToInstructions("--------else2 end -------");

				        //complete exit codes
				        mips.addCommentToInstructions("--------else exit complete begin -------");
				        mips.compJumpExitAndPop("line"+Integer.toString((((ElseStatementContext)_localctx).n!=null?((ElseStatementContext)_localctx).n.getLine():0)));
				        mips.addCommentToInstructions("--------else exit complete end -------");

					
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((ElseStatementContext)_localctx).hasElse =  false;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachStatementContext extends ParserRuleContext {
		public int forEachDepth;
		public String actorName;
		public boolean cantSend;
		public Token id;
		public ExpressionContext ex;
		public Token e;
		public TerminalNode Id() { return getToken(g2Parser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForEachStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth, String actorName, boolean cantSend) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
			this.actorName = actorName;
			this.cantSend = cantSend;
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g2Listener ) ((g2Listener)listener).exitForEachStatement(this);
		}
	}

	public final ForEachStatementContext forEachStatement(int forEachDepth,String actorName,boolean cantSend) throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState(), forEachDepth, actorName, cantSend);
		enterRule(_localctx, 88, RULE_forEachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

				    mips.addToStack("1");
				
			setState(612);
			match(T__37);
			setState(613);
			((ForEachStatementContext)_localctx).id = match(Id);
			setState(614);
			match(T__38);
			setState(615);
			((ForEachStatementContext)_localctx).ex = expression();
			setState(617); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(616);
				match(T__0);
				}
				}
				setState(619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			beginScope();

			        if(!(((ForEachStatementContext)_localctx).ex.expressionType instanceof ArrayType)){
			            print((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getLine():0)+") foreach statement should have arrayType");
			            //with no type put in pass1
			            SymbolTable.define();
			        }
			        else{
			            SymbolTable.top.changeType((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getText():null),((ArrayType)((ForEachStatementContext)_localctx).ex.expressionType).getType());
			            SymbolTable.define();
			        }
			        printSymbolTableTop();
			        //------------------code generation------------------

			        //----------init
			        int elementOffset = 0;
			        SymbolTableItem item = SymbolTable.top.get((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getText():null));
			        if(item == null) {
			            print((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getLine():0) + ") Item " + (((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getText():null) + " doesnt exist.");
			        }
			        else {
			            SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
			            elementOffset =var.getOffset()*-1;
			            mips.addAddressToStack((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getText():null), elementOffset);

			        }

			        int arraySize = ((ArrayType)((ForEachStatementContext)_localctx).ex.expressionType).getLength();
			        mips.addToStack(Integer.toString(arraySize*4));
			        //----------end init
			        mips.initFor(elementOffset, arraySize*4);
			        mips.addLabel("for" + Integer.toString((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getLine():0)));
			        mips.forJz();
			        //------------------end code generation------------------
			    
			_localctx.forEachDepth++;

				    //making sure the stack doesn't change after for
			//	    mips.beginScope(SymbolTable.top.getOffset(Register.SP));
			        beginScope();
				
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(625);
				statement(_localctx.forEachDepth, _localctx.actorName, _localctx.cantSend);
				{
				setState(627); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(626);
					match(T__0);
					}
					}
					setState(629); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();

			        SymbolTableItem item2 = SymbolTable.top.get((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getText():null));
			        SymbolTableVariableItemBase var2 = (SymbolTableVariableItemBase) item2;
			        int offset = var2.getOffset()*-1;

			        mips.foreachStep(offset);
			        mips.jump("for"+Integer.toString((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getLine():0)));
			    
			endScope();
			setState(639);
			((ForEachStatementContext)_localctx).e = match(T__1);
			_localctx.forEachDepth--;

			        mips.compForJump("endfor"+Integer.toString((((ForEachStatementContext)_localctx).e!=null?((ForEachStatementContext)_localctx).e.getLine():0)));
			        int arraySize2 = ((ArrayType)((ForEachStatementContext)_localctx).ex.expressionType).getLength();
			        mips.addCommentToInstructions("-----------poping for data------------");
			        mips.addCommentToInstructions("pop array size from for stack");
			        mips.popForStack();
			        mips.addCommentToInstructions("pop element from for stack");
			        mips.popForStack();
			        mips.addCommentToInstructions("pop array from for stack");
			        for (int i=0; i<arraySize2; i++)
			            mips.popForStack();
			        mips.addCommentToInstructions("pop element from real stack");
			        mips.popStack();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0286\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\6\4~\n\4\r\4\16\4\177\3\4\3\4\3\5\3\5\6\5\u0086\n\5\r"+
		"\5\16\5\u0087\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u009b\n\7\r\7\16\7\u009c\3\b\3\b\3\b\3\b"+
		"\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b8\n\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be"+
		"\13\t\3\n\3\n\3\n\7\n\u00c3\n\n\f\n\16\n\u00c6\13\n\3\n\3\n\3\n\3\n\6"+
		"\n\u00cc\n\n\r\n\16\n\u00cd\3\13\3\13\3\13\3\13\3\13\5\13\u00d5\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\6\13\u00dd\n\13\r\13\16\13\u00de\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00e8\n\f\f\f\16\f\u00eb\13\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00f2\n\f\3\r\3\r\6\r\u00f6\n\r\r\r\16\r\u00f7\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0103\n\16\3\17\3\17\6\17\u0107\n"+
		"\17\r\17\16\17\u0108\3\17\3\17\3\17\6\17\u010e\n\17\r\17\16\17\u010f\7"+
		"\17\u0112\n\17\f\17\16\17\u0115\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0132\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0140\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u014e\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015d\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016b"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0179\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0188\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0198"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u01a9\n#\r#"+
		"\16#\u01aa\3#\3#\3#\5#\u01b0\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\7$\u01c6\n$\f$\16$\u01c9\13$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\5$\u01d4\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u01e1\n&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01eb\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u01fa\n\'\3(\3(\3(\3(\3(\7(\u0201\n(\f(\16"+
		"(\u0204\13(\3(\3(\3(\3(\3(\3(\5(\u020c\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\6*\u0219\n*\r*\16*\u021a\3*\3*\6*\u021f\n*\r*\16*\u0220\7*\u0223"+
		"\n*\f*\16*\u0226\13*\3*\3*\3*\3*\3*\3+\7+\u022e\n+\f+\16+\u0231\13+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\6,\u023c\n,\r,\16,\u023d\3,\3,\6,\u0242\n,\r"+
		",\16,\u0243\7,\u0246\n,\f,\16,\u0249\13,\3,\3,\3,\3-\3-\3-\6-\u0251\n"+
		"-\r-\16-\u0252\3-\3-\3-\6-\u0258\n-\r-\16-\u0259\7-\u025c\n-\f-\16-\u025f"+
		"\13-\3-\3-\3-\5-\u0264\n-\3.\3.\3.\3.\3.\3.\6.\u026c\n.\r.\16.\u026d\3"+
		".\3.\3.\3.\3.\3.\6.\u0276\n.\r.\16.\u0277\7.\u027a\n.\f.\16.\u027d\13"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\7\3\3\3\3\3\2\27\30\3\2\6\7"+
		"\3\2\31\32\3\2\33\34\2\u029c\2\\\3\2\2\2\4i\3\2\2\2\6v\3\2\2\2\b\u008a"+
		"\3\2\2\2\n\u0092\3\2\2\2\f\u0094\3\2\2\2\16\u00a2\3\2\2\2\20\u00a4\3\2"+
		"\2\2\22\u00bf\3\2\2\2\24\u00cf\3\2\2\2\26\u00f1\3\2\2\2\30\u00f3\3\2\2"+
		"\2\32\u0102\3\2\2\2\34\u0104\3\2\2\2\36\u0119\3\2\2\2 \u011c\3\2\2\2\""+
		"\u0122\3\2\2\2$\u0131\3\2\2\2&\u0133\3\2\2\2(\u013f\3\2\2\2*\u0141\3\2"+
		"\2\2,\u014d\3\2\2\2.\u014f\3\2\2\2\60\u015c\3\2\2\2\62\u015e\3\2\2\2\64"+
		"\u016a\3\2\2\2\66\u016c\3\2\2\28\u0178\3\2\2\2:\u017a\3\2\2\2<\u0187\3"+
		"\2\2\2>\u0189\3\2\2\2@\u0197\3\2\2\2B\u0199\3\2\2\2D\u01af\3\2\2\2F\u01d3"+
		"\3\2\2\2H\u01d5\3\2\2\2J\u01d9\3\2\2\2L\u01f9\3\2\2\2N\u020b\3\2\2\2P"+
		"\u020d\3\2\2\2R\u0211\3\2\2\2T\u022f\3\2\2\2V\u0235\3\2\2\2X\u0263\3\2"+
		"\2\2Z\u0265\3\2\2\2\\]\b\2\1\2]d\b\2\1\2^_\5\4\3\2_`\b\2\1\2`c\3\2\2\2"+
		"ac\7\3\2\2b^\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
		"fd\3\2\2\2gh\b\2\1\2h\3\3\2\2\2ij\5\6\4\2jn\b\3\1\2km\5\b\5\2lk\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\4\2\2rs\b\3\1"+
		"\2st\t\2\2\2tu\b\3\1\2u\5\3\2\2\2vw\7\5\2\2wx\7.\2\2xy\b\4\1\2yz\7\6\2"+
		"\2z{\7+\2\2{}\7\7\2\2|~\7\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\4\1\2\u0082\7\3\2\2\2"+
		"\u0083\u0085\5\20\t\2\u0084\u0086\7\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u008b\5\22\n\2\u008a\u0083\3\2\2\2\u008a\u0089\3\2\2\2\u008b\t\3\2\2"+
		"\2\u008c\u008d\5\f\7\2\u008d\u008e\b\6\1\2\u008e\u0093\3\2\2\2\u008f\u0090"+
		"\5\16\b\2\u0090\u0091\b\6\1\2\u0091\u0093\3\2\2\2\u0092\u008c\3\2\2\2"+
		"\u0092\u008f\3\2\2\2\u0093\13\3\2\2\2\u0094\u0095\5\16\b\2\u0095\u009a"+
		"\b\7\1\2\u0096\u0097\7\b\2\2\u0097\u0098\7+\2\2\u0098\u0099\7\t\2\2\u0099"+
		"\u009b\b\7\1\2\u009a\u0096\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e\u009f\7\n\2\2\u009f\u00a3"+
		"\b\b\1\2\u00a0\u00a1\7\13\2\2\u00a1\u00a3\b\b\1\2\u00a2\u009e\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6"+
		"\b\t\1\2\u00a6\u00a7\b\t\1\2\u00a7\u00ac\7.\2\2\u00a8\u00a9\7\f\2\2\u00a9"+
		"\u00aa\5\"\22\2\u00aa\u00ab\b\t\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\t\1\2\u00af"+
		"\u00bc\b\t\1\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\7.\2\2\u00b2\u00b7\b\t"+
		"\1\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6\b\t\1\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\b\t\1\2\u00ba\u00b0\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c0\5\24\13\2\u00c0\u00c4\b\n\1\2\u00c1\u00c3\5\30\r\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\n\1\2\u00c8"+
		"\u00c9\b\n\1\2\u00c9\u00cb\7\4\2\2\u00ca\u00cc\7\3\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\23\3\2\2\2\u00cf\u00d4\7\16\2\2\u00d0\u00d1\7.\2\2\u00d1\u00d5\b\13\1"+
		"\2\u00d2\u00d3\7\17\2\2\u00d3\u00d5\b\13\1\2\u00d4\u00d0\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\20\2\2\u00d7\u00d8\5"+
		"\26\f\2\u00d8\u00d9\b\13\1\2\u00d9\u00da\b\13\1\2\u00da\u00dc\7\21\2\2"+
		"\u00db\u00dd\7\3\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\13\1\2"+
		"\u00e1\25\3\2\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\7.\2\2\u00e4\u00e5\b"+
		"\f\1\2\u00e5\u00e6\7\r\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5\n\6\2\u00ed\u00ee\7.\2\2\u00ee"+
		"\u00ef\b\f\1\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\b\f\1\2\u00f1\u00e9\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f5\5\32\16\2\u00f4"+
		"\u00f6\7\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u0103\5\34\17\2\u00fa"+
		"\u0103\5J&\2\u00fb\u0103\5R*\2\u00fc\u0103\5Z.\2\u00fd\u0103\5H%\2\u00fe"+
		"\u0103\5\36\20\2\u00ff\u0103\5 \21\2\u0100\u0103\5\"\22\2\u0101\u0103"+
		"\5\20\t\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2"+
		"\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\33\3\2\2\2\u0104"+
		"\u0106\7\22\2\2\u0105\u0107\7\3\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u0113\b\17\1\2\u010b\u010d\5\32\16\2\u010c\u010e\7\3\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\b\17\1\2\u0117\u0118\7\4\2\2\u0118\35\3\2\2\2\u0119\u011a\7\23"+
		"\2\2\u011a\u011b\b\20\1\2\u011b\37\3\2\2\2\u011c\u011d\7\24\2\2\u011d"+
		"\u011e\7\20\2\2\u011e\u011f\5\"\22\2\u011f\u0120\7\21\2\2\u0120\u0121"+
		"\b\21\1\2\u0121!\3\2\2\2\u0122\u0123\5$\23\2\u0123\u0124\b\22\1\2\u0124"+
		"\u0125\b\22\1\2\u0125#\3\2\2\2\u0126\u0127\5&\24\2\u0127\u0128\7\f\2\2"+
		"\u0128\u0129\5$\23\2\u0129\u012a\b\23\1\2\u012a\u012b\b\23\1\2\u012b\u012c"+
		"\b\23\1\2\u012c\u012d\b\23\1\2\u012d\u0132\3\2\2\2\u012e\u012f\5&\24\2"+
		"\u012f\u0130\b\23\1\2\u0130\u0132\3\2\2\2\u0131\u0126\3\2\2\2\u0131\u012e"+
		"\3\2\2\2\u0132%\3\2\2\2\u0133\u0134\5*\26\2\u0134\u0135\5(\25\2\u0135"+
		"\u0136\b\24\1\2\u0136\u0137\b\24\1\2\u0137\'\3\2\2\2\u0138\u0139\7\25"+
		"\2\2\u0139\u013a\5*\26\2\u013a\u013b\b\25\1\2\u013b\u013c\5(\25\2\u013c"+
		"\u013d\b\25\1\2\u013d\u0140\3\2\2\2\u013e\u0140\b\25\1\2\u013f\u0138\3"+
		"\2\2\2\u013f\u013e\3\2\2\2\u0140)\3\2\2\2\u0141\u0142\5.\30\2\u0142\u0143"+
		"\5,\27\2\u0143\u0144\b\26\1\2\u0144\u0145\b\26\1\2\u0145+\3\2\2\2\u0146"+
		"\u0147\7\26\2\2\u0147\u0148\5.\30\2\u0148\u0149\b\27\1\2\u0149\u014a\5"+
		",\27\2\u014a\u014b\b\27\1\2\u014b\u014e\3\2\2\2\u014c\u014e\b\27\1\2\u014d"+
		"\u0146\3\2\2\2\u014d\u014c\3\2\2\2\u014e-\3\2\2\2\u014f\u0150\5\62\32"+
		"\2\u0150\u0151\5\60\31\2\u0151\u0152\b\30\1\2\u0152\u0153\b\30\1\2\u0153"+
		"/\3\2\2\2\u0154\u0155\t\3\2\2\u0155\u0156\b\31\1\2\u0156\u0157\5\62\32"+
		"\2\u0157\u0158\b\31\1\2\u0158\u0159\5\60\31\2\u0159\u015a\b\31\1\2\u015a"+
		"\u015d\3\2\2\2\u015b\u015d\b\31\1\2\u015c\u0154\3\2\2\2\u015c\u015b\3"+
		"\2\2\2\u015d\61\3\2\2\2\u015e\u015f\5\66\34\2\u015f\u0160\5\64\33\2\u0160"+
		"\u0161\b\32\1\2\u0161\u0162\b\32\1\2\u0162\63\3\2\2\2\u0163\u0164\t\4"+
		"\2\2\u0164\u0165\5\66\34\2\u0165\u0166\b\33\1\2\u0166\u0167\5\64\33\2"+
		"\u0167\u0168\b\33\1\2\u0168\u016b\3\2\2\2\u0169\u016b\b\33\1\2\u016a\u0163"+
		"\3\2\2\2\u016a\u0169\3\2\2\2\u016b\65\3\2\2\2\u016c\u016d\5:\36\2\u016d"+
		"\u016e\58\35\2\u016e\u016f\b\34\1\2\u016f\u0170\b\34\1\2\u0170\67\3\2"+
		"\2\2\u0171\u0172\t\5\2\2\u0172\u0173\5:\36\2\u0173\u0174\b\35\1\2\u0174"+
		"\u0175\58\35\2\u0175\u0176\b\35\1\2\u0176\u0179\3\2\2\2\u0177\u0179\b"+
		"\35\1\2\u0178\u0171\3\2\2\2\u0178\u0177\3\2\2\2\u01799\3\2\2\2\u017a\u017b"+
		"\5> \2\u017b\u017c\5<\37\2\u017c\u017d\b\36\1\2\u017d\u017e\b\36\1\2\u017e"+
		";\3\2\2\2\u017f\u0180\t\6\2\2\u0180\u0181\b\37\1\2\u0181\u0182\5> \2\u0182"+
		"\u0183\b\37\1\2\u0183\u0184\5<\37\2\u0184\u0185\b\37\1\2\u0185\u0188\3"+
		"\2\2\2\u0186\u0188\b\37\1\2\u0187\u017f\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"=\3\2\2\2\u0189\u018a\5@!\2\u018a\u018b\5B\"\2\u018b\u018c\b \1\2\u018c"+
		"\u018d\b \1\2\u018d?\3\2\2\2\u018e\u018f\7\32\2\2\u018f\u0190\5@!\2\u0190"+
		"\u0191\b!\1\2\u0191\u0198\3\2\2\2\u0192\u0193\7\35\2\2\u0193\u0194\5@"+
		"!\2\u0194\u0195\b!\1\2\u0195\u0198\3\2\2\2\u0196\u0198\b!\1\2\u0197\u018e"+
		"\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0196\3\2\2\2\u0198A\3\2\2\2\u0199"+
		"\u019a\b\"\1\2\u019a\u019b\5F$\2\u019b\u019c\b\"\1\2\u019c\u019d\5D#\2"+
		"\u019d\u019e\b\"\1\2\u019eC\3\2\2\2\u019f\u01a0\b#\1\2\u01a0\u01a1\b#"+
		"\1\2\u01a1\u01a2\b#\1\2\u01a2\u01a8\b#\1\2\u01a3\u01a4\7\b\2\2\u01a4\u01a5"+
		"\5\"\22\2\u01a5\u01a6\7\t\2\2\u01a6\u01a7\b#\1\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a3\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\b#\1\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01b0\b#\1\2\u01af\u019f\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0E\3\2\2\2\u01b1"+
		"\u01b2\5L\'\2\u01b2\u01b3\b$\1\2\u01b3\u01b4\b$\1\2\u01b4\u01d4\3\2\2"+
		"\2\u01b5\u01b6\7+\2\2\u01b6\u01b7\b$\1\2\u01b7\u01d4\b$\1\2\u01b8\u01b9"+
		"\7,\2\2\u01b9\u01ba\b$\1\2\u01ba\u01d4\b$\1\2\u01bb\u01bc\7-\2\2\u01bc"+
		"\u01bd\b$\1\2\u01bd\u01d4\b$\1\2\u01be\u01bf\7.\2\2\u01bf\u01c0\b$\1\2"+
		"\u01c0\u01d4\b$\1\2\u01c1\u01c2\7\36\2\2\u01c2\u01c7\5\"\22\2\u01c3\u01c4"+
		"\7\r\2\2\u01c4\u01c6\5\"\22\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2"+
		"\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01ca\u01cb\7\37\2\2\u01cb\u01cc\b$\1\2\u01cc\u01d4\3\2\2\2\u01cd"+
		"\u01ce\b$\1\2\u01ce\u01cf\7\20\2\2\u01cf\u01d0\5\"\22\2\u01d0\u01d1\7"+
		"\21\2\2\u01d1\u01d2\b$\1\2\u01d2\u01d4\3\2\2\2\u01d3\u01b1\3\2\2\2\u01d3"+
		"\u01b5\3\2\2\2\u01d3\u01b8\3\2\2\2\u01d3\u01bb\3\2\2\2\u01d3\u01be\3\2"+
		"\2\2\u01d3\u01c1\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d4G\3\2\2\2\u01d5\u01d6"+
		"\b%\1\2\u01d6\u01d7\7 \2\2\u01d7\u01d8\b%\1\2\u01d8I\3\2\2\2\u01d9\u01e0"+
		"\b&\1\2\u01da\u01db\7!\2\2\u01db\u01e1\b&\1\2\u01dc\u01dd\7\"\2\2\u01dd"+
		"\u01e1\b&\1\2\u01de\u01df\7.\2\2\u01df\u01e1\b&\1\2\u01e0\u01da\3\2\2"+
		"\2\u01e0\u01dc\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3"+
		"\7#\2\2\u01e3\u01e4\5L\'\2\u01e4\u01e5\b&\1\2\u01e5K\3\2\2\2\u01e6\u01e7"+
		"\7.\2\2\u01e7\u01eb\b\'\1\2\u01e8\u01e9\7\17\2\2\u01e9\u01eb\b\'\1\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7\20"+
		"\2\2\u01ed\u01ee\5N(\2\u01ee\u01ef\b\'\1\2\u01ef\u01f0\7\21\2\2\u01f0"+
		"\u01f1\b\'\1\2\u01f1\u01f2\b\'\1\2\u01f2\u01fa\3\2\2\2\u01f3\u01f4\7$"+
		"\2\2\u01f4\u01f5\7\20\2\2\u01f5\u01f6\7+\2\2\u01f6\u01f7\7\21\2\2\u01f7"+
		"\u01f8\b\'\1\2\u01f8\u01fa\b\'\1\2\u01f9\u01ea\3\2\2\2\u01f9\u01f3\3\2"+
		"\2\2\u01faM\3\2\2\2\u01fb\u0202\b(\1\2\u01fc\u01fd\5P)\2\u01fd\u01fe\7"+
		"\r\2\2\u01fe\u01ff\b(\1\2\u01ff\u0201\3\2\2\2\u0200\u01fc\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0206\5P)\2\u0206\u0207\b(\1\2\u0207\u0208"+
		"\b(\1\2\u0208\u020c\3\2\2\2\u0209\u020a\b(\1\2\u020a\u020c\b(\1\2\u020b"+
		"\u01fb\3\2\2\2\u020b\u0209\3\2\2\2\u020cO\3\2\2\2\u020d\u020e\b)\1\2\u020e"+
		"\u020f\5\"\22\2\u020f\u0210\b)\1\2\u0210Q\3\2\2\2\u0211\u0212\b*\1\2\u0212"+
		"\u0213\7%\2\2\u0213\u0214\b*\1\2\u0214\u0215\5\"\22\2\u0215\u0216\b*\1"+
		"\2\u0216\u0218\b*\1\2\u0217\u0219\7\3\2\2\u0218\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0224\3\2\2\2\u021c"+
		"\u021e\5\32\16\2\u021d\u021f\7\3\2\2\u021e\u021d\3\2\2\2\u021f\u0220\3"+
		"\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u021c\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\b*\1\2\u0228"+
		"\u0229\5T+\2\u0229\u022a\7\4\2\2\u022a\u022b\b*\1\2\u022bS\3\2\2\2\u022c"+
		"\u022e\5V,\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2"+
		"\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233"+
		"\5X-\2\u0233\u0234\b+\1\2\u0234U\3\2\2\2\u0235\u0236\7&\2\2\u0236\u0237"+
		"\b,\1\2\u0237\u0238\b,\1\2\u0238\u0239\5\"\22\2\u0239\u023b\b,\1\2\u023a"+
		"\u023c\7\3\2\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0247\3\2\2\2\u023f\u0241\5\32\16\2\u0240"+
		"\u0242\7\3\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u023f\3\2\2\2\u0246"+
		"\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2"+
		"\2\2\u0249\u0247\3\2\2\2\u024a\u024b\b,\1\2\u024b\u024c\b,\1\2\u024cW"+
		"\3\2\2\2\u024d\u024e\7\'\2\2\u024e\u0250\b-\1\2\u024f\u0251\7\3\2\2\u0250"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u025d\b-\1\2\u0255\u0257\5\32\16\2\u0256"+
		"\u0258\7\3\2\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0255\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2"+
		"\2\2\u025f\u025d\3\2\2\2\u0260\u0261\b-\1\2\u0261\u0264\b-\1\2\u0262\u0264"+
		"\b-\1\2\u0263\u024d\3\2\2\2\u0263\u0262\3\2\2\2\u0264Y\3\2\2\2\u0265\u0266"+
		"\b.\1\2\u0266\u0267\7(\2\2\u0267\u0268\7.\2\2\u0268\u0269\7)\2\2\u0269"+
		"\u026b\5\"\22\2\u026a\u026c\7\3\2\2\u026b\u026a\3\2\2\2\u026c\u026d\3"+
		"\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0270\b.\1\2\u0270\u0271\b.\1\2\u0271\u0272\b.\1\2\u0272\u027b\b.\1\2"+
		"\u0273\u0275\5\32\16\2\u0274\u0276\7\3\2\2\u0275\u0274\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279"+
		"\u0273\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\b.\1\2\u027f"+
		"\u0280\b.\1\2\u0280\u0281\b.\1\2\u0281\u0282\7\4\2\2\u0282\u0283\b.\1"+
		"\2\u0283\u0284\b.\1\2\u0284[\3\2\2\28bdn\177\u0087\u008a\u0092\u009c\u00a2"+
		"\u00ac\u00b7\u00bc\u00c4\u00cd\u00d4\u00de\u00e9\u00f1\u00f7\u0102\u0108"+
		"\u010f\u0113\u0131\u013f\u014d\u015c\u016a\u0178\u0187\u0197\u01aa\u01af"+
		"\u01c7\u01d3\u01e0\u01ea\u01f9\u0202\u020b\u021a\u0220\u0224\u022f\u023d"+
		"\u0243\u0247\u0252\u0259\u025d\u0263\u026d\u0277\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}