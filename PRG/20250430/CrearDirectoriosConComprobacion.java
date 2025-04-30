import java.io.File;

public class CrearDirectoriosConComprobacion {
    public static void main(String[] args) {
        
        // Especificar rutas para crear directorios
        String directorio = "C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20240430\\miDirectorio";
        String varios = "/directorio1/directorio2/directorio3";

        File pruebaFichero = new File(directorio);

        // Crear un único directorio
        if ((pruebaFichero).mkdir()) {
            System.out.println("Directorio: " + directorio + " creado");
        } else {
            // Mostrar error con la ruta del padre (con getParent)
            System.out.println("No se encontró el directorio padre: " + pruebaFichero.getParent());
        }

        // Crear varios directorios anidados
        // directorio+varios equivale a la siguiente ruta:
        //"C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\miDirectorio\\directorio1\\directorio2\\directorio3";
        if ((new File(directorio+varios)).mkdir()) {
            System.out.println("Directorios: " + varios + " creados");
        } else {
            // Mostrar error con la ruta completa
            System.out.println("No se encontró el directorio padre en la ruta: " + directorio+varios);
        }

    }
}
