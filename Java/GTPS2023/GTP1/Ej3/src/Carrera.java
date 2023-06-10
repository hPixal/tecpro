
import java.util.List;

public class Carrera {
    private String nombre;
    private List<Alumno> alumnos;

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void addAlumno(Alumno al) {
        this.alumnos.add(al);
    }

    public Alumno getAlumno(Integer dni) {
        for (Integer i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getDNI() == dni) {
                return alumnos.get(i);
            }
        }
        return null;
    }

    public void displayNombre(){
        System.out.println("NOMBRE CARRERA: "+ this.nombre);
    }

    public void displayAlumnos() {
        for (Integer i = 0; i < alumnos.size(); i++) {
            this.alumnos.get(i).displayPersona();
        }
    }
}
