// Generated from c:/Users/Lucas/Desktop/analizador v2/Condicional.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import CondicionalListener from './CondicionalListener.js';
import CondicionalVisitor from './CondicionalVisitor.js';

const serializedATN = [4,1,15,73,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,5,0,26,8,
0,10,0,12,0,29,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,3,1,
3,1,4,1,4,1,5,1,5,3,5,49,8,5,1,6,1,6,3,6,53,8,6,1,7,1,7,1,8,1,8,1,8,3,8,
60,8,8,1,9,1,9,1,9,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,0,0,12,0,
2,4,6,8,10,12,14,16,18,20,22,0,2,1,0,9,10,1,0,11,12,65,0,27,1,0,0,0,2,32,
1,0,0,0,4,38,1,0,0,0,6,42,1,0,0,0,8,44,1,0,0,0,10,48,1,0,0,0,12,52,1,0,0,
0,14,54,1,0,0,0,16,59,1,0,0,0,18,61,1,0,0,0,20,64,1,0,0,0,22,67,1,0,0,0,
24,26,3,2,1,0,25,24,1,0,0,0,26,29,1,0,0,0,27,25,1,0,0,0,27,28,1,0,0,0,28,
30,1,0,0,0,29,27,1,0,0,0,30,31,5,0,0,1,31,1,1,0,0,0,32,33,5,1,0,0,33,34,
3,4,2,0,34,35,5,2,0,0,35,36,3,6,3,0,36,37,5,4,0,0,37,3,1,0,0,0,38,39,3,8,
4,0,39,40,3,10,5,0,40,41,3,12,6,0,41,5,1,0,0,0,42,43,3,16,8,0,43,7,1,0,0,
0,44,45,5,13,0,0,45,9,1,0,0,0,46,49,5,8,0,0,47,49,7,0,0,0,48,46,1,0,0,0,
48,47,1,0,0,0,49,11,1,0,0,0,50,53,3,14,7,0,51,53,5,14,0,0,52,50,1,0,0,0,
52,51,1,0,0,0,53,13,1,0,0,0,54,55,7,1,0,0,55,15,1,0,0,0,56,60,3,18,9,0,57,
60,3,20,10,0,58,60,3,22,11,0,59,56,1,0,0,0,59,57,1,0,0,0,59,58,1,0,0,0,60,
17,1,0,0,0,61,62,5,5,0,0,62,63,3,8,4,0,63,19,1,0,0,0,64,65,5,6,0,0,65,66,
3,8,4,0,66,21,1,0,0,0,67,68,5,7,0,0,68,69,3,8,4,0,69,70,5,3,0,0,70,71,5,
14,0,0,71,23,1,0,0,0,4,27,48,52,59];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class CondicionalParser extends antlr4.Parser {

    static grammarFileName = "Condicional.g4";
    static literalNames = [ null, "'cuando'", "'entonces'", "'a'", "';'", 
                            "'activar'", "'desactivar'", "'ajustar'", "'es'", 
                            "'mayor que'", "'menor que'", "'encendido'", 
                            "'apagado'" ];
    static symbolicNames = [ null, "CUANDO", "ENTONCES", "A", "SEM", "ACT", 
                             "DES", "AJU", "ES", "MAY", "MEN", "ENC", "APA", 
                             "ID", "ENTERO", "WS" ];
    static ruleNames = [ "programa", "regla", "condicion", "accion", "nombre_dispositivo", 
                         "estado_condicion", "valor_condicion", "estado", 
                         "accion_simple", "activar", "desactivar", "ajustar" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CondicionalParser.ruleNames;
        this.literalNames = CondicionalParser.literalNames;
        this.symbolicNames = CondicionalParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, CondicionalParser.RULE_programa);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 27;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===1) {
	            this.state = 24;
	            this.regla();
	            this.state = 29;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 30;
	        this.match(CondicionalParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	regla() {
	    let localctx = new ReglaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, CondicionalParser.RULE_regla);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32;
	        this.match(CondicionalParser.CUANDO);
	        this.state = 33;
	        this.condicion();
	        this.state = 34;
	        this.match(CondicionalParser.ENTONCES);
	        this.state = 35;
	        this.accion();
	        this.state = 36;
	        this.match(CondicionalParser.SEM);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, CondicionalParser.RULE_condicion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 38;
	        this.nombre_dispositivo();
	        this.state = 39;
	        this.estado_condicion();
	        this.state = 40;
	        this.valor_condicion();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	accion() {
	    let localctx = new AccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, CondicionalParser.RULE_accion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 42;
	        this.accion_simple();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nombre_dispositivo() {
	    let localctx = new Nombre_dispositivoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, CondicionalParser.RULE_nombre_dispositivo);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 44;
	        this.match(CondicionalParser.ID);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	estado_condicion() {
	    let localctx = new Estado_condicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, CondicionalParser.RULE_estado_condicion);
	    var _la = 0;
	    try {
	        this.state = 48;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 8:
	            localctx = new EstCondicionIsContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 46;
	            localctx.val = this.match(CondicionalParser.ES);
	            break;
	        case 9:
	        case 10:
	            localctx = new EstCondicionValueContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 47;
	            localctx.val = this._input.LT(1);
	            _la = this._input.LA(1);
	            if(!(_la===9 || _la===10)) {
	                localctx.val = this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valor_condicion() {
	    let localctx = new Valor_condicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, CondicionalParser.RULE_valor_condicion);
	    try {
	        this.state = 52;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 11:
	        case 12:
	            localctx = new ValCondicionEstadoContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 50;
	            localctx.val = this.estado();
	            break;
	        case 14:
	            localctx = new ValCondicionIntContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 51;
	            localctx.val = this.match(CondicionalParser.ENTERO);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	estado() {
	    let localctx = new EstadoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, CondicionalParser.RULE_estado);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 54;
	        _la = this._input.LA(1);
	        if(!(_la===11 || _la===12)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	accion_simple() {
	    let localctx = new Accion_simpleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, CondicionalParser.RULE_accion_simple);
	    try {
	        this.state = 59;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 5:
	            localctx = new ActivateContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 56;
	            this.activar();
	            break;
	        case 6:
	            localctx = new DeactivateContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 57;
	            this.desactivar();
	            break;
	        case 7:
	            localctx = new AdjustContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 58;
	            this.ajustar();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	activar() {
	    let localctx = new ActivarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, CondicionalParser.RULE_activar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 61;
	        this.match(CondicionalParser.ACT);
	        this.state = 62;
	        this.nombre_dispositivo();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	desactivar() {
	    let localctx = new DesactivarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, CondicionalParser.RULE_desactivar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 64;
	        this.match(CondicionalParser.DES);
	        this.state = 65;
	        this.nombre_dispositivo();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ajustar() {
	    let localctx = new AjustarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, CondicionalParser.RULE_ajustar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 67;
	        this.match(CondicionalParser.AJU);
	        this.state = 68;
	        this.nombre_dispositivo();
	        this.state = 69;
	        this.match(CondicionalParser.A);
	        this.state = 70;
	        this.match(CondicionalParser.ENTERO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

CondicionalParser.EOF = antlr4.Token.EOF;
CondicionalParser.CUANDO = 1;
CondicionalParser.ENTONCES = 2;
CondicionalParser.A = 3;
CondicionalParser.SEM = 4;
CondicionalParser.ACT = 5;
CondicionalParser.DES = 6;
CondicionalParser.AJU = 7;
CondicionalParser.ES = 8;
CondicionalParser.MAY = 9;
CondicionalParser.MEN = 10;
CondicionalParser.ENC = 11;
CondicionalParser.APA = 12;
CondicionalParser.ID = 13;
CondicionalParser.ENTERO = 14;
CondicionalParser.WS = 15;

CondicionalParser.RULE_programa = 0;
CondicionalParser.RULE_regla = 1;
CondicionalParser.RULE_condicion = 2;
CondicionalParser.RULE_accion = 3;
CondicionalParser.RULE_nombre_dispositivo = 4;
CondicionalParser.RULE_estado_condicion = 5;
CondicionalParser.RULE_valor_condicion = 6;
CondicionalParser.RULE_estado = 7;
CondicionalParser.RULE_accion_simple = 8;
CondicionalParser.RULE_activar = 9;
CondicionalParser.RULE_desactivar = 10;
CondicionalParser.RULE_ajustar = 11;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_programa;
    }

	EOF() {
	    return this.getToken(CondicionalParser.EOF, 0);
	};

	regla = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ReglaContext);
	    } else {
	        return this.getTypedRuleContext(ReglaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ReglaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_regla;
    }

	CUANDO() {
	    return this.getToken(CondicionalParser.CUANDO, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	ENTONCES() {
	    return this.getToken(CondicionalParser.ENTONCES, 0);
	};

	accion() {
	    return this.getTypedRuleContext(AccionContext,0);
	};

	SEM() {
	    return this.getToken(CondicionalParser.SEM, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterRegla(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitRegla(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitRegla(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_condicion;
    }

	nombre_dispositivo() {
	    return this.getTypedRuleContext(Nombre_dispositivoContext,0);
	};

	estado_condicion() {
	    return this.getTypedRuleContext(Estado_condicionContext,0);
	};

	valor_condicion() {
	    return this.getTypedRuleContext(Valor_condicionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterCondicion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitCondicion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_accion;
    }

	accion_simple() {
	    return this.getTypedRuleContext(Accion_simpleContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterAccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitAccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitAccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Nombre_dispositivoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_nombre_dispositivo;
    }

	ID() {
	    return this.getToken(CondicionalParser.ID, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterNombre_dispositivo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitNombre_dispositivo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitNombre_dispositivo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Estado_condicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_estado_condicion;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class EstCondicionIsContext extends Estado_condicionContext {

    constructor(parser, ctx) {
        super(parser);
        this.val = null;;
        super.copyFrom(ctx);
    }

	ES() {
	    return this.getToken(CondicionalParser.ES, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterEstCondicionIs(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitEstCondicionIs(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitEstCondicionIs(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.EstCondicionIsContext = EstCondicionIsContext;

class EstCondicionValueContext extends Estado_condicionContext {

    constructor(parser, ctx) {
        super(parser);
        this.val = null;;
        super.copyFrom(ctx);
    }

	MAY() {
	    return this.getToken(CondicionalParser.MAY, 0);
	};

	MEN() {
	    return this.getToken(CondicionalParser.MEN, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterEstCondicionValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitEstCondicionValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitEstCondicionValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.EstCondicionValueContext = EstCondicionValueContext;

class Valor_condicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_valor_condicion;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class ValCondicionIntContext extends Valor_condicionContext {

    constructor(parser, ctx) {
        super(parser);
        this.val = null;;
        super.copyFrom(ctx);
    }

	ENTERO() {
	    return this.getToken(CondicionalParser.ENTERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterValCondicionInt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitValCondicionInt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitValCondicionInt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.ValCondicionIntContext = ValCondicionIntContext;

class ValCondicionEstadoContext extends Valor_condicionContext {

    constructor(parser, ctx) {
        super(parser);
        this.val = null;;
        super.copyFrom(ctx);
    }

	estado() {
	    return this.getTypedRuleContext(EstadoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterValCondicionEstado(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitValCondicionEstado(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitValCondicionEstado(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.ValCondicionEstadoContext = ValCondicionEstadoContext;

class EstadoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_estado;
    }

	ENC() {
	    return this.getToken(CondicionalParser.ENC, 0);
	};

	APA() {
	    return this.getToken(CondicionalParser.APA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterEstado(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitEstado(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitEstado(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Accion_simpleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_accion_simple;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class AdjustContext extends Accion_simpleContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ajustar() {
	    return this.getTypedRuleContext(AjustarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterAdjust(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitAdjust(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitAdjust(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.AdjustContext = AdjustContext;

class ActivateContext extends Accion_simpleContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	activar() {
	    return this.getTypedRuleContext(ActivarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterActivate(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitActivate(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitActivate(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.ActivateContext = ActivateContext;

class DeactivateContext extends Accion_simpleContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	desactivar() {
	    return this.getTypedRuleContext(DesactivarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterDeactivate(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitDeactivate(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitDeactivate(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CondicionalParser.DeactivateContext = DeactivateContext;

class ActivarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_activar;
    }

	ACT() {
	    return this.getToken(CondicionalParser.ACT, 0);
	};

	nombre_dispositivo() {
	    return this.getTypedRuleContext(Nombre_dispositivoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterActivar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitActivar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitActivar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DesactivarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_desactivar;
    }

	DES() {
	    return this.getToken(CondicionalParser.DES, 0);
	};

	nombre_dispositivo() {
	    return this.getTypedRuleContext(Nombre_dispositivoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterDesactivar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitDesactivar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitDesactivar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AjustarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CondicionalParser.RULE_ajustar;
    }

	AJU() {
	    return this.getToken(CondicionalParser.AJU, 0);
	};

	nombre_dispositivo() {
	    return this.getTypedRuleContext(Nombre_dispositivoContext,0);
	};

	A() {
	    return this.getToken(CondicionalParser.A, 0);
	};

	ENTERO() {
	    return this.getToken(CondicionalParser.ENTERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.enterAjustar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CondicionalListener ) {
	        listener.exitAjustar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CondicionalVisitor ) {
	        return visitor.visitAjustar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




CondicionalParser.ProgramaContext = ProgramaContext; 
CondicionalParser.ReglaContext = ReglaContext; 
CondicionalParser.CondicionContext = CondicionContext; 
CondicionalParser.AccionContext = AccionContext; 
CondicionalParser.Nombre_dispositivoContext = Nombre_dispositivoContext; 
CondicionalParser.Estado_condicionContext = Estado_condicionContext; 
CondicionalParser.Valor_condicionContext = Valor_condicionContext; 
CondicionalParser.EstadoContext = EstadoContext; 
CondicionalParser.Accion_simpleContext = Accion_simpleContext; 
CondicionalParser.ActivarContext = ActivarContext; 
CondicionalParser.DesactivarContext = DesactivarContext; 
CondicionalParser.AjustarContext = AjustarContext; 
