import java.util.Calendar;
import java.util.Vector;

public class HistoricoJornada {
    Vector<JornalHora> jornadas;

    public HistoricoJornada(JornalHora jorn){
        super();
        this.jornadas = new Vector<JornalHora>();
        this.jornadas.add(jorn);
    }

    void anadirJornada(JornalHora jornal){
        this.jornadas.add(jornal);
    }

    public Float devolverSueldo(Integer horas,Calendar cal){
        for(JornalHora it : jornadas){
            if(it.perteneceAFecha(cal)){
                return it.devolverValor(horas);
            }
        }
        return 0.f;
    }    
}
