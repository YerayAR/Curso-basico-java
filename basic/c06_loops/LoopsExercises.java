package basic.c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
Clase 5 - Bucles y funciones (06/05/2025)
Vídeo: https://www.twitch.tv/videos/2452053839
*/

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        int j = 0;
        do {
            System.out.println(lista.get(j));
            j++;
        } while (j < lista.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int k = 1; k <= 50; k++) {
            if (k % 5 == 0) {
                System.out.println(k);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int k = 0; k < numeros.length; k++) {
            System.out.println(numeros[k]);
        }
        // 6. Usa for-each para recorrer un ArrayList y mostrar sus valores.
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap, Crealos.
        // Creación de un HashSet y un HashMap
        HashSet<String> conjunto = new HashSet<>(); 
        conjunto.add("Elemento A");
        conjunto.add("Elemento B"); 
        conjunto.add("Elemento C");
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Clave 1", 100);
        mapa.put("Clave 2", 200);
        mapa.put("Clave 3", 300);
        // Recorrido del HashSet
        for (String elemento : conjunto) {
            System.out.println("Conjunto: " + elemento);
        }
        // Recorrido del HashMap
        for (String clave : mapa.keySet()) {
            System.out.println("Mapa - Clave: " + clave + ", Valor: " + mapa.get(clave));
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int k = 10; k >= 1; k--) {
            System.out.println(k);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int k = 1; k <= 20; k++) {
            if (k % 3 == 0) {
                continue; // Salta los múltiplos de 3
            }
            System.out.println(k);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numerosNegativos = {1, 2, -3, 4, 5};
        for (int numero : numerosNegativos) {
            if (numero < 0) {
                break; // Detiene el bucle al encontrar un número negativo
            }
            System.out.println(numero);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 5; // Cambia este valor para calcular el factorial de otro número
        int factorial = 1;
        for (int k = 1; k <= numero; k++) {
            factorial *= k;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
