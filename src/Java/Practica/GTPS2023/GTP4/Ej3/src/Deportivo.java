import java.time.LocalDate;

public class Deportivo extends Barco {
    private Float cv;

    public Deportivo(Amarre amarre, Integer matricula, Float eslora, LocalDate fabricacion, Float cv) {
        super(amarre, matricula, eslora, fabricacion);
        this.cv = cv;
    }

    public Float getCv() {
        return cv;
    }

    public void setCv(Float cv) {
        this.cv = cv;
    }
    public Float getModulo(){
        return (this.getEslora()*10.f + this.cv );
    }
}
