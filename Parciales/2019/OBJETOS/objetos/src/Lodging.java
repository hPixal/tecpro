public class Lodging {

  private Integer capacity;
  private String direction;
  private Host host;
  private String name;
  private String type;

  public Lodging(
    Integer capacity,
    String direction,
    Host host,
    String name,
    String type
  ) {
    this.capacity = capacity;
    this.direction = direction;
    this.host = host;
    this.name = name;
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public String getDirection() {
    return direction;
  }

  public String getName() {
    return this.name;
  }

  public void showComments(){
    this.host.getComments();
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public String getHost() {
    return host.getUsername();
  }
}
