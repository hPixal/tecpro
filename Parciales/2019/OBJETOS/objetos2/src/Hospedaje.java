public class Hospedaje {

  private Integer capacidad;
  private String direccion;
  private HospedajeRol hospedajeRol;

  public Hospedaje(
    Integer capacidad,
    String direccion,
    HospedajeRol hospedajeRol
  ) {
    this.capacidad = capacidad;
    this.direccion = direccion;
    this.hospedajeRol = hospedajeRol;
  }

  public Integer getCapacidad() {
    return capacidad;
  }

  public String getDireccion() {
    return direccion;
  }

  public String getTipo(){
      return this.hospedajeRol.getTipo();
  }

  public Boolean getBanoCompartido(){
      return hospedajeRol.getBañoCompartido();
  }
  public void obetenerDatos(){
      System.out.println("Direccion: " + getDireccion());
      System.out.println("Capacidad: " + getCapacidad());
      this.hospedajeRol.obtenerCaracteristicas();
  }
}
