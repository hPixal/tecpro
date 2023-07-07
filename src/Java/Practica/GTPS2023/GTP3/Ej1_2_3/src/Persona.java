import java.time.*;

public class Persona {

    private Integer dni;
    private String nombre;
    private String ciudad;
    private String telefono;
    private Integer edad;
    private LocalDate birthday;

    public Persona(Integer dni, String nombre, String ciudad, String telefono, Integer edad, LocalDate birthday) {
        this.dni = dni;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
        this.birthday = birthday;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public Integer getEdad() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday, currentDate);
        this.edad = period.getYears();
        return edad;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getStringBirthday() {
        String year = Integer.toString(this.birthday.getYear());
        String month = Integer.toString(this.birthday.getMonthValue());
        String day = Integer.toString(this.birthday.getDayOfMonth());

        String concatValue = year + "-" + month + "-" + day;
        return concatValue;
    }

    public void displayPersona() {
        System.out.println("NOMBRE     : "+this.nombre);
        System.out.println("DNI        : "+this.dni);
        System.out.println("NACIMIENTO : "+this.getStringBirthday());
        System.out.println("CIUDAD     : "+this.ciudad);
    }

}
