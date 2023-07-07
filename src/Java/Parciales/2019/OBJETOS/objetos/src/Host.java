public class Host extends Rol {

  private String username;

  public Host(String name, String email, String username) {
    super(name, email, "Host");
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
