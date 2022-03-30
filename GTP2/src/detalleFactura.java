import java.util.Vector;

public class detalleFactura {

  public Integer unidades;

  public Integer precioUnitario;

  public Producto myProducto;
  public Vector mydetalleFactura;

  public detalleFactura(Integer unidades, Integer precioUnitario, Producto myProducto, Vector mydetalleFactura) {
    this.unidades = unidades;
    this.precioUnitario = precioUnitario;
    this.myProducto = myProducto;
    this.mydetalleFactura = mydetalleFactura;
  }

  
  public Float CalcularTotal() {
    Float facturacion = 0f;
    for(Factura oFactura: myFacturas){

    }
  }
}
