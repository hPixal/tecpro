import java.util.Calendar;
import javax.crypto.interfaces.PBEKey;
import javax.swing.UIDefaults.ProxyLazyValue;

public abstract class Barco {

  private Integer matricula;
  private Float eslora;
  private Float valorEspecial;
  private Calendar fechaFabricacion;
  private String tipo;

  public Barco(
    Integer matricula,
    Float eslora,
    Float valorEspecial,
    Calendar fechaFabricacion,
    String tipo
  ) {
    this.matricula = matricula;
    this.eslora = eslora;
    this.valorEspecial = valorEspecial;
    this.fechaFabricacion = fechaFabricacion;
    this.tipo = tipo;
  }

  public Float valorNormalXDia() {
    Float devolver = 0.f;
    devolver = eslora * 10;
    return devolver;
  }

  public Float valorEspecialXDia() {
    Float devolver = 0.f;
    devolver = valorNormalXDia() * valorEspecial;
    return devolver;
  }

  public abstract Float calcularValor();
}
