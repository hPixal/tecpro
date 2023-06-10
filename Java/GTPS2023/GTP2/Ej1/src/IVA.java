package Java.GTPS2023.GTP2.Ej1.src;

public class IVA {
    private Float porcentaje;
    private String tipo;
    public IVA(Float porcentaje, String tipo) {
        this.porcentaje = porcentaje;
        this.tipo = tipo;
    }
    public Float getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
