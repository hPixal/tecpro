package guia1tecpro;
import java.time.*;

public class Students {
	Person per;
	Career car;
	LocalDate fechaInscripcion;

	
	public Students(Person per, Career car,LocalDate date) {
		super();
		this.per = per;
		this.car = car;
		this.fechaInscripcion = date; 
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}

	public Career getCar() {
		return car;
	}

	public void setCar(Career car) {
		this.car = car;
	}
	
}
