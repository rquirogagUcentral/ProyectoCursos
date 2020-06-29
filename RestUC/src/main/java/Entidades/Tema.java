package Entidades;

import java.util.ArrayList;

public class Tema {
	private String idTema;
	private String nombreTema;
	private String urlVideoTema;
	private ArrayList<Leccion> leccion;
	
	public Tema(String idTema, String nombreTema, String urlVideoTema, ArrayList<Leccion> leccion) {
		super();
		this.idTema = idTema;
		this.nombreTema = nombreTema;
		this.urlVideoTema = urlVideoTema;
		this.leccion = leccion;
	}

	public Tema() {
		super();
	}

	public String getIdTema() {
		return idTema;
	}

	public void setIdTema(String idTema) {
		this.idTema = idTema;
	}

	public String getNombreTema() {
		return nombreTema;
	}

	public void setNombreTema(String nombreTema) {
		this.nombreTema = nombreTema;
	}

	public String getUrlVideoTema() {
		return urlVideoTema;
	}

	public void setUrlVideoTema(String urlVideoTema) {
		this.urlVideoTema = urlVideoTema;
	}

	public ArrayList<Leccion> getLeccion() {
		return leccion;
	}

	public void setLeccion(ArrayList<Leccion> leccion) {
		this.leccion = leccion;
	}
	
	
	
}
