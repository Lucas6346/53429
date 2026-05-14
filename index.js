import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";

import { CustomErrorListener } from "./CustomErrorListener.js"
import { CustomCondicionalListener } from "./CustomCondicionalListener.js";
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
    MostrarTabla(lexer);

    //Arbol de analisis sintactico
    console.log("\nÁrbol sintáctico: \n");
    let arbol = tree.toStringTree(parser.ruleNames, parser);
    console.log(arbol);

    //Interpretación a JS
}

function MostrarErrores(errorListener) 
{
    console.log(`\n==== La entrada contiene ${errorListener.errors.length} errores: ====\n`);

    errorListener.errors.forEach((error, i) => 
    {
        console.log("Error nro: " + (i+1));
        console.log(`Simbolo causante: '${error.token}'`);
        console.log(`Etapa: ${error.etapa}`);
        console.log(`Linea: ${error.line} | Columna: ${error.column}`);
        console.log(`Mensaje de error: ${error.msg}`);
        console.log("---------------------------");
    });
    console.log("");
}

function MostrarTabla(lexer) 
{
    //Verificar si el lexer está generando tokens 
    console.log("\nVerificando tokens generados por lexer...");
    const tokens = lexer.getAllTokens();
    if (tokens.length === 0) {
        console.error("\nNo se generaron tokens. Verifique la entrada y la gramática.");
        return;
    }

    //Mostrar la tabla de tokens y lexemas
    console.log("\nTabla de Tokens y Lexemas:");
    console.log("--------------------------------------------------------------");
    console.log("| Lexema                     | Token                         |");
    console.log("--------------------------------------------------------------");

    // Recorrer todos los tokens generados por el lexer
    for (let token of tokens) {
        // Obtener el nombre simbólico del token
        const tokenType = CondicionalLexer.symbolicNames[token.type] || `UNKNOWN (${token.type})`;
        const lexema = token.text; // Obtener el lexema (texto del token)
        console.log(`| ${lexema.padEnd(26)} | ${tokenType.padEnd(30)}|`);
    }
    console.log("--------------------------------------------------------------"); 
}

main();