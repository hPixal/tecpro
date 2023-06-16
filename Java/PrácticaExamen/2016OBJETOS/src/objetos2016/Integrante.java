package objetos2016;

public class Integrante extends FamiliaRol {

	public Integrante(Familia familia, Persona persona) {
		super(familia, persona);
		this.familia.addIntegrante(this);
	}

}
