package Java.GTPS2023.GTP2.Ej1.src;

public class Articulo {
    private Integer idArticulo;
    private Float costo;
    private String name;

    public Articulo(Integer idArticulo, Float costo, String name) {
        this.idArticulo = idArticulo;
        this.costo = costo;
        this.name = name;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
