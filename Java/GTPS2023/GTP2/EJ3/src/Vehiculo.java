public class Vehiculo {
    private Float precioBase;
    private String modelo;
    private String marca;
    private Uso uso;
    private Nacionalidad nac;
    private Float precioReal;


    public Vehiculo(Float precioBase, String modelo, String marca, Uso uso, Nacionalidad nac) {
        this.precioBase = precioBase;
        this.modelo = modelo;
        this.marca = marca;
        this.uso = uso;
        this.nac = nac;
    }
    // Clases privadas 

    private void actualizarPrecio(){
        this.precioReal = this.precioBase + this.nac.getPrecioImportacion();
    }


    // Clases publicas

    public Float getPrecioBase() {
        return precioBase;
    }

    
    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
        actualizarPrecio();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    public Nacionalidad getNac() {
        return nac;
    }

    public void setNac(Nacionalidad nac) {
        this.nac = nac;
        actualizarPrecio();
    }

    public Float getPrecioReal() {
        return precioReal;
    }

}
