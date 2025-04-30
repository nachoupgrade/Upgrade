import java.io.File;
import java.io.IOException;

public class CrearFicheroRutaAbsoluta {
    public static void main(String[] args) {
        // Crear un objeto File que representa un fichero llamado "fichero.txt"
        File fichero = new File("PRG\\20250430\\ficheroRutaAbsoluta.txt");

        // Intentar crear el fichero, y capturar errores si ocurren
        try {
            fichero.createNewFile();
            System.err.println("Fichero creado en la ruta absoluta: " + fichero.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error al crear el fichero");
        }

    }
}
