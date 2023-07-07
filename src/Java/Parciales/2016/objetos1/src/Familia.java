import java.util.Vector;

public class Familia {
    private Vector<Persona> personas;
    private String nombreFamilia;
    public Familia(Vector<Persona> personas, String nombreFamilia) {
        this.personas = personas;
        this.nombreFamilia = nombreFamilia;
    }
    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void anadirPersona(Persona persona){
        this.personas.add(persona);
    }
    
}
