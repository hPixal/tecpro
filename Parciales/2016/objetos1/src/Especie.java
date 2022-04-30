public abstract class Especie {

  private String nombreEspecie;
  private Float descuentoPorEspecie;
  public Especie(String nombreEspecie,Float descuento) {
    this.nombreEspecie = nombreEspecie;
    this.descuentoPorEspecie = descuento;
  }

  public String getNombreEspecie() {
    return nombreEspecie;
  }
  public Float getDescuento(){
    return this.descuentoPorEspecie;
  }

  public abstract String getDescripcion();
}
