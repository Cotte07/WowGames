package BaseDatos;

import Vendedor.Vendedores;

/**Clase para asignar roles de usuario y admin
 * 
 * 
 *
 */
public class Session {
	private static Vendedores vendedor;
	private static boolean isAdmin;
    
	/**Metodo para obtener vendedor
	 * 
	 * @return Session.vendedor
	 */
	public static Vendedores getvendedor() {
		return Session.vendedor;
	}
    
	/**Metodo para establecer vendedor
	 * 
	 * @param vendedor
	 */
	public static void setvendedor(Vendedores vendedor) {
		Session.vendedor = vendedor;
	}
    
	/**Metodo para verificar si el usuario es admin
	 * 
	 * @return
	 */
	public static boolean isAdmin() {
		return isAdmin;
	}
    
	/**Metodo para establecer admin
	 * 
	 * @param isAdmin
	 */
	public static void setAdmin(boolean isAdmin) {
		Session.isAdmin = isAdmin;
	}
	

}
