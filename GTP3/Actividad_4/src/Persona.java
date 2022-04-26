import java.util.Calendar;

public class Persona {
    private String nombre;
    private Integer dni;
    private Calendar fecha_nacimiento;
    private Boolean sexo;
    private String genero;

    public Persona(String nombre, Integer dni, Calendar fecha_nacimiento, Boolean sexo, String genero) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Genero: " + this.genero);
    }

}
