import java.time.LocalDate;

public class Otro extends Mascota {
    private String especie;

    public Otro(String alias, LocalDate fechaNacimiento, Familia familia, String especie) {
        super(alias, fechaNacimiento, familia);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public Boolean esRaza(String raza) {
        return false;
    }

    
}
