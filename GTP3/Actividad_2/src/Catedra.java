import java.util.Vector;

public class Catedra {
    private String nombre;
    private Docente docente;
    private Vector<Comision> comisiones;

    public Catedra(String nombre,Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
    }

    public String conseguirNombre(){
        return this.nombre;
    }
    
    public void anadirComision(Comision comision){
        this.comisiones.add(comision);
    }

    public void mostrarAlumnos(){
        for(Comision it : comisiones){
            System.out.println("Catedra " + it);
            it.mostrar();
        }
    }

    public Boolean checkearCatedra(Catedra catedra){
        return (catedra.conseguirNombre() == this.nombre);
    }
}
