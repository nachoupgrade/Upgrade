import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class EleccionDelegado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declaramos las variables que usaremos en el diccionario
        String nombre = "";
        int votos;
        // Diccionario para guardar las votaciones
        TreeMap<String, Integer> votaciones = new TreeMap<String, Integer>();

        // Bucle infinito para introducir datos
        while(true) {
            // Pedimos el nombre del estudiante
            System.out.print("Introduce voto ('fin' para terminar): ");
            nombre = scan.nextLine();
            // Si hemos introducido 'fin', terminamos el bucle while (el programa sigue en ejecución)
            if (nombre.equals("fin")) {
                break;
            } else {
                // Si el estudiante ya había sido votado antes, sumamos un voto
                if (votaciones.containsKey(nombre)) {
                    votos = votaciones.get(nombre);
                    votaciones.put(nombre, votos + 1);
                } else {
                    votos = 1;
                    votaciones.put(nombre, votos);
                }
            }
        }

        // Imprimimos el resultado recorriendo el diccionario con un for-each (y entrySet)
        System.out.println("\nResultado con for-each:");
        for(Map.Entry<String,Integer> tupla : votaciones.entrySet()) {
            nombre = tupla.getKey();
            votos = tupla.getValue();
            System.out.println(nombre +": " + votos + " votos.");
        }

        // Imprimimos el resultado recorriendo el diccionario con un Iterator (y entrySet)
        System.out.println("\nResultado con Iterator:");         
        Set<Map.Entry<String,Integer>> set = votaciones.entrySet();
        Iterator<Map.Entry<String,Integer>> iterador = set.iterator();
        while (iterador.hasNext()) {
            Map.Entry<String,Integer> tupla2 = iterador.next();
            nombre = tupla2.getKey();
            votos = tupla2.getValue();
            System.out.println(nombre +": " + votos + " votos.");
        }

        // Cerramos el Scanner
        scan.close();
    }    
}
