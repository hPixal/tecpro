import java.util.Vector;
import java.util.spi.CalendarNameProvider;

public class Puerto {
    private String nombre;
    private Vector<Amarra> amarras;
    private Vector<Alquiler> alquileres; 

    public calcularPeriodos(Calendar principio,Calendar fin){
        
    }

    public void anadirAlquiler(Alquiler alquiler){
        this.alquileres.add(alquiler);
    }
}
