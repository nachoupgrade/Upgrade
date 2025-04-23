import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionAmigos {

    // Método para guardar una lista de amigos en un archivo
    public static void guardarListaAmigos(List<Amigo> amigos, String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(amigos);
        }
    }

    // Método para leer una lista de amigos desde un archivo
    @SuppressWarnings("unchecked")  // Suprimir el warning por el cast no verificado
    public static List<Amigo> leerListaAmigos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Amigo>) ois.readObject();  // Cast sin comprobación explícita
        }
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        try {
            // Crear una lista de amigos
            List<Amigo> listaAmigos = new ArrayList<>();
            listaAmigos.add(new Amigo("Juan", "Pérez", LocalDate.of(1990, 5, 15)));
            listaAmigos.add(new Amigo("María", "López", LocalDate.of(1985, 3, 25)));
            listaAmigos.add(new Amigo("Carlos", "Gómez", LocalDate.of(1992, 8, 10)));

            // Una nueva lista de amigos
            List<Amigo> listaAmigosSergio = new ArrayList<>();

            String rutaArchivo = "PRG\\20250423\\amigos.dat";
            // Guardar la lista de amigos en un archivo
            guardarListaAmigos(listaAmigos, rutaArchivo);
            System.out.println("Lista de amigos guardada correctamente.");

            // Leer la lista de amigos desde el archivo
            List<Amigo> amigosLeidos = leerListaAmigos(rutaArchivo);
            System.out.println("Lista de amigos leída desde el archivo: " + rutaArchivo);
            // Recorremos la lista con un for-each
            for (Amigo amigo : amigosLeidos) {
                listaAmigosSergio.add(amigo);
                System.out.println(amigo);
            }
            System.out.println("Lista de amigos de Sergio: " + listaAmigos);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
