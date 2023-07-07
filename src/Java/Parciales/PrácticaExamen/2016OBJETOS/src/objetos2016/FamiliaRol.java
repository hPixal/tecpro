package objetos2016;

public abstract class FamiliaRol {
	private Persona persona;
	protected Familia familia;

	public FamiliaRol(Familia familia, Persona persona) {
		super();
		this.familia = familia;
		this.persona = persona;
		persona.addRol(this);
		
	}

}
