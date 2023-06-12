import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private List<Nodo> hijos;
    private Character etiqueta;
    private Integer profundidad;

    public Nodo(Character etiqueta, Integer profundidad) {
        this.etiqueta = etiqueta;
        this.profundidad = profundidad;
        this.hijos = new ArrayList<Nodo>();
    }

    public void setProfundidad(Integer profundidad) {
        this.profundidad = profundidad;
    }

    public Integer getProfundidad() {
        return profundidad;
    }

    public void addHijo(Character letra) {
        Nodo hijo = new Nodo(letra, profundidad + 1);
        this.hijos.add(hijo);
    }

     public void addHijo(Nodo hijo) {
        hijo.setProfundidad(profundidad+1);
        this.hijos.add(hijo);
    }


    public Character getEtiqueta() {
        return etiqueta;
    }

    public void display() {
        System.out.println("NODO : " + etiqueta);
        System.out.println("PROFUNDIDAD: " + profundidad);
        System.out.print("HIJOS : ");
        for (Nodo nodo : hijos) {
            System.out.print(nodo.getEtiqueta());
        }

    }

    public List<Nodo> getHijos() {
        return hijos;
    }
    
    public Boolean esHoja(){
        return this.hijos.isEmpty();
    }
}
