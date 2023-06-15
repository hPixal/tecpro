import java.time.*;


public class Huesped extends PersonaRol {
    private LocalDate nacimiento;

    public Huesped(Persona persona, LocalDate nacimiento) {
        super(persona);
        this.nacimiento = nacimiento;
    }

}
