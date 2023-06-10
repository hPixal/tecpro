import java.util.List;
public class Facultad {
    private List<Carrera> carreras;
    private String nombre;
    public Facultad(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void mostrarCarrerasYAlumnos(){
        for (Integer i = 0; i < carreras.size(); i++) {
            carreras.get(i).displayNombre();
            carreras.get(i).displayAlumnos();
        }
    }
}
