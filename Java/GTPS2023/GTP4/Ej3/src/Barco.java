import java.time.LocalDate;

public abstract class Barco {
    private Amarre amarre;
    private Integer matricula;
    private Float eslora;
    private LocalDate fabricacion;

    public Barco(Amarre amarre, Integer matricula, Float eslora, LocalDate fabricacion) {
        this.amarre = amarre;
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public Amarre getAmarre() {
        return amarre;
    }

    public void setAmarre(Amarre amarre) {
        this.amarre = amarre;
    }

    public Float getEslora() {
        return eslora;
    }

    public Float getModulo() {
        return eslora * 10;
    }
}
