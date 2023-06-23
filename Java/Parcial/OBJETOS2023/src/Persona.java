public class Persona {
    private String apellido;
    private String nombre;
    private Integer telefono;
    
    public Persona(String apellido, String nombre, Integer telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getTelefono() {
        return telefono;
    }
    
}
