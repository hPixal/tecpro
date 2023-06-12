import java.util.List;

public class Carrera {
    private Integer codCarrera;
    private String nombreCarrera;
    private List<Alumno> alumnos;

    public void displayCarrera() {
        System.out.println("CARRERA: " + this.nombreCarrera);
    }

    public Integer getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(Integer codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public void listarEgresados() {
        for (Alumno alumno : alumnos) {
            if (alumno.egreso()) {
                alumno.displayPersona();
            }
        }
    }
}
