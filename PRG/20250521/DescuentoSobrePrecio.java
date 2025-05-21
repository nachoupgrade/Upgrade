public class DescuentoSobrePrecio {
    // Atributos (o variables de la clase)
    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    // Constructor que inicializa los atributos
    public DescuentoSobrePrecio(String nombreProductoIntroducido, double precioOriginalIntroducido, double descuentoIntroducido) {
        this.nombreProducto = nombreProductoIntroducido;
        this.precioOriginal = precioOriginalIntroducido;
        this.descuento = descuentoIntroducido;
    }

    // Resto de métodos (funciones de la clase)
    // Este método calcula el precio final con descuento
    public double precioFinalConDescuento() {
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        return precioFinal; // Este NO redondea (salen todos los decimales)
        //return Math.round(precioFinal * 100.0) / 100.0; // Este redondea a 2 decimales
    }

    // Este método muestra todos los detalles de un producto (nombre, precio, descuento y precio final con descuento)
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio original: " + precioOriginal + " euros");
        System.out.println("Descuento: " + descuento + " %");

        // Opción 1:
        //double precioFinal = precioFinalConDescuento(); // Llamamos al método precioFinalConDescuento() para calcularlo
        //System.out.println("Precio final con descuento: " + precioFinal + " euros");

        // Opción 2:
        System.out.println("Precio final con descuento: " + precioFinalConDescuento() + " euros");
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Creamos dos objetos DescuentoSobrePrecio.
        DescuentoSobrePrecio producto1 = new DescuentoSobrePrecio("Teclado de ordenador", 150, 33);        
        DescuentoSobrePrecio producto2 = new DescuentoSobrePrecio("Teclado de ordenador", 350.99, 19.6362733);

        // Llamamos al método mostrarDetalles() para cada uno de los objetos
        producto1.mostrarDetalles();
        System.out.println();
        producto2.mostrarDetalles();
    }

}
