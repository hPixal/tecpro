import java.util.Vector;

public class Empresa {

  private String razonSocial;
  private IVA iva;
  private Vector<Cliente> clientes;
  private Vector<Factura> facturas;

  public Empresa(String razonSocial, IVA iva) {
    this.razonSocial = razonSocial;
    this.iva = iva;
    this.clientes = new Vector<Cliente>();
    this.facturas = new Vector<Factura>();
  }

  public Vector<Cliente> obtenerClientes() {
    return clientes;
  }

  public void anadirClientes(Cliente cliente) {
    this.clientes.add(cliente);
  }

  public String obtenerRazon(){
    return this.razonSocial;
  }

  public String obtenerIVA(){
    return iva.obtenerDescripcion();
  }

  public Vector<Factura> obtenerFacturas() {
    return facturas;
  }

  public void anadirFacturas(Factura factura) {
    this.facturas.add(factura);
  }

  public void mostrarFacturas() {
    for (Factura it : facturas) {
      System.out.println("Factura nro" + it.getNroFactura());
      System.out.println("Cliente: " + it.getCliente() + " "+  it.getIva() + " CUIT: " + it.getCuit());
      it.obtenerDetalles();  
    }
  }
}
