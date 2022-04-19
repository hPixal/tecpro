import java.util.Vector;

public class Person {

  private String name;
  private String email;
  private Vector<Comment> comments;
  private Vector<Rol> rol;

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
    this.comments = new Vector<Comment>();
    this.rol = new Vector<Rol>();
  }

  public Boolean hasComments() {
    return this.comments.isEmpty();
  }

  public Vector<Comment> getComments() {
    return this.comments;
  }

  public void displayComments(){
    if(this.hasComments()){
      for(Comment it : this.comments){
        it.displayComment();
      }
    }
  }

  public Vector<Comment> getComments(Short stars) {
    Vector<Comment> out = new Vector<Comment>();

    if (!this.comments.isEmpty()) {
      for (Comment it : this.comments) {
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
