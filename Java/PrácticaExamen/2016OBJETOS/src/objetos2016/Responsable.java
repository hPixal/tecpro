package objetos2016;

public class Responsable extends FamiliaRol {
	private String correo;

	public Responsable(Familia familia, Persona persona, String correo) {
		super(familia, persona);
		this.correo = correo;
		this.familia.setResponsable(this);
	}

	public String getCorreo() {
		return correo;
	}
	
	
}
