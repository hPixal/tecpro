import java.util.Vector;

public class AriBNB {

  Vector<Lodging> lodgings;
  Vector<Rent> rents;
  Vector<Person> persons;

  public AriBNB() {}

  public void addLodging(Lodging lod) {
    this.lodgings.add(lod);
  }

  public void addRents(Rent rent) {
    this.rents.add(rent);
  }

  public void addPerson(Person per) {
    this.persons.add(per);
  }

  public void showSharedLodgings() {
    for (Lodging it : lodgings) {
      if (it.getType() == "Shared") {
          System.out.println(it.getDirection());
      }
    }
  }
}
