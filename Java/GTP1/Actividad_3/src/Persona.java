import java.time.*;

public class Persona {
    String nombre;
    Integer dni;
    LocalDate fechaDeNacimiento;
    Boolean sexo;

    public Persona(String nombre, Integer dni, LocalDate fechaDeNacimiento, Boolean sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Boolean getsexo() {
        return sexo;
    }

    public void setsexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Integer getEdadActual(){
        LocalDate fooBar = LocalDate.now();
        Integer yearDiff = fooBar.getYear() - fechaDeNacimiento.getYear();
        Integer monthDiff = fooBar.getMonthValue() - fechaDeNacimiento.getMonthValue();
        Integer dayDiff = fooBar.getDayOfMonth() - fechaDeNacimiento.getDayOfMonth();
        
        if(dayDiff < 0){
            monthDiff++;
        }
        if(monthDiff < 0){
            yearDiff++;
        }
        
        return yearDiff;
    }

    public void showInforme(){
        System.out.println( "Datos Personales > " + getsexo() + getNombre() + getEdadActual() + getDni() );
    }
}
