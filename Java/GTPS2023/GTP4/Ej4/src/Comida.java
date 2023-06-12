public class Comida extends Local {
    private Boolean bar;

    public Comida(String nombre, Direccion dir, Boolean bar) {
        super(nombre, dir);
        this.bar = bar;
    }

    public Boolean getBar() {
        return bar;
    }

    @Override
    public void display() {
        System.out.println("LOCAL DE COMIDA");
        if(this.bar){
            System.out.println("BAR : TRUE");
        }else{
            System.out.println("COMEDOR : TRUE");
        }
        this.normDisplay();
    }
}
