public class Gato extends Especie {

  private String color;

  public Gato(Float descuento, String color) {
    super("Gato", descuento);
    this.color = color;
}

public String getColor() {
    return color;
  }

  @Override
  public String getDescripcion() {
    return getColor();
  }
}
