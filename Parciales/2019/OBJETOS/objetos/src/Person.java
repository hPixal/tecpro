import java.util.Vector;

public class Person {

  private String name;
  private String email;
  private Vector<Comment> comment;
  private Vector<Rol> rol;

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
    this.comment = new Vector<Comment>();
    this.rol = new Vector<Rol>();
  }

  public Boolean hasComments() {
    return this.comment.isEmpty();
  }

  public Vector<Comment> getComments() {
    return this.comment;
  }

  public Vector<Comment> getComments(Short stars) {
    Vector<Comment> out = new Vector<Comment>();

    if (!this.comment.isEmpty()) {
      for (Comment it : this.comment) {
        if (it.compareStars(stars)) {
          out.add(it);
        }
      }
    }

    return out;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addRol(Rol rol) {
    this.rol.add(rol);
  }
}
