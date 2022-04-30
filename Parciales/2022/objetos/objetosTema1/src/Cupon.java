import java.util.Calendar;

public class Cupon {

  private String identificador;
  private Calendar fechaCompra;
  private Entrega entrega;
  private RolComensalDTO rolComensalDTO;

  public Cupon(
    String identificador,
    Calendar fechaCompra,
    RolComensalDTO rolComensalDTO
  ) {
    this.identificador = identificador;
    this.fechaCompra = fechaCompra;
    this.rolComensalDTO = rolComensalDTO;
    entrega = null;
  }

  public void setEntrega(Entrega entrega) {
    this.entrega = entrega;
  }

  public Boolean comioEnDia(Calendar dia) {
    Boolean compara = false;
    if (this.entrega != null) compara = dia.equals(compara);
    return compara;
  }

  public void mostrarComensal(){
        this.rolComensalDTO.mostrarDatos();
  }

  public Boolean usado() {
    return this.entrega.equals(null);
  }
}
