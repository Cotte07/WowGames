package Facturas;

import java.util.LinkedList;
import java.util.List;

import Producto.Productos;

/**Clase para crear el objeto factura
 * 
 * 
 *
 */
public class Facturas {
	private Float id;
	private String fecha;
	private Float subTotal;
	private Float valorTotal;
	private Float descuento;
	private String credencialVendedor;
	private String identificacionCliente;
	
	private List<Productos> productos;
	/**Metodo constructor para las facturas
	 * 
	 * @param id
	 * @param fecha
	 * @param subTotal
	 * @param valorTotal
	 * @param descuento
	 * @param credencialVendedor
	 * @param identificacionCliente
	 */
	public Facturas(Float id, String fecha, Float subTotal, Float valorTotal, Float descuento, String credencialVendedor, String identificacionCliente) {
		this.id = id;
		this.fecha = fecha;
		this.subTotal = subTotal;
		this.valorTotal = valorTotal;
		this.descuento = descuento;
		this.credencialVendedor = credencialVendedor;
		this.identificacionCliente = identificacionCliente;
		this.productos = productos;
		productos = new LinkedList<Productos>();
	}
    
	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

	/**Getter para obtener el valor del atributo 'id'
	 * 
	 * @return id
	 */
	public Float getId() {
		return id;
	}
    
	/**Setter para establecer el valor del atributo 'id'
	 * 
	 * @param id
	 */
	public void setId(Float id) {
		this.id = id;
	}
    
	/**Getter para obtener el valor del atributo 'fecha'
	 * 
	 * @return fecha
	 */
	public String getFecha() {
		return fecha;
	}
    
	/**Setter para establecer el valor del atributo 'fecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
	/**Getter para obtener el valor del atributo 'subtotal'
	 * 
	 * @return subtotal
	 */
	public Float getSubTotal() {
		return subTotal;
	}
    
	/**Setter para establecer el valor del atributo 'subtotal'
	 * 
	 * @param subTotal
	 */
	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}
    
	/**Getter para obtener el valor del atributo 'valorTotal'
	 * 
	 * @return valorTotal
	 */
	public Float getValorTotal() {
		return valorTotal;
	}
    
	/**Setter para establecer el valor del atributo 'valorTotal'
	 * 
	 * @param valorTotal
	 */
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
    
	/**Getter para obtener el valor del atributo 'descuento'
	 * 
	 * @return descuento
	 */
	public Float getDescuento() {
		return descuento;
	}
    
	/**Setter para establecer el valor del atributo 'descuento'
	 * 
	 * @param descuento
	 */
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}
    
	/**Getter para obtener el valor del atributo 'credencialVendedor'
	 * 
	 * @return credencialVendedor
	 */
	public String getCredencialVendedor() {
		return credencialVendedor;
	}
    
	/**Setter para establecer el valor del atributo 'credencialVendedor'
	 * 
	 * @param credencialVendedor
	 */
	public void setCredencialVendedor(String credencialVendedor) {
		this.credencialVendedor = credencialVendedor;
	}
    
	/**Getter para obtener el valor del atributo 'identificacionCliente'
	 * 
	 * @return identificacionCliente
	 */
	public String getIdentificacionCliente() {
		return identificacionCliente;
	}
    
	/**Setter para establecer el valor del atributo 'identificacionCliente'
	 * 
	 * @param identificacionCliente
	 */
	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	


}
