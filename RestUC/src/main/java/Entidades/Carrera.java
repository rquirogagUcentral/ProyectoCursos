package Entidades;

public class Carrera {
	private String idCarrera;
	private String descCarrera;
	
	public Carrera() {
		super();
	}
	
	

	public Carrera(String idCarrera, String descCarrera) {
		super();
		this.idCarrera = idCarrera;
		this.descCarrera = descCarrera;
	}



	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}
	
	public String getIdCarrera() {
		return idCarrera;
	}
	public String getDescCarrera() {
		return descCarrera;
	}
	public void setDescCarrera(String descCarrera) {
		this.descCarrera = descCarrera;
	}
	
	
	
}
