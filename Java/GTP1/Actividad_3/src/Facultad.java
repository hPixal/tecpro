import java.util.ArrayList;

public class Facultad {
    ArrayList<Carrera> carreras;
    Integer id;
    String nombre;

    public Integer getId() {
        return id;
    }

    Facultad(String _nombre, Integer _id) {
        this.id = _id;
        this.nombre = _nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void addCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    public void removeCarrera(String nombre) {
        for (Integer i = 0; i < carreras.size(); i++) {
            String aux = carreras.get(i).getNombre();
            if (aux == nombre) {
                carreras.remove(i);
            }
        }
    }

}
