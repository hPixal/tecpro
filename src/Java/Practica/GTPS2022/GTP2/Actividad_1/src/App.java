import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        IVA iva = new IVA("Monotributo");
        Cliente cliente = new Cliente("Nahuel",304356,iva);
        Producto producto = new Producto("Mamposteria",400f);
        DetalleFactura detalle = new DetalleFactura(producto,40);
        Factura factura = new Factura(3040,cliente,Calendar.getInstance());
        factura.anadirDetalles(detalle);
        Empresa empresa = new Empresa("aaaaaa",iva);
        empresa.anadirFacturas(factura);
        empresa.anadirClientes(cliente);
        empresa.mostrarFacturas();
    }
}
