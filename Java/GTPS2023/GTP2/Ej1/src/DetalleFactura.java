package Java.GTPS2023.GTP2.Ej1.src;

public class DetalleFactura {
    private Float precioFinal;
    private Integer unidades;
    private Articulo artic;
    public DetalleFactura(Float precioFinal, Integer unidades, Articulo artic) {
        this.precioFinal = precioFinal;
        this.unidades = unidades;
        this.artic = artic;
    }
    public Float getPrecioFInal(){
        return unidades*artic.getCosto();
    }

}
