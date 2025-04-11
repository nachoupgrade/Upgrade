

/**
 * Class Sucursal
 */
public class Sucursal {

  //
  // Fields
  //

  private int identificador;
  private String nombre;
  private Domicilio domicilio;
  
  //
  // Constructors
  //
  public Sucursal () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of identificador
   * @param newVar the new value of identificador
   */
  public void setIdentificador (int newVar) {
    identificador = newVar;
  }

  /**
   * Get the value of identificador
   * @return the value of identificador
   */
  public int getIdentificador () {
    return identificador;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of domicilio
   * @param newVar the new value of domicilio
   */
  public void setDomicilio (Domicilio newVar) {
    domicilio = newVar;
  }

  /**
   * Get the value of domicilio
   * @return the value of domicilio
   */
  public Domicilio getDomicilio () {
    return domicilio;
  }

  //
  // Other methods
  //

}
