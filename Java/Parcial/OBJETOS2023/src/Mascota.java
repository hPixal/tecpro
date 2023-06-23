import java.time.LocalDate;

public abstract class Mascota {
    private String alias;
    private LocalDate fechaNacimiento;
    private Familia familia;

    public String getStringNacimiento() {
        String year = Integer.toString(this.fechaNacimiento.getYear());
        String month = Integer.toString(this.fechaNacimiento.getMonthValue());
        String day = Integer.toString(this.fechaNacimiento.getDayOfMonth());

        String concatValue = year + "-" + month + "-" + day;
        return concatValue;
    }

    public Mascota(String alias, LocalDate fechaNacimiento, Familia familia) {
        this.alias = alias;
        this.fechaNacimiento = fechaNacimiento;
        this.familia = familia;
        familia.addMascota(this);
    }

    public Boolean estaVactunadoRabia() {
        Boolean vacunado = false;

        return vacunado;
    }

    public String getAlias() {
        return alias;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract Boolean esRaza(String raza);
    
    public void mostrarSiRaza(String raza){
        if(this.esRaza(raza)){
            this.mostrar();
        }
    }

    public Boolean esPerro(){
        return false;
    }
    
    public void mostrar(){
        System.out.println("ALIAS : "+ this.alias);
        String fechaString = this.getStringNacimiento();
        System.out.println("FECHA DE NACIMIENTO : "+fechaString);
    }
}
