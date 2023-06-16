package objetos2016;

import java.time.LocalDate;

public class Visita {
	private Float monto;
	private String enfermedad;
	private LocalDate fecha;

	public Visita(Float monto, String enfermedad) {
		super();
		this.monto = monto;
		this.enfermedad = enfermedad;
		this.fecha = LocalDate.now();
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Float getMonto() {
		return monto;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

}
