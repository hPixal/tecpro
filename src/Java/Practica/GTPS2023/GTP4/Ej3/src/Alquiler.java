import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private Cliente cliente;
    private Barco barco;
    private Float monto;
    private LocalDate desde;
    private LocalDate hasta;

    private void actualizarMonto() {
        Long days = ChronoUnit.DAYS.between(desde, hasta);
        this.monto = barco.getModulo() * days;
    }

    public Alquiler(Cliente cliente, Barco barco, LocalDate desde, LocalDate hasta) {
        this.cliente = cliente;
        this.barco = barco;
        this.desde = desde;
        this.hasta = hasta;
        this.monto = 0.f;
        this.actualizarMonto();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Barco getBarco() {
        return barco;
    }

    public Float getMonto() {
        return monto;
    }

    public LocalDate getDesde() {
        return desde;
    }

    public LocalDate getHasta() {
        return hasta;
    }

    

}
