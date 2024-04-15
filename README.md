# Intro Java

La Java virtual Machine(JVM) + Library classes. Se encuentra en el JRE(Java Runtime Evironment). Los que solo quieren utilizar Java utilizan esto.
Los que quieren programar en Java denecesitaran el JDK(Java Development Kit) => JRE + Dev Tools.

El codigo funete de un proggrama en Java tiene la extencion de programa.java, para poder compilar el archivo y pasarlo a bytecode se utiliza el comando ``javac nombredearchivo.java``.

Si todo esta bien este creara un nuevo archivo con la extencion .class  ``nombredearchivo.class``. para correr este programa se utilizara el comando ``java nombredearchivo`` el cual leera los archivos bytecode y los interpretara. 

# Java creando tu primera aplicacion

## __1- El primer programa en Java__

### Para saber más: IntelliJ IDEA - Tips

Existen numerosas funcionalidades que podemos utilizar en IntelliJ IDEA para nuestro trabajo diario, lo cual aumenta la productividad en proyectos Java. Para complementar tus estudios, he separado un artículo que muestra las facilidades que IntelliJ nos brinda al declarar variables, estructuras de control de flujo e incluso en las propias estructuras de código.

Echa un vistazo a estos artículos [ IntelliJ IDEA para principiantes | Alura Cursos Online](https://www.aluracursos.com/blog/intellij-idea-para-principiantes)

[IntelliJ IDEA: consejos y trucos para usar en la vida cotidiana | Alura Cursos Online](https://www.aluracursos.com/blog/intellij-idea-consejos-trucos-vida-cotidiana)

### Para saber más: Bytecode y JVM

JVM (Java Virtual Machine) es una herramienta muy importante en el mundo de Java, ya que permite que una aplicación se ejecute en múltiples sistemas operativos distintos. Para complementar tus estudios, he separado un artículo y un video que muestra más detalles sobre el proceso de compilación y ejecución de una aplicación Java a través de JVM.

¿Vamos a echarle un vistazo?

[Paso a paso con la Máquina Virtual de Java (JVM) | Alura Cursos Online](https://www.aluracursos.com/blog/paso-a-paso-jvm)

[La magia detrás de Java #aluramás - YouTube](https://www.youtube.com/watch?v=GrEO8nZzyZM)

### Lo que aprendimos

En esta aula, aprendiste:

Cómo configurar el entorno de desarrollo, instalando JDK 17 y el IDE IntelliJ.
Las diferencias entre JVM, JRE y JDK:
JVM (Java Virtual Machine): es la Máquina Virtual de Java responsable de ejecutar el bytecode.
JRE (Java Runtime Environment): es el Entorno de Ejecución de Java que proporciona las bibliotecas estándar de Java para que el JDK compile tu código y para que JVM ejecute tu programa.
JDK (Java Development Kit): es el Kit de Desarrollo de Java responsable de compilar el código fuente en bytecode.
Cómo hacer el clásico "¡Hola, mundo!" en Java y ejecutar tu primer programa en IntelliJ.


------------------------------------------------------------------------------------------------------------------------------------------

## __2-Construyendo el catalogo de peliculas__

### Para saber más: operadores

En Java, tenemos varios tipos de operadores para manejar los datos con los que estamos trabajando en nuestra aplicación. Aquí detallaré algunos de ellos que ya mencioné en los videos:

Operadores de asignación:

Los operadores de asignación se utilizan para asignar un valor a una variable. El operador de asignación básico es "`=`" (signo igual). Por ejemplo:

`int valor =  5;  //Atribuye el valor 5 a la variable valor `

También existen operadores de asignación combinados, que son una forma abreviada de asignación. Por ejemplo, el operador `+=` agrega un valor a una variable existente. Así:

```
    int valor =  10; 
    valor += 15;  //Equivalente al valor = valor + 15, atribuye el valor 15 a la variable valor
```

Operadores aritméticos:

Los operadores aritméticos se utilizan para realizar operaciones matemáticas básicas. Estos son:

* "+" (adición)
* "-" (sustracción)
* "*" (multiplicación)
* "/" (división)
* "%" (módulo, resto de la división)

Por ejemplo:
```
int a = 10 + 5; // Atribuye el valor 15 a la variable a
int b = 10 - 5; // Atribuye el valor 5 a la variable b
int c = 10 * 5; // Atribuye el valor 50 a la variable c
int d = 10 / 5; // Atribuye el valor 2 a la variable d
int e = 10 % 3; // Atribuye el valor 1 a la variable ya que (el resto de la divición de 10 por 3 es 1)
```

Operadores relacionales:

Los operadores relacionales se utilizan para comparar valores. Devuelven un valor booleano (verdadero o falso). Trabajaremos más con ellos cuando lleguemos a la lección de condicionales, donde modificaremos el flujo de la aplicación en función de una condición. Estos son:

* "==" (igual a)
* "!=" (diferente de)
* ">" (mayor que)
* ">=" (mayor o igual que)
* "<" (menor que)
* "<=" (menor o igual que)

Ejemplo:
```
int a = 10; // Atribui o valor 10 à variável a
int b = 5; // Atribui o valor 5 à variável b
int c = 30; // Atribui o valor 30 à variável c

boolean igual = (b == a); //En este caso la variable igual quedará con valor *false, pues el el valor de b no es igual al valor de a.

boolean diferente = (b != c); //La variable diferente quedará con el valor de *true*, pues el valor de b es diferente del valor de c.
boolean mayor= (b > a); //la variable mayor quedará con el valor *false*, pues el valor de b es menor que el valor de a.

boolean menorIgual = (b <= c); //La variable menor igual quedará con el valor de *true*, pues el valor de b es menor que el valor de c.
```

Operadores lógicos:

Estos operadores se utilizan cuando queremos verificar dos o más condiciones y/o expresiones en una aplicación. Comparan valores booleanos y también devuelven un resultado booleano.

Existen tres operadores: AND (&&), OR (||) y NOT (!).

El operador AND (&&), también conocido como "y" en español, se utiliza para verificar si dos condiciones son verdaderas. Si ambas condiciones son verdaderas, el resultado será verdadero. De lo contrario, el resultado será falso.

Aquí tienes un ejemplo:
```
boolean a = true;
boolean b = false;
if (a && b) {
   // Este código no será ejecutado, ya que a es verdadero y b es falso
}
```

El operador OR (||), conocido como "o" en español, se utiliza para verificar si al menos una de las condiciones es verdadera. Si al menos una de las condiciones es verdadera, el resultado será verdadero. De lo contrario, el resultado será falso.

Aquí tienes un ejemplo:
```
boolean a = true;
boolean b = false;
if (a || b) {
   //Este código será ejecutado, ya que a es verdadero aunque b sea falso 
}
```

El operador NOT (!) se utiliza para negar una condición. Si la condición es verdadera, el resultado será falso. Si la condición es falsa, el resultado será verdadero.

Aquí tienes un ejemplo:
```
boolean a = true;
if (!a) {
   // Este código no será ejecutado, ya que a es verdadero
}
```
Operadores de incremento

Además de los operadores mencionados anteriormente, el operador de incremento se utiliza para aumentar el valor de una variable en 1. Hay dos tipos de operadores de incremento: el operador de pre-incremento (++variable) y el operador de post-incremento (variable++).

El operador de pre-incremento (++variable) aumenta el valor de la variable en 1 antes de utilizarla en una expresión.

Aquí tienes un ejemplo:
```
int num = 5;
int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
System.out.println(num); // imprime 6
System.out.println(resultado); // imprime 6
```
Por otro lado, el operador de post-incremento (variable++) aumenta el valor de la variable en 1 después de usarla en una expresión.

Aquí tienes un ejemplo:

* int num = 5;
* int resultado = num++; //num es atribuido primero a la variable resultado y depués es incrementado para 6
* System.out.println(num); // imprime 6
* System.out.println(resultado); // imprime 5

### Para saber más: convenciones de código

La convención de código de Java es un conjunto de reglas recomendadas para escribir código Java que sea fácil de leer, entender y mantener. Estas reglas han sido definidas por Oracle, la empresa que mantiene el lenguaje Java, y son ampliamente seguidas por la comunidad de desarrolladores de Java.

Aquí tienes algunas de las principales convenciones de código de Java:

Los nombres de las clases deben comenzar con una letra mayúscula y seguir la convención PascalCase (también conocida como Upper CamelCase).

Ejemplo: `MiClase`.

Los nombres de los métodos deben comenzar con una letra minúscula y seguir la convención camelCase.

Ejemplo: `miMetodo()`.

Los nombres de las constantes deben estar completamente en mayúsculas y separados por guiones bajos.

Ejemplo: `MI_CONSTANTE`.

Los nombres de las variables deben comenzar con una letra minúscula y seguir la convención camelCase.

Ejemplo: `miVariable`.

Cada línea de código debe tener un ancho máximo de 80 caracteres para facilitar la lectura.

Se recomienda utilizar espacios en blanco para separar operadores, palabras clave y elementos de control de flujo.

Ejemplo:` if (condicion) {`.

Utiliza comentarios para documentar tu código, explicando qué hace y por qué lo hace. Los comentarios deben ser claros y concisos.

Es importante destacar que el punto anterior, referente a los comentarios, es polémico, ya que muchos desarrolladores consideran que un buen código debe ser autoexplicativo. Si utilizas nombres intuitivos y descriptivos para tus variables y métodos, será más claro entender qué sucede en el código, lo que puede prescindir del uso de comentarios.

Estas son solo algunas de las convenciones de código más comunes en Java. Seguir estas reglas puede hacer que tu código sea más fácil de leer y entender, lo que puede ahorrarte tiempo y esfuerzo a largo plazo.

Es importante recordar que las convenciones de código son solo recomendaciones, no reglas obligatorias. Sin embargo, seguir estas convenciones puede ayudar a crear un estándar consistente en todo tu código Java y facilitar su compartición y colaboración con otros desarrolladores.

### Para saber más: tipos primitivos

En Java, al igual que en la mayoría de los lenguajes de programación, existen los tipos primitivos, que son los tipos de datos más básicos y fundamentales del lenguaje. Se utilizan para representar valores simples y están definidos por el propio lenguaje.

Java tiene ocho tipos primitivos diferentes: boolean, byte, char, short, int, long, float y double. Cada uno de estos tipos tiene sus propias características y rango de valores permitidos, como se describe a continuación.

__boolean__:

El tipo boolean se utiliza para representar valores lógicos y puede tener solo dos valores: true o false. Se utiliza en expresiones condicionales, bucles y otros casos en los que se desea evaluar si una determinada condición es verdadera o falsa.

__byte__:

El tipo byte se utiliza para representar valores numéricos enteros de 8 bits. Tiene un rango de valores de -128 a 127.

__char__:

El tipo char se utiliza para representar caracteres individuales. Puede almacenar cualquier carácter Unicode y se representa con comillas simples ('').

__short__:

El tipo short se utiliza para representar valores numéricos enteros de 16 bits. Tiene un rango de valores de -32.768 a 32.767.

__int__:

El tipo int se utiliza para representar valores numéricos enteros de 32 bits. Es uno de los tipos de datos más utilizados para representar números enteros en Java y tiene un rango de valores de -2.147.483.648 a 2.147.483.647.

__long__:

El tipo long se utiliza para representar valores numéricos enteros de 64 bits. Se utiliza para representar valores enteros muy grandes y tiene un rango de valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

__float__:

El tipo float se utiliza para representar valores numéricos de punto flotante, es decir, valores con decimales. Ocupa 32 bits de memoria. Puede representar números decimales con hasta siete dígitos y tiene una precisión limitada, lo que significa que puede redondear los números si son demasiado grandes o demasiado pequeños.

__double__:

El tipo double es similar al float, pero ocupa 64 bits de memoria y puede representar números decimales con hasta quince dígitos.

### Para saber más: comentarios en el código fuente

Al escribir código en Java, es importante que tu código sea legible y comprensible para otras personas, además de para ti mismo en el futuro. Una de las formas de lograr esto es mediante el uso de comentarios en el código, ya que ayudan a explicar qué está haciendo tu código y por qué se escribió de esa manera.

¿Cómo funcionan los comentarios en Java?

El compilador de Java ignora todas las secciones de comentarios en el código, por lo que no afectan el funcionamiento del programa. Hay dos formas principales de escribir comentarios en Java:

Comentarios de una sola línea: Son comentarios que aparecen en una sola línea y comienzan con dos barras diagonales "//". El compilador de Java ignora todo el texto que aparece después de las dos barras hasta el final de la línea.

Ejemplo:

`// Este es un comentario de una sola línea que será ignorado por el compilador`

Comentarios de varias líneas: Estos comentarios pueden abarcar varias líneas y se delimitan por "/" y "/". El compilador de Java ignora todo el texto que aparece entre estos dos símbolos.

Ejemplo:
```
/* Este es un ejemplo de comentario
de varias líneas en Java
que será ignorado por el compilador */
```
¿Son importantes los comentarios?

Los comentarios son importantes porque ayudan a que el código sea más legible y comprensible para otras personas que necesiten leer y mantener el código. Esto es especialmente importante cuando varias personas trabajan en el mismo proyecto. Los comentarios claros y concisos ayudan a explicar qué está haciendo el código, por qué se escribió de esa manera y cómo funciona.

### Para saber más: strings y text blocks
PRÓXIMA ACTIVIDAD

En Java, la clase String es una de las más importantes y utilizadas. Es responsable de representar una secuencia de caracteres, es decir, un texto.

Creación de Strings

Para crear una String en Java, simplemente se utiliza comillas dobles para delimitar el texto. Por ejemplo:
```
String nombre = "Alura";
```
En este ejemplo, la variable "nombre" recibe una String con el texto "Alura". Es posible concatenar dos o más Strings utilizando el operador +, por ejemplo:
```
String saludo = "Hola, ";
String nombre = "Alura";
String mensaje = saludo + nombre + "!";
```
En este caso, la variable "mensaje" recibirá la cadena "¡Hola, Alura!".

Comparación de Strings

En Java, es posible comparar dos Strings utilizando el operador ==. Sin embargo, este operador solo verifica si las dos variables apuntan al mismo objeto en la memoria, no si el contenido de las Strings es igual. Para comparar el contenido de dos Strings, es necesario utilizar el método equals(). Por ejemplo:
```
String contrasena= "12345";
if (contrasena.equals("12345")) {
    System.out.println("Acceso autorizado!");
} else {
    System.out.println("Contraseña incorrecta.");
}
```
En este caso, el método equals() se utiliza para comparar el contenido de la variable "contrasena" con la cadena "12345". Si las dos cadenas son iguales, se imprimirá el mensaje "¡Acceso autorizado!", de lo contrario, se imprimirá el mensaje "Contraseña incorrecta".

Más adelante, también trabajaremos con el método `equalsIgnoreCase()`, que se utiliza para que la comparación de Strings no distinga entre mayúsculas y minúsculas. Utilizando solo equals, las cadenas "alura" y "Alura" se considerarían diferentes.

Bloque de texto

Introducido en la versión 15 de Java, el bloque de texto (Text Block) es una nueva forma de representar cadenas que facilita la escritura de textos con múltiples líneas. En lugar de utilizar comillas dobles para delimitar el texto e insertar saltos de línea manualmente o utilizar concatenaciones, es posible utilizar una sintaxis más sencilla que permite insertar el texto exactamente como es.

Sintaxis del bloque de texto

Para crear un bloque de texto en Java, simplemente se utilizan tres comillas dobles para delimitar el texto, seguidas de un salto de línea. Por ejemplo:
```
String mensaje = """
                  Hola, mundo!
                  Este es un Text Block.
                  El permite escribir textos com múltiples lineas sin necesitar usar caracteres de escape o saltos de linea manualmente o concatenaciones.
                  """;
```
En este ejemplo, la variable "mensaje" recibe un bloque de texto (Text Block) con el texto "¡Hola mundo! Este es un bloque de texto. Permite escribir textos con varias líneas sin necesidad de usar caracteres de escape o saltos de línea manualmente o concatenaciones".

### Para saber más: formato de textos

En Java, es posible formatear textos y números de diversas maneras. Esto puede ser útil en diferentes situaciones, como al mostrar valores al usuario de una forma más legible.

Una de las formas más comunes de formatear textos en Java es utilizando el método format() de la clase String. Este método permite formatear un texto utilizando marcadores de posición (placeholders), que se representan con el carácter % seguido de una letra que indica el tipo de dato que se insertará en el marcador de posición. Por ejemplo, %s indica que se insertará una cadena en el marcador de posición, %d indica un valor entero y %f indica un valor decimal.

Veamos un ejemplo:
```
String nombre = "Maria";
int edad = 30;
double valor = 55.9999;
System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));
```
En este ejemplo, los valores de las variables "nombre", "edad" y "valor" se pasan como parámetros al método String.format, reemplazando los marcadores de posición %s, %d y %.2f, respectivamente. El resultado impreso será "Mi nombre es María, tengo 30 años y hoy gasté 55.99 dolares". Observa también que el marcador de posición %.2f indica que el valor debe ser formateado con dos decimales.

Este ejemplo de String.format también se puede usar con un bloque de texto (Text Block), donde se utiliza el método que mencioné en clase, formatted, para indicar las variables que se deben utilizar en lugar de los marcadores de posición.

Aquí tienes un ejemplo:
```
String nombre = “Juan”;
int aulas = 4;

String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre, aulas);

System.out.println(mensaje);
```
El resultado impreso en la consola será:

Hola, Juan! Bienvenido al curso de Java.

Tendremos 4 aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje.


### Para saber más: Casting

El casting es un recurso utilizado en Java para convertir un tipo de dato en otro. Esta conversión puede ser realizada de forma automática por el compilador (conversión implícita) cuando el tipo de dato de destino es compatible con el tipo de dato de origen, o de forma manual (conversión explícita) utilizando el operador de casting.

El casting se utiliza para permitir que tipos de datos incompatibles puedan ser utilizados en la misma operación o expresión. Por ejemplo, si un método espera un parámetro del tipo int y se desea pasar un valor del tipo double, es necesario hacer un casting para convertir el valor en int.

Casting implícito

El casting implícito se realiza automáticamente por el compilador cuando el tipo de dato de origen es compatible con el tipo de dato de destino. Por ejemplo, es posible asignar un valor de tipo int a una variable de tipo double, ya que el tipo double es más grande y puede almacenar todos los valores que el tipo int puede contener:
```
int x = 10;
double y = x; // casting implícito
```
Casting explícito

El casting explícito se realiza cuando el tipo de dato de origen es incompatible con el tipo de dato de destino. En este caso, debemos utilizar el operador de casting para realizar la conversión:
```
double x = 10.5;
int y = (int) x; // casting explícito
```
En el ejemplo anterior, el valor de la variable x se convierte en un valor entero utilizando el casting explícito. Es importante tener en cuenta que, en este caso, la parte decimal será truncada y el valor asignado a la variable y será 10.

A continuación, se muestra una tabla donde puedes ver más fácilmente las conversiones que son implícitas y las que requieren ser realizadas de forma explícita.

|PARA: |byte  |short    |char   |int      |long     |  float  |  double |
|----  |----  |---------|-------|---------|---------|---------|---------|
|DE:   |      |         |       |         |         |         |         |
|byte  |---   |Implicito|(char) |Implicito|Implicito|Implicito|Implicito|
|short |(byte)|---------|(char) |Implicito|Implicito|Implicito|Implicito|
|char  |(byte)|(short)  |------ |Implicito|Implicito|Implicito|Implicito|
|int   |(byte)|(short)  |(char) |---------|Implicito|Implicito|Implicito|
|long  |(byte)|(short)  |(char) |(int)    |---------|Implicito|Implicito|
|float |(byte)|(short)  |(char) |(int)    |(long)   |---------|Implicito|
|double|(byte)|(short)  |(char) |(int)    |(long)   |(float)  |---------|


### Lo que aprendimos

* Cómo trabajar con variables: un recurso utilizado para almacenar valores en la memoria.
* Sobre los tipos primitivos:
* Enteros (byte, short, int, long).
* Punto flotante (double y float).
* Char: que contiene un solo carácter.
* Boolean: que puede tener dos valores, true y false.
* Cómo representar textos en Java utilizando la clase String.
* Cómo realizar casting de valores para resolver situaciones de tipos incompatibles al realizar cálculos o asignaciones de variables.


## __3-Controlando el flujo de aplicaciones__

### Para saber más: Switch Case

Una alternativa al if/else es el switch case, que es una estructura de control de flujo que permite ejecutar diferentes acciones basadas en el valor de una expresión. Es una forma más simplificada y legible de escribir varios bloques if/else encadenados.

La sintaxis del switch case en Java es la siguiente:
```
switch (expresion) {
  case valor1:
    // código a ejecutar si la expresión es igual a valor1
    break;
  case valor2:
    // código a ejecutar si la expresión es igual a valor2
    break;
  // otros casos posibles...
  default:
    // código a ejecutar si ninguno de los casos anteriores se cumple
} 
```
La ‘expresion’ es una variable o una expresión de código que se evaluará. Cada caso es una posible condición que puede cumplirse según la expresión. Cuando la expresión es igual al valor especificado en un caso determinado, se ejecutará el código correspondiente a ese caso. La palabra clave break se utiliza para salir del switch case después de la ejecución del código correspondiente.

El caso default es opcional y se ejecuta cuando ninguno de los casos especificados se cumple.

Aquí tienes un ejemplo sencillo de uso del switch case en Java para verificar el día de la semana según un número entero:
```
int dia = 3;
switch (dia) {
  case 1:
    System.out.println("El día 1 es lunes");
    break;
  case 2:
    System.out.println("El día 2 es martes");
    break;
  case 3:
    System.out.println("El día 3 es miércoles");
    break;
  // otros casos posibles...
  default:
    System.out.println("Día no válido");
}
```
En este ejemplo, la expresión es la variable ‘dia’, que contiene el valor 3. El switch case verifica el valor de la variable ‘dia’ y ejecuta el código correspondiente al caso en el que ‘dia’ es igual a 3. El resultado será la impresión en la consola: "El día 3 es miércoles".

Ventajas del switch case:

En resumen, el switch case hace que el código sea más fácil de entender y más legible en comparación con el if/else, especialmente cuando hay varias condiciones posibles.

### Para saber más: Clase Scanner

La clase Scanner de Java se utiliza para leer datos de entrada en un programa Java. Estos datos pueden ser leídos desde varias fuentes de entrada, como archivos, flujos de entrada, cadenas e incluso la entrada del usuario a través del teclado, como vimos en la clase.

Proporciona una serie de métodos para leer datos de diferentes tipos, como enteros, números de punto flotante, cadenas y caracteres.

Para utilizar la clase Scanner, primero debes importarla al comienzo de tu programa. Probablemente, al incluirla en el código, el IDE sugiera automáticamente la importación. El import quedará como se muestra a continuación:
```
import java.util.Scanner;
```
Aquí tienes un ejemplo básico de cómo utilizar la clase Scanner para leer diferentes datos:
```
public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}
```
En este ejemplo, primero importamos la clase Scanner y luego creamos una instancia de ella pasando el objeto ‘System.in’ como parámetro para indicar que queremos leer la entrada del usuario desde el teclado.

Luego, utilizamos el método ‘nextLine()’ para leer una línea de texto. Además de eso, también utilizamos ‘nextInt()’ para leer un número entero y ‘nextDouble()’ para leer un número decimal.

Puedes encontrar la lista completa de métodos en la [documentación oficial de Java](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html).


### Lo que aprendimos

En esta clase has aprendido:

Configurar una aplicación para que elija entre ejecutar una acción u otra basada en algún elemento.
Realizar comparaciones para las condicionales: igual, diferente, mayor, menor.
Utilizar la lectura del teclado con la clase Scanner.
Trabajar con alternativas para las condicionales y elegir la más adecuada para el caso.
Utilizar estructuras de repetición con for y while.
¡Has adquirido conocimientos importantes sobre el manejo de condicionales y estructuras de repetición en Java!

## __4-Consolidando conocimientos__

### Desafío: construyendo una nueva aplicación

¿Hola, todo bien? Entonces, ¿te gustó el contenido presentado en el curso?

En esta clase me gustaría proponerte un nuevo reto para que consolides tus conocimientos y utilices la mayor parte de los conceptos y recursos vistos a lo largo del curso. El lenguaje de programación Java es muy poderoso y versátil y se usa en muchas aplicaciones del mundo real, desde juegos hasta aplicaciones comerciales.

La propuesta es crear una nueva aplicación, diferente a ScreenMatch, para que tengas la oportunidad de practicar y profundizar tu comprensión de los conceptos fundamentales de Java.

### Lo que aprendimos

En esta aula aprendiste:

Aplicar tus conocimientos en una aplicación de un sistema bancario, utilizando conceptos de variables, condicionales, bucles y lectura de datos en java junto con lógica de programación.
