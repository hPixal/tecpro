import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

public class Alquiler {

  private ArrayList<HospedajeRol> roles;
  private Calendar desde;
  private Calendar hasta;
  private Float precio;
  private Vector<Persona> inquilinos;

  public Alquiler(Calendar desde, Calendar hasta, Float precio) {
    this.desde = desde;
    this.hasta = hasta;
    this.precio = precio;
  }

public Vector<Persona> getInquilinos() {
    return inquilinos;
}

public void setInquilinos(Persona inquilinos) {
    this.inquilinos.add(inquilinos);
}

public ArrayList<HospedajeRol> getRoles() {
    return roles;
  }

  public void setRoles(HospedajeRol roles) {
    this.roles.add(roles);
  }

  public Calendar getDesde() {
    return desde;
  }

  public Calendar getHasta() {
    return hasta;
  }

  public Float getPrecio() {
    return precio;
  }
}
