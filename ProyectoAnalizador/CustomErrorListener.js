import { ErrorListener } from "antlr4";
//import CondicionalListener from "./generated/CondicionalListener.js";
import CondicionalParser from "./generated/CondicionalParser.js";
import CondicionalLexer from "./generated/CondicionalLexer.js";

export class CustomErrorListener extends ErrorListener
{
    constructor() 
    {
        super();
        this.errors = [];
    }

    syntaxError(recognizer, offendingSymbol, line, column, msg, e) 
    {
        const token = offendingSymbol ? offendingSymbol.text : "";
        let etapa = "";

        if(recognizer instanceof CondicionalLexer) {
            etapa = "Lexer";
        }
        else if(recognizer instanceof CondicionalParser) {
            etapa = "Parser";
        } 
        else {
            etapa = "Desconocida";
        }

        this.errors.push({
            line,
            column,
            token,
            msg,
            etapa
        });
    }
}
