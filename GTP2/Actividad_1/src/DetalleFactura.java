public class DetalleFactura {

  private Producto producto;
  private Integer unidades;
  private Float total;

  public DetalleFactura(Producto producto, Integer unidades) {
    this.producto = producto;
    this.unidades = unidades;
    total = producto.obtenerPrecio() * unidades;
  }

  public String obtenerNombre() {
    return this.producto.obtenerNombre();
  }

  public Integer obtenerUnidades() {
      return this.unidades;
  }

  public Float obtenerTotal() {
    return total;
  }
}
