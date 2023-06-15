import java.util.List;
import java.util.ArrayList;

public class AirBNB {
   private List<Hospedaje> cHospedajes;
   private List<Persona> cClientes; 
   private List<Alquiler> cAlquilers; 

    public void mostrarHospedajesCompartidos(Hospedaje h, Short estrellas){
        for (Alquiler i : cAlquilers) {
            i.comentarioFiltrado(estrellas,h);
        }

    };

}
