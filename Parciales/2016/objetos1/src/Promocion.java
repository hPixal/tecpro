import java.util.Vector;

public class Promocion {

  private Vector<Especie> especies;
  private Float descuentos;

  public Promocion(Vector<Especie> especies, Float descuentos) {
    this.especies = especies;
    this.descuentos = descuentos;
  }

  public Boolean entraEnPromo(Mascota mascota) {
    Especie compara = mascota.getEspecie();
    Boolean comparacion = false;
    for (Especie it : especies) {
      if (compara.equals(it)) comparacion = true;
    }
    return comparacion;
  }

  public Float getDescuento(Mascota mascota) {
    Float devolver = 1f;
    if (entraEnPromo(mascota)) devolver = this.descuentos;
    return devolver;
  }
}
