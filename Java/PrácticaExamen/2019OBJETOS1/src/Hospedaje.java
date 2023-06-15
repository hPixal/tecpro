import java.util.List;
import java.util.ArrayList;

public class Hospedaje {
    private Integer capacidad;
    private String direccion;

    private List<Alquiler> cAlquileres;

    public Integer getCapacidad() {
        return capacidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public Anfitrion getoAnfitrion() {
        return oAnfitrion;
    }

    private Anfitrion oAnfitrion;

    public Boolean compararDireccion(Hospedaje h) {
        Boolean aux = false;
        if (h.getDireccion() == this.direccion) {
         aux = true;
        }else{
            aux=false;
        }
        return aux;
    }

}
