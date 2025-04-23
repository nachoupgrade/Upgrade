import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CasoPractico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número:");
        int n = sc.nextInt();

        String fichero = "PRG\\20250423\\casoPractico_3.txt";

        try {
            PrintWriter pw = new PrintWriter(new File(fichero));

            for (int i = 1; i <= n; i++) {
                pw.println(i * n);
            }

            pw.close();

            System.out.println("Archivo creado correctamente: " + fichero);
        } catch (FileNotFoundException e) {
            System.err.println("Problemas al abrir el fichero: " + e.getMessage());
        }
    }
}
