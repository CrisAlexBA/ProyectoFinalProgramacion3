package co.edu.uniquindio.subasta.model;

public class Anuncio {

	// Atributos
	private String nombreArticulo;
	private String nombreAnunciante;
	private String descripcion;
//	private image foto;
//	private date fechaPublicacion;
//	private date fechaCumlinacion;
	private float valorInicial;
	private float valorFinal;
	// ---------------------------------- 
	
	
	// Metodos Constructor
	public Anuncio(String nombreArticulo, String nombreAnunciante, String descripcion, float valorInicial,
			float valorFinal) {
		super();
		this.nombreArticulo = nombreArticulo;
		this.nombreAnunciante = nombreAnunciante;
		this.descripcion = descripcion;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
	}
	public Anuncio() {
		super();
	}
	// ---------------------------------- 
	
	
	// Metodos Get and Set
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public String getNombreAnunciante() {
		return nombreAnunciante;
	}
	public void setNombreAnunciante(String nombreAnunciante) {
		this.nombreAnunciante = nombreAnunciante;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(float valorInicial) {
		this.valorInicial = valorInicial;
	}
	public float getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}
	// ---------------------------------- 
	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Anuncio [nombreArticulo=" + nombreArticulo + ", nombreAnunciante=" + nombreAnunciante + ", descripcion="
				+ descripcion + ", valorInicial=" + valorInicial + ", valorFinal=" + valorFinal + "]";
	}
	// ---------------------------------- 
	
	
	// Metodos hasCode y equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((nombreAnunciante == null) ? 0 : nombreAnunciante.hashCode());
		result = prime * result + ((nombreArticulo == null) ? 0 : nombreArticulo.hashCode());
		result = prime * result + Float.floatToIntBits(valorFinal);
		result = prime * result + Float.floatToIntBits(valorInicial);
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
		Anuncio other = (Anuncio) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (nombreAnunciante == null) {
			if (other.nombreAnunciante != null)
				return false;
		} else if (!nombreAnunciante.equals(other.nombreAnunciante))
			return false;
		if (nombreArticulo == null) {
			if (other.nombreArticulo != null)
				return false;
		} else if (!nombreArticulo.equals(other.nombreArticulo))
			return false;
		if (Float.floatToIntBits(valorFinal) != Float.floatToIntBits(other.valorFinal))
			return false;
		if (Float.floatToIntBits(valorInicial) != Float.floatToIntBits(other.valorInicial))
			return false;
		return true;
	}
	// ---------------------------------- 
	
}
