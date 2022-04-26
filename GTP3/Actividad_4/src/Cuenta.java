import java.util.Calendar;
import java.util.Vector;

public class Cuenta {

  private Propietario propietario;
  private HistoricoTransaccion historicoTransaccion;

  public Cuenta(Propietario propietario) {
    this.propietario = propietario;
    this.historicoTransaccion = new HistoricoTransaccion();
  }

  public void anadirTransaccion(Transaccion transaccion, Calendar fecha) {
    this.historicoTransaccion.anadirTransaccion(transaccion, fecha);
  }

  public Float obtenerTotalEnCuenta(){
      return historicoTransaccion.obtenerTotalEnCuenta();
  }
}
