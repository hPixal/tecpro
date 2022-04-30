import java.util.Calendar;

public class Consulta {

  private Familia familia;
  private Mascota mascota;
  private Calendar fecha;
  private Float montoBase;
  private Float montoACobrar;

  public Consulta(
    Familia familia,
    Mascota mascota,
    Calendar fecha,
    Float montoBase
  ) {
    this.familia = familia;
    this.mascota = mascota;
    this.fecha = fecha;
    this.montoBase = montoBase;
    calcularMonto();
  }

  public void calcularMonto(){
    Especie especie = mascota.getEspecie();
    Float descuentoEspecie = especie.getDescuento();
    Float descuentoRaza = mascota.get
}

  public Familia getFamilia() {
    return familia;
  }

  public Mascota getMascota() {
    return mascota;
  }

  public Float x

  public Calendar getFecha() {
    return fecha;
  }

  public Float getMonto() { 
    return montoBase;
  }
}
