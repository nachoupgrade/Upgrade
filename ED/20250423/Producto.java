

/**
 * Class Producto
 */
public class Producto {

  //
  // Fields
  //

  private int idProducto;
  private String nombreProducto;
  private double precioProducto;
  
  //
  // Constructors
  //
  public Producto () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idProducto
   * @param newVar the new value of idProducto
   */
  public void setIdProducto (int newVar) {
    idProducto = newVar;
  }

  /**
   * Get the value of idProducto
   * @return the value of idProducto
   */
  public int getIdProducto () {
    return idProducto;
  }

  /**
   * Set the value of nombreProducto
   * @param newVar the new value of nombreProducto
   */
  public void setNombreProducto (String newVar) {
    nombreProducto = newVar;
  }

  /**
   * Get the value of nombreProducto
   * @return the value of nombreProducto
   */
  public String getNombreProducto () {
    return nombreProducto;
  }

  /**
   * Set the value of precioProducto
   * @param newVar the new value of precioProducto
   */
  public void setPrecioProducto (double newVar) {
    precioProducto = newVar;
  }

  /**
   * Get the value of precioProducto
   * @return the value of precioProducto
   */
  public double getPrecioProducto () {
    return precioProducto;
  }

  //
  // Other methods
  //

}
