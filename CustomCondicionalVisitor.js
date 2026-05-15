import { Parser } from "antlr4";
import CondicionalVisitor from "./generated/CondicionalVisitor.js";
import CondicionalParser from "./generated/CondicionalParser.js";

export class CustomCondicionalVisitor extends CondicionalVisitor 
{
    constructor() 
    {
        super();
        this.memory = new Map();   //Declaro una variable de instancia con una memoria temporal para hacer las reducciones
    } 

    visitRegla(ctx)
    {
        const stringFunc = this.visit(ctx.accion());
        const objCondicion = this.visit(ctx.condicion());

        const line1 = `const ${objCondicion.disp} = { ${stringFunc } };`;
        const line2;
    }

    visitCondicion(ctx)
    {
        const disp = this.visit(ctx.nombre_dispositivo());
        const estCondicion = this.visit(ctx.estado_condicion());
        const valCondicion = this.visit(ctx.valor_condicion());
        
        return ({
            disp,
            estCondicion,
            valCondicion
        });
    }
    visitCondIsState(ctx)
    {
        return "encendido: ";
    }
    visitCondValue(ctx)
    {
        const val = ctx.val().getText();
        const simboloIf;
        const nombrePropiedad = "valor: ";

        if (val === "mayor que")
        {
            simboloIf = ">";
        }
        else if (val === "menor que") 
        {
            simboloIf = "<";
        }

        return ({
            nombrePropiedad,
            simboloIf
        });
    }

    visitAccion(ctx) 
    {
        return this.visit(ctx.accion_simple());
    }
    visitActivate(ctx)
    {
        const nombreDisp = ctx.activar().nombre_dispositivo().getText();
        return `activar: function() { this.${nombreDisp} = true; }`;
    }
    visitDeactivate(ctx)
    {
        const nombreDisp = ctx.desactivar().nombre_dispositivo().getText();
        return `desactivar: function() { this.${nombreDisp} = false; }`;
    }
    visitAdjust(ctx)
    {
        const nombreDisp = ctx.ajustar().nombre_dispositivo().getText();
        const valObjetivo = ctx.ajustar().ENTERO().getText();

        return `ajustar: function() { this.${nombreDisp} = ${valObjetivo}; }`;
    }
}
