import java.io.*;
public class EscrituraLecturaFicheroBinario {

    public static void main(String[] args) {
        String fichero = "PRG\\20250409\\binario.dat"; // Nombre del archivo binario

        try {
            // Abrir para escritura
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero));

            // Escritura de datos
            out.writeBoolean(true); // Escribe un booleano
            out.writeDouble(5.9);   // Escribe un double
            out.writeInt(10);       // Escribe un int

            // Cerrar ObjectOutputStream
            out.close();
            

            // Abrir para lectura
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero));
        
            // Lectura de datos
            boolean b = in.readBoolean(); // Lee un booleano
            double d = in.readDouble();   // Lee un double
            int i = in.readInt();         // Lee un int

            // Mostrar los valores leídos
            System.out.println("Boolean leído: " + b);
            System.out.println("Double leído: " + d);
            System.out.println("Int leído: " + i);

            // Cerrar ObjectInputStream
            in.close();

        } catch (IOException e) {
            System.err.println("Problemas con el fichero: " + e.getMessage());
        }
    }
}
