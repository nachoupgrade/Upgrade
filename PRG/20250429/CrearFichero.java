import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        // Crear un objeto File que representa un fichero llamado "fichero.txt"
        File fichero = new File("PRG\\20250429\\fichero.txt");

        // Intentar crear el fichero, y capturar errores si ocurren
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            System.err.println("Error al crear el fichero");
        }

    }
}
