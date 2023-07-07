public class RolVentanillaDTO extends RolUsuarioDTO {

  private String clave;
  private ComedorDTO comedorDTO;

  public RolVentanillaDTO(
    UsuarioDTO usuarioDTO,
    String clave,
    ComedorDTO comedorDTO
  ) {
    super(usuarioDTO);
    this.clave = clave;
    this.comedorDTO = comedorDTO;
  }

  public void mostrarComedor(){
      comedorDTO.mostrarComedor();
  }
}
