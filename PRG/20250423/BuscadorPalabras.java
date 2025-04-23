import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuscadorPalabras {
    public static void main(String[] args) {
        // Creamos un objeto scanner para leer de teclado (System.in)
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la palabra a buscar: ");
        String palabraBuscada = sc.nextLine();

        String rutaFichero = "PRG\\20250423\\palabrasParaBuscar.txt";

        // Creamos un objeto scanner para leer de un fichero (File)
        try (Scanner lectorFichero = new Scanner(new File(rutaFichero))) {
            // Guardamos el número de línea para mostrarlo luego
            int numeroLinea = 1;
            
            // Mientras haya líneas en el fichero, las recorremos
            while (lectorFichero.hasNextLine()) {
                // Guardar siguiente línea
                String linea = lectorFichero.nextLine();

                // Búsqueda de la palabra que haya introducido el usuario
                if (linea.contains(palabraBuscada)) {
                    System.out.println("Línea: " + numeroLinea + ": " + linea);
                }

                // Incrementamos el número de línea
                numeroLinea++;
            }
        
        } catch (FileNotFoundException excepcion) {
            System.err.println("No se encontró el fichero: " + excepcion.getMessage());
        }
        sc.close();
    }
}
