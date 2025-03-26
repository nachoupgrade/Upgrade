import java.util.ArrayList;
import java.util.Iterator;

public class IterarRemove {

    public static void main(String[] args) {
        // Crear una lista
        ArrayList<String> miListaAlumnos = new ArrayList<String>();
        // Insertar 6 valores distintos en la lista
        miListaAlumnos.add("Jose");
        miListaAlumnos.add("Ana");
        miListaAlumnos.add("Lourdes");
        miListaAlumnos.add("Raúl");
        miListaAlumnos.add("Ernesto");
        miListaAlumnos.add("Fidel");
        miListaAlumnos.add("Arantxa");

        // Iterar vía "Bucle Iterator"
        Iterator<String> miListaIterator1 = miListaAlumnos.iterator();
        System.out.println("1. Antes de borrar (Iterator1):");
        while (miListaIterator1.hasNext()) {
            String nombre = miListaIterator1.next();
            System.out.println(nombre);
            if (nombre.equals("Ernesto")) {
                miListaIterator1.remove();
            }
        }

        // Iterar vía "Iterator2"
        Iterator<String> miListaIterator2 = miListaAlumnos.iterator();
        System.out.println("\n2. Después de borrar (Iterator2):");
        while (miListaIterator2.hasNext()) {
            System.out.println(miListaIterator2.next());
        }

        // Iterar vía "bucle foreach"
        System.out.println("\n2. Después de borrar (bucle foreach):");
        for (String s : miListaAlumnos) {
            System.out.println(s);
        }

    }
}


