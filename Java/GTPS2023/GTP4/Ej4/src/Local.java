public abstract class Local {
    private String nombre;
    private Direccion dir;
    public Local(String nombre, Direccion dir) {
        this.nombre = nombre;
        this.dir = dir;
    }
    public String getNombre() {
        return nombre;
    }
    public Direccion getDir() {
        return dir;
    }
    protected void normDisplay(){
        System.out.println("NOMBRE LOCAL : " + this.nombre);
        dir.display();
    }
    public abstract void display();
}
