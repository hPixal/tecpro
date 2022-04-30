public class Otros extends Especie {
    private String caracteristica;



    public Otros(String nombreEspecie, Float descuento, String caracteristica) {
        super(nombreEspecie, descuento);
        this.caracteristica = caracteristica;
    }

    @Override
    public String getDescripcion() {
        return getCaracteristica();
    }

    public String getCaracteristica(){
        return this.caracteristica;
    }
    
}
