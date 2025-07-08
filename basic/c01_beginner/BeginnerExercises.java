package basic.c01_beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale Yeray.
        String nombre = "Yeray";
        System.out.println("¡Hola " + nombre + "!");
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 25;
        System.out.println("Edad: " + edad);

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.75;
        System.out.println("Altura: " + altura + " metros");

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean meGustaProgramar = true;
        System.out.println("¿Te gusta programar? " + meGustaProgramar);

        // 5. Declara una constante con tu email.
        final String EMAIL = "yeray@example.com";
        System.out.println("Email: " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'Y';
        System.out.println("Inicial: " + inicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Tenerife";
        System.out.println("Localidad: " + localidad);
        localidad = "La Laguna";
        System.out.println("Nueva localidad: " + localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 10;
        System.out.println("Suma de a y b: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de la variable a: " + ((Object)a).getClass().getSimpleName());
        System.out.println("Tipo de la variable b: " + ((Object)b).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int sinInicializar;
        sinInicializar = 42; // Asignación antes de imprimir
        System.out.println("Variable sin inicializar: " + sinInicializar);
    }
}
