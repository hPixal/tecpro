package objetos2016;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class Mascota {
	private String alias;
	private LocalDate fecha_nacimiento;
	private Float porcentaje;
	private Especie especie;
	private List<Visita> visitas;

	public Mascota(String alias, LocalDate fecha_nacimiento, Float porcentaje, Especie especie) {
		super();
		this.alias = alias;
		this.fecha_nacimiento = fecha_nacimiento;
		this.porcentaje = porcentaje;
		this.especie = especie;
		this.visitas = new ArrayList<Visita>();
	}

	public void addVisita(Visita visita) {
		this.visitas.add(visita);
	}

	public String getAlias() {
		return alias;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public Float getPorcentaje() {
		return porcentaje;
	}

	public Especie getEspecie() {
		return especie;
	}
	
	
}
