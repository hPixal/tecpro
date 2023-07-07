import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona per = new Persona(43538493,"Carlo Gimenez","Rosario","+54 9 323 522 2996",LocalDate.parse("2001-08-31"));
        System.out.println("DNI:       "+per.getDni());
        System.out.println("NOMBRE:    "+per.getNombre());
        System.out.println("TELEFONO:  "+per.getTelefono());
        System.out.println("EDAD:      "+per.getEdad());
        System.out.println("NACIMIENTO:"+per.getStringBirthday());
    }
}
