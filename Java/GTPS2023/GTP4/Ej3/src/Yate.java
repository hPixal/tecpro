import java.time.LocalDate;

public class Yate extends Barco {
    private Float cv;
    private Integer camarotes;

    public Yate(Amarre amarre, Integer matricula, Float eslora, LocalDate fabricacion, Float cv, Integer camarotes) {
        super(amarre, matricula, eslora, fabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public Float getCv() {
        return cv;
    }

    public void setCv(Float cv) {
        this.cv = cv;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public Float getModulo(){
        return (this.getEslora()*10.f + this.cv + this.camarotes );
    }
}
