import java.io.File;
import java.io.FilenameFilter;

public class FiltrarYEliminarFicherosTxt {
    public static void main(String[] args) {

        // Crear un filtro para aceptar solo archivos que terminen en ".txt"
        FilenameFilter filtro = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        // Crear objeto File que representa el directorio "miDirectorio" (src en las transparencias)
        File directorio = new File("C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\miDirectorio");

        // Obtener los archivos que cumplen el filtro (solo .txt)
        File[] ficheros = directorio.listFiles(filtro);

        // Recorrer todos los archivos encontrados
        for (int i = 0; i < ficheros.length; i++) {
            System.out.println("Fichero: " + ficheros[i]);

            // Si el archivo no es un directorio y además acaba en .txt, se elimina
            if (!ficheros[i].isDirectory()) {
                ficheros[i].delete();
            }
        }
    }
}
