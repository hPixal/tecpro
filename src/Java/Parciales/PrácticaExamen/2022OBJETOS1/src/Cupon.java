import java.time.*;
import java.util.List;
import java.util.ArrayList;

public class Cupon {
    private String identificador;
    private LocalDate fechaCompra;
    private Entrega oEntrega;

    public Boolean entregado() {
        return oEntrega != null;
    }
    
    public void addEntrega(Entrega entrega){
        this.oEntrega = entrega;
    }

}