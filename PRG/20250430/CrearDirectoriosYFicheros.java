import java.io.File;
import java.io.IOException;

public class CrearDirectoriosYFicheros {
    public static void main(String[] args) {
        
        // Especificar rutas para crear directorios
        String directorio = "C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\carpeta1";
        String varios = "/carpeta2/carpeta3";

        // Crear un único directorio
        if ((new File(directorio)).mkdir()) {
            System.out.println("Directorio: " + directorio + " creado");
        }

        // Crear varios directorios anidados
        if ((new File(directorio+varios)).mkdirs()) {
            System.out.println("Directorios: " + varios + " creados");
        }

        // Todo lo anterior es equivalente a esto:
        /*String rutaCompleta = "C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\carpeta1\\carpeta2\\carpeta3";
        if ((new File(rutaCompleta)).mkdirs()) {
            System.out.println("Directorios: " + rutaCompleta + " creados");
        }*/


        // Crear los objetos File que representan a los ficheros"
        File fichero1 = new File("C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\carpeta1\\fichero1.txt");
        File fichero2 = new File("C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\carpeta1\\carpeta2\\fichero2.txt");
        File fichero3 = new File("C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\carpeta1\\carpeta2\\carpeta3\\fichero3.txt");

        // Intentar crear los ficheros, y capturar errores si ocurren
        try {
            fichero1.createNewFile();
            fichero2.createNewFile();
            fichero3.createNewFile();
        } catch (IOException e) {
            System.err.println("Error al crear los ficheros");
        }

    }
}
