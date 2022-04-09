public class Accesorio {

  private String nombre_del_producto;
  private Integer codigo_articulo;
  private Float precio_unitario;
  private Integer stock;

  public Accesorio(
    String nombre_del_producto,
    Integer codigo_articulo,
    Float precio_unitario,
    Integer stock
  ) {
    this.nombre_del_producto = nombre_del_producto;
    this.codigo_articulo = codigo_articulo;
    this.precio_unitario = precio_unitario;
    this.stock = stock;
  }

  public String getNombre_del_producto() {
    return nombre_del_producto;
  }

  public void setNombre_del_producto(String nombre_del_producto) {
    this.nombre_del_producto = nombre_del_producto;
  }

  public Integer getCodigo_articulo() {
    return codigo_articulo;
  }

  public void setCodigo_articulo(Integer codigo_articulo) {
    this.codigo_articulo = codigo_articulo;
  }

  public Integer getPrecio_unitario() {
    return precio_unitario;
  }

  public void setPrecio_unitario(Integer precio_unitario) {
    this.precio_unitario = precio_unitario;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }


}
