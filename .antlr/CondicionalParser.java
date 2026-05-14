// Generated from c:/Users/Lucas/Desktop/analizador v2/Condicional.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CondicionalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CUANDO=1, ENTONCES=2, A=3, SEM=4, ACT=5, DES=6, AJU=7, ES=8, MAY=9, MEN=10, 
		ENC=11, APA=12, ID=13, ENTERO=14, WS=15;
	public static final int
		RULE_programa = 0, RULE_regla = 1, RULE_condicion = 2, RULE_accion = 3, 
		RULE_nombre_dispositivo = 4, RULE_estado_condicion = 5, RULE_valor_condicion = 6, 
		RULE_estado = 7, RULE_accion_simple = 8, RULE_activar = 9, RULE_desactivar = 10, 
		RULE_ajustar = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "regla", "condicion", "accion", "nombre_dispositivo", "estado_condicion", 
			"valor_condicion", "estado", "accion_simple", "activar", "desactivar", 
			"ajustar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cuando'", "'entonces'", "'a'", "';'", "'activar'", "'desactivar'", 
			"'ajustar'", "'es'", "'mayor que'", "'menor que'", "'encendido'", "'apagado'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CUANDO", "ENTONCES", "A", "SEM", "ACT", "DES", "AJU", "ES", "MAY", 
			"MEN", "ENC", "APA", "ID", "ENTERO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Condicional.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CondicionalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CondicionalParser.EOF, 0); }
		public List<ReglaContext> regla() {
			return getRuleContexts(ReglaContext.class);
		}
		public ReglaContext regla(int i) {
			return getRuleContext(ReglaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CUANDO) {
				{
				{
				setState(24);
				regla();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReglaContext extends ParserRuleContext {
		public TerminalNode CUANDO() { return getToken(CondicionalParser.CUANDO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(CondicionalParser.ENTONCES, 0); }
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public TerminalNode SEM() { return getToken(CondicionalParser.SEM, 0); }
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitRegla(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(CUANDO);
			setState(33);
			condicion();
			setState(34);
			match(ENTONCES);
			setState(35);
			accion();
			setState(36);
			match(SEM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public Estado_condicionContext estado_condicion() {
			return getRuleContext(Estado_condicionContext.class,0);
		}
		public Valor_condicionContext valor_condicion() {
			return getRuleContext(Valor_condicionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			nombre_dispositivo();
			setState(39);
			estado_condicion();
			setState(40);
			valor_condicion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public Accion_simpleContext accion_simple() {
			return getRuleContext(Accion_simpleContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitAccion(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			accion_simple();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nombre_dispositivoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CondicionalParser.ID, 0); }
		public Nombre_dispositivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_dispositivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterNombre_dispositivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitNombre_dispositivo(this);
		}
	}

	public final Nombre_dispositivoContext nombre_dispositivo() throws RecognitionException {
		Nombre_dispositivoContext _localctx = new Nombre_dispositivoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nombre_dispositivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Estado_condicionContext extends ParserRuleContext {
		public Estado_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_condicion; }
	 
		public Estado_condicionContext() { }
		public void copyFrom(Estado_condicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondLesserContext extends Estado_condicionContext {
		public TerminalNode MEN() { return getToken(CondicionalParser.MEN, 0); }
		public CondLesserContext(Estado_condicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterCondLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitCondLesser(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondIsContext extends Estado_condicionContext {
		public TerminalNode ES() { return getToken(CondicionalParser.ES, 0); }
		public CondIsContext(Estado_condicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitCondIs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondGreaterContext extends Estado_condicionContext {
		public TerminalNode MAY() { return getToken(CondicionalParser.MAY, 0); }
		public CondGreaterContext(Estado_condicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterCondGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitCondGreater(this);
		}
	}

	public final Estado_condicionContext estado_condicion() throws RecognitionException {
		Estado_condicionContext _localctx = new Estado_condicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estado_condicion);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
				_localctx = new CondIsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ES);
				}
				break;
			case MAY:
				_localctx = new CondGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(MAY);
				}
				break;
			case MEN:
				_localctx = new CondLesserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(MEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_condicionContext extends ParserRuleContext {
		public Valor_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_condicion; }
	 
		public Valor_condicionContext() { }
		public void copyFrom(Valor_condicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValCondicionIntContext extends Valor_condicionContext {
		public TerminalNode ENTERO() { return getToken(CondicionalParser.ENTERO, 0); }
		public ValCondicionIntContext(Valor_condicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterValCondicionInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitValCondicionInt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValCondicionEstadoContext extends Valor_condicionContext {
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public ValCondicionEstadoContext(Valor_condicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterValCondicionEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitValCondicionEstado(this);
		}
	}

	public final Valor_condicionContext valor_condicion() throws RecognitionException {
		Valor_condicionContext _localctx = new Valor_condicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valor_condicion);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENC:
			case APA:
				_localctx = new ValCondicionEstadoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				estado();
				}
				break;
			case ENTERO:
				_localctx = new ValCondicionIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(ENTERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode ENC() { return getToken(CondicionalParser.ENC, 0); }
		public TerminalNode APA() { return getToken(CondicionalParser.APA, 0); }
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==ENC || _la==APA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Accion_simpleContext extends ParserRuleContext {
		public Accion_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion_simple; }
	 
		public Accion_simpleContext() { }
		public void copyFrom(Accion_simpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjustContext extends Accion_simpleContext {
		public AjustarContext ajustar() {
			return getRuleContext(AjustarContext.class,0);
		}
		public AdjustContext(Accion_simpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterAdjust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitAdjust(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActivateContext extends Accion_simpleContext {
		public ActivarContext activar() {
			return getRuleContext(ActivarContext.class,0);
		}
		public ActivateContext(Accion_simpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterActivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitActivate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeactivateContext extends Accion_simpleContext {
		public DesactivarContext desactivar() {
			return getRuleContext(DesactivarContext.class,0);
		}
		public DeactivateContext(Accion_simpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterDeactivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitDeactivate(this);
		}
	}

	public final Accion_simpleContext accion_simple() throws RecognitionException {
		Accion_simpleContext _localctx = new Accion_simpleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_accion_simple);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACT:
				_localctx = new ActivateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				activar();
				}
				break;
			case DES:
				_localctx = new DeactivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				desactivar();
				}
				break;
			case AJU:
				_localctx = new AdjustContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				ajustar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActivarContext extends ParserRuleContext {
		public TerminalNode ACT() { return getToken(CondicionalParser.ACT, 0); }
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public ActivarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterActivar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitActivar(this);
		}
	}

	public final ActivarContext activar() throws RecognitionException {
		ActivarContext _localctx = new ActivarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_activar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ACT);
			setState(63);
			nombre_dispositivo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DesactivarContext extends ParserRuleContext {
		public TerminalNode DES() { return getToken(CondicionalParser.DES, 0); }
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public DesactivarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desactivar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterDesactivar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitDesactivar(this);
		}
	}

	public final DesactivarContext desactivar() throws RecognitionException {
		DesactivarContext _localctx = new DesactivarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_desactivar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(DES);
			setState(66);
			nombre_dispositivo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AjustarContext extends ParserRuleContext {
		public TerminalNode AJU() { return getToken(CondicionalParser.AJU, 0); }
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public TerminalNode A() { return getToken(CondicionalParser.A, 0); }
		public TerminalNode ENTERO() { return getToken(CondicionalParser.ENTERO, 0); }
		public AjustarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ajustar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).enterAjustar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CondicionalListener ) ((CondicionalListener)listener).exitAjustar(this);
		}
	}

	public final AjustarContext ajustar() throws RecognitionException {
		AjustarContext _localctx = new AjustarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ajustar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(AJU);
			setState(69);
			nombre_dispositivo();
			setState(70);
			match(A);
			setState(71);
			match(ENTERO);
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
		"\u0004\u0001\u000fJ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u00052\b\u0005\u0001\u0006\u0001\u0006\u0003\u00066\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b=\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000\u000b\fC"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000"+
		"\u0000\u0000\n1\u0001\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000e"+
		"7\u0001\u0000\u0000\u0000\u0010<\u0001\u0000\u0000\u0000\u0012>\u0001"+
		"\u0000\u0000\u0000\u0014A\u0001\u0000\u0000\u0000\u0016D\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000"+
		"\u0001\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!"+
		"\"\u0003\u0004\u0002\u0000\"#\u0005\u0002\u0000\u0000#$\u0003\u0006\u0003"+
		"\u0000$%\u0005\u0004\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0003"+
		"\b\u0004\u0000\'(\u0003\n\u0005\u0000()\u0003\f\u0006\u0000)\u0005\u0001"+
		"\u0000\u0000\u0000*+\u0003\u0010\b\u0000+\u0007\u0001\u0000\u0000\u0000"+
		",-\u0005\r\u0000\u0000-\t\u0001\u0000\u0000\u0000.2\u0005\b\u0000\u0000"+
		"/2\u0005\t\u0000\u000002\u0005\n\u0000\u00001.\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u000b\u0001\u0000"+
		"\u0000\u000036\u0003\u000e\u0007\u000046\u0005\u000e\u0000\u000053\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006\r\u0001\u0000\u0000\u0000"+
		"78\u0007\u0000\u0000\u00008\u000f\u0001\u0000\u0000\u00009=\u0003\u0012"+
		"\t\u0000:=\u0003\u0014\n\u0000;=\u0003\u0016\u000b\u0000<9\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0011"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0003\b\u0004\u0000"+
		"@\u0013\u0001\u0000\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0003\b\u0004"+
		"\u0000C\u0015\u0001\u0000\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0003"+
		"\b\u0004\u0000FG\u0005\u0003\u0000\u0000GH\u0005\u000e\u0000\u0000H\u0017"+
		"\u0001\u0000\u0000\u0000\u0004\u001b15<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}