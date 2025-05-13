import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class GestionActores {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";

        try (Connection con = DriverManager.getConnection(connectionUrl, "root", "")) {

            Statement stmt = con.createStatement();

            // 1. Insertar un nuevo actor con nacionalidad errónea
            System.out.println("Insertando actor con nacionalidad errónea...");
            stmt.executeUpdate("INSERT INTO actor (nombreActor, fechaNacimiento, nacionalidadActor, salario) " +
                    "VALUES ('Carlos Pérez', '1985-07-15', 2, 2500)");

            // 2. Actualizar la nacionalidad del actor
            System.out.println("Corrigiendo la nacionalidad del actor...");
            stmt.executeUpdate("UPDATE actor SET nacionalidadActor = 1 " +
                    "WHERE nombreActor = 'Carlos Pérez' AND fechaNacimiento = '1985-07-15'");

            // 3. Insertar un actor con todos los datos incorrectos
            System.out.println("Insertando actor con todos los datos incorrectos...");
            stmt.executeUpdate("INSERT INTO actor (nombreActor, fechaNacimiento, nacionalidadActor, salario) " +
                    "VALUES ('Pedro', '1900-01-01', 2, -500)");

            // 4. Eliminar el último actor insertado
            System.out.println("Eliminando actor con datos incorrectos...");
            stmt.executeUpdate("DELETE FROM actor WHERE nombreActor = 'Pedro' AND fechaNacimiento = '1900-01-01'");

            System.out.println("Operaciones completadas.");

        } catch (SQLException e) {
            System.err.println("Error en la base de datos: " + e.getMessage());
        }
    }
}

