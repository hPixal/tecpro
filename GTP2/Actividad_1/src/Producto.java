public class Producto {
    private String nombre;
    private Float precio;

    public Producto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void cambiarPrecio(Float precio){
        this.precio = precio;
    }

    public Float obtenerPrecio() {
        return precio;
    }
}
