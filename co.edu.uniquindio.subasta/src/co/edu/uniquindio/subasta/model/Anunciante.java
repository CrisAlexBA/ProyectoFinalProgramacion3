package co.edu.uniquindio.subasta.model;

import java.util.ArrayList;

public class Anunciante extends Usuario{

	// Atributo
	private int cantAnuncios;
	// ------------------------

	// Metodos constructor
	public Anunciante(int cantAnuncios) {
		super();
		this.cantAnuncios = cantAnuncios;
	}

	public Anunciante(String nombre, String idUsuario, int edad) {
		super(nombre, idUsuario, edad, 0, new ArrayList<Articulo>());
		
	}
	
	

	public Anunciante() {
		super();
	}
	// ------------------------
	
	
	// Metodos Get and Set
	public int getCantAnuncios() {
		return cantAnuncios;
	}

	public void setCantAnuncios(int cantAnuncios) {
		this.cantAnuncios = cantAnuncios;
	}
	// ------------------------
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Anunciante [cantAnuncios=" + cantAnuncios + "]";
	}
	// ------------------------
	
	
	// Metodo hasCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantAnuncios;
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
		Anunciante other = (Anunciante) obj;
		if (cantAnuncios != other.cantAnuncios)
			return false;
		return true;
	}
	// ------------------------
	
	
}
