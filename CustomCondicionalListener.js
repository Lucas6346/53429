import CondicionalListener from "./generated/CondicionalListener.js";

export class CustomCondicionalListener extends CondicionalListener 
{
    enterStat(ctx) 
    {
        console.log(`Se detectó una: ${ctx.constructor.name}`);
    }
}
