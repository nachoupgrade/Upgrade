import java.sql.*;

public class ActualizarSalarioContador {
    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String usr = "root";
        String pwd = "";

        try {
            // Establecer la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);

            // Preparamos la consulta y la ejecutamos
            Statement s = con.createStatement();
            int filasActualizadas = s.executeUpdate("UPDATE actor SET salario = salario + 1000 WHERE salario < 3000");

            // Informamos al usuario del número de actores que han recibido una subida de sueldo
            System.out.println("Número de actores que han recibido una subida de sueldo: " + filasActualizadas);

            // Cerramos la conexión a la base de datos.
            con.close();

        } catch (Exception e) {
            // En caso de error, mostrar mensaje
            System.out.println("No se ha podido establecer la conexión con la BDD o ha habido algún error");
            e.printStackTrace();
        }
    }
}
