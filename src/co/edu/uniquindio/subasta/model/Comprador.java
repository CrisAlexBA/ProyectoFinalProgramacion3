package co.edu.uniquindio.subasta.model;

public class Comprador {

	// Atributos
	private int cantPujas;
	// ------------------------

	
	// Metodos Constructor
	public Comprador(int cantPujas) {
		super();
		this.cantPujas = cantPujas;
	}
	public Comprador() {
		super();
	}
	// ------------------------
	
	
	// Metodos Get and Set
	public int getCantPujas() {
		return cantPujas;
	}
	public void setCantPujas(int cantPujas) {
		this.cantPujas = cantPujas;
	}
	// ------------------------
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Comprador [cantPujas=" + cantPujas + "]";
	}
	// ------------------------
	
	
	// Metodo hasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantPujas;
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
		Comprador other = (Comprador) obj;
		if (cantPujas != other.cantPujas)
			return false;
		return true;
	}
	// ------------------------------------------
	
}
