package basic.c02_operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma = 5 + 3;
        int resta = 5 - 3;
        int multiplicacion = 5 * 3;
        int division = 5 / 3;
        int modulo = 5 % 3;

        // 2. Crea una variable para cada tipo de operación de asignación.
        int a = 5;
        a += 3; // Suma
        a -= 2; // Resta
        a *= 4; // Multiplicación
        a /= 2; // División
        a %= 3; // Módulo

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(5 > 3);
        System.out.println(5 == 5);
        System.out.println(3 < 5);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(5 < 3);
        System.out.println(5 != 5);
        System.out.println(3 > 5);

        // 5. Utiliza el operador lógico and.
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // 6. Utiliza el operador lógico or.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // 7. Combina ambos operadores lógicos.
        System.out.println(true && (5 > 3));
        System.out.println(false || (5 < 3));

        // 8. Añade alguna negación.
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 > 3));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int b = 5;
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println((5 + 3) > 7 && (5 - 2) < 4);
    }
}
