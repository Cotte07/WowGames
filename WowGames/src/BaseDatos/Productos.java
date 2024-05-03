package BaseDatos;

public class Productos {
	private String referencia;
	private Float iva;
	private String tipoProducto;
	private String tipoJuego;
	private String nombre;
	private Float valorUnitario;
	private Float impuesto;
	private String plataforma;
	
	public void Producto(String referencia, Float iva, String tipoProducto, String tipoJuego, String nombre, Float valorUnitario, Float impuesto, String plataforma) {
		this.referencia = referencia;
		this.iva = iva;
		this.tipoProducto = tipoProducto;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.impuesto = impuesto;
		this.plataforma = plataforma;
		
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Float getIva() {
		return iva;
	}

	public void setIva(Float iva) {
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

	public Float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Float impuesto) {
		this.impuesto = impuesto;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
