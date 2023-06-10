import java.util.List;
import java.time.LocalDate;

public class Factura {
    private Character tipo;
    private Float precioFinal;
    private LocalDate fecha;
    private Integer nroFactura;
    private List<DetalleFactura> detalles;

    public Factura(Character tipo, Float precioFinal, LocalDate fecha, Integer nroFactura) {
        this.tipo = tipo;
        this.precioFinal = precioFinal;
        this.fecha = fecha;
        this.nroFactura = nroFactura;
    }

    // Funciones privadas
    private void actualizarTotal(){
        precioFinal = 0.f;
        for (DetalleFactura detalleFactura : detalles) {
            precioFinal += detalleFactura.getMonto();
        }
    }

    // Funciones publicas
    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Integer nroFactura) {
        this.nroFactura = nroFactura;
    }

    public void addDetalleFactura(DetalleFactura det){
        this.detalles.add(det);
        this.actualizarTotal();
    }
    
}
