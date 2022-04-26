public class Extraccion extends Transaccion{

    public Extraccion(Monto monto, String naturaleza) {
        super(monto, "Extraccion");
    }
    
    @Override
    public void mostrarOperacion(){
        System.out.println("Concepto |     DEBE     |    HABER     |");
        System.out.println("Concepto en Cta/Cte | -------- |" + this.obtenerMonto());
        System.out.println("Extraccion de Cta/Cte | " + this.obtenerMonto() + " | ------- |");
    }

    @Override
    public Float obtenerMontoEnPesos() {
        return -obtenerMonto();
    }
    
}
