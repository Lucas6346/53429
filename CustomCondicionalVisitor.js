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
        const objCondicion = this.visit(ctx.condicion());
        const objAccion = this.visit(ctx.accion());
        let valorFuncion = objCondicion.propiedadIzq;

        let op = ".";
        let negate = "";
        
        if(objCondicion.valCondicion.izq === "valor")
        {
            switch(objCondicion.estCondicion.comparacion)
            {
                case null:
                    op = " === ";
                    break;
                case 1:
                    op = " > ";
                    break;
                case -1:
                    op = " < ";
                    break;
            }

            if(objCondicion.valCondicion.der === "true")
                negate = "!";

            valorFuncion = "valor";
        }

        const line1 = `const ${objCondicion.nomDispositivo} = { ${objCondicion.propiedad}, ${objAccion.funcionNom}: function() { this.${objCondicion.propiedadIzq} = ${objAccion.funcionSet} } };`;
        const line2 = `if (${objCondicion.nomDispositivo}${op}${negate}${objCondicion.valCondicion.izq}) ${objCondicion.nomDispositivo}.${objAccion.funcionNom}();`;

        console.log("\nTraducción a JavaScript:")
        console.log(line1 + "\n" + line2);
        console.log("");
    }

    visitCondicion(ctx) 
    {
        const nomDispositivo = ctx.nombre_dispositivo().getText();
        const estCondicion = this.visit(ctx.estado_condicion());
        const valCondicion = this.visit(ctx.valor_condicion());
        let derFinal;

        if(estCondicion.comparacion === null)
        {
            derFinal = valCondicion.der;
        }
        else
        {
            derFinal = valCondicion.der + estCondicion.comparacion;
        }

        const propiedad = `${valCondicion.izq}: ${derFinal}`;
        const propiedadIzq = valCondicion.izq;

        return ({
            propiedadIzq,
            propiedad,
            nomDispositivo,
            estCondicion,
            valCondicion
        });
    }
    visitEstado_condicion(ctx)
    {
        let comparacion;

        if(ctx.val.type === CondicionalParser.ES) 
        {
            comparacion = null;
        }
        else if(ctx.val.type === CondicionalParser.MAY)
        {
            comparacion = 1;
        }
        else
        {
            comparacion = -1;
        }

        return comparacion;
    }
    visitValor_condicion(ctx)
    {
        let izq;
        let der;
        
        if(ctx.val.type === CondicionalParser.ENTERO)
        {
            izq = "valor";
            der = Number(ctx.ENTERO().getText());
        }
        else
        {
            izq = "encendido";

            if(ctx.val.type === CondicionalParser.ENC)
            {
                der = "true";
            }
            else
            {
                der = "false";
            }
        }

        return ({
            izq,
            der
        });
    }
    
    visitAccion(ctx)
    {
        return this.visit(ctx.accion_simple());
    }
    visitActivate(ctx)
    {
        const funcionNom = "activar";
        const funcionSet = "true";

        return ({
            funcionNom,
            funcionSet
        });
    }
    visitDeactivate(ctx)
    {
        const funcionNom = "desactivar";
        const funcionSet = "false";

        return ({
            funcionNom,
            funcionSet
        });
    }
    visitAdjust(ctx)
    {
        const valObjetivo = ctx.ajustar().ENTERO().getText();

        const funcionNom = "ajustar";
        const funcionSet = valObjetivo;

        return ({
            funcionNom,
            funcionSet
        });
    }
}
