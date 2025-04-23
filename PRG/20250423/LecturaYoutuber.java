import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaYoutuber {
    public static void main(String[] args) {
        // Lectura del fichero
        try {
            File f = new File("PRG\\20250423\\youtubers.txt");
            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                // Para forzar EOFException
                while (true) {
                    Youtuber y = (Youtuber) ois.readObject();
                    // Al mostrar el valor de un objeto, se llama automáticamente al método "toString()"
                    System.out.println(y);
                }
            } else {
                System.out.println("El fichero no existe");
            }
        } catch (EOFException e) {
            System.out.println("Se alcanzó el final.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error, el tipo de objeto no es compatible.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
