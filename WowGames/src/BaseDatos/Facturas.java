package BaseDatos;

public class Facturas {
	private String id;
	private String fecha;
	private Float subTotal;
	private Float valorTotal;
	private Float descuento;
	
	public void Factura(String id, String fecha, Float subTotal, Float valorTotal, Float descuento) {
		this.id = id;
		this.fecha = fecha;
		this.subTotal = subTotal;
		this.valorTotal = valorTotal;
		this.descuento = descuento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

}
