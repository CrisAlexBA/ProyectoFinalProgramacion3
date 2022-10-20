package co.edu.uniquindio.subasta.controller;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniquindio.subasta.exceptions.CompradorException;
import co.edu.uniquindio.subasta.model.Anunciante;
import co.edu.uniquindio.subasta.model.Comprador;
import co.edu.uniquindio.subasta.model.SubastaQuindio;
import co.edu.uniquindio.subasta.persistencia.Persistencia;

public class ModelFactoryController {

	SubastaQuindio subasta;
	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqu� al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	public ModelFactoryController() {

		// 1. inicializar datos y luego guardarlo en archivos
		// iniciarSalvarDatosPrueba();

		// 2. Cargar los datos de los archivos
		// cargarDatosDesdeArchivos();

		// 3. Guardar y Cargar el recurso serializable binario
		// guardarResourceBinario();
		// cargarResourceBinario();

		// 4. Guardar y Cargar el recurso serializable XML
		// guardarResourceXML();

		// Siempre se debe verificar si la raiz del recurso es null
		if (subasta == null) {
			System.out.println("es null");
			inicializarDatos();
			// guardarResourceSerializable();
		}

	}
	public SubastaQuindio getSubasta() {
		return subasta;
	}
	public void setSubasta(SubastaQuindio subasta) {
		this.subasta = subasta;
	}
	public void agregarAnunciante(Anunciante anunciante) throws IOException {
		SubastaQuindio.agregarAnunciante(anunciante);
		
		
	}
	public void agregarComprador(Comprador comprador) throws IOException {
		
		SubastaQuindio.agregarComprador(comprador);
		
	}
	
	
	ArrayList<Anunciante> traerListaAnunciantes() {
		return SubastaQuindio.getListaAnunciantes();
	}
	
	
	public void inicializarDatos(){
		
		SubastaQuindio subasta = new SubastaQuindio();
		
		Comprador anuncianteNuevo = new Comprador();
		anuncianteNuevo.setNombre("as");
		anuncianteNuevo.setIdUsuario("12345");
		anuncianteNuevo.setEdad(24);
		anuncianteNuevo.setDinero(240000);
		subasta.getListaCompradores().add(anuncianteNuevo);
		
//		try {
//			Persistencia.guardarEstudiantes(main.getListaEstudiantes());
//			Persistencia.guardarProgramas(main.getListaProgramas());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
//	public boolean ingresarAnunciante(String nombre, String idUsuario, int edad) {
//
//		
//		return false;
//	}
	
	
	// El obejto anunciante (que contiene el nombre, la id y la edad) se va para el modelo

	// ______________________________________________________________
	public boolean inicioSesionComprador(String nombre, String contrasenia) {
		try {
			return Persistencia.iniciarSesionComprador(nombre, contrasenia);
		} catch (IOException | CompradorException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
