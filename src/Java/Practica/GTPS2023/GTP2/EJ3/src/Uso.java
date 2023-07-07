public class Uso {
    private Integer kilos;
    private Vehiculo vehi;
    private Persona dueno;

    public Uso(Integer kilos, Vehiculo vehi, Persona dueno) {
        this.kilos = kilos;
        this.vehi = vehi;
        this.dueno = dueno;
    }

    public Integer getKilos() {
        return kilos;
    }

    public void setKilos(Integer kilos) {
        this.kilos = kilos;
    }

    public Vehiculo getVehi() {
        return vehi;
    }

    public void setVehi(Vehiculo vehi) {
        this.vehi = vehi;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

}
