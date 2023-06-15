public class RolVentanillaDTO  extends RolUsuarioDTO{
    private String clave;
    private ComedorDTO comedorDTO;
    public RolVentanillaDTO(UsuarioDTO oUsuarioDTO, String clave, ComedorDTO comedorDTO) {
        super(oUsuarioDTO);
        this.clave = clave;
        this.comedorDTO = comedorDTO;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("NOMBRE ROL : RolVentanillaDTO");
        System.out.println("CLAVE : " + this.clave);
        System.out.println("COMERDOR ASIGNADO : ");
        this.comedorDTO.mostrarDatos();
        
    }
    
    @Override
    public Boolean esComensal(){
        return false;
    }

    
    
}
