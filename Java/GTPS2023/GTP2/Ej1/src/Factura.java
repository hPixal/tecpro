package Java.GTPS2023.GTP2.Ej1.src;
import java.util.List;
public class Factura {
    private Integer numeroFactura;
    private Float precioFinal;
    private List<DetalleFactura> detalles;
    public Factura(Integer numeroFactura, Float precioFinal) {
        this.numeroFactura = numeroFactura;
        this.precioFinal = precioFinal;
    }

    private void actualizarPrecio(){
        this.precioFinal = 0.f;
        for (DetalleFactura detalleFactura : detalles) {
            this.precioFinal += detalleFactura.getPrecioFInal();
        }
    }
    
    //Functiones que debe cumplir getPF getIVA
    
    public void addDetalle(DetalleFactura det){
        this.detalles.add(det);
        actualizarPrecio();
    }
    
    public Float getPrecioFinal(){
        actualizarPrecio();
        return this.precioFinal;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }
    
}
