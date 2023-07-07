import java.util.List;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private List<UsuarioDTO> lUsuarioDTO;

    Universidad(String nombre){
        this.nombre = nombre;
        lUsuarioDTO = new ArrayList<UsuarioDTO>();
    }


    
    public void listarComensalesYOtro(){
       for (UsuarioDTO i : lUsuarioDTO) {
          i.MostrarDatosDelComensal();
       }

    }
}
