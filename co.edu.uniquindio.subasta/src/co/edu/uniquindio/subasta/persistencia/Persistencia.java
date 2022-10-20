package co.edu.uniquindio.subasta.persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import co.edu.uniquindio.subasta.exceptions.AnuncianteException;
import co.edu.uniquindio.subasta.exceptions.CompradorException;
import co.edu.uniquindio.subasta.model.Anunciante;
import co.edu.uniquindio.subasta.model.Comprador;


public class Persistencia {

	public static final String RUTA_ARCHIVO_ANUNCIANTES = "src/resources/ArchivoAnunciantes.txt";
	public static final String RUTA_ARCHIVO_COMPRADORES = "src/resources/ArchivoCompradores.txt";
	public static final String RUTA_ARCHIVO_ARTICULOS = "src/resources/ArchivoAnuncios.txt";
	public static final String RUTA_ARCHIVO_ANUNCIOS = "src/resources/ArchivoArticulos.txt";
	



	/**
	 * Guarda toda la informacion de los anunciantes
	 * @param listaEmpleados
	 * @throws IOException
	 */
	public static void guardarAnunciante(ArrayList<Anunciante> listaAnunciantes) throws IOException {


		String contenido = "";

		for (Anunciante anunciantes : listaAnunciantes) {
			contenido += anunciantes.getNombre() + ", " + anunciantes.getIdUsuario() + ", " + anunciantes.getEdad() + ", " +
					anunciantes.getDinero() + ", " + anunciantes.getCantAnuncios() +"\n";

		}
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_ANUNCIANTES, contenido, true);
	}
	public static void guardarComprador(ArrayList<Comprador> listacompradores) throws IOException {


		String contenido = "";

		for (Comprador compradores : listacompradores) {
			contenido += compradores.getNombre() + ", " + compradores.getIdUsuario() + ", " + compradores.getEdad() + ", " +
					compradores.getDinero() + ", " + compradores.getCantPujas() +"\n";

		}
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_COMPRADORES, contenido, true);
	}



	public static ArrayList<Anunciante> cargarAnunciantes(String ruta) throws IOException {
		
		ArrayList<Anunciante> anunciantes = new ArrayList<Anunciante>();

		ArrayList<String> contenido = ArchivoUtil.leerArchivo(ruta);
		String linea = "";

		for (int i = 0; i < contenido.size(); i++) {
			linea = contenido.get(i);
			Anunciante anunciante = new Anunciante();
			anunciante.setNombre(linea.split(",")[0]);
			anunciante.setIdUsuario(linea.split(",")[1]);
			anunciante.setEdad(Integer.parseInt(linea.split(",")[2]));
			anunciante.setDinero(Float.parseFloat(linea.split(",")[3]));
			anunciante.setCantAnuncios(Integer.parseInt(linea.split(",")[4]));
			//Dudas de como maneja el array de articulos
			anunciante.setListaArticulos(null);
			anunciantes.add(anunciante);

		}
		return anunciantes;
	}
public static ArrayList<Comprador> cargarCompradores(String ruta) throws IOException {
		
		ArrayList<Comprador> compradors = new ArrayList<Comprador>();

		ArrayList<String> contenido = ArchivoUtil.leerArchivo(ruta);
		String linea = "";

		for (int i = 0; i < contenido.size(); i++) {
			linea = contenido.get(i);
			Comprador comprador = new Comprador();
			comprador.setNombre(linea.split(",")[1]);
			comprador.setIdUsuario(linea.split(",")[2]);
			comprador.setEdad(Integer.parseInt(linea.split(",")[3]));
			comprador.setDinero(Float.parseFloat(linea.split(",")[4]));
			comprador.setCantPujas(Integer.parseInt(linea.split(",")[5]));
			//Dudas de como maneja el array de articulos
			comprador.setListaArticulos(null);
			compradors.add(comprador);

		}
		return compradors;
	}
public static boolean iniciarSesionAnunciante(String anunciante, String contrasenia) throws FileNotFoundException, IOException, AnuncianteException {
		
		if(validarAnunciante(anunciante,contrasenia)) {
			return true;
		}else {
			throw new AnuncianteException("Usuario no existe");
		}
		
}
	
	private static boolean validarAnunciante(String anunciante, String contrasenia) throws FileNotFoundException, IOException 
	{
		ArrayList<Anunciante> anunciantes = Persistencia.cargarAnunciantes(RUTA_ARCHIVO_ANUNCIANTES);
		
		for (int indiceAnunciante = 0; indiceAnunciante < anunciantes.size(); indiceAnunciante++) 
		{
			Anunciante anuncianteAux = anunciantes.get(indiceAnunciante);
			if(anuncianteAux.getNombre().equalsIgnoreCase(anunciante) && anuncianteAux.getIdUsuario().equalsIgnoreCase(contrasenia)) {
				return true;
			}
		}
		return false;
	}
	
public static boolean iniciarSesionComprador(String comprador, String contrasenia) throws FileNotFoundException, IOException, CompradorException {
		
		if(validarComprador(comprador,contrasenia)) {
			return true;
		}else {
			throw new CompradorException("comprador no existe");
		}
		
}
	
	private static boolean validarComprador(String comprador, String contrasenia) throws FileNotFoundException, IOException 
	{
		ArrayList<Comprador> compradores = Persistencia.cargarCompradores(RUTA_ARCHIVO_COMPRADORES);
		
		for (int indicecomprador = 0; indicecomprador < compradores.size(); indicecomprador++) 
		{
			Comprador compradorAux = compradores.get(indicecomprador);
			if(compradorAux.getNombre().equalsIgnoreCase(comprador) && compradorAux.getIdUsuario().equalsIgnoreCase(contrasenia)) {
				return true;
			}
		}
		return false;
	}

}
