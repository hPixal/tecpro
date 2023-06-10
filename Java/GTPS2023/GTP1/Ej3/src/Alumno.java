public class Alumno {
    private Persona per;
    private Carrera car;
    public Alumno(Persona per, Carrera car) {
        this.per = per;
        this.car = car;
    }
    public Integer getDNI(){
        return per.getDni();
    }
    public void displayPersona(){
        this.per.displayNombre();
    }
    
}
