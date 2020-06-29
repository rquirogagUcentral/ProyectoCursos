package Facade;

import Entidades.Estudiante;
import Entidades.Usuario;
import rest.Model.Util.ResponseGeneric;

public interface ICrudUsuarioFacade {
		public ResponseGeneric registro(Usuario request);
		public Usuario getUsuario(Usuario request);
}
