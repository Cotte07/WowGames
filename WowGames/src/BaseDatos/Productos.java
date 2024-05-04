package BaseDatos;

public class Productos {
	private String referencia;
	private int iva;
	private String tipoProducto;
	private String tipoJuego;
	private String nombre;
	private int valorUnitario;
	private int impuesto;
	private String plataforma;
	
	public Productos (String referencia, int iva, String tipoProducto, String tipoJuego, String nombre, int valorUnitario, int impuesto, String plataforma) {
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

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
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

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
