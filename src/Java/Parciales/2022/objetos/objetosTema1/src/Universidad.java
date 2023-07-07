import java.util.Calendar;
import java.util.Vector;

public class Universidad {

  private String nombre;
  private Vector<UsuarioDTO> usuarios;
  private Vector<Facultad> facultades;
  private Vector<ComedorDTO> comedores;

  public Universidad(String nombre) {
    this.nombre = nombre;
  }

  public Vector<UsuarioDTO> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(Vector<UsuarioDTO> usuarios) {
    this.usuarios = usuarios;
  }

  public Vector<Facultad> getFacultades() {
    return facultades;
  }

  public void setFacultades(Vector<Facultad> facultades) {
    this.facultades = facultades;
  }

  public void mostrarComensalesDia(Calendar dia){
      for(ComedorDTO it : comedores){
        it.mostrarComensalesDia(dia);
      }
  }
}
