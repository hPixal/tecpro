import java.util.Calendar;
import java.util.Vector;

public class Rent {

  private Float price;
  private Calendar from;
  private Calendar to;
  private Lodging lod;
  private Guest responsable;
  private Vector<Guest> group;
  private String type;

  public Rent(
    Float price,
    Calendar from,
    Calendar to,
    Lodging lod,
    Guest responsable,
    String type
  ) {
    this.price = price;
    this.from = from;
    this.to = to;
    this.lod = lod;
    this.responsable = responsable;
    this.type = type;
    this.group = new Vector<Guest>();
  }

  public Lodging getLod() {
    return lod;
  }

  public Guest getResponsable() {
    return responsable;
  }

  public Float getPrice() {
    return price;
  }

  public Calendar getFrom() {
    return from;
  }

  public Calendar getTo() {
    return to;
  }

  public String getType() {
    return this.type;
  }

  public void setGroup(Vector<Guest> group) {
    this.group = group;
  }

  public void addPerToGroup(Guest add) {
    this.group.add(add);
  }
}
