package Entidades;

import javax.mail.SendFailedException;

import Facade.ICrudUsuarioFacade;
import Singleton.ProductDao;
import rest.Model.Util.ResponseGeneric;
import rest.Model.Util.ServiceMail;

public class Usuario {
	private String idUsuario;
	private String nombreUsuario;
	private String correo;
	private String telefono;
	private String edad;
	private String genero;
	private String contrasena;
	private String fechaNacimiento;
	private String metodo;
	private String idTipoUsuario;
	private String flagCase;
	private Estudiante Estudiante;
	private Docente docente;
	private Coordinador coordinador;
	
	static ProductDao pd=new ProductDao();
	
	//constructor para Ingreso a la plataforma
	public Usuario(String idUsuario, String contrasena) {
		super();
		this.idUsuario = idUsuario;
		this.contrasena = contrasena;
	}
	
	
	//Constructor para primer registro de Estudiante
	public Usuario(String nombreUsuario, String correo, String telefono) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	public Usuario() {
		super();
	}
	
	
	
	
	public Usuario(String idUsuario, String nombreUsuario, String correo, String telefono, String edad, String genero,
			String contrasena, String idTipoUsuario, String flagCase) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
		this.genero = genero;
		this.contrasena = contrasena;
		this.idTipoUsuario = idTipoUsuario;
		this.flagCase = flagCase;
	}


	//Constructor para almacenar Estudiante
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public Usuario(String idUsuario, String nombreUsuario, String correo, String telefono, String edad, String genero,
			String contrasena, String idTipoUsuario, String flagCase, Entidades.Estudiante estudiante) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
		this.genero = genero;
		this.contrasena = contrasena;
		this.idTipoUsuario = idTipoUsuario;
		this.flagCase = flagCase;
		Estudiante = estudiante;
	}
	
	

	public Usuario(String idUsuario, String nombreUsuario, String correo, String telefono, String edad, String genero,
			String contrasena, String idTipoUsuario, String flagCase, Docente docente) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
		this.genero = genero;
		this.contrasena = contrasena;
		this.idTipoUsuario = idTipoUsuario;
		this.flagCase = flagCase;
		this.docente = docente;
	}


	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(String idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	public String getFlagCase() {
		return flagCase;
	}
	public void setFlagCase(String flagCase) {
		this.flagCase = flagCase;
	}
	public Estudiante getEstudiante() {
		return Estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		Estudiante = estudiante;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Coordinador getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
	
	public static ResponseGeneric validarUsuario(Usuario request) {
		String estado = "";
        String descripcionEstado ="";
		ServiceMail correo;
//		ProductDao pd=new ProductDao();
		
		boolean buscaUsuario=false;
		buscaUsuario=pd.validarUsuario(request);
		if(!buscaUsuario)
		{
			//Implementar envío correo
			ServiceMail sm = new ServiceMail();
			request.setIdUsuario(generarIdUsuario(request.correo));
			correo = sm.Message("registro",request.nombreUsuario, request.idUsuario);
			if(sm.sendMail(correo,request.correo))
			{
				request.setIdTipoUsuario("2");
				request.setFlagCase("0");
				//System.out.print(idestudiante);
				if(pd.InsertarUsuario(request))
				{
					estado="OK";
		            descripcionEstado="Se Envia exitosamente el correo de Registro";
		            pd.InsertarEstudiante(request.idUsuario);
				}
				else
				{
					estado="FAILED";
		            descripcionEstado="Error en la Inserción del usuario.";
				}
				
			}
			else
			{
				estado="FAILED";
	            descripcionEstado="Falla en el envío del correo";
			}
		}
		else
		{
			//Indicar que usuario ya existe
			estado="FAILED";
            descripcionEstado="La dirección de correo ya esta siendo Utilizada";
		}
		
		return  new ResponseGeneric(estado,descripcionEstado);
	}
	
	
	private static String generarIdUsuario(String correo2) {
		// TODO Auto-generated method stub
		String idUsuariogen="";
		String[] divCorreo=null;
		String[] divCorreo2=null;
		
		if(correo2.contains("@ucentral.edu.co"))
		{
			divCorreo=correo2.split("@");
			idUsuariogen = divCorreo[0];
		}
		else
		{
			divCorreo=correo2.split("@");
			divCorreo2=divCorreo[1].split("\\.");
			idUsuariogen = divCorreo[0]+divCorreo2[0];
			System.out.print(idUsuariogen);
		}
		return idUsuariogen;
	}
	
	
	
	public ResponseGeneric validarIngreso(Usuario request) {
		String estado = "";
        String descripcionEstado ="";
		ResponseGeneric response=null;
		
		boolean buscaUsuario=false;
		buscaUsuario=pd.validarUsuario(request);
		if(buscaUsuario)
		{
			//Indicar que el usuario no existe
			estado="OK";
            descripcionEstado="Ingreso Éxitoso";
		}
		else
		{
			//Indicar que el usuario no existe
			estado="FAILED";
            descripcionEstado="Ingreso fallido, Por favor valida tus datos";
		}
		
		
		return new ResponseGeneric(estado,descripcionEstado);
	}
	
	
	public ResponseGeneric olvidoContrasena(Usuario request) {
		String estado = "";
        String descripcionEstado ="";
		ResponseGeneric response=null;
		ServiceMail correo;
		ServiceMail sm = new ServiceMail();
		
		
		request=pd.consultaUsuarioBase(request);
		boolean actualizarContrasena=false;
		actualizarContrasena=pd.actualizarContrasena(request);
		if(actualizarContrasena)
		{
			correo = sm.Message("contrasena",request.nombreUsuario, request.idUsuario);
			System.out.print("\nusu:"+request.getNombreUsuario()+" correo:"+request.correo);
			if(sm.sendMail(correo,request.correo))
			{
				estado="OK";
	            descripcionEstado="Ingreso Éxitoso";
			}
			else
			{
				estado="FAILED";
	            descripcionEstado="No se logró enviar el correo con la contraseña";
			}
		}
		else
		{
			estado="FAILED";
            descripcionEstado="Ingreso fallido, Por favor valida tus datos";
		}
		
		return new ResponseGeneric(estado,descripcionEstado);
	}
	
}
