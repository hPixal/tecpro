import java.util.Calendar;
import java.util.Vector;

public class Alumno extends Persona {
    private Calendar fecha_ingreso;
    private Calendar fecha_egreso;
    private Vector<Examen> examenes;

    public Alumno(String nombre, Integer dni, Calendar fecha_nacimiento, Boolean sexo, String genero,
            Calendar fecha_ingreso, Calendar fecha_egreso) {
        super(nombre, dni, fecha_nacimiento, sexo, genero);
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = fecha_egreso;
        this.examenes = new Vector<Examen>();
    }

    public Boolean egreso() {
        return this.fecha_egreso != null;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Fecha de ingreso: " + this.fecha_ingreso.get(Calendar.DAY_OF_MONTH) + "/"
                + this.fecha_ingreso.get(Calendar.MONTH) + "/" + this.fecha_ingreso.get(Calendar.YEAR));
        System.out.print("Promedio aprobadas: " + conseguirPromedio());
        if (egreso())
            ;
        System.out.println("Fecha de ingreso: " + this.fecha_egreso.get(Calendar.DAY_OF_MONTH) + "/"
                + this.fecha_egreso.get(Calendar.MONTH) + "/" + this.fecha_egreso.get(Calendar.YEAR));
    }

    public Float conseguirPromedio() {
        Float promedio = 0.f;
        Integer contador = 0;
        for (Examen it : examenes) {
            if (it.aprobo()) {
                contador++;
                promedio += it.conseguirNota();
            }
        }
        promedio = promedio / contador;
        return promedio;
    }

    public void anadirExamen(Examen examen) {
        this.examenes.add(examen);
    }
}
