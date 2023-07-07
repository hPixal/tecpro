import java.util.List;

public class ComedorDTO {
    private String descripcion;
    private String domicilio;
    private List<Entrega> entregas;
    public ComedorDTO(String descripcion, String domicilio) {
        this.descripcion = descripcion;
        this.domicilio = domicilio;
    }
    
    public void mostrarDatos(){
        System.out.println("DIRECCION: " + this.domicilio);
        System.out.println("DESCRIPCION : " + this.descripcion);
    }

   public void addEntrega(Entrega oEntrega)
   {
     entregas.add(oEntrega);
   }
    
}
