import java.io.File;

public class EliminarFichero {
    public static void main(String[] args) {
        // Crear un objeto File que representa un fichero llamado "fichero.txt"
        File fichero = new File("PRG\\20250429\\fichero.txt");

        // Si el fichero existe, se borra
        if (fichero.exists()) {
            fichero.delete();
        }

    }
}

