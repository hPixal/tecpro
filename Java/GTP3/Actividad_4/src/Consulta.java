public class Consulta extends Transaccion{
    
    public Consulta(Monto monto) {
        super(monto, "Consulta");
    }

    @Override
    public void mostrarOperacion() {
        System.out.println("Concepto |     DEBE     |    HABER     |");
        System.out.println("Concepto en Cta/Cte |"+ this.obtenerMonto() + " |" + this.obtenerMonto());
    }

    @Override
    public Float obtenerMontoEnPesos() {
        return 0f;
    }
    
}
