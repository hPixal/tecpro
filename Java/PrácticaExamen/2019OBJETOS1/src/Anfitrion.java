public class Anfitrion  extends PersonaRol{
    private String usuario;

    public Anfitrion(Persona persona, String usuario) {
        super(persona);
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    

}
