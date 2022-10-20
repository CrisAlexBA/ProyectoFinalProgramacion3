package co.edu.uniquindio.subasta.model;

public enum TipoArticulo {

	HOGAR(0), TECNOLOGIA(1), DEPORTES(2), VEHICULOS(3), VIENESRAIZ(4);
	
	
	// Atributos
	private int tipoProducto;
	// ----------------------------
	
	
	// Metodos Get and Set
	public int getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	// --------------------------------
	
	
	// Metodo Constructor
	private TipoArticulo(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
}
