import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos {
    public static void main(String[] args) {
        String nombreArchivo = "PRG\\20250422\\datos.txt";

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = lector.readLine(); // Lee la primera línea
            if (linea != null) {
                System.out.println("Línea leída del archivo: " + linea);
            } else {
                System.out.println("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
