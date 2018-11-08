// Generated from g.g4 by ANTLR 4.7

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
public class gParser extends Parser {
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
		COMMENT=39, CONST_INT=40, CONST_STRING=41, CONST_CHAR=42, Id=43, WS=44;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actorDef = 2, RULE_actorBodyStatement = 3, 
		RULE_type = 4, RULE_arrayType = 5, RULE_varType = 6, RULE_dataDef = 7, 
		RULE_receiver = 8, RULE_receiverDef = 9, RULE_argumentDef = 10, RULE_receiverBodyStatement = 11, 
		RULE_statement = 12, RULE_scopeStatement = 13, RULE_breakStatement = 14, 
		RULE_writeStatement = 15, RULE_expression = 16, RULE_assignmentExpression = 17, 
		RULE_assignmentExpressionTmp = 18, RULE_orExpression = 19, RULE_orExpressionTmp = 20, 
		RULE_andExpression = 21, RULE_andExpressionTmp = 22, RULE_equalityCmpExpression = 23, 
		RULE_equalityCmpExpressionTmp = 24, RULE_comparisonExpression = 25, RULE_comparisonExpressionTmp = 26, 
		RULE_addExpression = 27, RULE_addExpressionTmp = 28, RULE_multExpression = 29, 
		RULE_multExpressionTmp = 30, RULE_notExpression = 31, RULE_notExpressionTmp = 32, 
		RULE_arrayAccessExpression = 33, RULE_arrayAccessExpressionTmp = 34, RULE_otherExpression = 35, 
		RULE_quitStatement = 36, RULE_sendStatement = 37, RULE_functionCall = 38, 
		RULE_arguments = 39, RULE_argument = 40, RULE_ifStatement = 41, RULE_elseIfelse = 42, 
		RULE_forEachStatement = 43, RULE_elseIf = 44, RULE_elseStatement = 45;
	public static final String[] ruleNames = {
		"program", "actor", "actorDef", "actorBodyStatement", "type", "arrayType", 
		"varType", "dataDef", "receiver", "receiverDef", "argumentDef", "receiverBodyStatement", 
		"statement", "scopeStatement", "breakStatement", "writeStatement", "expression", 
		"assignmentExpression", "assignmentExpressionTmp", "orExpression", "orExpressionTmp", 
		"andExpression", "andExpressionTmp", "equalityCmpExpression", "equalityCmpExpressionTmp", 
		"comparisonExpression", "comparisonExpressionTmp", "addExpression", "addExpressionTmp", 
		"multExpression", "multExpressionTmp", "notExpression", "notExpressionTmp", 
		"arrayAccessExpression", "arrayAccessExpressionTmp", "otherExpression", 
		"quitStatement", "sendStatement", "functionCall", "arguments", "argument", 
		"ifStatement", "elseIfelse", "forEachStatement", "elseIf", "elseStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'end'", "'actor'", "'<'", "'>'", "'['", "']'", "'int'", 
		"'char'", "'='", "','", "'receiver'", "'('", "')'", "'begin'", "'break'", 
		"'write'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", "'/'", 
		"'not'", "'{'", "'}'", "'quit'", "'sender'", "'self'", "'<<'", "'read'", 
		"'if'", "'foreach'", "'in'", "'elseif'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COMMENT", "CONST_INT", "CONST_STRING", "CONST_CHAR", 
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	    void print(String str){
	        System.out.println(str);
	    }

	    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
	        SymbolTable.top.put(
	            new SymbolTableLocalVariableItem(
	                new Variable(name,type),
	                SymbolTable.top.getOffset(Register.SP)
	            )
	        );
	    }

	    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
	        SymbolTable.top.put(
	            new SymbolTableGlobalVariableItem(
	                new Variable(name,type),
	                SymbolTable.top.getOffset(Register.GP)
	            )
	        );
	    }

	    void beginScope() {
	        	int offset = 0;
	        	if(SymbolTable.top != null){
	            	offset = SymbolTable.top.getOffset(Register.SP);
	            }
	            SymbolTable.push(new SymbolTable(SymbolTable.top));
	            SymbolTable.top.setOffset(Register.GP, SymbolTable.getGlobalOffset());
	            SymbolTable.top.setOffset(Register.SP, offset);
	    }

	    void endScope() {
	        print("Stack global offset: " + SymbolTable.top.getOffset(Register.GP));
	        print("Stack local offset: " + SymbolTable.top.getOffset(Register.SP));
	        {printSymbolTableTop();}
	        SymbolTable.setGlobalOffset(SymbolTable.top.getOffset(Register.GP));
	        SymbolTable.pop();
	    }

	    public void putTemp(String baseName, Type type) {
	    		int idx = 1;
	            String newName = baseName + "_Temproray_" + Integer.toString(idx);
	    		while (SymbolTable.top.containsItemName(newName)) {
	    			idx++;
	    			newName = baseName + "_Temproray_" + Integer.toString(idx);
	    		}
	    		try{
	    		    putLocalVar(newName, type);
	            }catch(ItemAlreadyExistsException e) {
	                 System.err.println("-----Exception--------:duplicate actor name");
	            }
	    }


	    void putReceiver(String name, List<Type> arguments) throws ItemAlreadyExistsException{
	        SymbolTable.top.put(
	            new SymbolTableFunctionObject(
	                arguments,
	                name
	            )
	        );
	    }

	    void putTempReciver(String name, List<Type> arguments){
	        print("*************put Temp Receiver");
	        int idx=1;
	        String newName = name + "_TEMPORARY_" + Integer.toString(idx);
	        SymbolTableFunctionObject newReceiver = new SymbolTableFunctionObject(
	                                                                  arguments,
	                                                                  newName
	                                                              );

	        while (SymbolTable.top.containsItemName(newReceiver.getKey())) {
	            idx++;
	            newName = name + "_TEMPORARY_" + Integer.toString(idx);
	            newReceiver = new SymbolTableFunctionObject(arguments, newName);
	        }
	        try{
	            putReceiver(newName, arguments);
	        }catch(ItemAlreadyExistsException e) {
	             System.err.println("-----Exception--------:duplicate actor name");
	        }
	    }

	    void printSymbolTableTop(){
	    print("printing symbol table");
	    SymbolTable.top.print();}

	public gParser(TokenStream input) {
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
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("program");
			    
			beginScope();
			((ProgramContext)_localctx).synHasActor =  false;
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__2) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(95);
					((ProgramContext)_localctx).a = actor();
					if(((ProgramContext)_localctx).a.synActorExists){((ProgramContext)_localctx).synHasActor =  true;}
					}
					break;
				case T__0:
					{
					setState(98);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if(!_localctx.synHasActor){
			          {print("program 1doesnt have any actor");}
			        //{throw new NoActorException();}
			    }
			endScope();
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
		public ActorDefContext actorDef() {
			return getRuleContext(ActorDefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
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
			if ( listener instanceof gListener ) ((gListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("actor");
			  
			setState(108);
			actorDef();
			beginScope();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11))) != 0)) {
				{
				{
				setState(110);
				actorBodyStatement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__1);
			endScope();
			setState(118);
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
		public Token name;
		public Token CONST_INT;
		public TerminalNode CONST_INT() { return getToken(gParser.CONST_INT, 0); }
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public ActorDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterActorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitActorDef(this);
		}
	}

	public final ActorDefContext actorDef() throws RecognitionException {
		ActorDefContext _localctx = new ActorDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actorDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__2);
			setState(122);
			((ActorDefContext)_localctx).name = match(Id);
			setState(123);
			match(T__3);
			setState(124);
			((ActorDefContext)_localctx).CONST_INT = match(CONST_INT);
			setState(125);
			match(T__4);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				match(T__0);
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );

				    int actorBufferLength = (((ActorDefContext)_localctx).CONST_INT!=null?Integer.valueOf(((ActorDefContext)_localctx).CONST_INT.getText()):0);
			        if (actorBufferLength<=0){
			            print( "Line:" +Integer.toString(((ActorDefContext)_localctx).name.getLine()) +"  +++++++++++++++Zero Or Negative Length in actor buffer length+++++++++++++++" );
			            actorBufferLength = 0;
			        }
			        try{
			            putLocalVar((((ActorDefContext)_localctx).name!=null?((ActorDefContext)_localctx).name.getText():null), new ActorType(actorBufferLength));
			        }
			        catch(ItemAlreadyExistsException e) {
			            System.err.println( "Line:" +Integer.toString(((ActorDefContext)_localctx).name.getLine()) + "-----Exception--------:duplicate actor name");
			            putTemp((((ActorDefContext)_localctx).name!=null?((ActorDefContext)_localctx).name.getText():null), new ActorType(actorBufferLength));
			        }
				
			//print("actorDef : " + $name.text);
				
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
		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class,0);
		}
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public ActorBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterActorBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitActorBodyStatement(this);
		}
	}

	public final ActorBodyStatementContext actorBodyStatement() throws RecognitionException {
		ActorBodyStatementContext _localctx = new ActorBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actorBodyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("actorBodyStatement");
			  
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(135);
				dataDef(true);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(T__0);
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__11:
				{
				setState(141);
				receiver();
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
			if ( listener instanceof gListener ) ((gListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(144);
				((TypeContext)_localctx).array = arrayType();
				((TypeContext)_localctx).dataType =  ((TypeContext)_localctx).array.dataArrayType;
				}
				break;
			case 2:
				{
				setState(147);
				((TypeContext)_localctx).variable = varType();
				((TypeContext)_localctx).dataType =  ((TypeContext)_localctx).variable.dataVariableType;
				}
				break;
			}
			//print("type");
				
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
		public List<TerminalNode> CONST_INT() { return getTokens(gParser.CONST_INT); }
		public TerminalNode CONST_INT(int i) {
			return getToken(gParser.CONST_INT, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((ArrayTypeContext)_localctx).v = varType();
			((ArrayTypeContext)_localctx).dataArrayType =  ((ArrayTypeContext)_localctx).v.dataVariableType;
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				match(T__5);
				setState(157);
				((ArrayTypeContext)_localctx).CONST_INT = match(CONST_INT);
				setState(158);
				match(T__6);
				if((((ArrayTypeContext)_localctx).CONST_INT!=null?Integer.valueOf(((ArrayTypeContext)_localctx).CONST_INT.getText()):0)<=0){
					    print("Line:" + Integer.toString(((ArrayTypeContext)_localctx).CONST_INT.getLine())+"  +++++++++++++++Zero Or Negative Length in array def+++++++++++++++");
					    {((ArrayTypeContext)_localctx).dataArrayType =  new ArrayType(0,_localctx.dataArrayType);}
				    }else
				        {((ArrayTypeContext)_localctx).dataArrayType =  new ArrayType((((ArrayTypeContext)_localctx).CONST_INT!=null?Integer.valueOf(((ArrayTypeContext)_localctx).CONST_INT.getText()):0),_localctx.dataArrayType);}
					
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			//print("arrayType");
				
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
			if ( listener instanceof gListener ) ((gListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__7);
				((VarTypeContext)_localctx).dataVariableType =  IntType.getInstance();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
		public TypeContext t;
		public Token name;
		public Token name2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
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
			if ( listener instanceof gListener ) ((gListener)listener).enterDataDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDataDef(this);
		}
	}

	public final DataDefContext dataDef(boolean isGlobal) throws RecognitionException {
		DataDefContext _localctx = new DataDefContext(_ctx, getState(), isGlobal);
		enterRule(_localctx, 14, RULE_dataDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("dataDef");
			    
			setState(173);
			((DataDefContext)_localctx).t = type();
			((DataDefContext)_localctx).dataType =  ((DataDefContext)_localctx).t.dataType;
			setState(175);
			((DataDefContext)_localctx).name = match(Id);
			System.out.println((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null)+" variable is "+((isGlobal)?"global":"local"));

			        try{
			            if(_localctx.isGlobal){
			                putGlobalVar((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null), _localctx.dataType);
			            }
			            else{
			                putLocalVar((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null), _localctx.dataType);
			            }
			        }
			        catch(ItemAlreadyExistsException e) {
			            System.err.println( "Line:" +Integer.toString(((DataDefContext)_localctx).name.getLine()) +"  -----Exception--------:duplicate variable name");
			            putTemp((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null), _localctx.dataType);
			        }
			    
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(178);
				match(T__9);
				setState(179);
				expression();
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(182);
				match(T__10);
				setState(183);
				((DataDefContext)_localctx).name2 = match(Id);

				        try{
				            putLocalVar((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getText():null), _localctx.dataType);
				        }
				        catch(ItemAlreadyExistsException e) {
				            System.err.println( "Line:" +Integer.toString(((DataDefContext)_localctx).name2.getLine()) +"  -----Exception--------:duplicate variable name");
				            putTemp((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getText():null), _localctx.dataType);
				        }
				    
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(185);
					match(T__9);
					setState(186);
					expression();
					}
				}

				}
				}
				setState(193);
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
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("receiver");
				
			setState(195);
			((ReceiverContext)_localctx).recDef = receiverDef();
			beginScope();
				for(Variable var: ((ReceiverContext)_localctx).recDef.receiverArgs){
				    try{
				        putLocalVar(var.getName(), var.getType());
				    }catch(ItemAlreadyExistsException e){
				        System.err.println("-----Exception--------:duplicate variable name");
				        putTemp(var.getName(), var.getType());
				    }
				}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(197);
				receiverBodyStatement();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(204);
			match(T__1);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				match(T__0);
				}
				}
				setState(208); 
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
		public List<Variable> receiverArgs;
		public Token name;
		public ArgumentDefContext argumentDefVars;
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public ArgumentDefContext argumentDef() {
			return getRuleContext(ArgumentDefContext.class,0);
		}
		public ReceiverDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReceiverDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReceiverDef(this);
		}
	}

	public final ReceiverDefContext receiverDef() throws RecognitionException {
		ReceiverDefContext _localctx = new ReceiverDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_receiverDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__11);
			setState(211);
			((ReceiverDefContext)_localctx).name = match(Id);
			//print("receiverDef : " + $name.text);
				
			setState(213);
			match(T__12);
			setState(214);
			((ReceiverDefContext)_localctx).argumentDefVars = argumentDef();

				    ((ReceiverDefContext)_localctx).receiverArgs =  ((ReceiverDefContext)_localctx).argumentDefVars.args;
			        List<Type> types= new ArrayList<Type>();
			        List<Variable> argRes = ((ReceiverDefContext)_localctx).argumentDefVars.args;
			        print(Integer.toString(argRes.size()));
			        for (Variable var : argRes){
			            types.add(var.getType());
			        }
			        try{
			            putReceiver((((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null),types);
			        }catch(ItemAlreadyExistsException e){
			            System.err.println("Line:" +Integer.toString(((ReceiverDefContext)_localctx).name.getLine()) +"-----Exception--------:duplicate receiver name");
			            putTempReciver((((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null), types);
			        }
			    
			setState(216);
			match(T__13);
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
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public ArgumentDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArgumentDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArgumentDef(this);
		}
	}

	public final ArgumentDefContext argumentDef() throws RecognitionException {
		ArgumentDefContext _localctx = new ArgumentDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentDef);
		try {
			int _alt;
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				//print("argumentDef");
					
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						((ArgumentDefContext)_localctx).t = type();
						setState(224);
						((ArgumentDefContext)_localctx).name = match(Id);

						    Variable v = new Variable((((ArgumentDefContext)_localctx).name!=null?((ArgumentDefContext)_localctx).name.getText():null), ((ArgumentDefContext)_localctx).t.dataType);
							_localctx.args.add(v);
							
						setState(226);
						match(T__10);
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(233);
				((ArgumentDefContext)_localctx).t2 = type();
				setState(234);
				((ArgumentDefContext)_localctx).name2 = match(Id);

				    Variable v2 = new Variable((((ArgumentDefContext)_localctx).name2!=null?((ArgumentDefContext)_localctx).name2.getText():null), ((ArgumentDefContext)_localctx).t2.dataType);
					_localctx.args.add(v2);
					for (Variable var : _localctx.args
				            			 ) {
				            			print(var.toString());
				            		}
					
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReceiverBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReceiverBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReceiverBodyStatement(this);
		}
	}

	public final ReceiverBodyStatementContext receiverBodyStatement() throws RecognitionException {
		ReceiverBodyStatementContext _localctx = new ReceiverBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_receiverBodyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("receiverBodyStatement");
				
			setState(241);
			statement(0);
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
		public StatementContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int forEachDepth) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("statement");
					
				print("--------------------------forEachDepth = " + Integer.toString(_localctx.forEachDepth));
				setState(249);
				scopeStatement(_localctx.forEachDepth);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				sendStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				ifStatement(_localctx.forEachDepth);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				forEachStatement(_localctx.forEachDepth);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				quitStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				breakStatement(_localctx.forEachDepth);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				writeStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScopeStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_scopeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterScopeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitScopeStatement(this);
		}
	}

	public final ScopeStatementContext scopeStatement(int forEachDepth) throws RecognitionException {
		ScopeStatementContext _localctx = new ScopeStatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 26, RULE_scopeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("scopeStatement");
				
			setState(261);
			match(T__14);
			{
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(T__0);
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
			beginScope();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(268);
				statement(_localctx.forEachDepth);
				{
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					match(T__0);
					}
					}
					setState(272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(280);
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
			if ( listener instanceof gListener ) ((gListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement(int forEachDepth) throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("break");
				
			setState(283);
			((BreakStatementContext)_localctx).b = match(T__15);
			if (_localctx.forEachDepth<=0) /*throw InvalidBreakException*/
			        print("Line:" +Integer.toString(((BreakStatementContext)_localctx).b.getLine()) +"---------Invalid Break");
			    
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("writeStatement");
				
			setState(287);
			match(T__16);
			setState(288);
			match(T__12);
			setState(289);
			arguments();
			setState(290);
			match(T__13);
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("expression");
				
			setState(293);
			assignmentExpression();
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
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AssignmentExpressionTmpContext assignmentExpressionTmp() {
			return getRuleContext(AssignmentExpressionTmpContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("assignmentExpression");
				
			setState(296);
			orExpression();
			setState(297);
			assignmentExpressionTmp();
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

	public static class AssignmentExpressionTmpContext extends ParserRuleContext {
		public Token op;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AssignmentExpressionTmpContext assignmentExpressionTmp() {
			return getRuleContext(AssignmentExpressionTmpContext.class,0);
		}
		public AssignmentExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignmentExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignmentExpressionTmp(this);
		}
	}

	public final AssignmentExpressionTmpContext assignmentExpressionTmp() throws RecognitionException {
		AssignmentExpressionTmpContext _localctx = new AssignmentExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignmentExpressionTmp);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((AssignmentExpressionTmpContext)_localctx).op = match(T__9);
				//print("assignmentExpressionTmp : " + $op.text);
					
				setState(301);
				orExpression();
				setState(302);
				assignmentExpressionTmp();
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__10:
			case T__13:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionTmpContext orExpressionTmp() {
			return getRuleContext(OrExpressionTmpContext.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOrExpression(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("orExpression");
				
			setState(308);
			andExpression();
			setState(309);
			orExpressionTmp();
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
		public Token op;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterOrExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOrExpressionTmp(this);
		}
	}

	public final OrExpressionTmpContext orExpressionTmp() throws RecognitionException {
		OrExpressionTmpContext _localctx = new OrExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orExpressionTmp);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				((OrExpressionTmpContext)_localctx).op = match(T__17);
				//print("orExpressionTmp : " + $op.text);
					
				setState(313);
				andExpression();
				setState(314);
				orExpressionTmp();
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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
		public EqualityCmpExpressionContext equalityCmpExpression() {
			return getRuleContext(EqualityCmpExpressionContext.class,0);
		}
		public AndExpressionTmpContext andExpressionTmp() {
			return getRuleContext(AndExpressionTmpContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("andExpression");
				
			setState(320);
			equalityCmpExpression();
			setState(321);
			andExpressionTmp();
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
		public Token op;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterAndExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAndExpressionTmp(this);
		}
	}

	public final AndExpressionTmpContext andExpressionTmp() throws RecognitionException {
		AndExpressionTmpContext _localctx = new AndExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_andExpressionTmp);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				((AndExpressionTmpContext)_localctx).op = match(T__18);
				//print("addExpressionTmp : " + $op.text);
					
				setState(325);
				equalityCmpExpression();
				setState(326);
				andExpressionTmp();
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__17:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public EqualityCmpExpressionTmpContext equalityCmpExpressionTmp() {
			return getRuleContext(EqualityCmpExpressionTmpContext.class,0);
		}
		public EqualityCmpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityCmpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEqualityCmpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEqualityCmpExpression(this);
		}
	}

	public final EqualityCmpExpressionContext equalityCmpExpression() throws RecognitionException {
		EqualityCmpExpressionContext _localctx = new EqualityCmpExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equalityCmpExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("equalityCmpExpression");
				
			setState(332);
			comparisonExpression();
			setState(333);
			equalityCmpExpressionTmp();
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
		public Token op;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterEqualityCmpExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEqualityCmpExpressionTmp(this);
		}
	}

	public final EqualityCmpExpressionTmpContext equalityCmpExpressionTmp() throws RecognitionException {
		EqualityCmpExpressionTmpContext _localctx = new EqualityCmpExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equalityCmpExpressionTmp);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((EqualityCmpExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((EqualityCmpExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				//print("equalityCmpExpressionTmp : "+ $op.text);
					
				setState(337);
				comparisonExpression();
				setState(338);
				equalityCmpExpressionTmp();
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__17:
			case T__18:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ComparisonExpressionTmpContext comparisonExpressionTmp() {
			return getRuleContext(ComparisonExpressionTmpContext.class,0);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("comparisonExpression");
				
			setState(344);
			addExpression();
			setState(345);
			comparisonExpressionTmp();
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
		public Token op;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterComparisonExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitComparisonExpressionTmp(this);
		}
	}

	public final ComparisonExpressionTmpContext comparisonExpressionTmp() throws RecognitionException {
		ComparisonExpressionTmpContext _localctx = new ComparisonExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparisonExpressionTmp);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
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
				//print("comparisonExpressionTmp : " + $op.text);
					
				setState(349);
				addExpression();
				setState(350);
				comparisonExpressionTmp();
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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
		public MultExpressionContext multExpression() {
			return getRuleContext(MultExpressionContext.class,0);
		}
		public AddExpressionTmpContext addExpressionTmp() {
			return getRuleContext(AddExpressionTmpContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAddExpression(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("addExpression");
				
			setState(356);
			multExpression();
			setState(357);
			addExpressionTmp();
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
		public Token op;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterAddExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAddExpressionTmp(this);
		}
	}

	public final AddExpressionTmpContext addExpressionTmp() throws RecognitionException {
		AddExpressionTmpContext _localctx = new AddExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addExpressionTmp);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				((AddExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
					((AddExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				//print("addExpressionTmp : " + $op.text);
					
				setState(361);
				multExpression();
				setState(362);
				addExpressionTmp();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public MultExpressionTmpContext multExpressionTmp() {
			return getRuleContext(MultExpressionTmpContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("multExpression");
				
			setState(368);
			notExpression();
			setState(369);
			multExpressionTmp();
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
		public Token op;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterMultExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMultExpressionTmp(this);
		}
	}

	public final MultExpressionTmpContext multExpressionTmp() throws RecognitionException {
		MultExpressionTmpContext _localctx = new MultExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multExpressionTmp);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				((MultExpressionTmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
					((MultExpressionTmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				//print("multExpressionTmp : " + $op.text);
					
				setState(373);
				notExpression();
				setState(374);
				multExpressionTmp();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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
		public NotExpressionTmpContext notExpressionTmp() {
			return getRuleContext(NotExpressionTmpContext.class,0);
		}
		public ArrayAccessExpressionContext arrayAccessExpression() {
			return getRuleContext(ArrayAccessExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("notExpression");
				
			setState(380);
			notExpressionTmp();
			setState(381);
			arrayAccessExpression();
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
			if ( listener instanceof gListener ) ((gListener)listener).enterNotExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNotExpressionTmp(this);
		}
	}

	public final NotExpressionTmpContext notExpressionTmp() throws RecognitionException {
		NotExpressionTmpContext _localctx = new NotExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_notExpressionTmp);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				//print("notExpressionTmp : " + '-');
					
				setState(384);
				((NotExpressionTmpContext)_localctx).op = match(T__22);
				setState(385);
				notExpressionTmp();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__25);
				setState(387);
				notExpressionTmp();
				}
				break;
			case T__12:
			case T__26:
			case T__32:
			case CONST_INT:
			case CONST_STRING:
			case CONST_CHAR:
			case Id:
				enterOuterAlt(_localctx, 3);
				{
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
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public ArrayAccessExpressionTmpContext arrayAccessExpressionTmp() {
			return getRuleContext(ArrayAccessExpressionTmpContext.class,0);
		}
		public ArrayAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArrayAccessExpression(this);
		}
	}

	public final ArrayAccessExpressionContext arrayAccessExpression() throws RecognitionException {
		ArrayAccessExpressionContext _localctx = new ArrayAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayAccessExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("arrayAccessExpression");
				
			setState(392);
			otherExpression();
			setState(393);
			arrayAccessExpressionTmp();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ArrayAccessExpressionTmpContext> arrayAccessExpressionTmp() {
			return getRuleContexts(ArrayAccessExpressionTmpContext.class);
		}
		public ArrayAccessExpressionTmpContext arrayAccessExpressionTmp(int i) {
			return getRuleContext(ArrayAccessExpressionTmpContext.class,i);
		}
		public ArrayAccessExpressionTmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessExpressionTmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArrayAccessExpressionTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArrayAccessExpressionTmp(this);
		}
	}

	public final ArrayAccessExpressionTmpContext arrayAccessExpressionTmp() throws RecognitionException {
		ArrayAccessExpressionTmpContext _localctx = new ArrayAccessExpressionTmpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayAccessExpressionTmp);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("arrayAccessExpressionTmp : []");
						
				setState(396);
				match(T__5);
				setState(397);
				expression();
				setState(398);
				arrayAccessExpressionTmp();
				setState(399);
				match(T__6);
				setState(400);
				arrayAccessExpressionTmp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode CONST_INT() { return getToken(gParser.CONST_INT, 0); }
		public TerminalNode CONST_STRING() { return getToken(gParser.CONST_STRING, 0); }
		public TerminalNode CONST_CHAR() { return getToken(gParser.CONST_CHAR, 0); }
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOtherExpression(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otherExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(405);
				functionCall();
				//print("otherExpression functionCall" );
				    
				}
				break;
			case 2:
				{
				setState(408);
				match(CONST_INT);
				//print("otherExpression CONST_INT" );
				    
				}
				break;
			case 3:
				{
				setState(410);
				match(CONST_STRING);
				//print("otherExpression CONST_STRING" );
				    
				}
				break;
			case 4:
				{
				setState(412);
				match(CONST_CHAR);
				//print("otherExpression CONST_CHAR" );
				    
				}
				break;
			case 5:
				{
				setState(414);
				match(Id);
				//print("otherExpression Id" );
				    
				}
				break;
			case 6:
				{
				setState(416);
				match(T__26);
				setState(417);
				expression();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(418);
					match(T__10);
					setState(419);
					expression();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(T__27);
				}
				break;
			case 7:
				{
				//print("otherExpression : ()");
				    
				setState(428);
				match(T__12);
				setState(429);
				expression();
				setState(430);
				match(T__13);
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
		public QuitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQuitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQuitStatement(this);
		}
	}

	public final QuitStatementContext quitStatement() throws RecognitionException {
		QuitStatementContext _localctx = new QuitStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_quitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("quit");
				
			setState(435);
			match(T__28);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public SendStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSendStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSendStatement(this);
		}
	}

	public final SendStatementContext sendStatement() throws RecognitionException {
		SendStatementContext _localctx = new SendStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sendStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("sendStatement");
				
			setState(438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << Id))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(439);
			match(T__31);
			setState(440);
			functionCall();
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
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CONST_INT() { return getToken(gParser.CONST_INT, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionCall);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				//print("functionCall");
					
				setState(443);
				match(Id);
				setState(444);
				match(T__12);
				setState(445);
				arguments();
				setState(446);
				match(T__13);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(T__32);
				setState(449);
				match(T__12);
				setState(450);
				match(CONST_INT);
				setState(451);
				match(T__13);
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
			if ( listener instanceof gListener ) ((gListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arguments);
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("arguments");
					
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(455);
						argument();
						setState(456);
						match(T__10);
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(463);
				argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argument);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__22:
			case T__25:
			case T__26:
			case T__32:
			case CONST_INT:
			case CONST_STRING:
			case CONST_CHAR:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				//print("argument");
					
				setState(468);
				expression();
				}
				break;
			case T__10:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IfStatementContext extends ParserRuleContext {
		public int forEachDepth;
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
		public IfStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement(int forEachDepth) throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 82, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("ifStatement");
				
			setState(473);
			match(T__33);
			beginScope();
			setState(475);
			expression();
			setState(477); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(476);
				match(T__0);
				}
				}
				setState(479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(481);
				statement(_localctx.forEachDepth);
				{
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(482);
					match(T__0);
					}
					}
					setState(485); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(493);
			elseIfelse(_localctx.forEachDepth);
			setState(494);
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

	public static class ElseIfelseContext extends ParserRuleContext {
		public int forEachDepth;
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseIfelseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseIfelseContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_elseIfelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseIfelse(this);
		}
	}

	public final ElseIfelseContext elseIfelse(int forEachDepth) throws RecognitionException {
		ElseIfelseContext _localctx = new ElseIfelseContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 84, RULE_elseIfelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("elseIfelse");
				
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(497);
				elseIf(_localctx.forEachDepth);
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(503);
			elseStatement(_localctx.forEachDepth);
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

	public static class ForEachStatementContext extends ParserRuleContext {
		public int forEachDepth;
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
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
		public ForEachStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForEachStatement(this);
		}
	}

	public final ForEachStatementContext forEachStatement(int forEachDepth) throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 86, RULE_forEachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("forEachStatement");
				
			setState(506);
			match(T__34);
			setState(507);
			match(Id);
			setState(508);
			match(T__35);
			setState(509);
			expression();
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(510);
				match(T__0);
				}
				}
				setState(513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			beginScope();
			_localctx.forEachDepth++;
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(517);
				statement(_localctx.forEachDepth);
				{
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(518);
					match(T__0);
					}
					}
					setState(521); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(529);
			match(T__1);
			_localctx.forEachDepth--;
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
		public ElseIfContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseIf(this);
		}
	}

	public final ElseIfContext elseIf(int forEachDepth) throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 88, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("elseIf");
				
			setState(533);
			match(T__36);
			beginScope();
			setState(535);
			expression();
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(536);
				match(T__0);
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(541);
				statement(_localctx.forEachDepth);
				{
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(542);
					match(T__0);
					}
					}
					setState(545); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState, int forEachDepth) {
			super(parent, invokingState);
			this.forEachDepth = forEachDepth;
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement(int forEachDepth) throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState(), forEachDepth);
		enterRule(_localctx, 90, RULE_elseStatement);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				//print("elseStatement");
					
				setState(555);
				match(T__37);
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(556);
					match(T__0);
					}
					}
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				beginScope();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
					{
					{
					setState(562);
					statement(_localctx.forEachDepth);
					{
					setState(564); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(563);
						match(T__0);
						}
						}
						setState(566); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				endScope();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0244\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i"+
		"\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0082\n\4\r\4\16\4\u0083\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\5\5\5\u0091\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00a3"+
		"\n\7\r\7\16\7\u00a4\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00be\n\t\7"+
		"\t\u00c0\n\t\f\t\16\t\u00c3\13\t\3\n\3\n\3\n\3\n\7\n\u00c9\n\n\f\n\16"+
		"\n\u00cc\13\n\3\n\3\n\3\n\6\n\u00d1\n\n\r\n\16\n\u00d2\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13\u00dd\n\13\r\13\16\13\u00de\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00e7\n\f\f\f\16\f\u00ea\13\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00f1\n\f\3\r\3\r\3\r\6\r\u00f6\n\r\r\r\16\r\u00f7\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0105\n\16\3\17\3\17\3\17\6\17"+
		"\u010a\n\17\r\17\16\17\u010b\3\17\3\17\3\17\6\17\u0111\n\17\r\17\16\17"+
		"\u0112\7\17\u0115\n\17\f\17\16\17\u0118\13\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0134\n\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0140\n\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u014c\n\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0158\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0164\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0170\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u017c"+
		"\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0188\n\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u0196\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\7%\u01a7\n%\f%\16%\u01aa\13%\3%\3%\3%\3%\3%\3%\3%\5%\u01b3\n%"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01c7\n"+
		"(\3)\3)\3)\3)\7)\u01cd\n)\f)\16)\u01d0\13)\3)\3)\5)\u01d4\n)\3*\3*\3*"+
		"\5*\u01d9\n*\3+\3+\3+\3+\3+\6+\u01e0\n+\r+\16+\u01e1\3+\3+\6+\u01e6\n"+
		"+\r+\16+\u01e7\7+\u01ea\n+\f+\16+\u01ed\13+\3+\3+\3+\3+\3,\3,\7,\u01f5"+
		"\n,\f,\16,\u01f8\13,\3,\3,\3-\3-\3-\3-\3-\3-\6-\u0202\n-\r-\16-\u0203"+
		"\3-\3-\3-\3-\6-\u020a\n-\r-\16-\u020b\7-\u020e\n-\f-\16-\u0211\13-\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\6.\u021c\n.\r.\16.\u021d\3.\3.\6.\u0222\n.\r"+
		".\16.\u0223\7.\u0226\n.\f.\16.\u0229\13.\3.\3.\3/\3/\3/\6/\u0230\n/\r"+
		"/\16/\u0231\3/\3/\3/\6/\u0237\n/\r/\16/\u0238\7/\u023b\n/\f/\16/\u023e"+
		"\13/\3/\3/\5/\u0242\n/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\b\3\3\3\3\3\2\26\27\3\2\6"+
		"\7\3\2\30\31\3\2\32\33\4\2 !--\2\u0255\2^\3\2\2\2\4m\3\2\2\2\6{\3\2\2"+
		"\2\b\u0088\3\2\2\2\n\u0098\3\2\2\2\f\u009c\3\2\2\2\16\u00ac\3\2\2\2\20"+
		"\u00ae\3\2\2\2\22\u00c4\3\2\2\2\24\u00d4\3\2\2\2\26\u00f0\3\2\2\2\30\u00f2"+
		"\3\2\2\2\32\u0104\3\2\2\2\34\u0106\3\2\2\2\36\u011c\3\2\2\2 \u0120\3\2"+
		"\2\2\"\u0126\3\2\2\2$\u0129\3\2\2\2&\u0133\3\2\2\2(\u0135\3\2\2\2*\u013f"+
		"\3\2\2\2,\u0141\3\2\2\2.\u014b\3\2\2\2\60\u014d\3\2\2\2\62\u0157\3\2\2"+
		"\2\64\u0159\3\2\2\2\66\u0163\3\2\2\28\u0165\3\2\2\2:\u016f\3\2\2\2<\u0171"+
		"\3\2\2\2>\u017b\3\2\2\2@\u017d\3\2\2\2B\u0187\3\2\2\2D\u0189\3\2\2\2F"+
		"\u0195\3\2\2\2H\u01b2\3\2\2\2J\u01b4\3\2\2\2L\u01b7\3\2\2\2N\u01c6\3\2"+
		"\2\2P\u01d3\3\2\2\2R\u01d8\3\2\2\2T\u01da\3\2\2\2V\u01f2\3\2\2\2X\u01fb"+
		"\3\2\2\2Z\u0216\3\2\2\2\\\u0241\3\2\2\2^_\b\2\1\2_`\b\2\1\2`g\b\2\1\2"+
		"ab\5\4\3\2bc\b\2\1\2cf\3\2\2\2df\7\3\2\2ea\3\2\2\2ed\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\b\2\1\2kl\b\2\1\2l\3\3\2\2"+
		"\2mn\b\3\1\2no\5\6\4\2os\b\3\1\2pr\5\b\5\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\4\2\2wx\b\3\1\2xy\t\2\2\2yz\b\3\1"+
		"\2z\5\3\2\2\2{|\7\5\2\2|}\7-\2\2}~\7\6\2\2~\177\7*\2\2\177\u0081\7\7\2"+
		"\2\u0080\u0082\7\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\4\1\2\u0086"+
		"\u0087\b\4\1\2\u0087\7\3\2\2\2\u0088\u0090\b\5\1\2\u0089\u008b\5\20\t"+
		"\2\u008a\u008c\7\3\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0091\5\22\n\2"+
		"\u0090\u0089\3\2\2\2\u0090\u008f\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\5"+
		"\f\7\2\u0093\u0094\b\6\1\2\u0094\u0099\3\2\2\2\u0095\u0096\5\16\b\2\u0096"+
		"\u0097\b\6\1\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\6\1\2\u009b\13\3\2\2\2\u009c\u009d"+
		"\5\16\b\2\u009d\u00a2\b\7\1\2\u009e\u009f\7\b\2\2\u009f\u00a0\7*\2\2\u00a0"+
		"\u00a1\7\t\2\2\u00a1\u00a3\b\7\1\2\u00a2\u009e\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\7\1\2\u00a7\r\3\2\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00ad\b\b\1\2"+
		"\u00aa\u00ab\7\13\2\2\u00ab\u00ad\b\b\1\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00af\b\t\1\2\u00af\u00b0\5\n\6\2\u00b0"+
		"\u00b1\b\t\1\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\b\t\1\2\u00b3\u00b6\b\t"+
		"\1\2\u00b4\u00b5\7\f\2\2\u00b5\u00b7\5\"\22\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00c1\3\2\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\7-"+
		"\2\2\u00ba\u00bd\b\t\1\2\u00bb\u00bc\7\f\2\2\u00bc\u00be\5\"\22\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b8\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\21\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\n\1\2\u00c5\u00c6\5\24\13"+
		"\2\u00c6\u00ca\b\n\1\2\u00c7\u00c9\5\30\r\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\n\1\2\u00ce\u00d0\7\4\2\2\u00cf"+
		"\u00d1\7\3\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6"+
		"\7-\2\2\u00d6\u00d7\b\13\1\2\u00d7\u00d8\7\17\2\2\u00d8\u00d9\5\26\f\2"+
		"\u00d9\u00da\b\13\1\2\u00da\u00dc\7\20\2\2\u00db\u00dd\7\3\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\25\3\2\2\2\u00e0\u00e8\b\f\1\2\u00e1\u00e2\5\n\6\2\u00e2\u00e3\7-\2\2"+
		"\u00e3\u00e4\b\f\1\2\u00e4\u00e5\7\r\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e1"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\n\6\2\u00ec\u00ed\7-"+
		"\2\2\u00ed\u00ee\b\f\1\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00e0\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\b\r\1"+
		"\2\u00f3\u00f5\5\32\16\2\u00f4\u00f6\7\3\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\31\3\2\2"+
		"\2\u00f9\u00fa\b\16\1\2\u00fa\u00fb\b\16\1\2\u00fb\u0105\5\34\17\2\u00fc"+
		"\u0105\5L\'\2\u00fd\u0105\5T+\2\u00fe\u0105\5X-\2\u00ff\u0105\5J&\2\u0100"+
		"\u0105\5\36\20\2\u0101\u0105\5 \21\2\u0102\u0105\5\"\22\2\u0103\u0105"+
		"\5\20\t\2\u0104\u00f9\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2"+
		"\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\33\3\2\2\2\u0106"+
		"\u0107\b\17\1\2\u0107\u0109\7\21\2\2\u0108\u010a\7\3\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0116\b\17\1\2\u010e\u0110\5\32\16\2\u010f\u0111"+
		"\7\3\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u010e\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\b\17\1\2\u011a\u011b\7\4\2\2\u011b\35\3\2\2"+
		"\2\u011c\u011d\b\20\1\2\u011d\u011e\7\22\2\2\u011e\u011f\b\20\1\2\u011f"+
		"\37\3\2\2\2\u0120\u0121\b\21\1\2\u0121\u0122\7\23\2\2\u0122\u0123\7\17"+
		"\2\2\u0123\u0124\5P)\2\u0124\u0125\7\20\2\2\u0125!\3\2\2\2\u0126\u0127"+
		"\b\22\1\2\u0127\u0128\5$\23\2\u0128#\3\2\2\2\u0129\u012a\b\23\1\2\u012a"+
		"\u012b\5(\25\2\u012b\u012c\5&\24\2\u012c%\3\2\2\2\u012d\u012e\7\f\2\2"+
		"\u012e\u012f\b\24\1\2\u012f\u0130\5(\25\2\u0130\u0131\5&\24\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\'\3\2\2\2\u0135\u0136\b\25\1\2\u0136\u0137\5,\27\2\u0137\u0138\5*\26"+
		"\2\u0138)\3\2\2\2\u0139\u013a\7\24\2\2\u013a\u013b\b\26\1\2\u013b\u013c"+
		"\5,\27\2\u013c\u013d\5*\26\2\u013d\u0140\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0139\3\2\2\2\u013f\u013e\3\2\2\2\u0140+\3\2\2\2\u0141\u0142\b\27\1\2"+
		"\u0142\u0143\5\60\31\2\u0143\u0144\5.\30\2\u0144-\3\2\2\2\u0145\u0146"+
		"\7\25\2\2\u0146\u0147\b\30\1\2\u0147\u0148\5\60\31\2\u0148\u0149\5.\30"+
		"\2\u0149\u014c\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014c/\3\2\2\2\u014d\u014e\b\31\1\2\u014e\u014f\5\64\33\2\u014f"+
		"\u0150\5\62\32\2\u0150\61\3\2\2\2\u0151\u0152\t\3\2\2\u0152\u0153\b\32"+
		"\1\2\u0153\u0154\5\64\33\2\u0154\u0155\5\62\32\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0151\3\2\2\2\u0157\u0156\3\2\2\2\u0158\63\3\2\2"+
		"\2\u0159\u015a\b\33\1\2\u015a\u015b\58\35\2\u015b\u015c\5\66\34\2\u015c"+
		"\65\3\2\2\2\u015d\u015e\t\4\2\2\u015e\u015f\b\34\1\2\u015f\u0160\58\35"+
		"\2\u0160\u0161\5\66\34\2\u0161\u0164\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u015d\3\2\2\2\u0163\u0162\3\2\2\2\u0164\67\3\2\2\2\u0165\u0166\b\35\1"+
		"\2\u0166\u0167\5<\37\2\u0167\u0168\5:\36\2\u01689\3\2\2\2\u0169\u016a"+
		"\t\5\2\2\u016a\u016b\b\36\1\2\u016b\u016c\5<\37\2\u016c\u016d\5:\36\2"+
		"\u016d\u0170\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170;\3\2\2\2\u0171\u0172\b\37\1\2\u0172\u0173\5@!\2\u0173\u0174"+
		"\5> \2\u0174=\3\2\2\2\u0175\u0176\t\6\2\2\u0176\u0177\b \1\2\u0177\u0178"+
		"\5@!\2\u0178\u0179\5> \2\u0179\u017c\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0175\3\2\2\2\u017b\u017a\3\2\2\2\u017c?\3\2\2\2\u017d\u017e\b!\1\2\u017e"+
		"\u017f\5B\"\2\u017f\u0180\5D#\2\u0180A\3\2\2\2\u0181\u0182\b\"\1\2\u0182"+
		"\u0183\7\31\2\2\u0183\u0188\5B\"\2\u0184\u0185\7\34\2\2\u0185\u0188\5"+
		"B\"\2\u0186\u0188\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188C\3\2\2\2\u0189\u018a\b#\1\2\u018a\u018b\5H%\2\u018b"+
		"\u018c\5F$\2\u018cE\3\2\2\2\u018d\u018e\b$\1\2\u018e\u018f\7\b\2\2\u018f"+
		"\u0190\5\"\22\2\u0190\u0191\5F$\2\u0191\u0192\7\t\2\2\u0192\u0193\5F$"+
		"\2\u0193\u0196\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u0194"+
		"\3\2\2\2\u0196G\3\2\2\2\u0197\u0198\5N(\2\u0198\u0199\b%\1\2\u0199\u01b3"+
		"\3\2\2\2\u019a\u019b\7*\2\2\u019b\u01b3\b%\1\2\u019c\u019d\7+\2\2\u019d"+
		"\u01b3\b%\1\2\u019e\u019f\7,\2\2\u019f\u01b3\b%\1\2\u01a0\u01a1\7-\2\2"+
		"\u01a1\u01b3\b%\1\2\u01a2\u01a3\7\35\2\2\u01a3\u01a8\5\"\22\2\u01a4\u01a5"+
		"\7\r\2\2\u01a5\u01a7\5\"\22\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01ac\7\36\2\2\u01ac\u01b3\3\2\2\2\u01ad\u01ae\b%\1\2\u01ae"+
		"\u01af\7\17\2\2\u01af\u01b0\5\"\22\2\u01b0\u01b1\7\20\2\2\u01b1\u01b3"+
		"\3\2\2\2\u01b2\u0197\3\2\2\2\u01b2\u019a\3\2\2\2\u01b2\u019c\3\2\2\2\u01b2"+
		"\u019e\3\2\2\2\u01b2\u01a0\3\2\2\2\u01b2\u01a2\3\2\2\2\u01b2\u01ad\3\2"+
		"\2\2\u01b3I\3\2\2\2\u01b4\u01b5\b&\1\2\u01b5\u01b6\7\37\2\2\u01b6K\3\2"+
		"\2\2\u01b7\u01b8\b\'\1\2\u01b8\u01b9\t\7\2\2\u01b9\u01ba\7\"\2\2\u01ba"+
		"\u01bb\5N(\2\u01bbM\3\2\2\2\u01bc\u01bd\b(\1\2\u01bd\u01be\7-\2\2\u01be"+
		"\u01bf\7\17\2\2\u01bf\u01c0\5P)\2\u01c0\u01c1\7\20\2\2\u01c1\u01c7\3\2"+
		"\2\2\u01c2\u01c3\7#\2\2\u01c3\u01c4\7\17\2\2\u01c4\u01c5\7*\2\2\u01c5"+
		"\u01c7\7\20\2\2\u01c6\u01bc\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7O\3\2\2\2"+
		"\u01c8\u01ce\b)\1\2\u01c9\u01ca\5R*\2\u01ca\u01cb\7\r\2\2\u01cb\u01cd"+
		"\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\5R"+
		"*\2\u01d2\u01d4\3\2\2\2\u01d3\u01c8\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"Q\3\2\2\2\u01d5\u01d6\b*\1\2\u01d6\u01d9\5\"\22\2\u01d7\u01d9\3\2\2\2"+
		"\u01d8\u01d5\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9S\3\2\2\2\u01da\u01db\b"+
		"+\1\2\u01db\u01dc\7$\2\2\u01dc\u01dd\b+\1\2\u01dd\u01df\5\"\22\2\u01de"+
		"\u01e0\7\3\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01eb\3\2\2\2\u01e3\u01e5\5\32\16\2\u01e4"+
		"\u01e6\7\3\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e3\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\b+\1\2\u01ef\u01f0\5V,\2\u01f0\u01f1"+
		"\7\4\2\2\u01f1U\3\2\2\2\u01f2\u01f6\b,\1\2\u01f3\u01f5\5Z.\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\5\\/\2\u01faW\3\2\2\2\u01fb"+
		"\u01fc\b-\1\2\u01fc\u01fd\7%\2\2\u01fd\u01fe\7-\2\2\u01fe\u01ff\7&\2\2"+
		"\u01ff\u0201\5\"\22\2\u0200\u0202\7\3\2\2\u0201\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\b-\1\2\u0206\u020f\b-\1\2\u0207\u0209\5\32\16\2\u0208\u020a\7\3"+
		"\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u0207\3\2\2\2\u020e\u0211\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0213\b-\1\2\u0213\u0214\7\4\2\2\u0214\u0215\b-\1"+
		"\2\u0215Y\3\2\2\2\u0216\u0217\b.\1\2\u0217\u0218\7\'\2\2\u0218\u0219\b"+
		".\1\2\u0219\u021b\5\"\22\2\u021a\u021c\7\3\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0227\3\2"+
		"\2\2\u021f\u0221\5\32\16\2\u0220\u0222\7\3\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2"+
		"\2\2\u0225\u021f\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\b."+
		"\1\2\u022b[\3\2\2\2\u022c\u022d\b/\1\2\u022d\u022f\7(\2\2\u022e\u0230"+
		"\7\3\2\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u023c\b/\1\2\u0234\u0236\5\32"+
		"\16\2\u0235\u0237\7\3\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0234\3\2"+
		"\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0242\b/\1\2\u0240\u0242\3\2"+
		"\2\2\u0241\u022c\3\2\2\2\u0241\u0240\3\2\2\2\u0242]\3\2\2\2\65egs\u0083"+
		"\u008d\u0090\u0098\u00a4\u00ac\u00b6\u00bd\u00c1\u00ca\u00d2\u00de\u00e8"+
		"\u00f0\u00f7\u0104\u010b\u0112\u0116\u0133\u013f\u014b\u0157\u0163\u016f"+
		"\u017b\u0187\u0195\u01a8\u01b2\u01c6\u01ce\u01d3\u01d8\u01e1\u01e7\u01eb"+
		"\u01f6\u0203\u020b\u020f\u021d\u0223\u0227\u0231\u0238\u023c\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}