public abstract class EnfermedadCongenita {
    private String nombre;
    private Integer newAttr;

    public EnfermedadCongenita(String nombre, Integer newAttr) {
        this.nombre = nombre;
        this.newAttr = newAttr;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNewAttr() {
        return newAttr;
    }

    public void mostrarEnfermedadSi(String nombre){
        if(this.nombre == nombre ){
            mostrar();
        }
    }

    public void mostrar(){
        System.out.println("NEWATTR : " + this.newAttr);
        System.out.println("NOMBRE ENFERMEDAD : " + this.nombre);
    }
}
