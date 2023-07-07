import java.util.Calendar;

public class App {

  public static void main(String[] args) throws Exception {
    Pais argentina = new Pais("Argentina", 0);
    Dueno dueno = new Dueno("nombre", "apellido", 3234);
    Auto autito = new Auto("marca", 34, 13000f, 0f, argentina);
    Auto autito2 = new Auto("marca", 34, 15000f, 0f, argentina);
    autito.anadirDueno(dueno);

    Accesorio accesorio = new Accesorio("alfombra",31,40.f,31);

    DetalleDeVenta detven = new DetalleDeVenta(autito);
    detven.anadirAccesorio(accesorio);
    DetalleDeVenta detven2 = new DetalleDeVenta(autito2);
    Venta ven = new Venta(Calendar.getInstance());
    ven.anadirDetalleVenta(detven);
    ven.anadirDetalleVenta(detven2);

    Concesionaria haimovich = new Concesionaria("haimovich", 321, "direccion");
    haimovich.andairVenta(ven);
    Float prueba = haimovich.ventaPorPaisConCondicion(argentina, true);
    Float prueba2 = haimovich.ventaPorPaisConCondicion(argentina, false);
    System.out.println("El monto es: " + prueba + "   " + prueba2);
  }
}
