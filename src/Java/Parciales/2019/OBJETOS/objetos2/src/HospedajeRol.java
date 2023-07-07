public abstract class HospedajeRol {

  private Boolean bañoCompartido;
  private String tipo;

  public HospedajeRol(Boolean bañoCompartido, String tipo) {
    this.bañoCompartido = bañoCompartido;
    this.tipo = tipo;
  }

  public Boolean getBañoCompartido() {
    return bañoCompartido;
  }

  public String getTipo() {
    return tipo;
  }

  public void obtenerCaracteristicas(){
    System.out.println("Tipo de Hospedaje: " + this.getTipo());
    System.out.println("Tiene baño compartido: ");
    if (getBañoCompartido()) System.out.print("SI");
                             System.out.print("NO");
  }
}
