public class Camioneta extends Vehiculo {

  public Camioneta(
    String marca,
    Integer modelo,
    Float precio,
    Float kilometraje,
    Pais pais
  ) {
    super(marca, modelo, precio, kilometraje, pais);
  }

  @Override
  public Float getPrecio() {
    return this.precio;
  }
}
