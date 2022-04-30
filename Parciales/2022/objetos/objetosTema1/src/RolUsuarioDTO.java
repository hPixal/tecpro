public class RolUsuarioDTO {

  private UsuarioDTO usuarioDTO;

  public RolUsuarioDTO(UsuarioDTO usuarioDTO) {
    this.usuarioDTO = usuarioDTO;
  }

  public void mostrarDatosUsuario() {
    this.usuarioDTO.mostrarDatos();
  }
}
