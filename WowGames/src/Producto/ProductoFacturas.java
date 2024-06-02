package Producto;

public class ProductoFacturas {

	
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
	
	
	public ProductoFacturas(String referencia, float iva, String tipoProducto, String tipoJuego, String nombre,
			float valorUnitario, float impuesto, String plataforma, Integer cantidad) {
		super();
		this.referencia = referencia;
		this.iva = iva;
		this.tipoProducto = tipoProducto;
		this.tipoJuego = tipoJuego;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.impuesto = impuesto;
		this.plataforma = plataforma;
		this.cantidad = cantidad;

	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getTipoJuego() {
		return tipoJuego;
	}
	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public float getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
