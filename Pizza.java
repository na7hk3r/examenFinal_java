import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String nombre;
    private String descripcion;
    private double precioBase;
    private boolean esEspecial;

    public Pizza(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return esEspecial ? precioBase * 1.7 : precioBase;
    }
}
