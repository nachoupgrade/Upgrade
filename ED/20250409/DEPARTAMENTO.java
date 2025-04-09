

/**
 * Class DEPARTAMENTO
 */
public class DEPARTAMENTO {

  //
  // Fields
  //

  private unsigned int identificador;
  private String nombre;
  
  //
  // Constructors
  //
  public DEPARTAMENTO () { };
  
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
  public void setIdentificador (unsigned int newVar) {
    identificador = newVar;
  }

  /**
   * Get the value of identificador
   * @return the value of identificador
   */
  public unsigned int getIdentificador () {
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

  //
  // Other methods
  //

}
