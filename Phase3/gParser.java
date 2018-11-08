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
	            new SymbolTableFunctionObject(
	                arguments,
	                name
	            )
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
				((ActorContext)_localctx).abs = actorBodyStatement();

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
		public boolean isReceiver;
		public String receiverString;
		public ReceiverContext r;
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
			  
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(139);
				dataDef(true);
				((ActorBodyStatementContext)_localctx).isReceiver =  false; ((ActorBodyStatementContext)_localctx).receiverString =  "";
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(T__0);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__11:
				{
				setState(146);
				((ActorBodyStatementContext)_localctx).r = receiver();
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(151);
				((TypeContext)_localctx).array = arrayType();
				((TypeContext)_localctx).dataType =  ((TypeContext)_localctx).array.dataArrayType;
				}
				break;
			case 2:
				{
				setState(154);
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
			setState(162);
			((ArrayTypeContext)_localctx).v = varType();
			((ArrayTypeContext)_localctx).dataArrayType =  ((ArrayTypeContext)_localctx).v.dataVariableType;
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(T__5);
				setState(165);
				((ArrayTypeContext)_localctx).CONST_INT = match(CONST_INT);
				setState(166);
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
				setState(170); 
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__7);
				((VarTypeContext)_localctx).dataVariableType =  IntType.getInstance();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
			setState(180);
			((DataDefContext)_localctx).t = type();
			((DataDefContext)_localctx).dataType =  ((DataDefContext)_localctx).t.dataType;
			setState(182);
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


			    
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(184);
				match(T__9);
				setState(185);
				expression();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(188);
				match(T__10);
				setState(189);
				((DataDefContext)_localctx).name2 = match(Id);

				        try{
				            putLocalVar((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getText():null), _localctx.dataType);
				        }
				        catch(ItemAlreadyExistsException e) {
				            System.err.println( "Line:" +Integer.toString(((DataDefContext)_localctx).name2.getLine()) +"  -----Exception--------:duplicate variable name");
				            SymbolTable.hasError = true;
				            putTemp((((DataDefContext)_localctx).name2!=null?((DataDefContext)_localctx).name2.getText():null), _localctx.dataType);
				        }
				    
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(191);
					match(T__9);
					setState(192);
					expression();
					}
				}

				}
				}
				setState(199);
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
				
			setState(201);
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
				((ReceiverContext)_localctx).receiverString =  ((ReceiverContext)_localctx).recDef.receiverString;
				
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(203);
				receiverBodyStatement();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(210);
			match(T__1);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(T__0);
				}
				}
				setState(214); 
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
		public String receiverString;
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
			setState(216);
			match(T__11);
			setState(217);
			((ReceiverDefContext)_localctx).name = match(Id);
			//print("receiverDef : " + $name.text);
				
			setState(219);
			match(T__12);
			setState(220);
			((ReceiverDefContext)_localctx).argumentDefVars = argumentDef();

				    ((ReceiverDefContext)_localctx).receiverArgs =  ((ReceiverDefContext)_localctx).argumentDefVars.args;
			        List<Type> types= new ArrayList<Type>();
			        List<Variable> argRes = ((ReceiverDefContext)_localctx).argumentDefVars.args;
			//        print(Integer.toString(argRes.size()));
			        for (Variable var : argRes){
			            types.add(var.getType());
			        }
			        try{
			            ((ReceiverDefContext)_localctx).receiverString =  putReceiver((((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null),types);
			        }catch(ItemAlreadyExistsException e){
			            System.err.println("Line:" +Integer.toString(((ReceiverDefContext)_localctx).name.getLine()) +"-----Exception--------:duplicate receiver name");
			            SymbolTable.hasError = true;
			            ((ReceiverDefContext)_localctx).receiverString =  putTempReciver((((ReceiverDefContext)_localctx).name!=null?((ReceiverDefContext)_localctx).name.getText():null), types);
			        }
			    
			setState(222);
			match(T__13);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(T__0);
				}
				}
				setState(226); 
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				//print("argumentDef");
					
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						((ArgumentDefContext)_localctx).t = type();
						setState(230);
						((ArgumentDefContext)_localctx).name = match(Id);

						    Variable v = new Variable((((ArgumentDefContext)_localctx).name!=null?((ArgumentDefContext)_localctx).name.getText():null), ((ArgumentDefContext)_localctx).t.dataType);
							_localctx.args.add(v);
							
						setState(232);
						match(T__10);
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(239);
				((ArgumentDefContext)_localctx).t2 = type();
				setState(240);
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
				
			setState(247);
			statement(0);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(T__0);
				}
				}
				setState(251); 
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
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("statement");
					
				setState(254);
				scopeStatement(_localctx.forEachDepth);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				sendStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				ifStatement(_localctx.forEachDepth);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				forEachStatement(_localctx.forEachDepth);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				quitStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				breakStatement(_localctx.forEachDepth);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				writeStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
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
				
			setState(266);
			match(T__14);
			{
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				match(T__0);
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
			beginScope();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(273);
				statement(_localctx.forEachDepth);
				{
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					match(T__0);
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(285);
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
				
			setState(288);
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
				
			setState(292);
			match(T__16);
			setState(293);
			match(T__12);
			setState(294);
			expression();
			setState(295);
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
				
			setState(298);
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
				
			setState(301);
			orExpression();
			setState(302);
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
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((AssignmentExpressionTmpContext)_localctx).op = match(T__9);
				//print("assignmentExpressionTmp : " + $op.text);
					
				setState(306);
				orExpression();
				setState(307);
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
				
			setState(313);
			andExpression();
			setState(314);
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
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((OrExpressionTmpContext)_localctx).op = match(T__17);
				//print("orExpressionTmp : " + $op.text);
					
				setState(318);
				andExpression();
				setState(319);
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
				
			setState(325);
			equalityCmpExpression();
			setState(326);
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
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				((AndExpressionTmpContext)_localctx).op = match(T__18);
				//print("addExpressionTmp : " + $op.text);
					
				setState(330);
				equalityCmpExpression();
				setState(331);
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
				
			setState(337);
			comparisonExpression();
			setState(338);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
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
					
				setState(342);
				comparisonExpression();
				setState(343);
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
				
			setState(349);
			addExpression();
			setState(350);
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
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
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
					
				setState(354);
				addExpression();
				setState(355);
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
				
			setState(361);
			multExpression();
			setState(362);
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
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
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
					
				setState(366);
				multExpression();
				setState(367);
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
				
			setState(373);
			notExpression();
			setState(374);
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
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
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
					
				setState(378);
				notExpression();
				setState(379);
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
				
			setState(385);
			notExpressionTmp();
			setState(386);
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
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				//print("notExpressionTmp : " + '-');
					
				setState(389);
				((NotExpressionTmpContext)_localctx).op = match(T__22);
				setState(390);
				notExpressionTmp();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(T__25);
				setState(392);
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
				
			setState(397);
			otherExpression();
			setState(398);
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
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("arrayAccessExpressionTmp : []");
						
				setState(401);
				match(T__5);
				setState(402);
				expression();
				setState(403);
				arrayAccessExpressionTmp();
				setState(404);
				match(T__6);
				setState(405);
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(410);
				functionCall();
				//print("otherExpression functionCall" );
				    
				}
				break;
			case 2:
				{
				setState(413);
				match(CONST_INT);
				//print("otherExpression CONST_INT" );
				    
				}
				break;
			case 3:
				{
				setState(415);
				match(CONST_STRING);
				//print("otherExpression CONST_STRING" );
				    
				}
				break;
			case 4:
				{
				setState(417);
				match(CONST_CHAR);
				//print("otherExpression CONST_CHAR" );
				    
				}
				break;
			case 5:
				{
				setState(419);
				match(Id);
				//print("otherExpression Id" );
				    
				}
				break;
			case 6:
				{
				setState(421);
				match(T__26);
				setState(422);
				expression();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(423);
					match(T__10);
					setState(424);
					expression();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(T__27);
				}
				break;
			case 7:
				{
				//print("otherExpression : ()");
				    
				setState(433);
				match(T__12);
				setState(434);
				expression();
				setState(435);
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
				
			setState(440);
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
				
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << Id))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(444);
			match(T__31);
			setState(445);
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
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				//print("functionCall");
					
				setState(448);
				match(Id);
				setState(449);
				match(T__12);
				setState(450);
				arguments();
				setState(451);
				match(T__13);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(T__32);
				setState(454);
				match(T__12);
				setState(455);
				match(CONST_INT);
				setState(456);
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
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				//print("arguments");
					
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(460);
						argument();
						setState(461);
						match(T__10);
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(468);
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
			setState(475);
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
					
				setState(473);
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
				
			setState(478);
			match(T__33);
			beginScope();
			setState(480);
			expression();
			setState(482); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(481);
				match(T__0);
				}
				}
				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(486);
				statement(_localctx.forEachDepth);
				{
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					match(T__0);
					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(498);
			elseIfelse(_localctx.forEachDepth);
			setState(499);
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
				
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(502);
				elseIf(_localctx.forEachDepth);
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(508);
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
				
			setState(511);
			match(T__34);
			setState(512);
			((ForEachStatementContext)_localctx).id = match(Id);
			setState(513);
			match(T__35);
			setState(514);
			expression();
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(515);
				match(T__0);
				}
				}
				setState(518); 
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
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(523);
				statement(_localctx.forEachDepth);
				{
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(524);
					match(T__0);
					}
					}
					setState(527); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(535);
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
				
			setState(539);
			match(T__36);
			beginScope();
			setState(541);
			expression();
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
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
				{
				{
				setState(547);
				statement(_localctx.forEachDepth);
				{
				setState(549); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(548);
					match(T__0);
					}
					}
					setState(551); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				}
				setState(557);
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
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				//print("elseStatement");
					
				setState(561);
				match(T__37);
				setState(563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(562);
					match(T__0);
					}
					}
					setState(565); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				beginScope();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << CONST_INT) | (1L << CONST_STRING) | (1L << CONST_CHAR) | (1L << Id))) != 0)) {
					{
					{
					setState(568);
					statement(_localctx.forEachDepth);
					{
					setState(570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(569);
						match(T__0);
						}
						}
						setState(572); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					}
					}
					setState(578);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u024a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i"+
		"\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0086\n\4\r\4\16"+
		"\4\u0087\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\u0091\n\5\r\5\16\5\u0092\3\5"+
		"\3\5\3\5\5\5\u0098\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00ab\n\7\r\7\16\7\u00ac\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\5\b\u00b5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00c4\n\t\7\t\u00c6\n\t\f\t\16\t\u00c9\13\t\3\n\3\n\3"+
		"\n\3\n\7\n\u00cf\n\n\f\n\16\n\u00d2\13\n\3\n\3\n\3\n\6\n\u00d7\n\n\r\n"+
		"\16\n\u00d8\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00e3\n\13\r"+
		"\13\16\13\u00e4\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ed\n\f\f\f\16\f\u00f0\13"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f7\n\f\3\r\3\r\3\r\6\r\u00fc\n\r\r\r\16"+
		"\r\u00fd\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010a"+
		"\n\16\3\17\3\17\3\17\6\17\u010f\n\17\r\17\16\17\u0110\3\17\3\17\3\17\6"+
		"\17\u0116\n\17\r\17\16\17\u0117\7\17\u011a\n\17\f\17\16\17\u011d\13\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0139"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0145\n\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0151\n\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015d\n\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0169\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0175\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u0181\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u018d\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u019b\n$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01ac\n%\f%\16%\u01af\13%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u01b8\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u01cc\n(\3)\3)\3)\3)\7)\u01d2\n)\f)\16)\u01d5\13)"+
		"\3)\3)\5)\u01d9\n)\3*\3*\3*\5*\u01de\n*\3+\3+\3+\3+\3+\6+\u01e5\n+\r+"+
		"\16+\u01e6\3+\3+\6+\u01eb\n+\r+\16+\u01ec\7+\u01ef\n+\f+\16+\u01f2\13"+
		"+\3+\3+\3+\3+\3,\3,\7,\u01fa\n,\f,\16,\u01fd\13,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\6-\u0207\n-\r-\16-\u0208\3-\3-\3-\3-\3-\6-\u0210\n-\r-\16-\u0211\7"+
		"-\u0214\n-\f-\16-\u0217\13-\3-\3-\3-\3-\3.\3.\3.\3.\3.\6.\u0222\n.\r."+
		"\16.\u0223\3.\3.\6.\u0228\n.\r.\16.\u0229\7.\u022c\n.\f.\16.\u022f\13"+
		".\3.\3.\3/\3/\3/\6/\u0236\n/\r/\16/\u0237\3/\3/\3/\6/\u023d\n/\r/\16/"+
		"\u023e\7/\u0241\n/\f/\16/\u0244\13/\3/\3/\5/\u0248\n/\3/\2\2\60\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\\2\b\3\3\3\3\3\2\26\27\3\2\6\7\3\2\30\31\3\2\32\33\4\2 !--\2\u025b"+
		"\2^\3\2\2\2\4n\3\2\2\2\6\177\3\2\2\2\b\u008c\3\2\2\2\n\u009f\3\2\2\2\f"+
		"\u00a3\3\2\2\2\16\u00b4\3\2\2\2\20\u00b6\3\2\2\2\22\u00ca\3\2\2\2\24\u00da"+
		"\3\2\2\2\26\u00f6\3\2\2\2\30\u00f8\3\2\2\2\32\u0109\3\2\2\2\34\u010b\3"+
		"\2\2\2\36\u0121\3\2\2\2 \u0125\3\2\2\2\"\u012b\3\2\2\2$\u012e\3\2\2\2"+
		"&\u0138\3\2\2\2(\u013a\3\2\2\2*\u0144\3\2\2\2,\u0146\3\2\2\2.\u0150\3"+
		"\2\2\2\60\u0152\3\2\2\2\62\u015c\3\2\2\2\64\u015e\3\2\2\2\66\u0168\3\2"+
		"\2\28\u016a\3\2\2\2:\u0174\3\2\2\2<\u0176\3\2\2\2>\u0180\3\2\2\2@\u0182"+
		"\3\2\2\2B\u018c\3\2\2\2D\u018e\3\2\2\2F\u019a\3\2\2\2H\u01b7\3\2\2\2J"+
		"\u01b9\3\2\2\2L\u01bc\3\2\2\2N\u01cb\3\2\2\2P\u01d8\3\2\2\2R\u01dd\3\2"+
		"\2\2T\u01df\3\2\2\2V\u01f7\3\2\2\2X\u0200\3\2\2\2Z\u021c\3\2\2\2\\\u0247"+
		"\3\2\2\2^_\b\2\1\2_`\b\2\1\2`g\b\2\1\2ab\5\4\3\2bc\b\2\1\2cf\3\2\2\2d"+
		"f\7\3\2\2ea\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ig\3\2\2\2jk\b\2\1\2kl\b\2\1\2lm\b\2\1\2m\3\3\2\2\2no\5\6\4\2ou\b\3\1"+
		"\2pq\5\b\5\2qr\b\3\1\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2xy\7\4\2\2yz\b\3\1\2z{\b\3\1\2{|\b\3\1\2|}\t\2\2"+
		"\2}~\b\3\1\2~\5\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\7-\2\2\u0081\u0082"+
		"\7\6\2\2\u0082\u0083\7*\2\2\u0083\u0085\7\7\2\2\u0084\u0086\7\3\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\4\1\2\u008a\u008b\b\4\1\2\u008b"+
		"\7\3\2\2\2\u008c\u0097\b\5\1\2\u008d\u008e\5\20\t\2\u008e\u0090\b\5\1"+
		"\2\u008f\u0091\7\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\3\2\2\2\u0094\u0095\5\22\n\2"+
		"\u0095\u0096\b\5\1\2\u0096\u0098\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0098\t\3\2\2\2\u0099\u009a\5\f\7\2\u009a\u009b\b\6\1\2\u009b"+
		"\u00a0\3\2\2\2\u009c\u009d\5\16\b\2\u009d\u009e\b\6\1\2\u009e\u00a0\3"+
		"\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\b\6\1\2\u00a2\13\3\2\2\2\u00a3\u00a4\b\7\1\2\u00a4\u00a5\5\16\b"+
		"\2\u00a5\u00aa\b\7\1\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9"+
		"\7\t\2\2\u00a9\u00ab\b\7\1\2\u00aa\u00a6\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\7"+
		"\1\2\u00af\r\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b5\b\b\1\2\u00b2\u00b3"+
		"\7\13\2\2\u00b3\u00b5\b\b\1\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\17\3\2\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\b\t\1\2\u00b8\u00b9"+
		"\7-\2\2\u00b9\u00bc\b\t\1\2\u00ba\u00bb\7\f\2\2\u00bb\u00bd\5\"\22\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c7\3\2\2\2\u00be\u00bf\7\r"+
		"\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c3\b\t\1\2\u00c1\u00c2\7\f\2\2\u00c2"+
		"\u00c4\5\"\22\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00be\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\21\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b\n\1"+
		"\2\u00cb\u00cc\5\24\13\2\u00cc\u00d0\b\n\1\2\u00cd\u00cf\5\30\r\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\n\1\2\u00d4"+
		"\u00d6\7\4\2\2\u00d5\u00d7\7\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\23\3\2\2\2\u00da\u00db"+
		"\7\16\2\2\u00db\u00dc\7-\2\2\u00dc\u00dd\b\13\1\2\u00dd\u00de\7\17\2\2"+
		"\u00de\u00df\5\26\f\2\u00df\u00e0\b\13\1\2\u00e0\u00e2\7\20\2\2\u00e1"+
		"\u00e3\7\3\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00ee\b\f\1\2\u00e7\u00e8"+
		"\5\n\6\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\b\f\1\2\u00ea\u00eb\7\r\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\5\n\6\2\u00f2\u00f3\7-\2\2\u00f3\u00f4\b\f\1\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\27\3\2\2\2\u00f8\u00f9\b\r\1\2\u00f9\u00fb\5\32\16\2\u00fa\u00fc\7\3"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u0100\b\16\1\2\u0100\u010a\5\34"+
		"\17\2\u0101\u010a\5L\'\2\u0102\u010a\5T+\2\u0103\u010a\5X-\2\u0104\u010a"+
		"\5J&\2\u0105\u010a\5\36\20\2\u0106\u010a\5 \21\2\u0107\u010a\5\"\22\2"+
		"\u0108\u010a\5\20\t\2\u0109\u00ff\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0102"+
		"\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u0109"+
		"\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\33\3\2\2"+
		"\2\u010b\u010c\b\17\1\2\u010c\u010e\7\21\2\2\u010d\u010f\7\3\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u011b\b\17\1\2\u0113\u0115\5\32\16\2\u0114"+
		"\u0116\7\3\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0113\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u011f\b\17\1\2\u011f\u0120\7\4\2\2\u0120"+
		"\35\3\2\2\2\u0121\u0122\b\20\1\2\u0122\u0123\7\22\2\2\u0123\u0124\b\20"+
		"\1\2\u0124\37\3\2\2\2\u0125\u0126\b\21\1\2\u0126\u0127\7\23\2\2\u0127"+
		"\u0128\7\17\2\2\u0128\u0129\5\"\22\2\u0129\u012a\7\20\2\2\u012a!\3\2\2"+
		"\2\u012b\u012c\b\22\1\2\u012c\u012d\5$\23\2\u012d#\3\2\2\2\u012e\u012f"+
		"\b\23\1\2\u012f\u0130\5(\25\2\u0130\u0131\5&\24\2\u0131%\3\2\2\2\u0132"+
		"\u0133\7\f\2\2\u0133\u0134\b\24\1\2\u0134\u0135\5(\25\2\u0135\u0136\5"+
		"&\24\2\u0136\u0139\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\'\3\2\2\2\u013a\u013b\b\25\1\2\u013b\u013c\5,\27"+
		"\2\u013c\u013d\5*\26\2\u013d)\3\2\2\2\u013e\u013f\7\24\2\2\u013f\u0140"+
		"\b\26\1\2\u0140\u0141\5,\27\2\u0141\u0142\5*\26\2\u0142\u0145\3\2\2\2"+
		"\u0143\u0145\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u0143\3\2\2\2\u0145+\3"+
		"\2\2\2\u0146\u0147\b\27\1\2\u0147\u0148\5\60\31\2\u0148\u0149\5.\30\2"+
		"\u0149-\3\2\2\2\u014a\u014b\7\25\2\2\u014b\u014c\b\30\1\2\u014c\u014d"+
		"\5\60\31\2\u014d\u014e\5.\30\2\u014e\u0151\3\2\2\2\u014f\u0151\3\2\2\2"+
		"\u0150\u014a\3\2\2\2\u0150\u014f\3\2\2\2\u0151/\3\2\2\2\u0152\u0153\b"+
		"\31\1\2\u0153\u0154\5\64\33\2\u0154\u0155\5\62\32\2\u0155\61\3\2\2\2\u0156"+
		"\u0157\t\3\2\2\u0157\u0158\b\32\1\2\u0158\u0159\5\64\33\2\u0159\u015a"+
		"\5\62\32\2\u015a\u015d\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u0156\3\2\2\2"+
		"\u015c\u015b\3\2\2\2\u015d\63\3\2\2\2\u015e\u015f\b\33\1\2\u015f\u0160"+
		"\58\35\2\u0160\u0161\5\66\34\2\u0161\65\3\2\2\2\u0162\u0163\t\4\2\2\u0163"+
		"\u0164\b\34\1\2\u0164\u0165\58\35\2\u0165\u0166\5\66\34\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\67\3\2\2\2\u016a\u016b\b\35\1\2\u016b\u016c\5<\37\2\u016c\u016d\5:\36"+
		"\2\u016d9\3\2\2\2\u016e\u016f\t\5\2\2\u016f\u0170\b\36\1\2\u0170\u0171"+
		"\5<\37\2\u0171\u0172\5:\36\2\u0172\u0175\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u016e\3\2\2\2\u0174\u0173\3\2\2\2\u0175;\3\2\2\2\u0176\u0177\b\37\1\2"+
		"\u0177\u0178\5@!\2\u0178\u0179\5> \2\u0179=\3\2\2\2\u017a\u017b\t\6\2"+
		"\2\u017b\u017c\b \1\2\u017c\u017d\5@!\2\u017d\u017e\5> \2\u017e\u0181"+
		"\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"?\3\2\2\2\u0182\u0183\b!\1\2\u0183\u0184\5B\"\2\u0184\u0185\5D#\2\u0185"+
		"A\3\2\2\2\u0186\u0187\b\"\1\2\u0187\u0188\7\31\2\2\u0188\u018d\5B\"\2"+
		"\u0189\u018a\7\34\2\2\u018a\u018d\5B\"\2\u018b\u018d\3\2\2\2\u018c\u0186"+
		"\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018b\3\2\2\2\u018dC\3\2\2\2\u018e"+
		"\u018f\b#\1\2\u018f\u0190\5H%\2\u0190\u0191\5F$\2\u0191E\3\2\2\2\u0192"+
		"\u0193\b$\1\2\u0193\u0194\7\b\2\2\u0194\u0195\5\"\22\2\u0195\u0196\5F"+
		"$\2\u0196\u0197\7\t\2\2\u0197\u0198\5F$\2\u0198\u019b\3\2\2\2\u0199\u019b"+
		"\3\2\2\2\u019a\u0192\3\2\2\2\u019a\u0199\3\2\2\2\u019bG\3\2\2\2\u019c"+
		"\u019d\5N(\2\u019d\u019e\b%\1\2\u019e\u01b8\3\2\2\2\u019f\u01a0\7*\2\2"+
		"\u01a0\u01b8\b%\1\2\u01a1\u01a2\7+\2\2\u01a2\u01b8\b%\1\2\u01a3\u01a4"+
		"\7,\2\2\u01a4\u01b8\b%\1\2\u01a5\u01a6\7-\2\2\u01a6\u01b8\b%\1\2\u01a7"+
		"\u01a8\7\35\2\2\u01a8\u01ad\5\"\22\2\u01a9\u01aa\7\r\2\2\u01aa\u01ac\5"+
		"\"\22\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\36"+
		"\2\2\u01b1\u01b8\3\2\2\2\u01b2\u01b3\b%\1\2\u01b3\u01b4\7\17\2\2\u01b4"+
		"\u01b5\5\"\22\2\u01b5\u01b6\7\20\2\2\u01b6\u01b8\3\2\2\2\u01b7\u019c\3"+
		"\2\2\2\u01b7\u019f\3\2\2\2\u01b7\u01a1\3\2\2\2\u01b7\u01a3\3\2\2\2\u01b7"+
		"\u01a5\3\2\2\2\u01b7\u01a7\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b8I\3\2\2\2"+
		"\u01b9\u01ba\b&\1\2\u01ba\u01bb\7\37\2\2\u01bbK\3\2\2\2\u01bc\u01bd\b"+
		"\'\1\2\u01bd\u01be\t\7\2\2\u01be\u01bf\7\"\2\2\u01bf\u01c0\5N(\2\u01c0"+
		"M\3\2\2\2\u01c1\u01c2\b(\1\2\u01c2\u01c3\7-\2\2\u01c3\u01c4\7\17\2\2\u01c4"+
		"\u01c5\5P)\2\u01c5\u01c6\7\20\2\2\u01c6\u01cc\3\2\2\2\u01c7\u01c8\7#\2"+
		"\2\u01c8\u01c9\7\17\2\2\u01c9\u01ca\7*\2\2\u01ca\u01cc\7\20\2\2\u01cb"+
		"\u01c1\3\2\2\2\u01cb\u01c7\3\2\2\2\u01ccO\3\2\2\2\u01cd\u01d3\b)\1\2\u01ce"+
		"\u01cf\5R*\2\u01cf\u01d0\7\r\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01ce\3\2\2"+
		"\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\5R*\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01cd\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9Q\3\2\2\2\u01da\u01db\b*\1\2\u01db"+
		"\u01de\5\"\22\2\u01dc\u01de\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01dc\3"+
		"\2\2\2\u01deS\3\2\2\2\u01df\u01e0\b+\1\2\u01e0\u01e1\7$\2\2\u01e1\u01e2"+
		"\b+\1\2\u01e2\u01e4\5\"\22\2\u01e3\u01e5\7\3\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f0\3\2"+
		"\2\2\u01e8\u01ea\5\32\16\2\u01e9\u01eb\7\3\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2"+
		"\2\2\u01ee\u01e8\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\b+"+
		"\1\2\u01f4\u01f5\5V,\2\u01f5\u01f6\7\4\2\2\u01f6U\3\2\2\2\u01f7\u01fb"+
		"\b,\1\2\u01f8\u01fa\5Z.\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fe\u01ff\5\\/\2\u01ffW\3\2\2\2\u0200\u0201\b-\1\2\u0201\u0202"+
		"\7%\2\2\u0202\u0203\7-\2\2\u0203\u0204\7&\2\2\u0204\u0206\5\"\22\2\u0205"+
		"\u0207\7\3\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\b-\1\2\u020b"+
		"\u020c\b-\1\2\u020c\u0215\b-\1\2\u020d\u020f\5\32\16\2\u020e\u0210\7\3"+
		"\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u020d\3\2\2\2\u0214\u0217\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0218\u0219\b-\1\2\u0219\u021a\7\4\2\2\u021a\u021b\b-\1"+
		"\2\u021bY\3\2\2\2\u021c\u021d\b.\1\2\u021d\u021e\7\'\2\2\u021e\u021f\b"+
		".\1\2\u021f\u0221\5\"\22\2\u0220\u0222\7\3\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u022d\3\2"+
		"\2\2\u0225\u0227\5\32\16\2\u0226\u0228\7\3\2\2\u0227\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0225\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\b."+
		"\1\2\u0231[\3\2\2\2\u0232\u0233\b/\1\2\u0233\u0235\7(\2\2\u0234\u0236"+
		"\7\3\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0242\b/\1\2\u023a\u023c\5\32"+
		"\16\2\u023b\u023d\7\3\2\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023a\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0248\b/\1\2\u0246\u0248\3\2"+
		"\2\2\u0247\u0232\3\2\2\2\u0247\u0246\3\2\2\2\u0248]\3\2\2\2\65egu\u0087"+
		"\u0092\u0097\u009f\u00ac\u00b4\u00bc\u00c3\u00c7\u00d0\u00d8\u00e4\u00ee"+
		"\u00f6\u00fd\u0109\u0110\u0117\u011b\u0138\u0144\u0150\u015c\u0168\u0174"+
		"\u0180\u018c\u019a\u01ad\u01b7\u01cb\u01d3\u01d8\u01dd\u01e6\u01ec\u01f0"+
		"\u01fb\u0208\u0211\u0215\u0223\u0229\u022d\u0237\u023e\u0242\u0247";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}