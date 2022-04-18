import java.util.Calendar;

public class Guest extends Rol {

  private Calendar birthdate;

  public Guest(Calendar birthdate) {
    super("Guest");
    this.birthdate = birthdate;
  }

  public Calendar getBirthdate() {
    return birthdate;
  }
}
