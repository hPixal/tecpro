import java.util.ArrayList;
import java.util.List;

public class UsuarioDTO {
    private String usuario;
    private String apellido;
    private String nombre;
    private String correo;
    private List<RolUsuarioDTO> lRolUsuarioDTO;

    public UsuarioDTO(String usuario, String apellido, String nombre, String correo) {
        this.usuario = usuario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.correo = correo;
        this.lRolUsuarioDTO = new ArrayList<RolUsuarioDTO>();
    }

    public void addRol(RolUsuarioDTO nRol) {
        this.lRolUsuarioDTO.add(nRol);
    }

    private void mostrarDatos() {
        System.out.print(apellido + " " + nombre);
    }
    
    private Boolean tieneMasDeUnRol(){
       boolean aux = false;
        if (this.lRolUsuarioDTO.size() > 1){
            aux = true;
        }
        else {
            aux = false;
        }
        return aux;
    }  

    public void MostrarDatosDelComensal(){
        if(this.tieneMasDeUnRol() && this.esComensal()){
            this.mostrarDatos();
            for (RolUsuarioDTO rolUsuarioDTO : lRolUsuarioDTO) {
                if(rolUsuarioDTO.esComensal()){
                    rolUsuarioDTO.mostrarDatos();
                }
            }
        }
    }

    public Boolean esComensal() {
        Boolean aux = false;
        for (RolUsuarioDTO i : lRolUsuarioDTO) {
            if (i.esComensal()) {
                aux = true;
            }
        }
        return aux;
    }

    public void mostrarDatosDeRoles() {
        if (lRolUsuarioDTO.size() > 1) {
            for (RolUsuarioDTO i : lRolUsuarioDTO) {
                i.mostrarDatos();
            }
        }
    }
    


}
