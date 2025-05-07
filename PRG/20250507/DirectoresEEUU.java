import java.sql.*;

public class DirectoresEEUU {
    public static void main(String[] args) {
        mostrarDirectoresEstadounidenses();
    }

    // Función que conecta con la base de datos e imprime directores estadounidenses
    public static void mostrarDirectoresEstadounidenses() {
        // Configuración de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        // Usuario de la base de datos
        String usr = "root";
        // Contraseña del usuario
        String pwd = "";

        try {
            // Establecer la conexión
            Connection con = DriverManager.getConnection(bdd, usr, pwd);

            // Crear el objeto Statement para ejecutar la consulta
            Statement stmt = con.createStatement();

            // Preparar la consulta SQL
            String consulta = "SELECT nombreDirector, edadDirector, nacionalidadDirector FROM Director WHERE nacionalidadDirector = 1";

            // Ejecutamos la consulta
            ResultSet rs = stmt.executeQuery(consulta);

            // Procesamos el resultado
            System.out.println("Directores estadounidenses: ");
            while (rs.next()) {
                String nombre = rs.getString("nombreDirector");
                int edad = rs.getInt("edadDirector");
                String nacionalidad = rs.getString("nacionalidadDirector");
                System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad);
            }

            // Cerrar la conexión
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos o ejecutar la consulta.");
            e.printStackTrace();
        }
    }
    
}
