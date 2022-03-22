package guia1tecpro;

public class Students {
	Person per;
	Career car;
	
	public Students(Person per, Career car) {
		super();
		this.per = per;
		this.car = car;
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
