import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirNumerosBinario {
    public static void main(String[] args) {
        String fichero = "PRG\\20250423\\numerosBinarios.dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))) {
            for (int i = 1; i < 1000; i++) {
                out.writeInt(i);
            }
        } catch (IOException e) {
            System.err.println("Problemas con el fichero." + e.getMessage());
        }
    }
}
