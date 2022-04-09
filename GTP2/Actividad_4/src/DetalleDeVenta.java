import java.util.Vector;

public class DetalleDeVenta {
    private Float montoFinal;
    private Vehiculo vehiculos;
    private Vector<Accesorio> accesorios;

    public DetalleDeVenta(Vehiculo vehiculos) {
        this.vehiculos = vehiculos;
        montoFinal = vehiculos.getPrecio();
    }
    
    public void anadirAccesorio(Accesorio accesorio){
        accesorios.add(accesorio);
        this.montoFinal += accesorio;
    }

    public Float valor(){
        return montoFinal;
    }
    
    public Pais paisProveniente(){
        return vehiculos.getPais();
    }

    public Boolean esUsado(){ 
        return vehiculos.tieneDueno();
    }
}
