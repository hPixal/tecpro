import java.util.Calendar;
import java.util.Vector;

public class RolComensalDTO extends RolUsuarioDTO {

  private Calendar ultimoAcceso;
  private String tokenSesion;
  private Facultad facultad;
  private Vector<Cupon> cupones;

  public RolComensalDTO(
    UsuarioDTO usuarioDTO,
    Calendar ultimoAcceso,
    String tokenSesion,
    Facultad facultad
  ) {
    super(usuarioDTO);
    this.ultimoAcceso = ultimoAcceso;
    this.tokenSesion = tokenSesion;
    this.facultad = facultad;
    this.cupones = new Vector<Cupon>();
  }

  public void setCupo(Cupon cupon) {
    this.cupones.add(cupon);
  }

  public void mostrarFacultad() {
    System.out.print(this.facultad.getSigla());
  }

  public Integer getSaldo() {
    Integer contador = 0;
    for (Cupon it : cupones) {
      if (!it.usado()) contador++;
    }
    return contador;
  }

  public void mostrarSaldo() {
    System.out.println("Saldo: " + getSaldo());
  }

  public void mostrarDatos() {
    System.out.println("Datos del comensal");
    mostrarSaldo();
    System.out.println(
      "Ultimo acceso: " +
      ultimoAcceso.get(Calendar.DAY_OF_MONTH) +
      " / " +
      ultimoAcceso.get(Calendar.MONTH) +
      " / " +
      ultimoAcceso.get(Calendar.YEAR)
    );
    System.out.println("Facultad: ");
    mostrarFacultad();
    mostrarDatosUsuario();
  }
}
