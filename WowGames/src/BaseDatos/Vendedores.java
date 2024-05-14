package BaseDatos;

/**Clase para crear el objeto vendedor
 * 
 * 
 *
 */
public class Vendedores {
	private String credencial;
	private String identificacion; 
	private String nombre;
	private String apellido;
	private String fechaIngreso;
	private String contrasena;
	
	/**Metodo constructor de los vendedors
	 * 
	 * @param credencial
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 * @param contrasena
	 * @param  
	 */
	public Vendedores(String credencial, String identificacion, String nombre, String apellido, String fechaIngreso, String contrasena) {
		this.credencial = credencial;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.contrasena = contrasena;
	}

	public String getIdentificacion() {
		return identificacion;
	}
    
	
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
    
	
    
	/**Getter para obtener el valor del atributo 'credencial'
	 * 
	 * @return credencial
	 */
	public String getCredencial() {
		return credencial;
	}
    
	/**Setter para establecer el valor del atributo 'credencial'
	 * 
	 * @param credencial
	 */
	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
    
	/**Getter para obtener el valor del atributo 'nombre'
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
    
	/**Setter para establecer el valor del atributo 'nombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
	/**Getter para obtener el valor del atributo 'apellido'
	 * 
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}
    
	/**Setter para establecer el valor del atributo 'apellido'
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
    
	/**Getter para obtener el valor del atributo 'fechaIngreso'
	 * 
	 * @return fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}
    
	/**Setter para establecer el valor del atributo 'fechaIngreso'
	 * 
	 * @param fechaIngreso
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
    
	/**Getter para obtener el valor del atributo 'contrasena'
	 * 
	 * @return contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
    
	/**Setter para establecer el valor del atributo 'contrasena'
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
