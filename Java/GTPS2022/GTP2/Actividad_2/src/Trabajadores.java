import java.util.Calendar;
public abstract class Trabajadores {

  private String nombre;
  private String Apellido;
  private String Direccion;
  private Integer DNI;

  public Trabajadores(
    String nombre,
    String apellido,
    String direccion,
    Integer dNI
  ) {
    this.nombre = nombre;
    Apellido = apellido;
    Direccion = direccion;
    DNI = dNI;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return Apellido;
  }

  public void setApellido(String apellido) {
    Apellido = apellido;
  }

  public String getDireccion() {
    return Direccion;
  }

  public void setDireccion(String direccion) {
    Direccion = direccion;
  }

  public Integer getDNI() {
    return DNI;
  }

  public void setDNI(Integer dNI) {
    DNI = dNI;
  }

  public abstract Float CacularSueldo(Calendar periodo);
}
