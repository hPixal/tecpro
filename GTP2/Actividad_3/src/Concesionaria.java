import java.util.Vector;

import javax.print.DocFlavor.STRING;
public class Concesionaria {
    private String nombre;
    private Integer codigo;
    private String direccion;
    private Vector<Venta> ventas;
    public Concesionaria(String nombre, Integer codigo, String direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.ventas = new Vector<Venta>();
    }

    public void andairVenta(Venta ven){
        this.ventas.add(ven);
    }

    public Float ventaPorPais(Pais pais){
        Float monto = 0.f;
        for(Venta x : ventas){
            monto += x.montPais(pais);
        }
        return monto;
    }

    public Float ventaPorPaisConCondicion(Pais pais,Boolean esUsado){
        Float monto = 0.f;
        for(Venta x : ventas){
            monto += x.montPaisConCondicion(pais,esUsado);
        }
        return monto;
    }


}
