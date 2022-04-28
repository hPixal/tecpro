import java.util.ArrayList;

public class Privado extends HospedajeRol {

  private Short camas;


  public Privado(Boolean bañoCompartido, Short camas) {
    super(bañoCompartido, "Privado");
    this.camas = camas;
  }

  @Override
  public void obtenerCaracteristicas() {
    System.out.println("Tipo de Hospedaje: " + this.getTipo());
    System.out.println("Tiene baño compartido: ");
    if (getBañoCompartido()) System.out.print("SI");
                             System.out.print("NO");
    System.out.println("Cantidad de camas: " + this.getCamas());
  }

  public Short getCamas() {
    return camas;
  }
}
