import java.io.File;

public class VaciarDirectorio {
    public static void main(String[] args) {
       
       // Crear objeto File para acceder al directorio "src"
        File directorio = new File("C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\miDirectorio");

        // Obtener la lista de ficheros dentro del directorio
        File[] ficheros = directorio.listFiles();
        System.out.println("Número de ficheros y directorios encontrados: " + ficheros.length);

        // Recorrer todos los ficheros encontrados
        for (int i = 0; i < ficheros.length; i++) {
            // Si el archivo no es un directorio, se elimina
            System.out.println("isDirectory: " + ficheros[i].isDirectory());
            if (!ficheros[i].isDirectory()) {
                ficheros[i].delete();
            }
        }
    }
}
