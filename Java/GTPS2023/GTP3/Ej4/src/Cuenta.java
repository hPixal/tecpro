import java.time.LocalDate;

public class Cuenta {
    private Integer numCuenta;
    private Float saldo;
    private Historial historial;

    public Cuenta(Integer numCuenta, Float saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.historial = new Historial(numCuenta);
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Integer getNumCuenta() {
        return this.numCuenta;
    }

    public Float getSaldo() {
        return this.saldo;
    }

    public Float getSaldo(Tipo_Moneda tipo) {
        return this.historial.validarSaldo(tipo);
    }

    public void validarSaldo() {
        this.saldo = historial.validarSaldo();
    }

    public void verHistorialTransacciones(){
        historial.verTransacciones();
    }

    public void addTrans(Transaccion trans) {
        this.historial.addTrans(trans);
        this.saldo += trans.getMonto();
    }

    public Float comision(LocalDate desde, LocalDate hasta) {
        return historial.comision(desde, hasta);
    }
}
