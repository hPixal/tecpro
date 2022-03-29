import java.util.*;

public class Person {

  private String name;
  private String surname;
  private Calendar BirthDate;
  private Integer DNI;
  private String hashedPass;

  public Person(String name, String surname, Calendar BirthDate,String pass) {
    super();
    this.name = name;
    this.surname = surname;
    this.BirthDate = BirthDate;
    this.hashedPass = StringMD.getStringMessageDigest(pass,StringMD.SHA256);
  }

  public Integer getAge() {
    Integer birthYear = this.BirthDate.get(Calendar.YEAR);
    Integer birthMonth = this.BirthDate.get(Calendar.MONTH);
    Integer birthDay = this.BirthDate.get(Calendar.DAY_OF_MONTH);

    Calendar currentDate = Calendar.getInstance();
    Integer currentYear = currentDate.get(Calendar.YEAR);
    Integer currentMonth = currentDate.get(Calendar.YEAR);
    Integer currentDay = currentDate.get(Calendar.YEAR);

    Integer age = currentYear - birthYear;

    if (birthMonth > currentMonth) return --age;
    if (birthMonth == currentMonth) {
      if (birthDay > currentDay) return --age;
    }

    return age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Calendar getBirthDate() {
    return BirthDate;
  }

  public void setBirthDate(Calendar birthDate) {
    BirthDate = birthDate;
  }

  public Integer getDNI() {
    return DNI;
  }

  public void setDNI(Integer dNI) {
    DNI = dNI;
  }

  public Boolean verificate(String pass){
    String ver = StringMD.getStringMessageDigest(pass,StringMD.SHA256);
    return (ver == this.hashedPass);
  }
}
