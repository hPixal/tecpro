import java.security.PublicKey;
import java.util.Calendar;

public class Entrega {

  private Calendar fecha;
  RolVentanillaDTO rolVentanillaDTO;
  Cupon cupon;

  public Entrega(Calendar fecha,Cupon cupon) {
    this.cupon = cupon;
    this.fecha = fecha;
  }

  public Boolean comioEnDia(Calendar dia){
      return fecha.equals(dia);
  }

  public void mostrarComensal(){
      this.cupon.mostrarComensal();
  }
}
