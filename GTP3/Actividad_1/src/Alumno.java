import java.util.Calendar;
import java.util.Vector;

public class Alumno {
    private String nombre;
    private Calendar fecha_ingreso;
    private Calendar fecha_egreso;
    private Vector<Examen> examenes;

    public Alumno(String nombre, Calendar fecha_ingreso) {
        this.nombre = nombre;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = null;
    }

    public Boolean egreso() {
        return this.fecha_egreso != null;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de ingreso: " + this.fecha_ingreso.get(Calendar.DAY_OF_MONTH) + "/"
                + this.fecha_ingreso.get(Calendar.MONTH) + "/" + this.fecha_ingreso.get(Calendar.YEAR));
        System.out.print("Promedio aprobadas: " + conseguirPromedio());
        if(egreso());
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
}
