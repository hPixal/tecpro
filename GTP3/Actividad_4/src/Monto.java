public class Monto {
    private Moneda moneda;
    private Float monto;
    private Float montoEnPeso;

    public Monto(Moneda moneda, Float monto) {
        this.moneda = moneda;
        this.monto = monto;
        this.montoEnPeso = moneda.obtenerMontoEnPeso(monto);
    }

    public Float obtenerMontoEnPeso(){
        return this.montoEnPeso;
    }



    
}
