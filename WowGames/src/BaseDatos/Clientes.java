package BaseDatos;

public class Clientes {
	private String identificacion;
	private String credencial;
	private String nombre;
	private String apellido;
	private String fechaIngreso;
	private String contraseñaVendedor;
	
	public void Cliente (String identificacion, String credencial, String nombre, String apellido, String fechaIngreso, String contraseñaVendedor) {
		this.credencial = credencial;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.contraseñaVendedor = contraseñaVendedor;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getContraseñaVendedor() {
		return contraseñaVendedor;
	}

	public void setContraseñaVendedor(String contraseñaVendedor) {
		this.contraseñaVendedor = contraseñaVendedor;
	}
	
	

}
