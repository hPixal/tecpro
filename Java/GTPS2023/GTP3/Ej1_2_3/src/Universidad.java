import java.util.List;

public class Universidad {
    private String nombre;
    private Integer codigo;
    private List<Carrera> carreras;

    public Universidad(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void anadirCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    public void listarEgresados() {
        for (Carrera carrera : carreras) {
            carrera.listarEgresados();
        }
    }

    public void listarAlumnos(Catedra catedra) {
        catedra.displayAlumnos();
    }
}
