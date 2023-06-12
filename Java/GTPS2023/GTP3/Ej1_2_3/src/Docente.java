import java.time.LocalDate;

public class Docente extends Persona {
    private Integer legajo;
    
    public Docente(Integer dni, String nombre, String ciudad, String telefono, Integer edad, LocalDate birthday,
            Integer legajo) {
        super(dni, nombre, ciudad, telefono, edad, birthday);
        this.legajo = legajo;
    }
    
    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }


}
