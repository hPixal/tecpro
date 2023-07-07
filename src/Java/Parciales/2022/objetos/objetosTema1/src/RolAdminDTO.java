public class RolAdminDTO extends RolUsuarioDTO {

  private String clave;

public RolAdminDTO(UsuarioDTO usuarioDTO, String clave) {
    super(usuarioDTO);
    this.clave = clave;
}

    
}
