import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    public static void main(String[] args) {
        try {
            // Indicar el tipo y el lugar de la base de datos
            String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";

            // Usuario de la base de datos con el que vamos a realizar el login
            String usr = "root";

            // Contraseña para ese usuario en esa base de datos
            String pwd = "";

            // Establece la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);
            System.out.println("Conexión con la BDD realizada con éxito.");

            // Cerrar la conexión
            con.close();

        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la conexión con la BDD.");
            e.printStackTrace();
        }
    }
}
