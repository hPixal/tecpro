package guia1tecpro;
import java.util.ArrayList;

public class Career {
	private String name;
	private ArrayList<Students> list;

	public Career(String name) {
		super();
		this.name = name;
		this.list = new ArrayList<Students>();
	}
	
	public void addStudent(Students a) {
		this.list.add(a);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showStudents() {
		for(int i = 0; i < list.size() ; i++ ) {
			System.out.println(list.get(i).getPer().getName() +" "+list.get(i).getPer().getSurname() + "  "+
			list.get(i).fechaInscripcion.getYear() + "/" + list.get(i).fechaInscripcion.getMonthValue() + "/" +
			list.get(i).fechaInscripcion.getDayOfMonth());
		}
	}
}
