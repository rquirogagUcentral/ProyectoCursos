package Entidades;

import java.util.ArrayList;

public class Pregunta {
	private String idPregunta;
	private String formPregunta;
	private ArrayList<Respuesta> respuesta;
	
	
	public Pregunta() {
		super();
	}


	public Pregunta(String idPregunta, String formPregunta, ArrayList<Respuesta> respuesta) {
		super();
		this.idPregunta = idPregunta;
		this.formPregunta = formPregunta;
		this.respuesta = respuesta;
	}


	public String getIdPregunta() {
		return idPregunta;
	}


	public void setIdPregunta(String idPregunta) {
		this.idPregunta = idPregunta;
	}


	public String getFormPregunta() {
		return formPregunta;
	}


	public void setFormPregunta(String formPregunta) {
		this.formPregunta = formPregunta;
	}


	public ArrayList<Respuesta> getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(ArrayList<Respuesta> respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
}
