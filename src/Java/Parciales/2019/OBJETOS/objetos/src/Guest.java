import java.util.Calendar;

public class Guest extends Rol {

  private Calendar birthdate;

  public Guest(String name, String email, Calendar birthdate) {
    super(name, email, "Guest");
    this.birthdate = birthdate;
  }

  public Calendar getBirthdate() {
    return birthdate;
  }
}
