import java.util.List;

public class Vacuna {
    private String marca;
    private String droga;
    private Integer stock;
    private String enfermedad;
    private List<Aplicacion> aplicaciones;

    public Vacuna(String marca, String droga, Integer stock, String enfermedad) {
        this.enfermedad = enfermedad;
        this.marca = marca;
        this.droga = droga;
        this.stock = stock;
    }
    
    public void addAplicacion(Aplicacion aplicacion){
        this.aplicaciones.add(aplicacion);
    }

    public String getMarca() {
        return marca;
    }

    public String getDroga() {
        return droga;
    }

    public Integer getStock() {
        return stock;
    }

    public Boolean esPara(String enfermedad){
        Boolean valor = false;
        if(this.enfermedad == enfermedad){
            valor = true;
        }
        return valor;
    }

    public void mostrar(){
        System.out.println("MARCA : "+ this.marca);
        System.out.println("DROGA : "+ this.droga);
        System.out.println("STOCK : "+ this.stock);
    }
    
}
