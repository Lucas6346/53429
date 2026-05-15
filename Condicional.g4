grammar Condicional;

//Gramatica
programa: regla* EOF;

regla: CUANDO condicion ENTONCES accion SEM;

condicion: nombre_dispositivo estado_condicion valor_condicion;

accion: accion_simple;

nombre_dispositivo: ID;

estado_condicion
    : val = ES          
    | val = (MAY|MEN)   
    ;

valor_condicion
    : val = estado      
    | val = ENTERO      
    ;

estado
    : ENC
    | APA
    ;

accion_simple
    : activar           #activate
    | desactivar        #deactivate
    | ajustar           #adjust
    ;

activar: ACT nombre_dispositivo;
desactivar: DES nombre_dispositivo;
ajustar: AJU nombre_dispositivo A ENTERO;

//Lexemas
CUANDO: 'cuando' ;
ENTONCES: 'entonces' ;
A: 'a' ;
SEM: ';' ;
ACT: 'activar';
DES: 'desactivar';
AJU: 'ajustar';
ES: 'es';
MAY: 'mayor que';
MEN: 'menor que';
ENC: 'encendido';
APA: 'apagado';
ID: [a-zA-Z] [a-zA-Z_0-9]*;
ENTERO: [0-9]+;
WS: [ \t\r\n]+ -> skip;
