import java.util.ArrayList;
import java.util.Collections;

public class OrdenarColeccion {

    public static void main(String[] args) {
        // Crear una lista de enteros
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(5);
        listaEnteros.add(3);
        listaEnteros.add(9);
        listaEnteros.add(1);

        // Duplicar la lista
        ArrayList<Integer> listaEnterosDuplicada = new ArrayList<Integer>(listaEnteros);

       // Muestro la lista desordenada
       System.out.println("Lista original (desordenada):\n" + listaEnteros);

        // Ordenar la lista de enteros
        Collections.sort(listaEnteros);

        // Muestro la lista ordenada
        System.out.println("\nLista original (ordenada):\n" + listaEnteros);

        
        // Muestro la lista duplicada (desordenada)
        System.out.println("\nLista duplicada (desordenada):\n" + listaEnterosDuplicada);
        
    }
}


