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
	        SymbolTableLocalVariableItem item = new SymbolTableLocalVariableItem(
	            new Variable(name,type),
	            SymbolTable.top.getOffset(Register.SP)
	        );
	        SymbolTable.resultString += item.itemToString() + '\n';
	        SymbolTable.top.put(
	            item
	        );
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

	    void beginScope() {
	            SymbolTable.resultString += "----"+'\n';
	        	int offset = 0;
	        	if(SymbolTable.top != null){
	            	offset = SymbolTable.top.getOffset(Register.SP);
	            }
	            SymbolTable.push(new SymbolTable(SymbolTable.top));
	            SymbolTable.top.setOffset(Register.GP, SymbolTable.getGlobalOffset());
	            SymbolTable.top.setOffset(Register.SP, offset);
	            SymbolTable.top.firstOffset = offset;
	    }

	    void endScope() {
	//        print("Stack global offset: " + SymbolTable.top.getOffset(Register.GP));
	//        print("Stack local offset: " + SymbolTable.top.getOffset(Register.SP));
	        //{printSymbolTableTop();}

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


	    String putReceiver(String name, List<Type> arguments) throws ItemAlreadyExistsException{
	        SymbolTableFunctionObject item = new SymbolTableFunctionObject(
	                                                         arguments,
	                                                         name
	                                                     );
	        SymbolTable.resultString += "---- "+ item.itemToString()+ " ----"+'\n';
	        SymbolTable.top.put(
	            item
	        );

	        return item.itemToString();
	    }

	    String putTempReciver(String name, List<Type> arguments){
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
	            return putReceiver(newName, arguments);
	        }catch(ItemAlreadyExistsException e) {
	             System.err.println("-----Exception--------:duplicate actor name");
	        }
	        return "";
	    }

	    void putActor(String name, int bufferSize, List<String> receivers)throws ItemAlreadyExistsException{
	            SymbolTableActorItem item = new SymbolTableActorItem(
	                                                             name,
	                                                             bufferSize,
	                                                             receivers
	                                                         );
	            SymbolTable.resultString += "---- "+ item.itemToString()+ " ----"+'\n';
	            print("actor created with name:"+name);
	            item.printReceivers();
	            SymbolTable.top.put(
	                new SymbolTableActorItem(
	                    name,
	                    bufferSize,
	                    receivers
	                )
	            );

	    }

	    void printSymbolTableTop(){
	    print("printing symbol table");
	    SymbolTable.top.print();
	    }

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

			        if(!SymbolTable.hasError){
			            print(SymbolTable.resultString);
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

	public static class ActorContext extends ParserRuleContext {
		public boolean synActorExists;
		public List<String> receiverSign = new ArrayList<>();
		public ActorDefContext ad;
		public ActorBodyStatementContext abs;
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
			setState(108);
			((ActorContext)_localctx).ad = actorDef();
			beginScope();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11))) != 0)) {
				{
				{
				setState(110);
				((ActorContext)_localctx).abs = actorBodyStatement(((ActorContext)_localctx).ad.actorName);

				    if(((ActorContext)_localctx).abs.isReceiver){
				        _localctx.receiverSign.add(((ActorContext)_localctx).abs.receiverString);
				    }
				  
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__1);
			endScope();

			     try{
			         putActor(((ActorContext)_localctx).ad.actorName, ((ActorContext)_localctx).ad.actorBufferLength, _localctx.receiverSign);
			     }
			     catch(ItemAlreadyExistsException e) {
			         System.err.println( "-----Exception--------:duplicate actor name");
			         SymbolTable.hasError = true;
			         putTemp(((ActorContext)_localctx).ad.actorName, new ActorType(((ActorContext)_localctx).ad.actorBufferLength));
			     }
			     SymbolTable.resultString += "----------------- Actor : "+((ActorContext)_localctx).ad.actorName+"<"+Integer.toString(((ActorContext)_localctx).ad.actorBufferLength)+"> -------------------------"+'\n';
			   
			SymbolTable.resultString += "------------------------------------------------------"+'\n';
			setState(122);
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
		public int actorBufferLength;
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
			setState(125);
			match(T__2);
			setState(126);
			((ActorDefContext)_localctx).name = match(Id);
			setState(127);
			match(T__3);
			setState(128);
			((ActorDefContext)_localctx).CONST_INT = match(CONST_INT);
			setState(129);
			match(T__4);
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

				    ((ActorDefContext)_localctx).actorBufferLength =  (((ActorDefContext)_localctx).CONST_INT!=null?Integer.valueOf(((ActorDefContext)_localctx).CONST_INT.getText()):0);
			        if (_localctx.actorBufferLength<=0){
			            print( "Line:" +Integer.toString(((ActorDefContext)_localctx).name.getLine()) +"  +++++++++++++++Zero Or Negative Length in actor buffer length+++++++++++++++" );
			            SymbolTable.hasError = true;
			            ((ActorDefContext)_localctx).actorBufferLength =  0;
			        }
			        ((ActorDefContext)_localctx).actorName =  (((ActorDefContext)_localctx).name!=null?((ActorDefContext)_localctx).name.getText():null);
				
			//print("actorDef : " + $name.text);
				

			        SymbolTable.addActor(new Actor((((ActorDefContext)_localctx).name!=null?((ActorDefContext)_localctx).name.getText():null),(((ActorDefContext)_localctx).CONST_INT!=null?Integer.valueOf(((ActorDefContext)_localctx).CONST_INT.getText()):0)));
			    
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
		public boolean isReceiver;
		public String receiverString;
		public ReceiverContext r;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterActorBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitActorBodyStatement(this);
		}
	}

	public final ActorBodyStatementContext actorBodyStatement(String actorName) throws RecognitionException {
		ActorBodyStatementContext _localctx = new ActorBodyStatementContext(_ctx, getState(), actorName);
		enterRule(_localctx, 6, RULE_actorBodyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("actorBodyStatement");
			  
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(140);
				dataDef(true);
				((ActorBodyStatementContext)_localctx).isReceiver =  false; ((ActorBodyStatementContext)_localctx).receiverString =  "";
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					match(T__0);
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__11:
				{
				setState(147);
				((ActorBodyStatementContext)_localctx).r = receiver(_localctx.actorName);
				((ActorBodyStatementContext)_localctx).isReceiver =  true; ((ActorBodyStatementContext)_localctx).receiverString =  ((ActorBodyStatementContext)_localctx).r.receiverString;
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(152);
				((TypeContext)_localctx).array = arrayType();
				((TypeContext)_localctx).dataType =  ((TypeContext)_localctx).array.dataArrayType;
				}
				break;
			case 2:
				{
				setState(155);
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
		public List<Integer> dimensions = new ArrayList<>();
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
			print("+++++++++++++++arrayType");
			setState(163);
			((ArrayTypeContext)_localctx).v = varType();
			((ArrayTypeContext)_localctx).dataArrayType =  ((ArrayTypeContext)_localctx).v.dataVariableType;
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(T__5);
				setState(166);
				((ArrayTypeContext)_localctx).CONST_INT = match(CONST_INT);
				setState(167);
				match(T__6);

				        if((((ArrayTypeContext)_localctx).CONST_INT!=null?Integer.valueOf(((ArrayTypeContext)_localctx).CONST_INT.getText()):0)<=0){
				            print("Line:" + Integer.toString(((ArrayTypeContext)_localctx).CONST_INT.getLine())+"  +++++++++++++++Zero Or Negative Length in array def+++++++++++++++");
				            SymbolTable.hasError = true;
				            _localctx.dimensions.add(0);
				        }else{
				            _localctx.dimensions.add((((ArrayTypeContext)_localctx).CONST_INT!=null?Integer.valueOf(((ArrayTypeContext)_localctx).CONST_INT.getText()):0));
				        }
					
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );

				    print("********************"+Integer.toString(_localctx.dimensions.size()));
				    for(int i = (_localctx.dimensions.size()-1);i>=0;i--){
				        print("in for for i: "+Integer.toString(i));
				        ((ArrayTypeContext)_localctx).dataArrayType =  new ArrayType(_localctx.dimensions.get(i),_localctx.dataArrayType);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__7);
				((VarTypeContext)_localctx).dataVariableType =  IntType.getInstance();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
			setState(181);
			((DataDefContext)_localctx).t = type();
			((DataDefContext)_localctx).dataType =  ((DataDefContext)_localctx).t.dataType;
			setState(183);
			((DataDefContext)_localctx).name = match(Id);

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
			            SymbolTable.hasError = true;
			            putTemp((((DataDefContext)_localctx).name!=null?((DataDefContext)_localctx).name.getText():null), _localctx.dataType);
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

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(189);
				match(T__10);
				setState(190);
				((DataDefContext)_localctx).name2 = match(Id);

				        try{
				            putLocalVar((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getText():null), _localctx.dataType);
				        }
				        catch(ItemAlreadyExistsException e) {
				            System.err.println( "Line:" +Integer.toString(((DataDefContext)_localctx).name2.getLine()) +"  -----Exception--------:duplicate variable name");
				            SymbolTable.hasError = true;
				            putTemp((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getText():null), _localctx.dataType);
				        }
				    
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(192);
					match(T__9);
					setState(193);
					expression();
					}
				}

				}
				}
				setState(200);
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
		public String receiverString;
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
			if ( listener instanceof gListener ) ((gListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver(String actorName) throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState(), actorName);
		enterRule(_localctx, 16, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//print("receiver");
				
			setState(202);
			((ReceiverContext)_localctx).recDef = receiverDef(_localctx.actorName);
			beginScope();
				for(Variable var: ((ReceiverContext)_localctx).recDef.receiverArgs){
				    try{
				        putLocalVar(var.getName(), var.getType());
				    }catch(ItemAlreadyExistsException e){
				        System.err.println("-----Exception--------:duplicate variable name");
				        putTemp(var.getName(), var.getType());
				    }
				}
				((ReceiverContext)_localctx).receiverString =  ((ReceiverContext)_localctx).recDef.receiverString;
				
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(204);
				receiverBodyStatement();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(211);
			match(T__1);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				match(T__0);
				}
				}
				setState(215); 
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
		public String receiverString;
		public Token name;
		public ArgumentDefContext argumentDefVars;
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public ArgumentDefContext argumentDef() {
			return getRuleContext(ArgumentDefContext.class,0);
		}
		public ReceiverDefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverDefContext(ParserRuleContext parent, int invokingState, String actorName) {
			super(parent, invokingState);
			this.actorName = actorName;
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

	public final ReceiverDefContext receiverDef(String actorName) throws RecognitionException {
		ReceiverDefContext _localctx = new ReceiverDefContext(_ctx, getState(), actorName);
		enterRule(_localctx, 18, RULE_receiverDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__11);
			setState(218);
			((ReceiverDefContext)_localctx).name = match(Id);
			//print("receiverDef : " + $name.text);
				
			setState(220);
			match(T__12);
			setState(221);
			((ReceiverDefContext)_localctx).argumentDefVars = argumentDef();

				    ((ReceiverDefContext)_localctx).receiverArgs =  ((ReceiverDefContext)_localctx).argumentDefVars.args;
				    int argCount = 0;
			        List<Type> types= new ArrayList<Type>();
			        List<Variable> argRes = ((ReceiverDefContext)_localctx).argumentDefVars.args;
			//        print(Integer.toString(argRes.size()));
			        for (Variable var : argRes){
			            types.add(var.getType());
			            if(var.getType() instanceof ArrayType){
			                ArrayType arrType = (ArrayType)var.getType();
			                print("*************************************************** it is arrraaaaaay");
			                argCount += arrType.getElementCount();
			                print(Integer.toString(argCount));
			            }
			            else{
			                print("*************************************************** it is not arrraaaaaay");
			                argCount++;
			            }
			        }
			        try{
			            ((ReceiverDefContext)_localctx).receiverString =  putReceiver((((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null),types);
			        }catch(ItemAlreadyExistsException e){
			            System.err.println("Line:" +Integer.toString(((ReceiverDefContext)_localctx).name.getLine()) +"-----Exception--------:duplicate receiver name");
			            SymbolTable.hasError = true;
			            ((ReceiverDefContext)_localctx).receiverString =  putTempReciver((((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null), types);
			        }
			        SymbolTable.addActorReceiverPair(new ActorReceiverPair(_localctx.actorName, _localctx.receiverString, argCount));
			    
			setState(223);
			match(T__13);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				match(T__0);
				}
				}
				setState(227); 
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
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				//print("argumentDef");
					
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230);
						((ArgumentDefContext)_localctx).t = type();
						setState(231);
						((ArgumentDefContext)_localctx).name = match(Id);

						    Variable v = new Variable((((ArgumentDefContext)_localctx).name!=null?((ArgumentDefContext)_localctx).name.getText():null), ((ArgumentDefContext)_localctx).t.dataType);
							_localctx.args.add(v);
							
						setState(233);
						match(T__10);
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(240);
				((ArgumentDefContext)_localctx).t2 = type();
				setState(241);
				((ArgumentDefContext)_localctx).name2 = match(Id);

				    Variable v2 = new Variable((((ArgumentDefContext)_localctx).name2!=null?((ArgumentDefContext)_localctx).name2.getText():null), ((ArgumentDefContext)_localctx).t2.dataType);
					_localctx.args.add(v2);

					
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
				
			setState(248);
			statement(0);
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				match(T__0);
				}
				}
				setState(252); 
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("statement");
					
				setState(255);
				scopeStatement(_localctx.forEachDepth);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				sendStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				ifStatement(_localctx.forEachDepth);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				forEachStatement(_localctx.forEachDepth);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				quitStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				breakStatement(_localctx.forEachDepth);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				writeStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
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
				
			setState(267);
			match(T__14);
			{
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				match(T__0);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
			beginScope();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(274);
				statement(_localctx.forEachDepth);
				{
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					match(T__0);
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(286);
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
				
			setState(289);
			((BreakStatementContext)_localctx).b = match(T__15);
			if (_localctx.forEachDepth<=0) /*throw InvalidBreakException*/
			        print("Line:" +Integer.toString(((BreakStatementContext)_localctx).b.getLine()) +"---------Invalid Break");
			        SymbolTable.hasError = true;
			    
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
				
			setState(293);
			match(T__16);
			setState(294);
			match(T__12);
			setState(295);
			expression();
			setState(296);
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
				
			setState(299);
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
				
			setState(302);
			orExpression();
			setState(303);
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((AssignmentExpressionTmpContext)_localctx).op = match(T__9);
				//print("assignmentExpressionTmp : " + $op.text);
					
				setState(307);
				orExpression();
				setState(308);
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
				
			setState(314);
			andExpression();
			setState(315);
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((OrExpressionTmpContext)_localctx).op = match(T__17);
				//print("orExpressionTmp : " + $op.text);
					
				setState(319);
				andExpression();
				setState(320);
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
				
			setState(326);
			equalityCmpExpression();
			setState(327);
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				((AndExpressionTmpContext)_localctx).op = match(T__18);
				//print("addExpressionTmp : " + $op.text);
					
				setState(331);
				equalityCmpExpression();
				setState(332);
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
				
			setState(338);
			comparisonExpression();
			setState(339);
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
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
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
					
				setState(343);
				comparisonExpression();
				setState(344);
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
				
			setState(350);
			addExpression();
			setState(351);
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
			setState(359);
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
				//print("comparisonExpressionTmp : " + $op.text);
					
				setState(355);
				addExpression();
				setState(356);
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
				
			setState(362);
			multExpression();
			setState(363);
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
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
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
					
				setState(367);
				multExpression();
				setState(368);
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
				
			setState(374);
			notExpression();
			setState(375);
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
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
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
					
				setState(379);
				notExpression();
				setState(380);
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
				
			setState(386);
			notExpressionTmp();
			setState(387);
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				//print("notExpressionTmp : " + '-');
					
				setState(390);
				((NotExpressionTmpContext)_localctx).op = match(T__22);
				setState(391);
				notExpressionTmp();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T__25);
				setState(393);
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
				
			setState(398);
			otherExpression();
			setState(399);
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
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("arrayAccessExpressionTmp : []");
						
				setState(402);
				match(T__5);
				setState(403);
				expression();
				setState(404);
				arrayAccessExpressionTmp();
				setState(405);
				match(T__6);
				setState(406);
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
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(411);
				functionCall();
				//print("otherExpression functionCall" );
				    
				}
				break;
			case 2:
				{
				setState(414);
				match(CONST_INT);
				//print("otherExpression CONST_INT" );
				    
				}
				break;
			case 3:
				{
				setState(416);
				match(CONST_STRING);
				//print("otherExpression CONST_STRING" );
				    
				}
				break;
			case 4:
				{
				setState(418);
				match(CONST_CHAR);
				//print("otherExpression CONST_CHAR" );
				    
				}
				break;
			case 5:
				{
				setState(420);
				match(Id);
				//print("otherExpression Id" );
				    
				}
				break;
			case 6:
				{
				setState(422);
				match(T__26);
				setState(423);
				expression();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(424);
					match(T__10);
					setState(425);
					expression();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
				match(T__27);
				}
				break;
			case 7:
				{
				//print("otherExpression : ()");
				    
				setState(434);
				match(T__12);
				setState(435);
				expression();
				setState(436);
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
				
			setState(441);
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
				
			setState(444);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << Id))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(445);
			match(T__31);
			setState(446);
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
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				//print("functionCall");
					
				setState(449);
				match(Id);
				setState(450);
				match(T__12);
				setState(451);
				arguments();
				setState(452);
				match(T__13);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(T__32);
				setState(455);
				match(T__12);
				setState(456);
				match(CONST_INT);
				setState(457);
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
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("arguments");
					
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(461);
						argument();
						setState(462);
						match(T__10);
						}
						} 
					}
					setState(468);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(469);
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
			setState(476);
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
					
				setState(474);
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
				
			setState(479);
			match(T__33);
			beginScope();
			setState(481);
			expression();
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
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(487);
				statement(_localctx.forEachDepth);
				{
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(488);
					match(T__0);
					}
					}
					setState(491); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(499);
			elseIfelse(_localctx.forEachDepth);
			setState(500);
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
				
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(503);
				elseIf(_localctx.forEachDepth);
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(509);
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
		public Token id;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
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
				
			setState(512);
			match(T__34);
			setState(513);
			((ForEachStatementContext)_localctx).id = match(Id);
			setState(514);
			match(T__35);
			setState(515);
			expression();
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				match(T__0);
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			beginScope();

				    try{
			                putLocalVar((((ForEachStatementContext)_localctx).id!=null?((ForEachStatementContext)_localctx).id.getText():null), NoType.getInstance());
			            }catch(ItemAlreadyExistsException e) {
			                 System.err.println("-----Exception--------:duplicate variable name");
			            }
				
			_localctx.forEachDepth++;
			beginScope();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(525);
				statement(_localctx.forEachDepth);
				{
				setState(527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(526);
					match(T__0);
					}
					}
					setState(529); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			endScope();
			setState(538);
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
				
			setState(542);
			match(T__36);
			beginScope();
			setState(544);
			expression();
			setState(546); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(545);
				match(T__0);
				}
				}
				setState(548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(550);
				statement(_localctx.forEachDepth);
				{
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(551);
					match(T__0);
					}
					}
					setState(554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(560);
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
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				//print("elseStatement");
					
				setState(564);
				match(T__37);
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(565);
					match(T__0);
					}
					}
					setState(568); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				beginScope();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
					{
					{
					setState(571);
					statement(_localctx.forEachDepth);
					{
					setState(573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(572);
						match(T__0);
						}
						}
						setState(575); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					}
					}
					setState(581);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u024d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i"+
		"\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0086\n\4\r\4\16"+
		"\4\u0087\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\u0092\n\5\r\5\16\5\u0093"+
		"\3\5\3\5\3\5\5\5\u0099\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00ac\n\7\r\7\16\7\u00ad\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00be\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\7\t\u00c7\n\t\f\t\16\t\u00ca\13\t\3\n\3"+
		"\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\6\n\u00d8\n\n"+
		"\r\n\16\n\u00d9\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00e4\n\13"+
		"\r\13\16\13\u00e5\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ee\n\f\f\f\16\f\u00f1"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\r\3\r\3\r\6\r\u00fd\n\r\r\r"+
		"\16\r\u00fe\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010b"+
		"\n\16\3\17\3\17\3\17\6\17\u0110\n\17\r\17\16\17\u0111\3\17\3\17\3\17\6"+
		"\17\u0117\n\17\r\17\16\17\u0118\7\17\u011b\n\17\f\17\16\17\u011e\13\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u013a"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0146\n\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0152\n\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015e\n\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016a\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0176\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u0182\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u018e\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u019c\n$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01ad\n%\f%\16%\u01b0\13%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u01b9\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u01cd\n(\3)\3)\3)\3)\7)\u01d3\n)\f)\16)\u01d6\13)"+
		"\3)\3)\5)\u01da\n)\3*\3*\3*\5*\u01df\n*\3+\3+\3+\3+\3+\6+\u01e6\n+\r+"+
		"\16+\u01e7\3+\3+\6+\u01ec\n+\r+\16+\u01ed\7+\u01f0\n+\f+\16+\u01f3\13"+
		"+\3+\3+\3+\3+\3,\3,\7,\u01fb\n,\f,\16,\u01fe\13,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\6-\u0208\n-\r-\16-\u0209\3-\3-\3-\3-\3-\3-\6-\u0212\n-\r-\16-\u0213"+
		"\7-\u0216\n-\f-\16-\u0219\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\6.\u0225\n"+
		".\r.\16.\u0226\3.\3.\6.\u022b\n.\r.\16.\u022c\7.\u022f\n.\f.\16.\u0232"+
		"\13.\3.\3.\3/\3/\3/\6/\u0239\n/\r/\16/\u023a\3/\3/\3/\6/\u0240\n/\r/\16"+
		"/\u0241\7/\u0244\n/\f/\16/\u0247\13/\3/\3/\5/\u024b\n/\3/\2\2\60\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\\2\b\3\3\3\3\3\2\26\27\3\2\6\7\3\2\30\31\3\2\32\33\4\2 !--\2\u025e"+
		"\2^\3\2\2\2\4n\3\2\2\2\6\177\3\2\2\2\b\u008d\3\2\2\2\n\u00a0\3\2\2\2\f"+
		"\u00a4\3\2\2\2\16\u00b5\3\2\2\2\20\u00b7\3\2\2\2\22\u00cb\3\2\2\2\24\u00db"+
		"\3\2\2\2\26\u00f7\3\2\2\2\30\u00f9\3\2\2\2\32\u010a\3\2\2\2\34\u010c\3"+
		"\2\2\2\36\u0122\3\2\2\2 \u0126\3\2\2\2\"\u012c\3\2\2\2$\u012f\3\2\2\2"+
		"&\u0139\3\2\2\2(\u013b\3\2\2\2*\u0145\3\2\2\2,\u0147\3\2\2\2.\u0151\3"+
		"\2\2\2\60\u0153\3\2\2\2\62\u015d\3\2\2\2\64\u015f\3\2\2\2\66\u0169\3\2"+
		"\2\28\u016b\3\2\2\2:\u0175\3\2\2\2<\u0177\3\2\2\2>\u0181\3\2\2\2@\u0183"+
		"\3\2\2\2B\u018d\3\2\2\2D\u018f\3\2\2\2F\u019b\3\2\2\2H\u01b8\3\2\2\2J"+
		"\u01ba\3\2\2\2L\u01bd\3\2\2\2N\u01cc\3\2\2\2P\u01d9\3\2\2\2R\u01de\3\2"+
		"\2\2T\u01e0\3\2\2\2V\u01f8\3\2\2\2X\u0201\3\2\2\2Z\u021f\3\2\2\2\\\u024a"+
		"\3\2\2\2^_\b\2\1\2_`\b\2\1\2`g\b\2\1\2ab\5\4\3\2bc\b\2\1\2cf\3\2\2\2d"+
		"f\7\3\2\2ea\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ig\3\2\2\2jk\b\2\1\2kl\b\2\1\2lm\b\2\1\2m\3\3\2\2\2no\5\6\4\2ou\b\3\1"+
		"\2pq\5\b\5\2qr\b\3\1\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2xy\7\4\2\2yz\b\3\1\2z{\b\3\1\2{|\b\3\1\2|}\t\2\2"+
		"\2}~\b\3\1\2~\5\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\7-\2\2\u0081\u0082"+
		"\7\6\2\2\u0082\u0083\7*\2\2\u0083\u0085\7\7\2\2\u0084\u0086\7\3\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\4\1\2\u008a\u008b\b\4\1\2\u008b"+
		"\u008c\b\4\1\2\u008c\7\3\2\2\2\u008d\u0098\b\5\1\2\u008e\u008f\5\20\t"+
		"\2\u008f\u0091\b\5\1\2\u0090\u0092\7\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095"+
		"\u0096\5\22\n\2\u0096\u0097\b\5\1\2\u0097\u0099\3\2\2\2\u0098\u008e\3"+
		"\2\2\2\u0098\u0095\3\2\2\2\u0099\t\3\2\2\2\u009a\u009b\5\f\7\2\u009b\u009c"+
		"\b\6\1\2\u009c\u00a1\3\2\2\2\u009d\u009e\5\16\b\2\u009e\u009f\b\6\1\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\b\6\1\2\u00a3\13\3\2\2\2\u00a4\u00a5\b\7\1\2\u00a5"+
		"\u00a6\5\16\b\2\u00a6\u00ab\b\7\1\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\7"+
		"*\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ac\b\7\1\2\u00ab\u00a7\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\b\7\1\2\u00b0\r\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b6"+
		"\b\b\1\2\u00b3\u00b4\7\13\2\2\u00b4\u00b6\b\b\1\2\u00b5\u00b1\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9"+
		"\b\t\1\2\u00b9\u00ba\7-\2\2\u00ba\u00bd\b\t\1\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00be\5\"\22\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c8\3"+
		"\2\2\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c4\b\t\1\2\u00c2"+
		"\u00c3\7\f\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00cc\b\n\1\2\u00cc\u00cd\5\24\13\2\u00cd\u00d1\b\n\1\2\u00ce"+
		"\u00d0\5\30\r\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\b\n\1\2\u00d5\u00d7\7\4\2\2\u00d6\u00d8\7\3\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\23\3\2\2\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de\b\13\1"+
		"\2\u00de\u00df\7\17\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\b\13\1\2\u00e1"+
		"\u00e3\7\20\2\2\u00e2\u00e4\7\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\25\3\2\2\2\u00e7"+
		"\u00ef\b\f\1\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea\7-\2\2\u00ea\u00eb\b\f"+
		"\1\2\u00eb\u00ec\7\r\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\n\6\2\u00f3\u00f4\7-\2\2\u00f4"+
		"\u00f5\b\f\1\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00e7\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u00fa\b\r\1\2\u00fa\u00fc"+
		"\5\32\16\2\u00fb\u00fd\7\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100\u0101"+
		"\b\16\1\2\u0101\u010b\5\34\17\2\u0102\u010b\5L\'\2\u0103\u010b\5T+\2\u0104"+
		"\u010b\5X-\2\u0105\u010b\5J&\2\u0106\u010b\5\36\20\2\u0107\u010b\5 \21"+
		"\2\u0108\u010b\5\"\22\2\u0109\u010b\5\20\t\2\u010a\u0100\3\2\2\2\u010a"+
		"\u0102\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\33\3\2\2\2\u010c\u010d\b\17\1\2\u010d\u010f\7\21"+
		"\2\2\u010e\u0110\7\3\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011c\b\17"+
		"\1\2\u0114\u0116\5\32\16\2\u0115\u0117\7\3\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0114\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\b\17"+
		"\1\2\u0120\u0121\7\4\2\2\u0121\35\3\2\2\2\u0122\u0123\b\20\1\2\u0123\u0124"+
		"\7\22\2\2\u0124\u0125\b\20\1\2\u0125\37\3\2\2\2\u0126\u0127\b\21\1\2\u0127"+
		"\u0128\7\23\2\2\u0128\u0129\7\17\2\2\u0129\u012a\5\"\22\2\u012a\u012b"+
		"\7\20\2\2\u012b!\3\2\2\2\u012c\u012d\b\22\1\2\u012d\u012e\5$\23\2\u012e"+
		"#\3\2\2\2\u012f\u0130\b\23\1\2\u0130\u0131\5(\25\2\u0131\u0132\5&\24\2"+
		"\u0132%\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\b\24\1\2\u0135\u0136\5"+
		"(\25\2\u0136\u0137\5&\24\2\u0137\u013a\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0133\3\2\2\2\u0139\u0138\3\2\2\2\u013a\'\3\2\2\2\u013b\u013c\b\25\1"+
		"\2\u013c\u013d\5,\27\2\u013d\u013e\5*\26\2\u013e)\3\2\2\2\u013f\u0140"+
		"\7\24\2\2\u0140\u0141\b\26\1\2\u0141\u0142\5,\27\2\u0142\u0143\5*\26\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0144"+
		"\3\2\2\2\u0146+\3\2\2\2\u0147\u0148\b\27\1\2\u0148\u0149\5\60\31\2\u0149"+
		"\u014a\5.\30\2\u014a-\3\2\2\2\u014b\u014c\7\25\2\2\u014c\u014d\b\30\1"+
		"\2\u014d\u014e\5\60\31\2\u014e\u014f\5.\30\2\u014f\u0152\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u0150\3\2\2\2\u0152/\3\2\2\2"+
		"\u0153\u0154\b\31\1\2\u0154\u0155\5\64\33\2\u0155\u0156\5\62\32\2\u0156"+
		"\61\3\2\2\2\u0157\u0158\t\3\2\2\u0158\u0159\b\32\1\2\u0159\u015a\5\64"+
		"\33\2\u015a\u015b\5\62\32\2\u015b\u015e\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u0157\3\2\2\2\u015d\u015c\3\2\2\2\u015e\63\3\2\2\2\u015f\u0160\b\33\1"+
		"\2\u0160\u0161\58\35\2\u0161\u0162\5\66\34\2\u0162\65\3\2\2\2\u0163\u0164"+
		"\t\4\2\2\u0164\u0165\b\34\1\2\u0165\u0166\58\35\2\u0166\u0167\5\66\34"+
		"\2\u0167\u016a\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\67\3\2\2\2\u016b\u016c\b\35\1\2\u016c\u016d\5<\37\2\u016d"+
		"\u016e\5:\36\2\u016e9\3\2\2\2\u016f\u0170\t\5\2\2\u0170\u0171\b\36\1\2"+
		"\u0171\u0172\5<\37\2\u0172\u0173\5:\36\2\u0173\u0176\3\2\2\2\u0174\u0176"+
		"\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0174\3\2\2\2\u0176;\3\2\2\2\u0177"+
		"\u0178\b\37\1\2\u0178\u0179\5@!\2\u0179\u017a\5> \2\u017a=\3\2\2\2\u017b"+
		"\u017c\t\6\2\2\u017c\u017d\b \1\2\u017d\u017e\5@!\2\u017e\u017f\5> \2"+
		"\u017f\u0182\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u0180"+
		"\3\2\2\2\u0182?\3\2\2\2\u0183\u0184\b!\1\2\u0184\u0185\5B\"\2\u0185\u0186"+
		"\5D#\2\u0186A\3\2\2\2\u0187\u0188\b\"\1\2\u0188\u0189\7\31\2\2\u0189\u018e"+
		"\5B\"\2\u018a\u018b\7\34\2\2\u018b\u018e\5B\"\2\u018c\u018e\3\2\2\2\u018d"+
		"\u0187\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018c\3\2\2\2\u018eC\3\2\2\2"+
		"\u018f\u0190\b#\1\2\u0190\u0191\5H%\2\u0191\u0192\5F$\2\u0192E\3\2\2\2"+
		"\u0193\u0194\b$\1\2\u0194\u0195\7\b\2\2\u0195\u0196\5\"\22\2\u0196\u0197"+
		"\5F$\2\u0197\u0198\7\t\2\2\u0198\u0199\5F$\2\u0199\u019c\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0193\3\2\2\2\u019b\u019a\3\2\2\2\u019cG\3\2\2\2"+
		"\u019d\u019e\5N(\2\u019e\u019f\b%\1\2\u019f\u01b9\3\2\2\2\u01a0\u01a1"+
		"\7*\2\2\u01a1\u01b9\b%\1\2\u01a2\u01a3\7+\2\2\u01a3\u01b9\b%\1\2\u01a4"+
		"\u01a5\7,\2\2\u01a5\u01b9\b%\1\2\u01a6\u01a7\7-\2\2\u01a7\u01b9\b%\1\2"+
		"\u01a8\u01a9\7\35\2\2\u01a9\u01ae\5\"\22\2\u01aa\u01ab\7\r\2\2\u01ab\u01ad"+
		"\5\"\22\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2"+
		"\7\36\2\2\u01b2\u01b9\3\2\2\2\u01b3\u01b4\b%\1\2\u01b4\u01b5\7\17\2\2"+
		"\u01b5\u01b6\5\"\22\2\u01b6\u01b7\7\20\2\2\u01b7\u01b9\3\2\2\2\u01b8\u019d"+
		"\3\2\2\2\u01b8\u01a0\3\2\2\2\u01b8\u01a2\3\2\2\2\u01b8\u01a4\3\2\2\2\u01b8"+
		"\u01a6\3\2\2\2\u01b8\u01a8\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9I\3\2\2\2"+
		"\u01ba\u01bb\b&\1\2\u01bb\u01bc\7\37\2\2\u01bcK\3\2\2\2\u01bd\u01be\b"+
		"\'\1\2\u01be\u01bf\t\7\2\2\u01bf\u01c0\7\"\2\2\u01c0\u01c1\5N(\2\u01c1"+
		"M\3\2\2\2\u01c2\u01c3\b(\1\2\u01c3\u01c4\7-\2\2\u01c4\u01c5\7\17\2\2\u01c5"+
		"\u01c6\5P)\2\u01c6\u01c7\7\20\2\2\u01c7\u01cd\3\2\2\2\u01c8\u01c9\7#\2"+
		"\2\u01c9\u01ca\7\17\2\2\u01ca\u01cb\7*\2\2\u01cb\u01cd\7\20\2\2\u01cc"+
		"\u01c2\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cdO\3\2\2\2\u01ce\u01d4\b)\1\2\u01cf"+
		"\u01d0\5R*\2\u01d0\u01d1\7\r\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01cf\3\2\2"+
		"\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\5R*\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01ce\3\2\2\2\u01d9\u01d8\3\2\2\2\u01daQ\3\2\2\2\u01db\u01dc\b*\1\2\u01dc"+
		"\u01df\5\"\22\2\u01dd\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01dd\3"+
		"\2\2\2\u01dfS\3\2\2\2\u01e0\u01e1\b+\1\2\u01e1\u01e2\7$\2\2\u01e2\u01e3"+
		"\b+\1\2\u01e3\u01e5\5\"\22\2\u01e4\u01e6\7\3\2\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01f1\3\2"+
		"\2\2\u01e9\u01eb\5\32\16\2\u01ea\u01ec\7\3\2\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2"+
		"\2\2\u01ef\u01e9\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\b+"+
		"\1\2\u01f5\u01f6\5V,\2\u01f6\u01f7\7\4\2\2\u01f7U\3\2\2\2\u01f8\u01fc"+
		"\b,\1\2\u01f9\u01fb\5Z.\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2"+
		"\2\2\u01ff\u0200\5\\/\2\u0200W\3\2\2\2\u0201\u0202\b-\1\2\u0202\u0203"+
		"\7%\2\2\u0203\u0204\7-\2\2\u0204\u0205\7&\2\2\u0205\u0207\5\"\22\2\u0206"+
		"\u0208\7\3\2\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\b-\1\2\u020c"+
		"\u020d\b-\1\2\u020d\u020e\b-\1\2\u020e\u0217\b-\1\2\u020f\u0211\5\32\16"+
		"\2\u0210\u0212\7\3\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u020f\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u021a\u021b\b-\1\2\u021b\u021c\b-\1\2\u021c\u021d"+
		"\7\4\2\2\u021d\u021e\b-\1\2\u021eY\3\2\2\2\u021f\u0220\b.\1\2\u0220\u0221"+
		"\7\'\2\2\u0221\u0222\b.\1\2\u0222\u0224\5\"\22\2\u0223\u0225\7\3\2\2\u0224"+
		"\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0230\3\2\2\2\u0228\u022a\5\32\16\2\u0229\u022b\7\3\2\2\u022a"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022f\3\2\2\2\u022e\u0228\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0233\u0234\b.\1\2\u0234[\3\2\2\2\u0235\u0236\b/\1\2\u0236\u0238"+
		"\7(\2\2\u0237\u0239\7\3\2\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0245\b/"+
		"\1\2\u023d\u023f\5\32\16\2\u023e\u0240\7\3\2\2\u023f\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
		"\2\2\u0243\u023d\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024b\b/"+
		"\1\2\u0249\u024b\3\2\2\2\u024a\u0235\3\2\2\2\u024a\u0249\3\2\2\2\u024b"+
		"]\3\2\2\2\65egu\u0087\u0093\u0098\u00a0\u00ad\u00b5\u00bd\u00c4\u00c8"+
		"\u00d1\u00d9\u00e5\u00ef\u00f7\u00fe\u010a\u0111\u0118\u011c\u0139\u0145"+
		"\u0151\u015d\u0169\u0175\u0181\u018d\u019b\u01ae\u01b8\u01cc\u01d4\u01d9"+
		"\u01de\u01e7\u01ed\u01f1\u01fc\u0209\u0213\u0217\u0226\u022c\u0230\u023a"+
		"\u0241\u0245\u024a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}