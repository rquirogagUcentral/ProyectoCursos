package Entidades;

public class Respuesta {
	private String idRespuesta;
	private String formRespuesta;
	private boolean esRespuesta;
	public Respuesta(String idRespuesta, String formRespuesta, boolean esRespuesta) {
		super();
		this.idRespuesta = idRespuesta;
		this.formRespuesta = formRespuesta;
		this.esRespuesta = esRespuesta;
	}
	public Respuesta() {
		super();
	}
	public String getIdRespuesta() {
		return idRespuesta;
	}
	public void setIdRespuesta(String idRespuesta) {
		this.idRespuesta = idRespuesta;
	}
	public String getFormRespuesta() {
		return formRespuesta;
	}
	public void setFormRespuesta(String formRespuesta) {
		this.formRespuesta = formRespuesta;
	}
	public boolean isEsRespuesta() {
		return esRespuesta;
	}
	public void setEsRespuesta(boolean esRespuesta) {
		this.esRespuesta = esRespuesta;
	}
	
	
}
