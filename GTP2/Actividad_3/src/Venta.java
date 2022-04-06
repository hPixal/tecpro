import java.util.Calendar;
import java.util.Vector;

public class Venta {
    Calendar fecha;
    Integer codigoVenta;
    Vector<DetalleDeVenta> det;
    
    public Venta(Calendar fecha){
        this.fecha = fecha;
    }

    public void anadirDetalleVenta(DetalleDeVenta detalle){
        this.det.add(detalle);
    }
    
    
    
    
}
