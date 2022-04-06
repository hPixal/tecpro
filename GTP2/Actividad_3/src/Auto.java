public abstract class Auto extends Vehiculo {

  public Auto(
    String marca,
    Integer modelo,
    Float precio,
    Float kilometraje,
    Pais pais
  ) {
    super(marca, modelo, precio, kilometraje, pais);
  }

  @Override
  public Boolean esAuto() {
    return true;
  }

  @Override
  public Float getPrecio() {
    Float fin = this.precio + this.precio * this.pais.getArancel();
    return fin;
  }
}
