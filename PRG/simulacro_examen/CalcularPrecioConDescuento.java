package PRG.simulacro_examen;

class DescuentoSobrePrecio {
    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    public DescuentoSobrePrecio(String nombreProducto, double precioOriginal, double descuento) {
        this.nombreProducto = nombreProducto;
        this.precioOriginal = precioOriginal;
        this.descuento = descuento;
    }

    public double precioFinalConDescuento() {
        return precioOriginal - (precioOriginal * descuento / 100);
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio original: " + precioOriginal + " €");
        System.out.println("Descuento: " + descuento + " %");
        System.out.println("Precio final con descuento: " + precioFinalConDescuento() + " €");
    }
}

// Clase principal
public class CalcularPrecioConDescuento {
    public static void main(String[] args) {
        DescuentoSobrePrecio producto = new DescuentoSobrePrecio("Teclado", 50.0, 20.0);
        producto.mostrarDetalles();
    }
}