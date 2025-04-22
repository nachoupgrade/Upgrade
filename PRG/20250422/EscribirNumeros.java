import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirNumeros {
    public static void main(String[] args) {
        String fichero = "PRG\\20250422\\numeros.txt";

        try (PrintWriter pw = new PrintWriter(new File(fichero))) {
            for (int i = 1; i < 1000; i++) {
                pw.println(i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Problemas al abrir el fichero: " + e.getMessage());
        }
    }
}
