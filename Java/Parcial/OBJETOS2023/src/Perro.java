import java.time.LocalDate;

public class Perro extends Mascota {
    private Raza raza;

    public Perro(String alias, LocalDate fechaNacimiento, Familia familia, Raza raza) {
        super(alias, fechaNacimiento, familia);
        this.raza = raza;
    }

    public Raza getRaza() {
        return raza;
    }

    @Override
    public Boolean esRaza(String raza) {
        Boolean aux =  false;
        aux = this.esRaza(raza);
        return aux;
    }

    @Override
    public Boolean esPerro() {
        return true;
    }
    

}
