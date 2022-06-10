import java.util.Calendar;
import java.util.Vector;

public class Factura {

  private Integer nroFactura;
  private Cliente cliente;
  private Calendar fecha;
  private Vector<DetalleFactura> detalles;

  public Factura(Integer nroFactura, Cliente cliente, Calendar fecha) {
    this.nroFactura = nroFactura;
    this.cliente = cliente;
    this.fecha = fecha;
    this.detalles = new Vector<DetalleFactura>();
  }

  public void anadirDetalles(DetalleFactura detalle) {
    this.detalles.add(detalle);
  }

  public Float obtenerTotal() {
    Float total = 0.f;
    for (DetalleFactura det : detalles) {
      total += det.obtenerTotal();
    }
    return total;
  }

  public Integer getNroFactura() {
    return nroFactura;
  }

  public Calendar getFecha() {
    return fecha;
  }

  public String getCliente() {
    return this.cliente.getNombre();
  }

  public String getIva() {
    return this.cliente.getIva();
  }

  public Integer getCuit() {
    return this.cliente.getCuit();
  }

  public void obtenerDetalles() {
    Integer count = 0;
    for (DetalleFactura det : this.detalles) {
      count++;
      System.out.println(
        "Detalle " +
        count +
        ": " +
        det.obtenerNombre() +
        " Unidades: " +
        det.obtenerUnidades() +
        " Total: " +
        det.obtenerTotal()
      );
    }
  }
}
