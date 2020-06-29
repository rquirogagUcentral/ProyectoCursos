package rest.Model.Util;

public class ResponseGeneric {
	private String estado;
	private String descripcionEstado;
	
	
	
	
	public ResponseGeneric(String estado, String descripcionEstado) {
		super();
		this.estado = estado;
		this.descripcionEstado = descripcionEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getDescripcionEstado() {
		return descripcionEstado;
	}
	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}
	@Override
	public String toString() {
		return "ResponseGeneric [estado=" + estado + ", descripcionEstado=" + descripcionEstado + "]";
	}
	
	
	
}
