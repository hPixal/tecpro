import java.time.LocalDate;

public class Gato extends Mascota {
    private String color;

    public Gato(String alias, LocalDate fechaNacimiento, Familia familia, String color) {
        super(alias, fechaNacimiento, familia);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Boolean esRaza(String raza) {
        return false;
    }

    
}
