import java.util.Calendar;
import java.util.Vector;

public class Jornalizados extends Trabajadores {

  private Vector<Jornada> myJornadas;
  private HistoricoJornada jhoras;

  public Jornalizados(String nombre, String apellido, String direccion, Integer dNI) {
    super(nombre, apellido, direccion, dNI);
    this.myJornadas = new Vector<Jornada>();
  }

  public void anadirJornada(JornalHora nJornada){
    this.jhoras.anadirJornada(nJornada);
  }

  @Override
  public Float CacularSueldo(Calendar periodo) {
    Integer horasLaburadas = 0;
    for(Jornada jor : myJornadas){
      if(jor.pertenecePeriodo(periodo)){
        horasLaburadas += jor.getHoras();
      }
    }

    return jhoras.devolverSueldo(horasLaburadas, periodo);
  }


}