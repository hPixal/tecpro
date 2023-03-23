import java.util.Calendar;

public class Velero extends Barco {

  private Integer nroMastiles;

  public Velero(
    Integer matricula,
    Float eslora,
    Float valorEspecial,
    Calendar fechaFabricacion,
    Integer nroMastiles
  ) {
    super(matricula, eslora, valorEspecial, fechaFabricacion, "Velero");
    this.nroMastiles = nroMastiles;
  }

  @Override
  public Float calcularValor() {
    Float devolver = 0.f;
    devolver =
      this.calcularValor() + this.nroMastiles + this.valorEspecialXDia();
    return devolver;
  }
}
