public class Moneda {

  private String nombre;
  private Float cotizacionEnPeso;

  public Moneda(String nombre, Float monto, Float cotizacionEnPeso) {
    this.nombre = nombre;
    this.cotizacionEnPeso = cotizacionEnPeso;
  }

  public String conseguirNombre() {
    return nombre;
  }

  public Float obtenerMontoEnPeso(Float monto){
    return cotizacionEnPeso*monto;
  }
}
