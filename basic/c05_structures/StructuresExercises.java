package basic.c05_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

/*
Clase 4 - Listas, Sets y Mapas (31/04/2025)
Vídeo: https://www.twitch.tv/videos/2447254597
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        Integer[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Longitud del Array: " + numeros.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor antes de modificar: " + numeros[2]);
        numeros[2] = 10;
        System.out.println("Valor después de modificar: " + numeros[2]);

        // 3. Crea un ArrayList vacío.
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Longitud del ArrayList: " + lista.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        System.out.println("Longitud del ArrayList después de añadir elementos: " + lista.size());
        lista.remove(2);
        System.out.println("Longitud del ArrayList después de eliminar un elemento: " + lista.size());

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        System.out.println("Tamaño del HashSet: " + conjunto.size());
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        conjunto.add(2);
        conjunto.add(3);
        System.out.println("Tamaño del HashSet después de añadir elementos: " + conjunto.size());

        // 7. Elimina uno de los elementos del HashSet.
        conjunto.remove(1);
        System.out.println("Tamaño del HashSet después de eliminar un elemento: " + conjunto.size());

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> contactos = new HashMap<>();
        contactos.put("Alice", "123-456-7890");
        contactos.put("Bob", "987-654-3210");
        contactos.put("Charlie", "555-555-5555");

        // 9. Modifica uno de los contactos y elimina otro.
        contactos.put("Alice", "111-111-1111");
        contactos.remove("Bob");

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer num : hashSet) {
            hashMap.put(num, num);
        }
    }
}
