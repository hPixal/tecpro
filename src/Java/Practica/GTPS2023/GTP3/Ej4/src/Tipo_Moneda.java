public class Tipo_Moneda {
    private Short codigoTipo;
    private String nombre;
    private Float conversion;

    Tipo_Moneda(Short codigo, String nombre, Float conversion) {
        super();
        this.codigoTipo = codigo;
        this.nombre = nombre;
        this.conversion = conversion;

    };

    public void verTipo() {
        System.out.println(nombre);
    }

    public Boolean compareTipo(Tipo_Moneda tipo) {
        return tipo.getCodigo() == this.codigoTipo;
    }

    public Short getCodigo() {
        return codigoTipo;
    }

    public Float getConversion(){
        return this.conversion;
    }

    public void display(){
        System.out.println("NOMBRE_MONEDA : " + nombre);
        System.out.println("CÓDIGO_MONEDA : " + codigoTipo);
        System.out.println("CONVERSIÓN    : " + conversion);
    }
}
