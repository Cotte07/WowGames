package BaseDatos;

public class Productos {
	private String referencia;
	private float iva;
	private String tipoProducto;
	private String tipoJuego;
	private String nombre;
	private float valorUnitario;
	private float impuesto;
	private String plataforma;
	
	public Productos (String referencia, String nombre, float iva, String tipoProducto, float impuesto, String tipoJuego, float valorUnitario, String plataforma) {
		this.referencia = referencia;
		this.nombre = nombre; 
		this.iva = iva;
		this.tipoProducto = tipoProducto;
		this.impuesto = impuesto;
		this.tipoJuego = tipoJuego;
		this.valorUnitario = valorUnitario;
		this.plataforma = plataforma;
		
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

	public void setImpuesto(float  impuesto) {
		this.impuesto = impuesto;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
