public abstract class Vehiculo {

  private String marca;
  private Integer modelo;
  private Float kilometraje;
  private Dueño dueño;

  protected Float precio;
  protected Pais pais;

  public Vehiculo(
    String marca,
    Integer modelo,
    Float precio,
    Float kilometraje,
    Pais pais
  ) {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.kilometraje = kilometraje;
    this.dueño = null;
    this.pais = pais;
  }

  public void anadirDueno(Dueño dueño) {
    this.dueño = dueño;
  }

  public Boolean tieneDueño() {
    return !(this.dueño == null);
  }

  public Boolean esAuto() {
    return false;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Integer getModelo() {
    return modelo;
  }

  public void setModelo(Integer modelo) {
    this.modelo = modelo;
  }

  public abstract Float getPrecio();

  public void setPrecio(Float precio) {
    this.precio = precio;
  }

  public Float getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(Float kilometraje) {
    this.kilometraje = kilometraje;
  }

  public Dueño getDueño() {
    return dueño;
  }

  public void setDueño(Dueño dueño) {
    this.dueño = dueño;
  }
}
