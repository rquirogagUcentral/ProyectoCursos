package Entidades;

public class ParametrosCurso {
	private String paramCurso;
	private String paramDesc;
	private String paramValor;
	
	public ParametrosCurso() {
		super();
	}
	public ParametrosCurso(String paramCurso, String paramDesc, String paramValor) {
		super();
		this.paramCurso = paramCurso;
		this.paramDesc = paramDesc;
		this.paramValor = paramValor;
	}
	public String getParamCurso() {
		return paramCurso;
	}
	public void setParamCurso(String paramCurso) {
		this.paramCurso = paramCurso;
	}
	public String getParamDesc() {
		return paramDesc;
	}
	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}
	public String getParamValor() {
		return paramValor;
	}
	public void setParamValor(String paramValor) {
		this.paramValor = paramValor;
	}
	
	 
	
}
