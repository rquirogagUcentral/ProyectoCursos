package Entidades;

public class tipoUsuario {
	private String idTipoUsuario;
	private String descTipoUsuario;
	
	
	
	public tipoUsuario(String idTipoUsuario, String descTipoUsuario) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.descTipoUsuario = descTipoUsuario;
	}
	public String getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(String idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getDescTipoUsuario() {
		return descTipoUsuario;
	}
	public void setDescTipoUsuario(String descTipoUsuario) {
		this.descTipoUsuario = descTipoUsuario;
	}
	
	
}
