package Producto;

/**Clase que crea objeto producto
 * 
 * 
 *
 */
public class Productos {
	private String referencia;
	private float iva;
	private String tipoProducto;
	private String tipoJuego;
	private String nombre;
	private float valorUnitario;
	private float impuesto;
	private String plataforma;
	private Integer cantidad; 
	private float total;
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**Metodo constructor de los productos
	 * 
	 * @param referencia
	 * @param iva
	 * @param tipoProducto
	 * @param tipoJuego
	 * @param nombre
	 * @param valorUnitario
	 * @param impuesto
	 * @param plataforma
	 * @param cantidad 
	 */
	public Productos (String referencia, float iva, String tipoProducto, String tipoJuego, String nombre, float valorUnitario, float impuesto, String plataforma) {
		this.referencia = referencia;
		this.nombre = nombre; 
		this.iva = iva;
		this.tipoProducto = tipoProducto;
		this.impuesto = impuesto;
		this.tipoJuego = tipoJuego;
		this.valorUnitario = valorUnitario;
		this.plataforma = plataforma;
		
	}
    
	/**Getter para obtener el valor del atributo 'referencia'
	 * 
	 * @return
	 */
	public String getReferencia() {
		return referencia;
	}
    
	/**Setter para establecer el valor del atributo 'referencia'
	 * 
	 * @param referencia
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
    
	/**Getter para obtener el valor del atributo 'iva'
	 * 
	 * @return
	 */
	public float getIva() {
		return iva;
	}
    
	/**Setter para establecer el valor del atributo 'iva'
	 * 
	 * @param iva
	 */
	public void setIva(float iva) {
		this.iva = iva;
	}
    
	/**Getter para obtener el valor del atributo 'tipoProducto'
	 *  
	 * @return tipoProducto
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}
    
	/**Setter para establecer el valor del atributo 'tipoProducto'
	 * 
	 * @param tipoProducto
	 */
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
    
	/**Getter para obtener el valor del atributo 'tipoJuego'
	 * 
	 * @return tipoJuego
	 */
	public String getTipoJuego() {
		return tipoJuego;
	}
    
	/**Setter para establecer el valor del atributo 'tipoJuego'
	 * 
	 * @param tipoJuego
	 */
	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
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
    
	/**Getter para obtener el valor del atributo 'valorUnitario'
	 * 
	 * @return valorUnitario
	 */
	public float getValorUnitario() {
		return valorUnitario;
	}
    
	/**Setter para establecer el valor del atributo 'valorUnitario'
	 * 
	 * @param valorUnitario
	 */
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
    
	/**Getter para obtener el valor del atributo 'impuesto'
	 * 
	 * @return impuesto
	 */
	public float getImpuesto() {
		return impuesto;
	}
    
	/**Setter para establecer el valor del atributo 'impuesto'
	 * 
	 * @param impuesto
	 */
	public void setImpuesto(float  impuesto) {
		this.impuesto = impuesto;
	}
    
	/**Getter para obtener el valor del atributo 'plataforma'
	 * 
	 * @return plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

    /**Setter para establecer el valor del atributo 'plataforma'
     * 
     * @param plataforma
     */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
