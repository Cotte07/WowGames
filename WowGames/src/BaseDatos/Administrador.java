package BaseDatos;

public class Administrador {

	private String credencial;
	private String constrasenaAdministrador; 
	
	
	public Administrador(String credencial, String constrasenaAdministrador) {
		this.credencial = credencial;
		this.constrasenaAdministrador = constrasenaAdministrador;
	}


	public String getCredencial() {
		return credencial;
	}


	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}


	public String getConstrasenaAdministrador() {
		return constrasenaAdministrador;
	}


	public void setConstrasenaAdministrador(String constrasenaAdministrador) {
		this.constrasenaAdministrador = constrasenaAdministrador;
	}
}
