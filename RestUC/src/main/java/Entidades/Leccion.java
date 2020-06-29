package Entidades;

import java.util.ArrayList;

public class Leccion {
	private String idLeccion;
	private int calificacion;	
	private ArrayList<Pregunta> pregunta;
	
	public Leccion() {
		super();
	}
	public Leccion(String idLeccion,int calificacion, ArrayList<Pregunta> pregunta) {
		super();
		this.idLeccion = idLeccion;
		this.calificacion = calificacion;
		this.pregunta = pregunta;
	}
	public String getIdLeccion() {
		return idLeccion;
	}
	public void setIdLeccion(String idLeccion) {
		this.idLeccion = idLeccion;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public ArrayList<Pregunta> getPregunta() {
		return pregunta;
	}
	public void setPregunta(ArrayList<Pregunta> pregunta) {
		this.pregunta = pregunta;
	}
	
	
	
}
