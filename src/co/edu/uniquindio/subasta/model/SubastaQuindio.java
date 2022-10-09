package co.edu.uniquindio.subasta.model;

public class SubastaQuindio {

	// Atributos
	private String nombre;
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
	
}
