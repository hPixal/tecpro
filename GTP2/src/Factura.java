import java.util.Vector;

public class Factura {

  public Integer NroFactura;
  public Calendar fecha;
  public Vector<Factura> mydetalleFactura;
  public Cliente myCliente;

  public Factura(
    Integer nroFactura,
    Calendar fecha,
    Cliente myCliente
  ) {
    NroFactura = nroFactura;
    this.fecha = fecha;
    this.myCliente = myCliente;
    this.mydetalleFactura = new Vector<Factura>();
  }



  public Float calcularTotal() {
    FLoat total = 0f;
    for(detalleFactura oDetalle : mydetalleFactura){
      total += mydetalleFactura.
    }
  }
}
