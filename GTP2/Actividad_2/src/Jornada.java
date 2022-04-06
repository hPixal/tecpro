import java.util.Calendar;

public class Jornada {

  private Integer horas;
  private Calendar fecha;

  public Jornada(Integer hora, Calendar fecha) {
    this.horas = hora;
    this.fecha = fecha;
  }

  public Integer getHoras() {
    return horas;
  }

  public Boolean pertenecePeriodo(Calendar fecha){
    return fecha == this.fecha;
  }
  
}
