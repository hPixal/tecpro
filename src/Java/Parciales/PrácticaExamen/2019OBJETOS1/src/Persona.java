import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String email;
    private List<PersonaRol> rol;
    private List<Comentario> comentarios;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.rol = new ArrayList<PersonaRol>();
        this.comentarios = new ArrayList<Comentario>();
    }

    public void mostrarPersona(){
        System.out.println("NOMBRE : " + this.nombre);
        System.out.println("EMAIL : " +this.email);
    }
    public void crearComentario(String comentario, Short estrellas,PersonaRol personaRol){
        Comentario newComment = new Comentario(comentario,estrellas,personaRol);
    }

    public void setRol(PersonaRol rol) {
        this.rol.add(rol);
    }

    public void mostrarComentariosCondicionado(Short estrellas,PersonaRol personaRol) {
        for (Comentario comentario : comentarios) {
            comentario.mostrarComentarioCondicionado(estrellas,personaRol);
        }
    }
}
