import java.time.*;

public class Entrega {
    private LocalDate entrega;
    private Cupon oCupon; 
    private RolVentanillaDTO oRolVentanillaDTO;
    private ComedorDTO oComedorDTO;

    public Entrega(LocalDate entrega, Cupon oCupon, RolVentanillaDTO oRolVentanillaDTO, ComedorDTO oComedorDTO) {
        this.entrega = entrega;
        this.oCupon = oCupon;
        this.oRolVentanillaDTO = oRolVentanillaDTO;
        this.oComedorDTO = oComedorDTO;
        this.oCupon.addEntrega(this);
        this.oComedorDTO.addEntrega(this);
    }
    
    

}
