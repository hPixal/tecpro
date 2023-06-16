package objetos2016;

import java.util.ArrayList;
import java.util.List;

public class Familia {
	private String apellido;
	private String direccion;
	private Integer telefono;
	private Responsable responsable;
	private List<Integrante> integrantes;
	private List<Mascota> mascotas;

	public Familia(String apellido, String direccion, Integer telefono, Responsable responsable) {
		super();
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.responsable = responsable;
		this.integrantes = new ArrayList<Integrante>();
		this.mascotas = new ArrayList<Mascota>();
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public void addIntegrante(Integrante integrante) {
		this.integrantes.add(integrante);
	}

	public void addMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public Responsable getResponsable() {
		return responsable;
	}
}
