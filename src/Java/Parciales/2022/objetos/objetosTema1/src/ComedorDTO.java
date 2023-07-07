import java.util.Calendar;
import java.util.Vector;

public class ComedorDTO {
    private String descripcion;
    private String domicilio;
    private Vector<Entrega> entregas;

    public void mostrarComensalesDia(Calendar dia){
        for(Entrega it : entregas){
            if(it.comioEnDia(dia)){
                mostrarComedor();
                it.mostrarComensal();
            }
        }
    }

    public void mostrarComedor(){
        System.out.println("Comedor: "+this.descripcion);
        System.out.println("Direccion: "+this.domicilio);
    }
}
