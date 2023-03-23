import java.time.*;
import java.util.ArrayList;

public class Alumno extends Persona {
    LocalDate fechaDeIngreso;
    Carrera carrera;
    ArrayList<
    public Alumno(String nombre, Integer dni, LocalDate fechaDeNacimiento, Boolean sexo, LocalDate fechaDeIngreso) {
        super(nombre, dni, fechaDeNacimiento, sexo);
        this.fechaDeIngreso = fechaDeIngreso;
    }
    
}
