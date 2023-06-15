public abstract class PersonaRol {
    private Persona persona;

    

    public PersonaRol(Persona persona) {
        this.persona = persona;
    }

    public void mostrarPersona(){
        this.persona.mostrarPersona();
    }

    public void crearComentario(String comentario, Short estrallas){
        this.persona.crearComentario(comentario, estrallas,this);
    }

    public void mostrarComentarioCondicionado(Short estrellas){
        this.persona.mostrarComentariosCondicionado(estrellas,this);
    }

}
