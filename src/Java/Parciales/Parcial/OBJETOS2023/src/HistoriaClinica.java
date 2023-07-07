import java.time.LocalDate;
import java.util.List;

import javax.swing.text.rtf.RTFEditorKit;

import java.util.ArrayList;

public class HistoriaClinica {
    private LocalDate fecha;
    private Mascota mascota;
    private List<Aplicacion> aplicaciones;
    private List<EnfermedadCongenita> enfermedades;

    public HistoriaClinica(LocalDate fecha, Mascota mascota) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.aplicaciones = new ArrayList<Aplicacion>();
        this.enfermedades = new ArrayList<EnfermedadCongenita>();
    }
    
    public String getStringFecha() {
        String year = Integer.toString(this.fecha.getYear());
        String month = Integer.toString(this.fecha.getMonthValue());
        String day = Integer.toString(this.fecha.getDayOfMonth());

        String concatValue = year + "-" + month + "-" + day;
        return concatValue;
    }

    public void addAplicacion(Aplicacion aplicacion) {
        this.aplicaciones.add(aplicacion);
    }

    public void addEnfermedadCongenita(EnfermedadCongenita enfermedad) {
        this.enfermedades.add(enfermedad);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Boolean tieneEnfermedad(){
        if(!this.enfermedades.isEmpty()){
            return true;
        }
        return false;
    }

    public void mostrarEnfermedades(){
        if(this.tieneEnfermedad()){ 
            for (EnfermedadCongenita enfermedad : enfermedades) {
                enfermedad.mostrar();
            }
        }
    }

    public Boolean encuentraVacunacion(String enfermedad){
        Boolean valor = false;
        for (Aplicacion aplicacion : aplicaciones) {
            if(aplicacion.estaVacunadoPara(enfermedad)){
                valor = true;
            }
        }

        return valor;
    }
    
    
    public void mostrarVacunaParaEnfermedad(String enfermedad){
        for (Aplicacion aplicacion : aplicaciones) {
            aplicacion.mostrarVacunaSiEsParaEnfermedad(enfermedad);
        }
    }

    public void mostrarSiEstaVacunadoParaEnfermedades(){
        for (EnfermedadCongenita enfermedad : enfermedades) {
            Boolean aux = false; String auxenf = enfermedad.getNombre();
            System.out.println("DATOS DE LA ENFERMEDAD");
            enfermedad.mostrar();
            for (Aplicacion aplicacion : aplicaciones) {
                if(aplicacion.estaVacunadoPara(auxenf)){
                    aux = true;
                }
                
            }
            if(aux){
                this.mostrarVacunaParaEnfermedad(auxenf);
            }else{
                System.out.println("NO ESTA VACUNADO PARA LA ENFERMEDAD");
            }
        }
    }

    public void mostrarSiEnfermedad(String enfermedad){
        for (EnfermedadCongenita enfit : enfermedades) {
            enfit.mostrarEnfermedadSi(enfermedad);
        }
    }



    public void mostrarSiEstaVacunadoParaEnfermedad(String enfermedad){
        Boolean aux = false;
        System.out.println("DATOS DE LA ENFERMEDAD");
        
        for (Aplicacion aplicacion : aplicaciones) {
            if(aplicacion.estaVacunadoPara(enfermedad)){
                aux = true;
            }
            
        }
        if(aux){
            this.mostrarVacunaParaEnfermedad(enfermedad);
        }else{
            System.out.println("NO ESTA VACUNADO PARA LA ENFERMEDAD");
        }
    }

    public void mostrarSiPerroEnfermedad(String raza,String enfermedad){
        if(this.tieneEnfermedad()){
            if(this.mascota.esPerro()){
                this.mascota.mostrarSiRaza(raza);
                this.mostrarSiEstaVacunadoParaEnfermedad(enfermedad);
            }
        }
    }
}
