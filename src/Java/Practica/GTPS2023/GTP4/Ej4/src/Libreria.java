public class Libreria extends Local{
    
    public Libreria(String nombre, Direccion dir) {
        super(nombre, dir);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("LIBRERIA");
        this.normDisplay();
    }
    
}
