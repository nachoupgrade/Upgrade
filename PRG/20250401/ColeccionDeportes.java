import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColeccionDeportes  {

    public static void main(String[] args) {
        // Crear una colección de tipo ArrayList de Strings
        Collection<String> deportes = new ArrayList<String>();
        // Equivalente a:
        // Collection<String> deportes = new ArrayList<>();
        // Equivalente a:
        // ArrayList<String> deportes = new ArrayList<>();

        // add() - Añadir elementos
        deportes.add("Fútbol");
        deportes.add("Baloncesto");
        deportes.add("Tenis");
        deportes.add("Natación");
        deportes.add("Vóley");

        System.out.println("Colección inicial: " + deportes);

        // size() - Ver el tamaño
        System.out.println("Número de deportes: " + deportes.size());

        // contains() - Verificar si contiene un elemento
        System.out.println("¿La colección contiene 'Tenis'? " + deportes.contains("Tenis"));

        // remove() - Eliminar un elemento
        deportes.remove("Vóley");
        System.out.println("Después de eliminar Vóley: " + deportes);

        // isEmpty() - Ver si está vacía
        System.out.println("¿La colección está vacía? " + deportes.isEmpty());

        // iterator() - Recorrer con iterator
        System.out.print("Recorriendo con iterator: ");
        Iterator<String> it = deportes.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // clear() - Vaciar la colección
        deportes.clear();
        System.out.println("Después de clear(), colección vacía: " + deportes);

    }
}


