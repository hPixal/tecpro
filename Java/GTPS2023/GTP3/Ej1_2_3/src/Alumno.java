import java.time.LocalDate;
import java.util.List;

public class Alumno extends Persona {
    private Integer legajo;
    private Carrera carrera;
    private List<Examen> examenes;
    private Float promedio; 
    private LocalDate ingreso;
    private LocalDate egreso;

    
    public Alumno(Integer dni, String nombre, String ciudad, String telefono, Integer edad, LocalDate birthday,
    Integer legajo, LocalDate ingreso,Carrera carrera) {
        super(dni, nombre, ciudad, telefono, edad, birthday);
        this.legajo = legajo;
        this.ingreso = ingreso;
        this.carrera = carrera;
    }

    public LocalDate getIngreso(){
        return ingreso;
    }
    
    private void actualizarPromedio(){
        this.promedio = 0.f;
        for (Examen examen : examenes) {
            promedio += examen.getNota();
        }
        promedio = promedio/this.examenes.size();
    }

    public Boolean egreso(){
        return (this.egreso != null);
    }
    
    public void anadirExamen(Examen examen){
        this.examenes.add(examen);
        actualizarPromedio();
    }

    public void displayAlumno(){
        System.out.println("LEGAJO : " + this.legajo);
        this.displayPersona();
    }

    public Float getPromedio(){
        return this.promedio;
    }

    public void displayCarrera(){
        this.carrera.displayCarrera();
    }
}
