package projectogithub;

import java.util.ArrayList;

public class Cliente {

	String nombre;
	String apellido;
	String dni;
	ArrayList <Producto> compras = new ArrayList <Producto> ();
	
	public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
}
