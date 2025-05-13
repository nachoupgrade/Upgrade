import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertarActor {

    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";

        // Usuario de la base de datos
        String usr = "root";

        // Contraseña del usuario
        String pwd = "";

        try (
            // Obtener la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);

            // Crear el statement
            Statement s = con.createStatement();
        ) {
            // Sentencia SQL para insertar un nuevo actor
            String sql = "INSERT INTO actor (nombreActor, nacionalidadActor, fechaNacimiento, salario) " +
                         "VALUES ('Nacho Muñoz', 1, '1986-12-08', 3200)";

            // Ejecutar la inserción
            s.executeUpdate(sql);


        } catch (SQLException e) {
            System.err.println("Error al insertar actor: " + e.getMessage());
        }
    }
}
