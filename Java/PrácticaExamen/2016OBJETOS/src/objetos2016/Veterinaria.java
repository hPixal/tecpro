package objetos2016;

import java.util.List;
import java.util.ArrayList;

public class Veterinaria {
	private String nombre;
	private Float costoBase;
	private List<Visita> visitas;
	private List<Familia> familias;
	private List<Persona> clientes;
	private List<Promocion> promociones;

	public Veterinaria(String nombre, Float costoBase) {
		super();
		this.nombre = nombre;
		this.costoBase = costoBase;
		this.promociones = new ArrayList<Promocion>();
		this.visitas = new ArrayList<Visita>();
		this.familias = new ArrayList<Familia>();
		this.clientes = new ArrayList<Persona>();
	}

	public void addPromocion(Promocion promocion) {
		this.promociones.add(promocion);
	}

	public void addPersona(Persona persona) {
		this.clientes.add(persona);
	}

	public void addFamilia(Familia familia) {
		this.familias.add(familia);
	}

	public void addVisita(Visita visita) {
		this.visitas.add(visita);
	}

	public String getNombre() {
		return nombre;
	}

	public Float getCostoBase() {
		return costoBase;
	}

	public void addCliente(Persona cliente) {
		this.clientes.add(cliente);
	}
	
	public Float precioMascota(String alias) {
		Float precio = this.costoBase;
		for(Familia fam : familias) {
			if(fam.pertenceMascota(alias)) {
				precio = fam.obtenerPrecioMascota(alias,this.costoBase);
			}
		}
		return precio;
	}
	
	public Especie obtenerEspecieMascota(String alias) {
		Especie esp = null;
		for(Familia fam : familias) {
			if(fam.pertenceMascota(alias)) {
				esp = fam.obtenerEspecieMascota(alias);
			}
		}
		return esp;
	}
	
	public Float precioDescuento(Float precioM, String alias) {
		Float precio = precioM;
		Especie especie = this.obtenerEspecieMascota(alias);
		for(Promocion promo : promociones) {
			if(promo.tieneDescuento(especie)) {
				precio = fam.calcularDescuento(especie,precio);
			}
		}
		return precio;
	}
	
	public Float obtenerPrecioFinal(String alias) {
		Float precioM = precioMascota(alias); // obtengo precio_base*porcentajeMascota
		Float precioFinal = precioDescuento(precioM,alias); //obengo precio
		return precioFinal;
	}

	public Float nuevaVisita(String alias, String enfermedad) {
		Float precio = obtenerPrecioFinal(alias);
		//necesio enfermedad y monto para hacer una visita
		Visita nueva = new Visita(precio,enfermedad);
		this.addVisita(nueva);
	}
}
