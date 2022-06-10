import java.util.Calendar;

public class Deportivo extends Barco{
    private Float potencia;

    public Deportivo(Integer matricula, Float eslora, Float valorEspecial, Calendar fechaFabricacion, String tipo,
            Float potencia) {
        super(matricula, eslora, valorEspecial, fechaFabricacion, tipo);
        this.potencia = potencia;
    }

    @Override
    public Float calcularValor() {
        // TODO Auto-generated method stub
        return null;
    }

   
    
    
    

}
