import java.util.Calendar;
import java.util.Vector;

public class Empresa {

  private Vector<Trabajadores> Trabajadores;

  public Float determinarSueldos(Calendar periodo){
    float montoTotal = 0.f;
    for(Trabajadores it : this.Trabajadores){
      montoTotal += it.CacularSueldo(periodo);
    }
    return montoTotal;
  }
}