package co.edu.uniquindio.subasta.model;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniquindio.subasta.persistencia.Persistencia;


public class SubastaQuindio {

	// Atributos
	private String nombre;
	static ArrayList<Anunciante> listaAnunciantes = new ArrayList<Anunciante>();
	static ArrayList<Comprador> listaCompradores = new ArrayList<Comprador>();
	// ----------------------

	
	// Metodos constructor
	public SubastaQuindio(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public SubastaQuindio() {
		super();
	}
	// ----------------------
	
	
	// Metodos Get and Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static ArrayList<Anunciante> getListaAnunciantes() {
		return listaAnunciantes;
	}
	
	public static void setListaAnunciantes(ArrayList<Anunciante> listaAnunciantes) {
		SubastaQuindio.listaAnunciantes = listaAnunciantes;
	}
	public  ArrayList<Comprador> getListaCompradores() {
		return listaCompradores;
	}

	public void setListaCompradores(ArrayList<Comprador> listaCompradores) {
		listaCompradores = listaCompradores;
	}
	// -------------------------------
	
	
	

	// Metodo toString
	@Override
	public String toString() {
		return "SubastaQuindio [nombre=" + nombre + "]";
	}
	// -------------------------------
	
	
	// Metodo hasCode y equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		SubastaQuindio other = (SubastaQuindio) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	// ------------------------------

	

	public static void agregarAnunciante(Anunciante anunciante) throws IOException {
		int bandera = 0;
		for(int i = 0; i < listaAnunciantes.size() && bandera == 0; i++) {
			if(listaAnunciantes.get(i).getIdUsuario().equals(anunciante.getIdUsuario())) {
				bandera = 1;
			}
		}
		if(bandera == 0){
			listaAnunciantes.add(anunciante);
			Persistencia.guardarAnunciante(listaAnunciantes);
			System.out.println("Se agregO un nuevo usuario.");
		}else{
			System.out.println("Este usuario ya existe");
		}
		
	}

	public static void agregarComprador(Comprador comprador) throws IOException {
		
		int bandera = 0;
		for(int i = 0; i < listaCompradores.size() && bandera == 0; i++) {
			if(listaCompradores.get(i).getIdUsuario().equals(comprador.getIdUsuario())) {
				bandera = 1;
			}
		}
		if(bandera == 0){
			listaCompradores.add(comprador);
			Persistencia.guardarComprador(listaCompradores);
			System.out.println("Se agregO un nuevo usuario.");
		}else{
			System.out.println("Este usuario ya existe");
		}
		
	}

	
	
}