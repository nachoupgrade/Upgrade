import java.sql.*;

public class ListarDirectores {
    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";

        // Usuario de la base de datos
        String usr = "root";

        // Contraseña del usuario
        String pwd = "";

        try {
            // Establece la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);

            // Ejecuta la consulta
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombreDirector, edadDirector FROM Director");

            // Mientras haya registros que leer...
            while (rs.next()) {
                // Obtener el valor del campo nombre del registro actual
                String nombre = rs.getString("nombreDirector");

                // Obtener el valor del campo edad del registro actual
                int edad = rs.getInt("edadDirector");

                // Imprimir la información por pantalla
                System.out.println("Director: " + nombre + " - " + edad + " años.");
            }

            // Cerrar la conexión
            con.close();

        } catch (SQLException e) {
            // Informar si hay error al establecer la conexión
            System.out.println("No se ha podido establecer la conexión con la BDD.");
            e.printStackTrace();
        }
    }
}

