public class Entero extends HospedajeRol {

  private Short ambientes;

  public Entero(Boolean bañoCompartido, Short ambientes) {
    super(bañoCompartido, "Entero");
    this.ambientes = ambientes;
  }

  @Override
  public void obtenerCaracteristicas() {
    System.out.println("Tipo de Hospedaje: " + this.getTipo());
    System.out.println("Tiene baño compartido: ");
    if (getBañoCompartido()) System.out.print("SI");
                             System.out.print("NO");
    System.out.println("Cantidad de ambientes: " + this.getAmbientes());
  }

  public Short getAmbientes() {
    return ambientes;
  }
}
