import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Nodo madre = new Nodo('A',1);
        madre.addHijo('B');
        madre.addHijo('C');
        madre.display();
        List<Nodo> aux = madre.getHijos();
        for (Nodo nodo : aux) {
            if(nodo.esHoja()){
                System.out.println("Es hoja");
            }
        }
    }
}
