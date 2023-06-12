import java.time.LocalDate;

public class Examen {
    private Float nota;
    private LocalDate fecha;
    private Alumno alumno;
    private Catedra catedra;

    public Examen(Float nota, LocalDate fecha, Alumno alumno, Catedra catedra) {
        this.nota = nota;
        this.fecha = fecha;
        this.alumno = alumno;
        this.catedra = catedra;
    }

    public Float getNota() {
        return nota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void displayAlumno(){
        this.alumno.displayAlumno();
    }
}
