import java.util.List;

public class Veterinaria {
    private String nombre;
    private String domicilio;
    private Float costoBase;
    private List<HistoriaClinica> historias;
    private List<Familia> clientes;

    public Veterinaria(String nombre, String domicilio, Float costoBase) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.costoBase = costoBase;
    }

    public void addFamilia(Familia familia) {
        this.clientes.add(familia);
    }

    public void addHistoriaClinica(HistoriaClinica hC) {
        this.historias.add(hC);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Float getCostoBase() {
        return costoBase;
    }

    public void mostrarPerrosVacunadosParaDermatitis(String raza){
        String enfermedad = "Dermatitis";
        for (HistoriaClinica historia : historias) {
            historia.mostrarSiPerroEnfermedad(raza,enfermedad);
        }
    }

}
