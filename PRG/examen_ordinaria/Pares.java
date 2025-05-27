import java.util.ArrayList;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();

        System.out.println("Introduce 5 números enteros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        System.out.println("\nNúmeros pares almacenados:");
        System.out.println(pares);

        scanner.close();
    }
}