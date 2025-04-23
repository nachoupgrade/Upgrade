import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraYoutuber {
    public static void main(String[] args) {
        String[] youtubers = {"elrubiusOMG", "VEGETTA777", "AuronPlay", "Mikecrack"};
        int[] desdeCuando = {2011, 2008, 2006, 2015};
        double[] seguidores = {39.9, 32.4, 28.1, 25.0};

        try {
            // Se crea un flujo para escribir bytes en el archivo
            FileOutputStream fs = new FileOutputStream("PRG\\20250423\\youtubers.txt");

            // Se crea un flujo para escribir objetos en el archivo
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            // Se recorren los arrays para crear objetos Youtuber y escribirlos
            for (int i = 0; i < 4; i++) {
                Youtuber y = new Youtuber(youtubers[i], desdeCuando[i], seguidores[i]);
                oos.writeObject(y); // Se escribe el objeto en el archivo
            }

            // Se cierran los flujos de salida si no son null
            if (oos != null) {
                oos.close();
                fs.close();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Muestra errores de entrada/salida si ocurren
        }
    }
}

