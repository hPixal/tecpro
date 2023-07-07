import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class RolComensalDTO extends RolUsuarioDTO {
    private LocalDate ultimoAcceso;
    private String tokenSesion;
    private Facultad facultad;
    private List<Cupon> cupones;

    public RolComensalDTO(UsuarioDTO oUsuarioDTO, LocalDate ultimoAcceso, String tokenSesion, Facultad facultad) {
        super(oUsuarioDTO);
        this.ultimoAcceso = ultimoAcceso;
        this.tokenSesion = tokenSesion;
        this.facultad = facultad;
        this.cupones = new ArrayList<Cupon>();
    }

    public void addCupon(Cupon cupon) {
        this.cupones.add(cupon);
        this.actualizarSaldo();
    }

    private String getUltimoAccesoString() {
        String year = Integer.toString(this.ultimoAcceso.getYear());
        String month = Integer.toString(this.ultimoAcceso.getMonthValue());
        String day = Integer.toString(this.ultimoAcceso.getDayOfMonth());

        String concatValue = year + "-" + month + "-" + day;
        return concatValue;
    }

    @Override
    public Boolean esComensal(){
        return true;
    }

    @Override
    public void mostrarDatos() {
        String ultimo = this.getUltimoAccesoString();
        this.actualizarSaldo();
        System.out.println("ULTIMO ACCESO: " + ultimo);
        System.out.println("TOKEN : " + this.tokenSesion);
        System.out.println("SALDO : " + this.actualizarSaldo());
        this.facultad.mostrarDatos();
    }

    private Integer actualizarSaldo() {
        Integer saldo = 0;
        for (Cupon i : cupones) {
            if (!i.entregado()) {
                saldo++;
            }
        }
        return saldo;
    }

}
