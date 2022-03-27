import java.util.Calendar;

public class Student {

  private Person per;
  private Career car;
  private Calendar signIn;

  public Student(Person per, Career car,Calendar signIn) {
    this.per = per;
    this.car = car;
    this.signIn = signIn;
  }

  public String getPer() {
    return per.getName()+" "+per.getSurname();
  }

  public void setPer(Person per) {
    this.per = per;
  }

  public Career getCar() {
    return car;
  }

  public void setCar(Career car) {
    this.car = car;
  }

  public String getSignIn() {
    Integer year = signIn.get(Calendar.YEAR);
    Integer month = signIn.get(Calendar.MONTH);
    Integer day = signIn.get(Calendar.DAY_OF_MONTH);

    return day.toString()+"/"+month.toString()+"/"+year.toString();
  }

  public void setSignIn(Calendar signIn) {
    this.signIn = signIn;
  }

  public String toString() {
    return per.toString() + " " + car.toString();
  }
}
