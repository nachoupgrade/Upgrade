import java.sql.*;

public class InsertarDirector {
    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String usr = "root";
        String pwd = "";

        try {
            // Establecer la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);

            // Creamos la consulta parametrizada
            String sql = "INSERT INTO Director VALUES (?, ?, ?, ?, ?)";

            // Preparamos la sentencia
            PreparedStatement stmt = con.prepareStatement(sql);

            // Indicamos el primer parámetro de la consulta (nombre del director)
            stmt.setInt(1, 4);

            // Indicamos el primer parámetro de la consulta (nombre del director)
            stmt.setString(2, "Stephen Hillenburg");

            // Indicamos el segundo parámetro de la consulta (edadDirector)
            stmt.setInt(3, 59);

            // Indicamos el tercer parámetro de la consulta (nacionalidadDirector)
            stmt.setInt(4, 1);

            // Indicamos el cuarto parámetro de la consulta (salarioDirector)
            stmt.setInt(5, 0);

            // Ejecutamos la consulta
            int n = stmt.executeUpdate();

            // Mostramos el número de registros insertados
            System.out.println(n + " registros insertados.");

            // Cerramos la conexión
            con.close();

        } catch (Exception e) {
            // En caso de error, mostrar mensaje
            System.out.println("No se ha podido establecer la conexión con la BDD o ha habido algún error");
            e.printStackTrace();
        }
    }
}
