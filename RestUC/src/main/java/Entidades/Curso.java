package Entidades;

import java.util.ArrayList;

public class Curso {
	private String idCurso;
	private String nombreCurso;
	private String objetivoCurso;
	private String justificacionCurso;
	private String precondicion;
	private String urlVideoCurso;
	private ArrayList<ParametrosCurso> parametros;
	private ArrayList<Tema> tema;
	
	
	public Curso() {
		super();
	}

	public Curso(String nombreCurso, String objetivoCurso, String justificacionCurso, String precondicion,
			String urlVideoCurso, ArrayList<ParametrosCurso> parametros, ArrayList<Tema> tema) {
		super();
		this.nombreCurso = nombreCurso;
		this.objetivoCurso = objetivoCurso;
		this.justificacionCurso = justificacionCurso;
		this.precondicion = precondicion;
		this.urlVideoCurso = urlVideoCurso;
		this.parametros = parametros;
		this.tema = tema;
	}



	public Curso(String nombreCurso) {
		super();
		this.nombreCurso = nombreCurso;
	}



	public Curso(String idCurso, String nombreCurso, String objetivoCurso, String justificacionCurso,
			String precondicion, String urlVideoCurso, ArrayList<ParametrosCurso> parametros, ArrayList<Tema> tema) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.objetivoCurso = objetivoCurso;
		this.justificacionCurso = justificacionCurso;
		this.precondicion = precondicion;
		this.urlVideoCurso = urlVideoCurso;
		this.parametros = parametros;
		this.tema = tema;
	}



	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getObjetivoCurso() {
		return objetivoCurso;
	}

	public void setObjetivoCurso(String objetivoCurso) {
		this.objetivoCurso = objetivoCurso;
	}

	public String getUrlVideoCurso() {
		return urlVideoCurso;
	}

	public void setUrlVideoCurso(String urlVideoCurso) {
		this.urlVideoCurso = urlVideoCurso;
	}

	public ArrayList<ParametrosCurso> getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList<ParametrosCurso> parametros) {
		this.parametros = parametros;
	}

	public ArrayList<Tema> getTema() {
		return tema;
	}

	public void setTema(ArrayList<Tema> tema) {
		this.tema = tema;
	}
	
	
}
