package objetos2016;

import java.time.*;
import java.util.List;
import java.util.ArrayList;

public class Persona {
	private String nommbre;
	private LocalDate fecha_nacimiento;
	private List<FamiliaRol> rol;
	
	public void addRol(FamiliaRol rol) {
		this.rol.add(rol);
		this.rol = new ArrayList<FamiliaRol>();
	}

	public String getNommbre() {
		return nommbre;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public List<FamiliaRol> getRol() {
		return rol;
	}
	
	
}
