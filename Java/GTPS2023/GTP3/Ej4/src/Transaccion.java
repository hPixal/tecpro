import java.time.LocalDate;

public class Transaccion {
    private Tipo_Moneda tmoneda;
    private Tipo_Operacion top;
    private LocalDate fecha;
    private Float monto;

    public Transaccion(Tipo_Moneda tmoneda, Tipo_Operacion top, LocalDate fecha, Float monto) {
        this.tmoneda = tmoneda;
        this.top = top;
        this.fecha = fecha;
        this.monto = monto;
    }

    public Tipo_Moneda getTmoneda() {
        return tmoneda;
    }

    public Tipo_Operacion getTop() {
        return top;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void display(){
        System.out.println("FECHA : " + fecha.toString());
        tmoneda.display();
        top.display();
        System.out.println("MONTO : $" + monto);
    }

    public Float getMonto(Tipo_Moneda tipo) {
        if (this.tmoneda.compareTipo(tipo)) {
            if (this.top.getSuma()) {
                return monto * tmoneda.getConversion();
            } else if (this.top.getResta()) {
                return -monto * tmoneda.getConversion();
            } else { // CONSULTA
                return 0.f;
            }
        }
        return monto;
    }

    public Float getMonto() {
        if (this.top.getSuma()) {
            return monto * tmoneda.getConversion();
        } else if (this.top.getResta()) {
            return -monto * tmoneda.getConversion();
        } else { // CONSULTA
            return 0.f;
        }
    }

}
