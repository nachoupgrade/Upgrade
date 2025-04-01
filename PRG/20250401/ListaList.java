import java.util.ArrayList;

public class ListaList {
    public static void main(String[] args) {
        // Crear una lista de alumnos
        ArrayList<String> miListaAlumnos = new ArrayList<>();

        // Insertar alumnos
        miListaAlumnos.add("Jose");
        miListaAlumnos.add("Ana");
        miListaAlumnos.add("Lourdes");
        miListaAlumnos.add("Raúl");
        miListaAlumnos.add("Fidel");
        miListaAlumnos.add("Arantxa");

        // Eliminar un alumno
        if (miListaAlumnos.remove("Jose")) {
            System.out.println("Elemento eliminado correctamente");
        } else {
            System.out.println("NO existe el alumno a eliminar en el ArrayList");
        }

        // Comprobar si existe un alumno en la lista
        if (miListaAlumnos.contains("Ana")) {
            System.out.println("SÍ existe el alumno en el ArrayList");
        } else {
            System.out.println("NO existe el alumno en el ArrayList");
        }

        // Número de alumnos del ArrayList
        System.out.println("Número de alumnos: " + miListaAlumnos.size());
    }
}
