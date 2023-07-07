package objetos2016;

import java.time.LocalDate;

public class Promocion {
	private Especie especie;
	private Float porcentaje;
	private LocalDate desde;
	private LocalDate hasta;

	public Promocion(Especie especie, Float porcentaje, LocalDate desde, LocalDate hasta) {
		super();
		this.especie = especie;
		this.porcentaje = porcentaje;
		this.desde = desde;
		this.hasta = hasta;
	}

	public Especie getEspecie() {
		return especie;
	}

	public Float getPorcentaje() {
		return porcentaje;
	}

	public LocalDate getDesde() {
		return desde;
	}

	public LocalDate getHasta() {
		return hasta;
	}

}
