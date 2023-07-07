import java.util.Calendar;

public class Persona {

  private Calendar fechaNacimiento;
  private String nombre;
  private String apelllido;
  private String email;
  private Integer dni;



  public Persona(Calendar fechaNacimiento, String nombre, String apelllido, String email, Integer dni) {
    this.fechaNacimiento = fechaNacimiento;
    this.nombre = nombre;
    this.apelllido = apelllido;
    this.email = email;
    this.dni = dni;
}

public Calendar getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getNombre() {
    return nombre;
  }


  public String getApelllido() {
    return apelllido;
  }


  public Integer getDni() {
    return dni;
  }

  public String getEmail(){
      return this.email;
  }


}
