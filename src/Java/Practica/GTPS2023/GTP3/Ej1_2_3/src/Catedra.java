import java.util.List;

public class Catedra {
    private String nombreCatedra;
    private Integer nroCatedra;
    private List<Comision> comisiones;

    public Catedra(String nombreCatedra, Integer nroCatedra) {
        this.nombreCatedra = nombreCatedra;
        this.nroCatedra = nroCatedra;
    }

    public void displayAlumnos(){
        for (Comision comision : comisiones) {
            comision.displayAlumnos();
        }
    }
    
    public void addComision(Comision comi){
        this.comisiones.add(comi);
    }

    public String getNombreCatedra() {
        return nombreCatedra;
    }

    public void setNombreCatedra(String nombreCatedra) {
        this.nombreCatedra = nombreCatedra;
    }

    public Integer getNroCatedra() {
        return nroCatedra;
    }

    public void setNroCatedra(Integer nroCatedra) {
        this.nroCatedra = nroCatedra;
    }

}
