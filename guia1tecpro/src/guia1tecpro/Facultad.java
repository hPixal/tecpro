package guia1tecpro;

import java.util.ArrayList;

public class Facultad {
	String name;
	ArrayList<Career> cars;
	public Facultad(String name,Career car) {
		super();
		cars = new ArrayList<Career>();
		this.name = name;
		cars.add(car);
	}
	
	public Facultad(String name, ArrayList<Career> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	
	public void showCareerStudents() {
		for(int i = 0 ; i < cars.size() ; i++) {
			System.out.println("Career: "+cars.get(i).getName());
			System.out.println("Students: ");
			cars.get(i).showStudents();
		}
	}
}
