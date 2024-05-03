package BaseDatos;



public class Session {
	private static Vendedores vendedor;
	private static boolean isAdmin;

	public static Vendedores getvendedor() {
		return Session.vendedor;
	}

	public static void setvendedor(Vendedores vendedor) {
		Session.vendedor = vendedor;
	}

	public static boolean isAdmin() {
		return isAdmin;
	}

	public static void setAdmin(boolean isAdmin) {
		Session.isAdmin = isAdmin;
	}
	

}
