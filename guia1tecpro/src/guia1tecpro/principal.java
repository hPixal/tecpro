package guia1tecpro;

import java.time.*;

public class principal {
	static public void main(String[] args) {
		
		LocalDate born = LocalDate.of(2001, 8, 31);
		String name = "Nahuel";
		String surname = "Gareis";
		int dni = 43538493;
		Person nahue = new Person(name,surname,born,dni);
		Career S_Ingeneering = new Career("Software Engineering");
		
		Students yo = new Students(nahue,S_Ingeneering);
		
		S_Ingeneering.addStudent(yo);
		
		Facultad fich = new Facultad("FICH",S_Ingeneering);
		fich.showCareerStudents();
	}
}
