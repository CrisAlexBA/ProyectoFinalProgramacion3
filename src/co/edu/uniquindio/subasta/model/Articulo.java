package co.edu.uniquindio.subasta.model;

public class Articulo {

	// Atributos
	private String nombreArticulo;
	private String idArticulo;
	private TipoArticulo tipoArticulo;
	// --------------------------------------
	
	
	// Metodos Constructor
	public Articulo(String nombreArticulo, String idArticulo, TipoArticulo tipoArticulo) {
		super();
		this.nombreArticulo = nombreArticulo;
		this.idArticulo = idArticulo;
		this.tipoArticulo = tipoArticulo;
	}
	public Articulo() {
		super();
	}
	// --------------------------------------
	
	
	// Metodos Get and Set
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}
	public TipoArticulo getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(TipoArticulo tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	// --------------------------------------
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Articulo [nombreArticulo=" + nombreArticulo + ", idArticulo=" + idArticulo + ", tipoArticulo="
				+ tipoArticulo + "]";
	}
	// --------------------------------------
	
	
	// Metodo hasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idArticulo == null) ? 0 : idArticulo.hashCode());
		result = prime * result + ((nombreArticulo == null) ? 0 : nombreArticulo.hashCode());
		result = prime * result + ((tipoArticulo == null) ? 0 : tipoArticulo.hashCode());
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
		Articulo other = (Articulo) obj;
		if (idArticulo == null) {
			if (other.idArticulo != null)
				return false;
		} else if (!idArticulo.equals(other.idArticulo))
			return false;
		if (nombreArticulo == null) {
			if (other.nombreArticulo != null)
				return false;
		} else if (!nombreArticulo.equals(other.nombreArticulo))
			return false;
		if (tipoArticulo != other.tipoArticulo)
			return false;
		return true;
	}
	// --------------------------------------
}
