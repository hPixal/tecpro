import java.util.List;

public class Carrera {
    String nombre;
    List<Alumno> alumnos;
    Facultad facultad;
    Integer id;
    public Integer getId() {
        return id;
    }

    Carrera(String nom,Facultad facultad, Integer id){
        this.nombre = nom;
        this.facultad = facultad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void removeAlumno(Integer dni){
        for(Integer i = 0 ; i < alumnos.size() ; i++ ){
            Alumno aux = alumnos.get(i);
            if(aux.getDni() == dni){
                alumnos.remove(i);
            }
        }
    }
}
