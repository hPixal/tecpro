import java.util.Vector;

public class Universidad {
    Vector<Carrera> carreras;
    String nombre;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.carreras = new Vector<Carrera>();
    }

    public void anadirCarrera(Carrera carrera){
        this.carreras.add(carrera);
    }

    public void listarAlumnos(Catedra catedra){
        for(Carrera it : this.carreras){
            if(it.perteneceCatedra(catedra)){
                it.listarAlumnosEnCatedra(catedra);
            }
        }
    }
}
