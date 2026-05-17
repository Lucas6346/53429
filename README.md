# Analizador Sintáctico 
## Consigna
El analizador sintáctico está construido en base al tema **25914_9**.
Corresponde a la siguiente gramática EBNF:

<img width="1440" height="489" alt="image" src="https://github.com/user-attachments/assets/f1c42398-a7ef-4f15-9b04-ca75fc0a7c74" />

El analizador realiza las siguientes tareas:
1. **Análisis léxico y sintáctico:** Realiza análisis léxico y sintáctico sobre el código fuente e informa si la entrada es correcta o contiene errores. En caso de errores, indica la línea en la que ocurren y la causa del problema.
2. **Tabla de lexemas-tokens:** Genera una tabla que contiene los lexemas y sus respectivos tokens reconocidos durante el análisis léxico.
3. **Árbol de análisis sintáctico:** Construye y muestra el árbol de análisis sintáctico concreto de la entrada en formato de texto.
4. **Interpretación:** Traduce el código fuente a JavaScript y lo ejecuta como un intérprete básico.
## Instrucciones de Uso
1. Clonar el repositorio con el siguiente comando en la terminal o usando otro método:
```
git clone https://github.com/Lucas6346/53429.git
```
2. En el proyecto hay 4 archivos de texto:

<img width="191" height="110" alt="image" src="https://github.com/user-attachments/assets/9bffe298-adbe-4c46-a42f-6092007a0d3f" />

Cada archivo contiene una cadena de entrada para copiar en `input.txt`. En total hay 2 cadenas válidas y 2 cadenas inválidas **(2 para cada caso)**. Para introducir una de las cadenas de entrada de los ejemplos, copiar el texto del archivo txt de ejemplo y pegarlo en `input.txt`, luego guarde con `ctrl+S`. También se puede escribir una cadena cualquiera a mano. 

<img width="600" height="114" alt="image" src="https://github.com/user-attachments/assets/049ea184-b21e-4e7e-8dd3-ecf8859637cf" />

La gramática reconoce varias cadenas a la vez, pero si una de ellas es errónea, no va a mostrar tabla, árbol ni interpretación, muestra la lista de errores.

3. Para ejecutar el analizador, en la terminal use:
```
node index.js
```
## Ejemplo de Funcionamiento
Usando como ejemplo la cadena mostrada en la imagen anterior, una vez ejecutado el programa, la terminal muestra lo siguiente:
```
==== Cadena ingresada ====
cuando horno es encendido entonces desactivar horno;
---------------------------

Entrada válida.
Verificando tokens generados por lexer...

==== Tabla de Tokens y Lexemas ====
--------------------------------------------------------------
| Lexema                     | Token                         |
--------------------------------------------------------------
| cuando                     | CUANDO                        |
| horno                      | ID                            |
| es                         | ES                            |
| encendido                  | ENC                           |
| entonces                   | ENTONCES                      |
| desactivar                 | DES                           |
| horno                      | ID                            |
| ;                          | SEM                           |
--------------------------------------------------------------

==== Árbol sintáctico ====
(programa (regla cuando (condicion (nombre_dispositivo horno) (estado_condicion es) (valor_condicion (estado encendido))) entonces (accion (accion_simple (desactivar desactivar (nombre_dispositivo horno)))) ;) <EOF>)

==== Traducción a JavaScript ====
const horno = { encendido: true, desactivar: function() { this.encendido = false } };
if (horno.encendido === true) horno.desactivar();
```
## Aclaraciones
Fui a una clase de consulta de la Profesora Naveda para preguntarle sobre posibles cadenas confusas que puede reconocer la gramática. La profesora me indicó que yo aclare algunas restricciones a la hora de ingresar las entradas para evitar generar cadenas confusas. Cuando uno quiera escribir en `input.txt`, es mejor tener en cuenta lo siguiente:

La estructura de las entradas que corresponden a la gramática se puede ver como la siguiente: 
```
"cuando" <dispositivo> <condicion> <estado/número> "entonces" <accion> <dispositivo>;
```
Sabiendo esto, tenga en cuenta lo siguiente:

1. Ambos `<dispositivo>` deben ser iguales. Por ejemplo, evite entradas como: `cuando router es encendido entonces desactivar ventilador;`
2. Cuando se evalúa un número, úsese la función ajustar. Por ejemplo: `cuando temperatura mayor que 40 entonces ajustar temperatura a 36;`
3. Cuando se evalúa un estado, úsese la función activar o desactivar. Por ejemplo: `cuando lampara es apagado entonces activar lampara;`
4. Cuando la condición es distinta a "es" (es decir, mayor que/menor que), evalúese un número, no un estado. Por ejemplo, evite entradas como: `cuando precio menor que encendido entonces desactivar precio;`

Todas estas cadenas de ejemplo mostradas son válidas para el analizador, pero a la hora de traducirlas a JavaScript el resultado de algunas es confuso.
