import java.util.Vector;

public class Carrera {
    private String nombre;
    private Vector<Alumno> alumnos;
    private Vector<Catedra> catedras;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.alumnos = new Vector<Alumno>();
    }

    public Short conseguirCantidadEgresados() {
        Short cantidad = 0;
        for (Alumno it : alumnos) {
            if (it.egreso())
                cantidad++;
        }
        return cantidad;
    }

    public void anadirCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    public void listarAlumnosEnCatedra(Catedra catedra){
        Catedra cat = null;
        for(Catedra it : this.catedras){
            if(it.checkearCatedra(catedra)) cat = it;
        }
        
        if(cat!=null){
            cat.mostrarAlumnos();
        }
    }

    public Boolean perteneceCatedra(Catedra catedra){
        Boolean pertence = false;
        for(Catedra it : this.catedras){
            if(it.checkearCatedra(catedra)) pertence = true;
        }
        return pertence;
    }

    /*
     * Separe la funcion listar egresados en dos ya que hacer una sola que muestra
     * los egresados y te devuelva la cantidad abarca más de lo necesario, el nombre
     * original no hacia referencia a la funcionalidad completa por lo que decidi
     * partir en dos la función asi no hace más de lo que el nombre indica.
     */

    public void mostrarEgresados() {
        for (Alumno it : alumnos) {
            if (it.egreso())
                it.mostrar();
        }
    }
}
