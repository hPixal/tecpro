public class Cliente {
    private String nombre;
    private Integer cuit;
    private IVA iva;

    public Cliente(String nombre, Integer cuit, IVA iva) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCuit() {
        return cuit;
    }

    public String getIva() {
        return iva.obtenerDescripcion();
    }
}
