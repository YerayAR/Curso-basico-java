package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 20; // Cambia este valor para probar
        if (edad >= 18) {
            System.out.println("El usuario puede votar.");
        } else {
            System.out.println("El usuario no puede votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numero = 0;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int numeroParImpar = 7; // Cambia este valor para probar
        if (numeroParImpar % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int numeroRango = 50; // Cambia este valor para probar
        if (numeroRango >= 1 && numeroRango <= 100) {   
            System.out.println("El número está en el rango de 1 a 100.");
        } else {
            System.out.println("El número no está en el rango de 1 a 100.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int diaSemana = 3; // Cambia este valor para probar
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido.");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 85; // Cambia este valor para probar
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edadCine = 16; // Cambia este valor para probar
        boolean acompañado = false; // Cambia este valor para probar

        if (edadCine >= 15 || acompañado) {
            System.out.println("Puedes entrar al cine.");
        } else {
            System.out.println("No puedes entrar al cine.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'a'; // Cambia este valor para probar
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra es una consonante.");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 5;
        int b = 10;
        int c = 3;
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        System.out.println("El mayor de los tres es: " + mayor);
    }
}
