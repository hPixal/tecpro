import java.util.ArrayList;
public class College {
    private String name;
    ArrayList<Career> cars;

    public College(String name) {
        this.name = name;
        this.cars = new ArrayList<Career>();
    }

    public College(String name,Career car) {
        this.name = name;
        this.cars = new ArrayList<Career>();
        cars.add(car);
    }
    
    public College(String name, ArrayList<Career> cars) {
        this.name = name;
        this.cars = cars;
    }

    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void showCareersAndStudents(){
        for(Integer i = 0; i < this.cars.size() ; i++){
            System.out.println("Career: "+cars.toString());
            System.out.println("Students: ");
            cars.get(i).showStudents();
        }
    }
}
