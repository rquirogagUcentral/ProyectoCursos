package Entidades;

import Facade.ICrudUsuarioFacade;
import Singleton.ProductDao;
import rest.Model.Util.ResponseGeneric;

public class Coordinador implements ICrudUsuarioFacade{

	ProductDao pd=new ProductDao();
	
	@Override
	public ResponseGeneric registro(Usuario request) {
		// TODO Auto-generated method stub
		return null;
	}

	//Realiza la consulta de la información básica del usuario
		@Override
		public Usuario getUsuario(Usuario request) {
			Usuario usuario=new Usuario();
			//Paso 1 Realiza la consulta basica del usuario
			usuario= pd.consultaUsuarioBase(request);
				request.setIdUsuario(usuario.getIdUsuario());
				request.setNombreUsuario(usuario.getNombreUsuario());
				request.setCorreo(usuario.getCorreo());
				request.setTelefono(usuario.getTelefono());
				request.setEdad(usuario.getEdad());
				request.setGenero(usuario.getGenero());
				request.setContrasena(usuario.getContrasena());
				request.setIdTipoUsuario(usuario.getIdTipoUsuario());
				request.setFlagCase(usuario.getFlagCase());
				
			
			
			return null;
		}
	
}
