import java.util.List;

public class Comision {
    private Integer idComision;
    private List<Alumno> alumnos;
    private Character letraComision;

    public Comision(Integer idComision, Character letraComision) {
        this.idComision = idComision;
        this.letraComision = letraComision;
    }

    public Integer getIdComision() {
        return idComision;
    }

    public void setIdComision(Integer idComision) {
        this.idComision = idComision;
    }

    public Character getLetraComision() {
        return letraComision;
    }

    public void setLetraComision(Character letraComision) {
        this.letraComision = letraComision;
    }

    public void displayAlumnos() {
        for (Alumno alumno : alumnos) {
            alumno.displayAlumno();
        }
    }

}
