package guia1tecpro;
import java.time.*;

public class Person {
	
	private int doc;
	private String name;
	private String surname;
	private LocalDate born;
	
	public Person(String name, String surname, LocalDate bday, int document){
		this.name = name;
		this.surname = surname;
		this.doc = document;
		this.born = bday;
	}
	

	public int getDoc() {
		return doc;
	}


	public void setDoc(int doc) {
		this.doc = doc;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public LocalDate getBorn() {
		return born;
	}


	public void setBorn(LocalDate born) {
		this.born = born;
	}


	public int getAge(){
		if(this.born.getMonthValue() > LocalDate.now().getMonthValue()){
			return (LocalDate.now().getYear()-born.getYear()-1);
		}
		if(this.born.getMonthValue() == LocalDate.now().getMonthValue()) {
			if(born.getDayOfMonth() < LocalDate.now().getDayOfMonth()){
				return (LocalDate.now().getYear()-born.getYear()-1);
			}
		}
		return LocalDate.now().getYear()-born.getYear();
	}
	
}
