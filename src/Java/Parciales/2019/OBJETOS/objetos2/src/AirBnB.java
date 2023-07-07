import java.util.Vector;

public class AirBnB {
    private Vector<Alquiler> alquileres;
    private Vector<Hospedaje> hospedajes;
    private Vector<Persona> clientes;
    public AirBnB(Vector<Alquiler> alquileres, Vector<Hospedaje> hospedajes, Vector<Persona> clientes) {
        this.alquileres = alquileres;
        this.hospedajes = hospedajes;
        this.clientes = clientes;
    }

    public Vector<Hospedaje> obtenerTipoHospedaje(String tipo,Boolean banoCompartido){
        Vector<Hospedaje> devolver = new Vector<Hospedaje>();
        for(Hospedaje it: hospedajes){
            if(it.getTipo() == tipo && it.getBanoCompartido() == banoCompartido){
                devolver.add(it);
            }
        }
        return devolver;
    }

    public void mostrarHospedajesDiscrimindos(String tipo,Boolean banoCompartido){
        Vector<Hospedaje> mostrar = obtenerTipoHospedaje(tipo, banoCompartido);
        for(Hospedaje it : mostrar){
            it.obetenerDatos();
        }
    }
}
