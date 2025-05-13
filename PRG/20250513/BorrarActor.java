import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class BorrarActor {

    public static void main(String[] args) {
        // URL de conexión a la base de datos
        String connectionUrl = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";

        try (
            // Establecer conexión con la base de datos
            Connection con = DriverManager.getConnection(connectionUrl, "root", "");
            // Crear el statement
            Statement s = con.createStatement();
        ) {
            // Ejecutar la sentencia DELETE
            int numReg = s.executeUpdate("DELETE FROM actor WHERE nombreActor = 'Nacho Muñoz'");

            // Informar al usuario
            System.out.println("Se borró " + numReg + " registro(s).");

        } catch (SQLException e) {
            System.err.println("Error al borrar el actor: " + e.getMessage());
        }
    }
}
