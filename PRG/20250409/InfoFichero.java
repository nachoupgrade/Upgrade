import java.io.File;
import java.util.Scanner;

public class InfoFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero: ");
        String ruta = scanner.nextLine();
        //String ruta = "PRG\\20250409\\fichero.txt";

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile()) {
            System.out.println("Nombre del fichero: " + fichero.getName());
            System.out.println("Directorio: " + fichero.getParent());
            System.out.println("Tamaño: " + fichero.length() + " Bytes");
            System.out.println("Tamaño: " + fichero.length()/1024 + " Kilobytes");
            System.out.println("Permisos:");
            System.out.println(" - Lectura: " + fichero.canRead());
            System.out.println(" - Escritura: " + fichero.canWrite());
            System.out.println(" - Ejecución: " + fichero.canExecute());
        } else {
            System.out.println("El fichero no existe.");
        }

        scanner.close();
    }
}
