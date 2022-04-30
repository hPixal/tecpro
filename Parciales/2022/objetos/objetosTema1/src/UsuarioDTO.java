import java.util.Calendar;
import java.util.Vector;
import javax.swing.text.PlainView;

public class UsuarioDTO {

  private String usuario;
  private String apellido;
  private String nombre;
  private String correo;
  private Vector<RolUsuarioDTO> roles;

  public UsuarioDTO(
    String usuario,
    String apellido,
    String nombre,
    String correo,
    Vector<RolUsuarioDTO> roles
  ) {
    this.usuario = usuario;
    this.apellido = apellido;
    this.nombre = nombre;
    this.correo = correo;
    this.roles = roles;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void mostrarDatos(){
      System.out.println("Usuario: " +getUsuario());
      System.out.println("Correo: " +getCorreo());
      System.out.println("Apellido: " +getApellido());
  }
}
