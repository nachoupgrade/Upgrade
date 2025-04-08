import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Queue<String> colaAnimales = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar nuevo animal");
            System.out.println("2. Atender siguiente animal");
            System.out.println("3. Ver próximo animal a atender");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre del animal: ");
                    String nombre = scanner.nextLine();
                    colaAnimales.add(nombre);
                    System.out.println(nombre + " ha sido añadido a la cola.\n");
                    break;
                case 2:
                    if (colaAnimales.isEmpty()) {
                        System.out.println("No hay animales en la cola\n");
                    } else {
                        String siguienteAnimal = colaAnimales.poll();
                        System.out.println("Atendiendo a: " + siguienteAnimal + "\n");
                    }
                    break;
                case 3:
                    if (colaAnimales.isEmpty()) {
                        System.out.println("No hay animales en la cola\n");
                    } else {
                        String siguienteAnimal = colaAnimales.peek();
                        System.out.println("El próximo animal a atender es: " + siguienteAnimal + "\n");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.\n");

            }
        }
    }
}
