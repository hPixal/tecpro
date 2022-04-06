public class Dueño {

  private String nombre;
  private String apellido;
  private Integer telefono;

  public Dueño(String nombre, String apellido, Integer telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Integer getTelefono() {
    return telefono;
  }

  public void setTelefono(Integer telefono) {
    this.telefono = telefono;
  }
}
