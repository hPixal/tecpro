public class Nacionalidad {
    private String nombrePais;
    private Integer codPais;
    private Float precioImportacion;

    public Nacionalidad(String nombrePais, Integer codPais, Float precioImportacion) {
        this.nombrePais = nombrePais;
        this.codPais = codPais;
        this.precioImportacion = precioImportacion;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public Float getPrecioImportacion() {
        return precioImportacion;
    }

    public void setPrecioImportacion(Float precioImportacion) {
        this.precioImportacion = precioImportacion;
    }

}
