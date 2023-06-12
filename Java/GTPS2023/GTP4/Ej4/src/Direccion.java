public class Direccion {
    private Integer piso;
    private Integer direccion;
    public Direccion(Integer piso, Integer direccion) {
        this.piso = piso;
        this.direccion = direccion;
    }
    public Integer getPiso() {
        return piso;
    }
    public Integer getDireccion() {
        return direccion;
    }
    public void display(){
        System.out.println("DIRECCION: "+this.direccion);
        System.out.println("PISO : "+ this.piso);
    }
}
