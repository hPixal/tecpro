public abstract class RolUsuarioDTO {
    private UsuarioDTO usuarioDTO;

    public RolUsuarioDTO(UsuarioDTO oUsuarioDTO) {
        this.usuarioDTO = oUsuarioDTO;
        this.usuarioDTO.addRol(this);
    }
 
    public abstract void mostrarDatos();

    public abstract Boolean esComensal();

}
