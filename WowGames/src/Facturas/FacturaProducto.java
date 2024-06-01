package Facturas;

public class FacturaProducto {

	private String id;
	private Integer cantidad;
	private String idFactura;
	private String referenciaProducto;
	public FacturaProducto(String id, Integer cantidad, String idFactura, String referenciaProducto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.idFactura = idFactura;
		this.referenciaProducto = referenciaProducto;
	}
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	public String getReferenciaProducto() {
		return referenciaProducto;
	}
	public void setReferenciaProducto(String referenciaProducto) {
		this.referenciaProducto = referenciaProducto;
	}
	
	
}
