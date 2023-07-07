public class Categoria {

  private String nombre;
  private Float sueldo;

  public Categoria(String nombre, Float sueldo) {
    this.nombre = nombre;
    this.sueldo = sueldo;
  }

  public Float getSueldo() {
    return sueldo;
  }

  public void setSueldo(Float sueldo) {
    this.sueldo = sueldo;
  }

  public String getNombre(){
    return this.nombre;
  }
}
