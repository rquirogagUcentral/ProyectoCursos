package Entidades;

public class Facultad {
	private String idFacultad;
	private String descFacultad;
	public Facultad(String idFacultad, String descFacultad) {
		super();
		this.idFacultad = idFacultad;
		this.descFacultad = descFacultad;
	}
	
	
	
	public Facultad() {
		// TODO Auto-generated constructor stub
	}


	public String getIdFacultad() {
		return idFacultad;
	}



	public void setIdFacultad(String idFacultad) {
		this.idFacultad = idFacultad;
	}



	public String getDescFacultad() {
		return descFacultad;
	}
	public void setDescFacultad(String descFacultad) {
		this.descFacultad = descFacultad;
	}
	
	
}
