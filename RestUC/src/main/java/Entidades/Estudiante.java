package Entidades;

import java.util.ArrayList;

import Facade.ICrudUsuarioFacade;
import Singleton.ProductDao;
import rest.Model.Util.ResponseGeneric;

public class Estudiante implements ICrudUsuarioFacade{
	private Carrera carreraEstudio;
	private Facultad facultadEstudio;
	private String idCarrera;
	private String idFacultad; 
	private String semestre;
	
	ProductDao pd = new ProductDao();
	
	
	
	public Estudiante(String idCarrera, String idFacultad, String semestre) {
		super();
		this.idCarrera = idCarrera;
		this.idFacultad = idFacultad;
		this.semestre = semestre;
	}



	public Estudiante(Carrera carreraEstudio, Facultad facultadEstudio, String semestre) {
		super();
		this.carreraEstudio = carreraEstudio;
		this.facultadEstudio = facultadEstudio;
		this.semestre = semestre;
	}



	public Estudiante(String semestre) {
		super();
		carreraEstudio = new Carrera();
		facultadEstudio =  new Facultad();
		this.semestre = semestre;
	}

	public Estudiante() {
		super();
	}

	public Carrera getCarreraEstudio() {
		return carreraEstudio;
	}



	public void setCarreraEstudio(Carrera carreraEstudio) {
		this.carreraEstudio = carreraEstudio;
	}



	public Facultad getFacultadEstudio() {
		return facultadEstudio;
	}



	public void setFacultadEstudio(Facultad facultadEstudio) {
		this.facultadEstudio = facultadEstudio;
	}



	public String getSemestre() {
		return semestre;
	}



	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	
	
	public String getIdCarrera() {
		return idCarrera;
	}



	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}



	public String getIdFacultad() {
		return idFacultad;
	}



	public void setIdFacultad(String idFacultad) {
		this.idFacultad = idFacultad;
	}

	@Override
	public ResponseGeneric registro(Usuario request) {
		// TODO Auto-generated method stub
		ResponseGeneric response=null;
		String estado = "";
        String descripcionEstado ="";
        request.setFlagCase("1");
        boolean actualiza= false;
        actualiza=pd.actualizarEstudiante(request);
        if(actualiza)
        {
        	estado="OK";
            descripcionEstado="Ingreso Éxitoso";
        }
        else
        {
        	estado="OK";
            descripcionEstado="Ingreso Éxitoso";
        }
        
		
        return new ResponseGeneric(estado,descripcionEstado);
	}
	
	//Realiza la consulta de la información básica del usuario
	@Override
	public Usuario getUsuario(Usuario request)
	{
		try
		{
			Usuario usuario=new Usuario();
			Estudiante estudiante = new Estudiante();
			Facultad facultad=null;
			//Paso 2. Se obtiene la información del estudiante.
			estudiante=pd.consultaEstudiante(request.getIdUsuario());
			System.out.print("\nidFacultad: "+estudiante.getIdFacultad()+"\n");
			/*if(!estudiante.getIdFacultad().isEmpty() || !estudiante.getIdFacultad().isBlank())
			{
				facultad=pd.consultaFacultad(estudiante.getIdFacultad());
			}
			else
			{
				facultad.setDescFacultad("null|x|");
			}*/
			//System.out.print("\nfacultad: "+facultad.getDescFacultad()+"\n");
			
			Estudiante est=new Estudiante(new Carrera(estudiante.getIdCarrera(),""), new Facultad(estudiante.getIdFacultad(),""),estudiante.getSemestre());
			request.setEstudiante(est);
			return request;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
	
	
	
	
	
}