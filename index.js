import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";

import { CustomErrorListener } from "./CustomErrorListener.js"
import CondicionalParser from "./generated/CondicionalParser.js";
import CondicionalLexer from "./generated/CondicionalLexer.js";

import readline from 'readline';
import fs from 'fs';
import { error } from "console";

async function main() 
{
    let input;

    input = fs.readFileSync('input.txt', 'utf8'); //lee input

    //Obtener tokens y arbol
    let inputStream = CharStreams.fromString(input);
    let lexer = new CondicionalLexer(inputStream);
    let tokenStream = new CommonTokenStream(lexer);
    let parser = new CondicionalParser(tokenStream);
    parser.buildParseTrees = true;
    
    // Analisis lexico y sintactico
    const errorListener = new CustomErrorListener();
    lexer.removeErrorListeners();
    parser.removeErrorListeners();
    lexer.addErrorListener(errorListener);
    parser.addErrorListener(errorListener);

    let tree = parser.programa(); //llama al listener si detecta errores en la entrada

    if (errorListener.errors.length > 0) 
    {
        MostrarErrores(errorListener);
        console.log("\nEntrada inválida.");
        console.log("Programa terminado.");
        process.exit(1);
    }
    
    console.log("\nEntrada válida.");

    //Tabla de lexemas y Tokens

    //Arbol de analisis sintactico

    //Interpretación a JS
}



main();