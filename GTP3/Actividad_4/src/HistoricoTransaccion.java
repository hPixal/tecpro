import java.util.Calendar;
import java.util.Vector;

public class HistoricoTransaccion {
    private Vector<Transaccion> transacciones;
    private Vector<Calendar> fechas;
    public HistoricoTransaccion() {
    }
    
    public void anadirTransaccion(Transaccion transaccion, Calendar fecha){
        this.transacciones.add(transaccion);
        this.fechas.add(fecha);
    }

    private Float obtenerSuma(){
        Float total = 0f;
        for(Transaccion it : transacciones){
            total += it.obtenerMontoEnPesos();
        }
        return total;
    }
    public Float obtenerTotalEnCuenta(){
        return obtenerSuma() - obtenerComision();
    }

    public Float obtenerComision(){
        Float comision = obtenerSuma();
        Float tamano = 1f*transacciones.size();
        if(!transacciones.isEmpty())
        comision = (30f - (comision/tamano) * 0.005f );
        return comision;
    }
}
