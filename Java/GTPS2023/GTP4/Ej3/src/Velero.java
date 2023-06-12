import java.time.LocalDate;

public class Velero extends Barco {
    private Integer mastiles;

    public Velero(Amarre amarre, Integer matricula, Float eslora, LocalDate fabricacion, Integer mastiles) {
        super(amarre, matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Float getModulo(){
        return (this.getEslora()*10.f + this.mastiles );
    }

}
