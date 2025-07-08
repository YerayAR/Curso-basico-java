package basic.c00_helloworld;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu Yeray en lugar de "¡Hola Mundo!".
        System.out.println("¡Hola Yeray!");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // Esta línea imprime un saludo personalizado en la consola.
        // Esta línea imprime "Hola" y "Mundo" en líneas separadas.

        // 4. Crea un comentario en varias líneas.
        /*
         * Este es un comentario de varias líneas.
         * Aquí puedes explicar más sobre el programa,
         * como su propósito o cómo funciona.
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 25");
        System.out.println("Color favorito: Azul");
        System.out.println("Ciudad: Madrid");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        // Aquí puedes explorar otros métodos de impresión, como System.err.println() para errores.
        System.err.println("Este es un mensaje de error de ejemplo.");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Este es un mensaje impreso en varias líneas.");
        System.out.println("Cada línea se imprime por separado.");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  ^   ^ ");
        System.out.println("  (o o)");
        System.out.println("    _");
        System.out.println("   \\_/ ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // Si intentas ejecutar el programa sin el método main, obtendrás un error de compilación
        // porque Java requiere un método main para iniciar la ejecución del programa.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // Si cambias el nombre del archivo a uno diferente del de la clase, obtendrás un error de compilación

    }
}