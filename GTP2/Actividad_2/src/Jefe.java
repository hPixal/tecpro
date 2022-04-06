import java.util.Calendar;
import java.util.Vector;

public class Jefe extends Trabajadores {

  private Float sueldo;
  private Vector<Trabajadores> myTrabajadores;
  public Jefe(
    String nombre,
    String apellido,
    String direccion,
    Integer dNI,
    Float sueldo
  ) {
    super(nombre, apellido, direccion, dNI);
    this.sueldo = sueldo;
    myTrabajadores = new  Vector<Trabajadores>();
  }

  public void anadirTrabajador(Trabajadores trabajador){
    this.myTrabajadores.add(trabajador);
  }

  @Override
  public Float CacularSueldo(Calendar periodo) {
    return sueldo;
  }
}
