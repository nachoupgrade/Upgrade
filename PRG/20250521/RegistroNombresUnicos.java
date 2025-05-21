import java.util.ArrayList;
import java.util.Scanner;

public class RegistroNombresUnicos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Indicamos al scanner que vamos a meter datos por teclado
        ArrayList<String> listaNombres = new ArrayList<>(); // Lista para almacenar nombres sin duplicar

        boolean continuar = true;  // Declaramos un booleano para usarlo en la condición del bucle
        while (continuar) {
            System.out.print("Introduce nombres (escribe 'fin' para terminar): "); // Muestra el mensaje y NO salta de línea
            String nombre = scan.nextLine().trim(); // El trim es para eliminar espacios

            if (nombre.equalsIgnoreCase("fin")) { // Si el usuario escribe "fin", sin importar mayúsculas, se termina el bucle
                continuar = false;
            }

            // Verificar si el nombre introducido ya está en la lista, para evitar duplicados
            if (!listaNombres.contains(nombre)) {  // Si el nombre no está dentro de la lista...
                listaNombres.add(nombre);  // ...añade el nombre a la lista
            } else {
                System.out.println("Ese nombre ya está en la lista."); // Opcional: Avisar al usuario que el nombre ya está en la lista.
            }
            
        }

        // Mostrar al usuario todos los nombres que hay en la lista
        System.out.println("\nLista de nombres sin duplicados: ");
        for (String nombreLista : listaNombres) {  // Recorremos la lista
            System.out.println("- " + nombreLista);  // Imprime cada nombre con un guión delante
        }

        scan.close(); // Cerramos el scanner para liberar recursos de memoria

    }
}
