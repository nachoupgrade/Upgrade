import java.io.*;
import java.time.LocalDate;

public class Amigo implements Serializable {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private transient int edad;

    // Constructor
    public Amigo(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = getEdad(); // Calculamos la edad
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = getEdad();
    }

    // Método para calcular la edad
    public int getEdad() {
        LocalDate hoy = LocalDate.now();
        return hoy.getYear() - fechaNacimiento.getYear();
    }

    // Método toString para representar el objeto
    @Override
    public String toString() {
        return "Amigo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad + " años" +
                '}';
    }
}
