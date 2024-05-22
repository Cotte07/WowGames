package Cliente;

/**Clase para crear el objeto tipo persona clientes
 * 
 * 
 *
 */
public class Clientes {
	private String identificacion; 
	private String nombre; 
	private String apellido; 
	private String fechaRegistro;
	private String direccion;
	private String telefono;
	
	/**Metodo constructor de los clientes
	 * 
	 * @param identificacion numero de identificacion del cliente
	 * @param nombre nombre del cliente
	 * @param apellido apellido del cliente
	 * @param fechaRegistro fecha en la que se registra el cliente en la base de datos
	 * @param direccion direccion de residencia del cliente
	 * @param telefono numero de contacto del cliente
	 */
	public  Clientes(String identificacion, String nombre, String apellido, String fechaRegistro, String direccion, String telefono) {
		
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaRegistro = fechaRegistro;
		this.direccion = direccion;
		this.telefono = telefono;
	}
    
	/**Getter para obtener el valor del atributo 'identificaion'
	 * 
	 * @return identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}
    
	/**Setter para establecer el valor del atributo 'identificacion'
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
    
	/**Getter para obtener el valor del atributo 'fechaRegistro'
	 * 
	 * @return fechaRegistro
	 */
	public String getFechaRegistro() {
		return fechaRegistro;
	}
    
	/**Setter para establecer el valor del atributo 'fechaRegistro'
	 * 
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
    
	/**Getter para obtener el valor del atributo 'direccion'
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
    
	/**Setter para establecer el valor del atributo 'direccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
	/**Getter para obtener el valor del atributo 'telefono'
	 * 
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}
    
	/**Setter para establecer el valor del atributo 'telefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	

}
