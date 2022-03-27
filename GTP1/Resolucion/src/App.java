import java.util.Calendar;

public class App {

  public static void main(String[] args) {
    Calendar b = Calendar.getInstance();
    b.set(Calendar.YEAR, 2001);
    b.set(Calendar.MONTH, 8);
    b.set(Calendar.DAY_OF_MONTH, 31);

    Person per = new Person("Nahuel", "Gareis", b);
    Career car = new Career("Software Engineering");

    b.set(Calendar.YEAR, 2019);
    b.set(Calendar.MONTH, 9);
    b.set(Calendar.DAY_OF_MONTH, 25);
    Student st = new Student(per, car,b);
    car.addStudent(st);

    College fich = new College(
      "Facultad de Ingeniería y Recursos Hídricos",
      car
    );

    fich.showCareersAndStudents();
  }
}
