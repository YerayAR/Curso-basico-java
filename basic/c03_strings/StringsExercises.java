package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String str1 = "Hola";
        String str2 = "Mundo";
        String resultado = str1 + " " + str2;
        System.out.println(resultado);

        // 2. Muestra la longitud de una cadena de texto.
        String texto = "Java es genial";
        int longitud = texto.length();
        System.out.println("Longitud del texto: " + longitud);

        // 3. Muestra el primer y último carácter de un string.
        char primerCaracter = texto.charAt(0);
        char ultimoCaracter = texto.charAt(longitud - 1);
        System.out.println("Primer carácter: " + primerCaracter);
        System.out.println("Último carácter: " + ultimoCaracter);

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
        System.out.println("Texto en minúsculas: " + texto.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("¿Contiene 'Java'? " + texto.contains("Java"));
        System.out.println("¿Contiene 'Python'? " + texto.contains("Python"));  
        // 6. Formatea un string con un entero.
        int numero = 10;
        String textoFormateado = String.format("El número es: %d", numero);
        System.out.println(textoFormateado);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String textoConEspacios = "   Hola Mundo   ";
        String textoSinEspacios = textoConEspacios.trim();
        System.out.println("Texto sin espacios: '" + textoSinEspacios + "'");

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String textoConGuiones = textoConEspacios.replace(" ", "-");
        System.out.println("Texto con guiones: '" + textoConGuiones + "'");

        // 9. Comprueba si dos strings son iguales.
        String str3 = "Hola Mundo";
        String str4 = "Hola Mundo";
        System.out.println("¿Son iguales? " + str3.equals(str4));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("¿Tienen la misma longitud? " + (str3.length() == str4.length()));
    }
}
