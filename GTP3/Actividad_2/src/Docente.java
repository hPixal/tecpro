import java.util.Calendar;

public class Docente extends Persona {

    private Integer legajo;

    public Docente(String nombre, Integer dni, Calendar fecha_nacimiento, Boolean sexo, String genero, Integer legajo) {
        super(nombre, dni, fecha_nacimiento, sexo, genero);
        this.legajo = legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("DNI: " + this.getDni() + " Legajo: " + this.legajo);
        System.out.println("Genero: " + this.getGenero());
    }

}
