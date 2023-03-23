public class Deposito extends Transaccion {
    

    public Deposito(Monto monto) {
        super(monto, "Deposito");
    }

    @Override
    public void mostrarOperacion() {
        System.out.println("Concepto |     DEBE     |    HABER     |");
        System.out.println("Deposito en Cta/Cte | " + this.obtenerMonto() + " | -------- |");
        System.out.println("Concepto en Cta/Cte | ----- |" + this.obtenerMonto());
        
    }

    @Override
    public Float obtenerMontoEnPesos() {
        return obtenerMonto();
    }
    
}
