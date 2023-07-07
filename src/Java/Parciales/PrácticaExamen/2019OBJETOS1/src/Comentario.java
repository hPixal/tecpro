public class Comentario {
    private String comentario;
    private Short estrellas;
    private PersonaRol personaRol;
    
    public Comentario(String comentario, Short estrellas, PersonaRol personaRol) {
        this.comentario = comentario;
        this.estrellas = estrellas;
        this.personaRol = personaRol;
    }

    public Boolean checkPersonaRol(PersonaRol dado){
        Class<? extends PersonaRol> c1 = this.personaRol.getClass();
        Class<? extends PersonaRol> c2 = dado.getClass();
        return c1 == c2;
    }
    
    public void mostrarComentario(){
        System.out.println("Estrellas : " + this.estrellas);
        System.out.println("Comentario : " + this.comentario);
    }
    
    public Boolean compararEstrellas(Short estrellas){
        return this.estrellas == estrellas;
    }
    public void mostrarComentarioCondicionado(Short estrellas,PersonaRol personaRol){
        if(this.compararEstrellas(estrellas) && this.checkPersonaRol(personaRol)){
            this.mostrarComentario(); 
            personaRol.mostrarPersona();

        }
    }


    
}
