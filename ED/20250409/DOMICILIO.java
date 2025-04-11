

/**
 * Class Domicilio
 */
public class Domicilio {

  //
  // Fields
  //

  private String direccion;
  private int codigo_postal;
  private String poblacion;
  private String provincia;
  
  //
  // Constructors
  //
  public Domicilio () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  /**
   * Set the value of codigo_postal
   * @param newVar the new value of codigo_postal
   */
  public void setCodigo_postal (int newVar) {
    codigo_postal = newVar;
  }

  /**
   * Get the value of codigo_postal
   * @return the value of codigo_postal
   */
  public int getCodigo_postal () {
    return codigo_postal;
  }

  /**
   * Set the value of poblacion
   * @param newVar the new value of poblacion
   */
  public void setPoblacion (String newVar) {
    poblacion = newVar;
  }

  /**
   * Get the value of poblacion
   * @return the value of poblacion
   */
  public String getPoblacion () {
    return poblacion;
  }

  /**
   * Set the value of provincia
   * @param newVar the new value of provincia
   */
  public void setProvincia (String newVar) {
    provincia = newVar;
  }

  /**
   * Get the value of provincia
   * @return the value of provincia
   */
  public String getProvincia () {
    return provincia;
  }

  //
  // Other methods
  //

}
