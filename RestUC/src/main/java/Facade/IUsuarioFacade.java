package Facade;

import Entidades.Usuario;
import rest.Model.Util.ResponseGeneric;



public interface IUsuarioFacade {
	public ResponseGeneric sendService(Usuario request);
	public Usuario getUsuario(Usuario request);
}
