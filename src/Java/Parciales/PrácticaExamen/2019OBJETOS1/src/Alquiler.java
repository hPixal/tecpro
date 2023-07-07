import java.time.*;
import java.util.List;
import java.util.ArrayList;

public class Alquiler {
    private Float precio;
    private LocalDate desde;
    private LocalDate hasta;
    private Huesped responsable;
    private List<Huesped> grupo;
    private Hospedaje hospedaje;

    public Alquiler(Float precio, LocalDate desde, LocalDate hasta, Huesped responsable) {
        this.precio = precio;
        this.desde = desde;
        this.hasta = hasta;
        this.responsable = responsable;
    }

    public void comentarioFiltrado(Short estrellas, Hospedaje h) {
        if (this.hospedaje.compararDireccion(h)) {
            this.responsable.mostrarComentarioCondicionado(estrellas);
            for (Huesped i : grupo) {
                i.mostrarComentarioCondicionado(estrellas);
            }
        }
    }

}
