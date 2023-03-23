import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LocalDate nacimiento = LocalDate.of(2001,8,31);
        Integer dni = 43538493;
        Boolean sexo = true;
        Persona persona = new Persona("Nahuel", dni , nacimiento, sexo);
        persona.showInforme();
    }
}
