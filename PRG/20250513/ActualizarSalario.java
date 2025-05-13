import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class ActualizarSalario {

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

            // Preparamos la consulta y la ejecutamos
            Statement s = con.createStatement();
        ) {
            s.executeUpdate("UPDATE actor SET salario = salario + 1000 WHERE nombreActor = 'Harrison Ford'");
            System.out.println("Salario actualizado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
