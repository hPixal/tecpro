package Java.GTPS2023.GTP2.Ej1.src;

public class Empresa extends Cliente{
    private Integer cuit;
    private String nombre;
    private IVA iva;
    public Empresa(Integer nroCliete, Integer cuit, String nombre, IVA iva) {
        super(nroCliete);
        this.cuit = cuit;
        this.nombre = nombre;
        this.iva = iva;
    }
}  
