package co.edu.uniquindio.subasta.model;

public class PujaArticulo {

	// Atributo
	private float valorPuja;
	// -------------------------------


	// Metodos Constructor
	public PujaArticulo(float valorPuja) {
		super();
		this.valorPuja = valorPuja;
	}
	public PujaArticulo() {
		super();
	}
	// -------------------------------


	// Metodos Get and Set
	public float getValorPuja() {
		return valorPuja;
	}
	public void setValorPuja(float valorPuja) {
		this.valorPuja = valorPuja;
	}
	// -------------------------------


	// Metodo toString
	@Override
	public String toString() {
		return "PujaArticulo [valorPuja=" + valorPuja + "]";
	}
	// -------------------------------


	// Metodo hasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(valorPuja);
		return result;
	}
	// -------------------------------

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PujaArticulo other = (PujaArticulo) obj;
		if (Float.floatToIntBits(valorPuja) != Float.floatToIntBits(other.valorPuja))
			return false;
		return true;
	}




}