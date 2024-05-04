package BaseDatos;



public class sesion {
	private static Productos producto;
	public static Productos getProducto() {
		return sesion.producto;
	}

	public static void setProducto(Productos producto) {
		sesion.producto = producto;

}
}
