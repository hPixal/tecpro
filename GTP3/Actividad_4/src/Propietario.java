import java.util.Calendar;

public class Propietario extends Persona {
    private Long cbu;
    public Propietario(String nombre, Integer dni, Calendar fecha_nacimiento, Boolean sexo, String genero, Long cbu) {
        super(nombre, dni, fecha_nacimiento, sexo, genero);
        this.cbu = cbu;
    }
    
    
}
