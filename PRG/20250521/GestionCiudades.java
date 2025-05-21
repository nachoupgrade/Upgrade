import java.util.ArrayList;
import java.util.Scanner;

public class GestionCiudades {

    public static void main(String[] args) {
        ArrayList<String> listaCiudades = new ArrayList<>();  // Creamos la lista para almacenar las ciudades
        Scanner scanner = new Scanner(System.in);  // Creamos un scanner para capturar el teclado
        int opcion;

        do {
            // Mostramos el menú de opciones
            System.out.println("\n MENÚ DE GESTIÓN DE CIUDADES");
            System.out.println("1. Agregar ciudad");
            System.out.println("2. Mostrar todas las ciudades");
            System.out.println("3. Buscar ciudad");
            System.out.println("4. Eliminar ciudad");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            // Si el usuario no mete un entero, mostramos error
            while(!scanner.hasNextInt()) {
                System.out.println("Error. Tienes que introducir un número.");
                scanner.next();
            }

            opcion = scanner.nextInt(); // Guardamos el entero en la variable opcion
            scanner.nextLine(); // Limpiamos el buffer

            switch (opcion) {
                case 1:
                    //  Agregar ciudad
                    System.out.print("Introduce el nombre de la ciudad a guardar: ");
                    String ciudadParaGuardar = scanner.nextLine().trim();
                    if (listaCiudades.contains(ciudadParaGuardar)) {
                        System.out.println(" La ciudad ya existe en la lista.");
                    } else {
                        listaCiudades.add(ciudadParaGuardar);
                        System.out.println(" Ciudad guardada correctamente.");
                    }
                    break;
                case 2:
                    // Mostrar todas las ciudades
                    if (listaCiudades.isEmpty()) {
                        System.out.println(" La lista de ciudades está vacía.");
                    } else {
                        System.out.println(" Ciudades almacenadas: ");
                        for (String ciudad : listaCiudades) {
                            System.out.println("- " + ciudad);
                        }
                    }
                    break;
                case 3:
                    // Buscar ciudad
                    System.out.print(" Escribe el nombre de la ciudad a buscar: ");
                    String ciudadABuscar = scanner.nextLine().trim();
                    if (listaCiudades.contains(ciudadABuscar)) {
                        System.out.println(" La ciudad '" + ciudadABuscar + "' está en la lista.");
                    } else {
                        System.out.println(" La ciudad '" + ciudadABuscar + "' no está en la lista.");
                    }
                    break;
                case 4:
                    // Eliminar ciudad
                    System.out.print(" Escribe el nombre de la ciudad a eliminar: ");
                    String ciudadAEliminar = scanner.nextLine().trim();
                    if (listaCiudades.remove(ciudadAEliminar)) {
                        System.out.println(" Ciudad eliminada correctamente.");
                    } else {
                        System.out.println(" No se pudo eliminar la ciudad, porque no está en la lista.");
                    }
                    break;
                case 5:
                    // Salir
                    System.out.println(" Fin del programa.");
                    break;
                default:
                    System.out.println(" Opción inválida. Introduce un número correcto.");
            }

        } while (opcion != 5); // Si el usuario introduce un 5, terminamos el bucle (y el programa)

        scanner.close();
    }  

}
