import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ConsultarCodificacionFichero {
    public static void main(String[] args) {
        FileInputStream fichero;
        try {
            // Elegimos fichero para leer flujos de bytes
            String ruta_relativa = "PRG\\20250409\\fichero.txt";            
            //String ruta_absoluta = "C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250409\\fichero.txt";
            fichero = new FileInputStream(ruta_relativa);

            // InputStreamReader sirve de puente de flujos de byte a caracteres
            InputStreamReader unReader = new InputStreamReader(fichero);

            // Vemos la codificación actual
            System.out.println(unReader.getEncoding());

        } catch (FileNotFoundException ex) {
            System.err.println("El fichero NO existe!");
        }
    }
}
