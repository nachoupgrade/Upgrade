import java.io.Serializable;

public class Youtuber implements Serializable {
    private String nombre;
    private int añoCanal;
    private transient double seguidores;

    public Youtuber(String nombre, int añoCanal, double seguidores) {
        this.nombre = nombre;
        this.añoCanal = añoCanal;
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "Youtuber [nombre=" + nombre + ", añoCanal=" + añoCanal +
               ", seguidores=" + seguidores + "]";
    }
}

