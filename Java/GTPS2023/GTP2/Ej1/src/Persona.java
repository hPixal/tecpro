package Java.GTPS2023.GTP2.Ej1.src;

import java.time.*;

public class Persona extends Cliente {

    private Integer dni;
    private String nombre;
    private String ciudad;
    private String telefono;
    private Integer edad;
    private Integer cuit;
    private LocalDate birthday;
    private IVA iva;

    public Persona(Integer nroCliete, Integer dni, String nombre, String ciudad, String telefono, Integer edad,
            Integer cuit, LocalDate birthday, IVA iva) {
        super(nroCliete);
        this.dni = dni;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
        this.cuit = cuit;
        this.birthday = birthday;
        this.iva = iva;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public Integer getEdad() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday, currentDate);
        this.edad = period.getYears();
        return edad;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getStringBirthday() {
        String year = Integer.toString(this.birthday.getYear());
        String month = Integer.toString(this.birthday.getMonthValue());
        String day = Integer.toString(this.birthday.getDayOfMonth());

        String concatValue = year + "-" + month + "-" + day;
        return concatValue;
    }

    public Float getIva() {
        return iva.getPorcentaje();
    }

    public void displayNombre() {
        System.out.println("NOMBRE: " + this.nombre);
    }

}
