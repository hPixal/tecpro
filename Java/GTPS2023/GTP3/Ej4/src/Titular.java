public class Titular {
    private String apellido;
    private String nombre;
    private String cuil;

    Titular(String nombre, String apellido, String cuil) {
        super();
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public void verTitular() {
        System.out.println(nombre + " " + apellido);
    }

    public void verCuil() {
        System.out.println(cuil);
    }

}
