import java.util.List;

public class Familia {
    private String apellido;
    private String direccion;
    private Integer telefono;
    private Responsable responsable;
    private List<Integrante> integrantes;
    private List<Mascota> mascotas;

    public void addIntegrante(Integrante integrante) {
        this.integrantes.add(integrante);
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

}
