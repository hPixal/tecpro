public class Raza {
    private String nombre;
    private String descripcion;
    public Raza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    public Boolean esRaza(String raza){
        if(this.nombre == raza){
            return true;
        }
        return false;
    }
}
