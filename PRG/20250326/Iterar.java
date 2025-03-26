import java.util.ArrayList;
import java.util.Iterator;

public class Iterar {

    public static void main(String[] args) {
        // Crear una lista
        ArrayList<String> miListaAlumnos = new ArrayList<String>();
        // Insertar 6 valores distintos en la lista
        miListaAlumnos.add("Jose");
        miListaAlumnos.add("Ana");
        miListaAlumnos.add("Lourdes");
        miListaAlumnos.add("Raúl");
        miListaAlumnos.add("Fidel");
        miListaAlumnos.add("Arantxa");

        // Iterar vía "Bucle Iterator"
        System.out.println("1. Iterator:");
        Iterator<String> miListaIterator = miListaAlumnos.iterator();
        while (miListaIterator.hasNext()) {
            System.out.println(miListaIterator.next());
        }
        // System.out.println(); // Con println() añade una línea vacía, igual que con \n


        // Iterar vía "bucle for"
        System.out.println("\n2. Bucle for:");
        for (int i = 0; i < miListaAlumnos.size(); i++) {
            System.out.println(miListaAlumnos.get(i));
        }

        // Iterar vía "bucle foreach"
        System.out.println("\n3. Bucle foreach:");
        for (String s : miListaAlumnos) {
            System.out.println(s);
        }

        // Iterar vía "Bucle While"
        System.out.println("\n4. Bucle While:");
        int i = 0;
        while (i < miListaAlumnos.size()) {
            System.out.println(miListaAlumnos.get(i));
            i++;
        }
    }
}


