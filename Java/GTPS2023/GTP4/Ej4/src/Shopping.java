import java.util.List;

public class Shopping {
    private List<Local> locales;
    private List<Direccion> direcciones;
    private String nombre;

    public Shopping(String nombre) {
        this.nombre = nombre;
    }

    public Integer localesDeRopa(Boolean mujer, Boolean varon) {
        Integer count = 0;
        for (Local local : locales) {
            if (local instanceof Ropa) {
                Ropa ropaElem = (Ropa) local;
                if (ropaElem.getVaron() == varon && ropaElem.getMujer() == mujer) {
                    count++;
                }
            }
        }
        return count;
    }

    public Integer localesDeComida(Boolean bar) {
        Integer count = 0;
        for (Local local : locales) {
            if (local instanceof Comida) {
                Comida comidaElem = (Comida) local;
                if (comidaElem.getBar() == bar) {
                    count++;
                }
            }
        }
        return count;

    }

    public Integer localesDeLibros() {
        Integer count = 0;
        for (Local local : locales) {
            if (local instanceof Libreria) {
                    count++;
            }
        }
        return count;
    }
}
