import java.util.Calendar;

public class Yate extends Barco {

  private Float potencia;
  private Integer nroCamarotes;

  public Yate(
    Integer matricula,
    Float eslora,
    Float valorEspecial,
    Calendar fechaFabricacion,
    Float potencia,
    Integer nroCamarotes
  ) {
    super(matricula, eslora, valorEspecial, fechaFabricacion, "Yate");
    this.potencia = potencia;
    this.nroCamarotes = nroCamarotes;
  }

@Override
public Float calcularValor() {
    Float devolver = 0.f;
    devolver  = this.calcularValor()+ (this.potencia + this.nroCamarotes) + this.valorEspecialXDia();
    return devolver;
}

  
}
