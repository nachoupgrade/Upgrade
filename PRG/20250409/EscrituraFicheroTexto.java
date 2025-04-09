import java.io.*;

public class EscrituraFicheroTexto {
    public static void main(String[] args) throws IOException {
        // Crea un FileWriter que sobrescribe el contenido del archivo "fichero2.txt"
        FileWriter escritorArchivo = new FileWriter("PRG\\20250409\\ficheroEscritura.txt"); 
        escritorArchivo.write("Estoy escribiendo desde el programa.");
        // Cierra el FileWriter para guardar los cambios y liberar recursos
        escritorArchivo.close(); 
    }
}
