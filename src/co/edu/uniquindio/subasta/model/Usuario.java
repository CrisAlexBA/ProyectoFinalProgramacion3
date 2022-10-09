package co.edu.uniquindio.subasta.model;

import java.util.ArrayList;

public class Usuario {

	// Atributos
	private String nombre;
	private String idUsuario;
	private int edad;
	private float dinero;
	private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
	// ------------------------------------
	
	
	// Metodo constructor
	public Usuario(String nombre, String idUsuario, int edad, float dinero, ArrayList<Articulo> listaArticulos) {
		super();
		this.listaArticulos = listaArticulos;
		this.nombre = nombre;
		this.idUsuario = idUsuario;
		this.edad = edad;
		this.dinero = dinero;
	}
	public Usuario() {
		super();
	}
	// ----------------------------------------
	
	// Metodos Get and Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public ArrayList<Articulos> getListaArticulos() {
		return listaArticulos;
	}
	public void setListaArticulos(ArrayList<Articulos> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getDinero() {
		return dinero;
	}
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	// ---------------------------------------------------
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", idUsuario=" + idUsuario + ", edad=" + edad + ", dinero=" + dinero
				+ ", listaArticulos=" + listaArticulos + "]";
	}
	// ---------------------------------------------------
	
	
	// Metodo hasCode y equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(dinero);
		result = prime * result + edad;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((listaArticulos == null) ? 0 : listaArticulos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Float.floatToIntBits(dinero) != Float.floatToIntBits(other.dinero))
			return false;
		if (edad != other.edad)
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (listaArticulos == null) {
			if (other.listaArticulos != null)
				return false;
		} else if (!listaArticulos.equals(other.listaArticulos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	// ----------------------------------------
	
}
