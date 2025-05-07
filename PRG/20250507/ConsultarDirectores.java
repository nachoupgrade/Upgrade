import java.sql.*;

public class ConsultarDirectores {
    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";

        // Usuario de la base de datos con el que vamos a realizar el login
        String usr = "root";

        // Contraseña para ese usuario en esa base de datos
        String pwd = "";

        try {
            // Establece la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);

            // Creamos un objeto de tipo Statement a partir de la conexión
            Statement stmt = con.createStatement();

            // Ejecutar la consulta y obtener el resultado
            ResultSet rs = stmt.executeQuery("SELECT nombreDirector, edadDirector FROM Director");

            // Cerrar la conexión
            con.close();

        } catch (SQLException e) {
            // En caso de error, informar al usuario
            System.out.println("No se ha podido establecer la conexión con la BDD");
        }
    }
}

