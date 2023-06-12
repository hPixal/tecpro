import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Historial {
    private Integer codigoCuenta;
    private List<Transaccion> historia;

    public Historial(Integer codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
        this.historia = new ArrayList<Transaccion>();
    }

    public Integer getCodigoCuenta() {
        return codigoCuenta;
    }

    public void addTrans(Transaccion trans){
        this.historia.add(trans);
    }

    public void verTransacciones(){
        for(Transaccion i : historia){
            i.display(); 
        }
    }

    public Float validarSaldo(Tipo_Moneda tipo){
        Float acum=0.f;
        for (Transaccion transaccion : historia) {
            acum+=transaccion.getMonto(tipo);
        }
        return acum;
    }

    public Float validarSaldo(){
        Float acum=0.f;
        for (Transaccion transaccion : historia) {
            acum+=transaccion.getMonto();
        }
        return acum;
    }

    public Float comision(LocalDate desde, LocalDate hasta){
        Float sumTrans = 0.f;
        Integer canTrans=0;
         for (Transaccion trans : historia) {
            LocalDate fechaTrans = trans.getFecha();
            if(fechaTrans.isAfter(desde) && fechaTrans.isBefore(hasta)){
                sumTrans+=trans.getMonto();
                canTrans+=1;
            }
         }
         return 30 - ((sumTrans/canTrans)* 0.005f);
    }
 
 



       

}
