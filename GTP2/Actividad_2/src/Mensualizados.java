import java.util.Calendar;

public class Mensualizados extends Trabajadores {

  private Categoria myCat;

  public Mensualizados(
    String nombre,
    String apellido,
    String direccion,
    Integer dNI,
    Integer mySueldo,
    Categoria myCat
  ) {
    super(nombre, apellido, direccion, dNI);
    this.myCat = myCat;
  }

  @Override
  public Float CacularSueldo(Calendar periodo) {
    return myCat.getSueldo();
  }
}
