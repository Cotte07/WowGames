package Producto;

public class Operaciones {

	Productos producto;
	
	private float iva; 
	private float impuesto;
	private int valorUnitario;
	
	public int total() {
		
		float total;
		Productos producto = new Productos( null, iva, null, null, null, valorUnitario, impuesto, null);
		
		total= (int) ((((iva+impuesto)/100)+1)*valorUnitario);
		
		return (int) total;

	}
}


