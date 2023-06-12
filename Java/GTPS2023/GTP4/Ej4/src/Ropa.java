public class Ropa extends Local {
    private Boolean varon;
    private Boolean mujer;
    public Ropa(String nombre, Direccion dir, Boolean varon, Boolean mujer) {
        super(nombre, dir);
        this.varon = varon;
        this.mujer = mujer;
    }
    public Boolean getVaron() {
        return varon;
    }
    public void setVaron(Boolean varon) {
        this.varon = varon;
    }
    public Boolean getMujer() {
        return mujer;
    }
    public void setMujer(Boolean mujer) {
        this.mujer = mujer;
    }
    @Override
    public void display() {
        if(this.varon && this.mujer){
            System.out.println("LOCAL DE ROPA MIXTO");
        }else if(varon){
            System.out.println("LOCAL DE ROPA DE VARON");
        }else if(mujer){
            System.out.println("LOCAL DE ROPA DE MUJER");
        }else{
            System.out.println("ERROR DE INICIALIZACION");
        }
    }
}
