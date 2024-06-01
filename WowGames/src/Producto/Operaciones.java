package Producto;

public class Operaciones {

	private Productos producto;
	
	public int total() {
		
		float total;
		
		total= (int) ((((producto.getIva()+producto.getImpuesto())/100)+1)*producto.getValorUnitario());
		
		return (int) total;

	}
	
	
	public float subTotal() {
		
		float subtotal;
		
		return subtotal= producto.getValorUnitario();
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
	
}


