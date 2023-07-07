public class Tipo_Operacion {
    private Short codigoTipo;
    private String nombre;
    private Boolean suma;
    private Boolean resta;

    public Tipo_Operacion(Short codigoTipo, String nombre, Boolean suma, Boolean resta) {
        this.codigoTipo = codigoTipo;
        this.nombre = nombre;
        this.suma = suma;
        this.resta = resta;
    }

    public void verTipo() {
        System.out.println(nombre);
    }

    public Short getCodigoTipo() {
        return codigoTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getSuma() {
        return suma;
    }

    public Boolean getResta() {
        return resta;
    }

    public void display(){
        System.out.println("CÓDIGO_TIPO : " + this.codigoTipo);
        System.out.println("NOMBRE_TIPO : " + this.nombre);
        System.out.println("RESTA       : " + this.resta);
        System.out.println("SUMA        : " + this.suma);

    }
}