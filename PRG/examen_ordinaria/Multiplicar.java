import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir número entero
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // 2. Solicitar rango mínimo y máximo
        System.out.print("Introduce el rango mínimo: ");
        int minimo = scanner.nextInt();

        System.out.print("Introduce el rango máximo: ");
        int maximo = scanner.nextInt();

        // 3. Verificar que el rango es válido
        if (maximo <= minimo) {
            System.out.println("Error: El rango máximo debe ser mayor que el mínimo.");
        } else {
            // 4. Mostrar la tabla de multiplicar en el rango especificado
            for (int i = minimo; i <= maximo; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}
