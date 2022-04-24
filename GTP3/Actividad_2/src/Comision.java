import java.util.Vector;

public class Comision {
    private Docente titular;
    private Character comision;
    private Vector<Alumno> alumnos;
    public Comision(Docente titular, Character comision) {
        this.titular = titular;
        this.comision = comision;
        this.alumnos = new Vector<Alumno>();
    }
    
    public void mostrar(){
        System.out.println("Docente titular: ");
        for(Alumno it : this.alumnos){
            it.mostrar();
        }
    }

    public void mostrarTitular() {
        this.titular.mostrar();
    }


    public Character getComision() {
        return comision;
    }
    
}
