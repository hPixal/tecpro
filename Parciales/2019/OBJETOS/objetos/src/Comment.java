public class Comment {

  private String comment;
  private Short stars;
  private Rol rol;

  public Comment(String comment, Short stars, Rol rol) {
    if (stars > 5) stars = 5;
    if (stars < 0) stars = 0;
    this.stars = stars;
    this.comment = comment;
    this.rol = rol;
  }

  public Boolean compareStars(Short stars) {
    if (stars > 5) stars = 5;
    if (stars < 0) stars = 0;
    return (this.stars == stars);
  }

  public String getComment() {
    return comment;
  }

  public String getRol() {
    return this.rol.getName();
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Short getStars() {
    return stars;
  }

  public void setStars(Short stars) {
    if (stars > 5) stars = 5;
    if (stars < 0) stars = 0;
    this.stars = stars;
  }
}
