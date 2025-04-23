import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerNumerosBinario {
    public static void main(String[] args) {
        String fichero = "PRG\\20250423\\numerosBinarios.dat";

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero))) {
            int x;
            int suma = 0;
            int suma2 = 0;

            for (int i = 1; i < 1000; i++) {
                // Leer entero
                x = in.readInt();

                // Mostrar entero por pantalla
                System.out.println(x);

                // Calcular suma
                suma += x;
                // Es equivalente a:
                suma2 = suma2 + x;
            }

            // Imprimir suma total
            System.out.println("Suma total: " + suma);
            System.out.println("Suma2 total: " + suma2);

        } catch (IOException e) {
            System.err.println("Problemas con el fichero: " + e.getMessage());
        }
    }
}
