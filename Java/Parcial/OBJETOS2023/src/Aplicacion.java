import java.time.LocalDate;

public class Aplicacion {
    private Vacuna vacuna;
    private HistoriaClinica hC;
    private LocalDate fechaAplicacion;

    public Aplicacion(Vacuna vacuna, HistoriaClinica hC, LocalDate fechaAplicacion) {
        this.vacuna = vacuna;
        this.hC = hC;
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getStringAplicacion() {
        String year = Integer.toString(this.fechaAplicacion.getYear());
        String month = Integer.toString(this.fechaAplicacion.getMonthValue());
        String day = Integer.toString(this.fechaAplicacion.getDayOfMonth());

        String concatValue = year + "-" + month + "-" + day;
        return concatValue;
    }


    public Vacuna getVacuna() {
        return vacuna;
    }

    public HistoriaClinica gethC() {
        return hC;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void mostrarVacunaSiEsParaEnfermedad(String enfermedad){
        if(this.estaVacunadoPara(enfermedad)){
            this.vacuna.mostrar();
            this.mostrar();
        }
    }

    public void mostrar(){
        System.out.println("FECHA APLICACION : " + this.getStringAplicacion());
    }

    public Boolean estaVacunadoPara(String enfermedad){
        Boolean valor = false;
        valor = vacuna.esPara(enfermedad);
        return valor;
    }
}
