public class Perro extends Especie {
    private String raza;


    public Perro(Float descuento, String raza) {
        super("Perro", descuento);
        this.raza = raza;
    }

    @Override
    public String getDescripcion() {
        return getRaza();
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public Float obtenerDescuentoDeEspecie() {
        return null;
    }
    
}
