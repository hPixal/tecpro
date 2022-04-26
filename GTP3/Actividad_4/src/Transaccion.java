import java.util.Calendar;
import java.util.Vector;

public abstract class Transaccion {
    private Monto monto;
    private String naturaleza;

    public Transaccion(Monto monto,String naturaleza) {
        this.monto = monto;
        this.naturaleza = naturaleza;
    }
    
    
    public String obtenerNaturaleza(){
        return this.naturaleza;
    }

    protected Float obtenerMonto(){
        return this.monto.obtenerMontoEnPeso();
    }

    public abstract void mostrarOperacion();
    
    public abstract Float obtenerMontoEnPesos();
}
