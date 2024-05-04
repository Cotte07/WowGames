package BaseDatos;

public class Facturas {
	private Float id;
	private String fecha;
	private Float subTotal;
	private Float valorTotal;
	private Float descuento;
	private String credencialVendedor;
	private String identificacionCliente;
	
	public Facturas(Float id, String fecha, Float subTotal, Float valorTotal, Float descuento, String credencialVendedor, String identificacionCliente) {
		this.id = id;
		this.fecha = fecha;
		this.subTotal = subTotal;
		this.valorTotal = valorTotal;
		this.descuento = descuento;
		this.credencialVendedor = credencialVendedor;
		this.identificacionCliente = identificacionCliente;
	}

	public String getCredencialVendedor() {
		return credencialVendedor;
	}

	public void setCredencialVendedor(String credencialVendedor) {
		this.credencialVendedor = credencialVendedor;
	}

	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	public Float getId() {
		return id;
	}

	public void setId(Float id) {
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
