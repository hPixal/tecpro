public abstract class Rol extends Person {

  private String rolname;

  public Rol(String name, String email, String rolname) {
    super(name, email);
    this.rolname = rolname;
  }

  public String getRealName(){
    return this.getName();
  }

  public String getRolname() {
    return this.rolname;
  }
}
