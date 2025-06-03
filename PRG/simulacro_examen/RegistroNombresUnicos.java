package PRG.simulacro_examen;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroNombresUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            // Evita agregar duplicados
            if (!nombres.contains(nombre)) {
                nombres.add(nombre);
            }
        }

        System.out.println("\nLista de nombres sin duplicados:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        scanner.close();
    }
}