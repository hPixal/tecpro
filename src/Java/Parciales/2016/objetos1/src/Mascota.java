public class Mascota {

  private Especie especie;
  private String alias;

  public Especie getEspecie() {
    return especie;
  }

  public String getAlias() {
    return alias;
  }

  public Float getDescuento(){
      Float devuelve = this.especie.getDescuento();
      return devuelve;
  }
}
