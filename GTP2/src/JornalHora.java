import java.util.Calendar;

public class JornalHora {

  private Float menor40;
  private Float mayor40;
  private Calendar fechaDesde;
  private Calendar fehcaHasta;

  public JornalHora(Float menor40, Float mayor40, Calendar fechaDesde) {
    this.menor40 = menor40;
    this.mayor40 = mayor40;
    this.fechaDesde = fechaDesde;
    this.fehcaHasta = Calendar.getInstance();
  }

  public Boolean perteneceAFecha(Calendar fecha){
    return fecha.before(fechaDesde) && fecha.after(fehcaHasta);
  }

  public Float devolverValor(Integer horas){
    if(horas<40) return menor40*horas;
    return mayor40*horas;
  }
  
}
