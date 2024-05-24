package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Cliente.Clientes;
import Facturas.Facturas;
import Producto.Productos;
import Vendedor.Vendedores;


 /**Clase en la que se conecta el proyecto con la base de datos
  * 
  * 
  *
  */
 public class Datos {

	private String conectionstr = "jdbc:oracle:thin:@192.168.1.6:1521";
	private String username = "wow";
	private String password = "wowgames";
	
	/**Metodo en el que se establece la conexion con la base de datos
	 * 
	 * @return conn
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(this.conectionstr, this.username, this.password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	} 
	
	/**Metodo de login para que el vendedor entre en la aplicacion
	 * 
	 * @param credencial
	 * @param contrasena
	 * @return user
	 */
	public Vendedores login(String credencial, String contrasena) {
		Vendedores user=null;
		Connection conn = this.getConnection();
		try {
			String query = "select * from vendedor where credencial=? and contrasenavendedor=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, credencial);
			st.setString(2, contrasena);
			ResultSet result = st.executeQuery();
			while(result.next()) {
				user = new Vendedores (result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	
}
	
	public Administrador loginAdmin(String credencial, String contrasena) {
		Administrador user=null;
		Connection conn = this.getConnection();
		try {
			String query = "select * from administrador where credencial=? and constrasenaadmin=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, credencial);
			st.setString(2, contrasena);
			ResultSet result = st.executeQuery();
			while(result.next()) {
				user = new Administrador (result.getString(1), result.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	
}
	
	/**Metodo para crear nuevos clientes
	 * 
	 * @param Cliente
	 * @return success retorna un booleano
	 */
	public boolean createCliente(Clientes Cliente) {
		Connection conn = this.getConnection();
		String query = "INSERT INTO cliente VALUES(?,?,?,?,?,?)";
		boolean success = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, Cliente.getIdentificacion());
			st.setString(2, Cliente.getNombre());
			st.setString(3, Cliente.getApellido());
			st.setString(4, Cliente.getFechaRegistro());
			st.setString(5, Cliente.getDireccion());
			st.setString(6, Cliente.getTelefono());
			st.executeUpdate();
			success = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	
	/**Metodo para crear nuevas facturas
	 * 
	 * @param factura
	 * @return success1 retorna un booleano
	 */
	public boolean createFactura(Facturas factura) {
		Connection conn = this.getConnection();
		String query = "INSERT INTO factura VALUES(?,?,?,?,?,?,?)";
		boolean success1 = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setFloat(1, factura.getId());
			st.setString(2, factura.getFecha());
			st.setFloat(3, factura.getSubTotal());
			st.setFloat(4, factura.getValorTotal());
			st.setFloat(5, factura.getDescuento());
			st.setString(6, factura.getCredencialVendedor());
			st.setString(7, factura.getIdentificacionCliente());
			st.executeUpdate();
			success1 = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success1;
	}
	
	/**Metodo que busca el id que sea mayor entre las facturas para automatizar el generar los id 
	 * 
	 * @param factura
	 * @return consultarId
	 */
	public Facturas consultarId (Facturas factura) {
		Facturas consultarId = null;
		Connection conn = this.getConnection();
		String query = "SELECT id FROM factura WHERE id = (SELECT MAX(id) FROM factura)(?)";
		return consultarId;
	}
	
	/**Metodo para crear nuevos productos
	 * 
	 * @param Producto
	 * @return successAñadirProducto retorna un booleano
	 */
	public boolean createProducto(Productos Producto) {
		Connection conn = this.getConnection();
		String query = "INSERT INTO producto VALUES(?,?,?,?,?,?,?,?)";
		boolean successAñadirProducto = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, Producto.getReferencia());
			st.setFloat(2, Producto.getIva());
			st.setString(3, Producto.getTipoProducto());
			st.setString(4, Producto.getTipoJuego());
			st.setString(5, Producto.getNombre());
			st.setFloat(6, Producto.getValorUnitario());
			st.setFloat(7, Producto.getImpuesto());
			st.setString(8, Producto.getPlataforma());
			st.executeUpdate();
			successAñadirProducto = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return successAñadirProducto;
	}
	
	/**Metodo para mostrar los productos
	 * 
	 * @return data
	 */
	public LinkedList<Productos> getDatos(){
		LinkedList<Productos> data = new LinkedList<Productos>();
		Connection conn = this.getConnection();
		Statement st;
		try {
			st = conn.createStatement();
			String query = "select * from producto where referencia=?";
			ResultSet result = st.executeQuery(query);
			while(result.next()) {
				data.add(new Productos(result.getString(1), result.getFloat(2), result.getString(3), result.getString(4), result.getString(5), result.getFloat(6), result.getFloat(7), result.getString(8)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	/**Metodo para eliminar un producto con el numero de referencia
	 * 
	 * @param producto
	 * @return success retorna un booleano
	 */
	public boolean deleteProducto(Productos producto) {
		Connection conn = this.getConnection();
		String query = "DELETE FROM producto WHERE referencia=?";
		boolean success = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, producto.getReferencia());
			st.executeUpdate();
			success = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	
	/**Metodo para actualizar los datos de los productos con el numero de referencia
	 * 
	 * @param producto
	 * @return success retorna un booleano
	 */
	public boolean modificarProducto(Productos producto) {
		Connection conn = this.getConnection();
		String query = "update producto set iva=?, tipoProducto=?, tipoJuego=?, nombre=?, valorUnitario=?, impuesto=?, platorma=? where referencia=?";
		boolean success = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setFloat(1, producto.getIva());
			st.setString(2, producto.getTipoProducto());
			st.setString(3, producto.getTipoJuego());
			st.setString(4, producto.getNombre());
			st.setFloat(5, producto.getValorUnitario());
			st.setFloat(6, producto.getImpuesto());
			st.setString(7, producto.getPlataforma());
			st.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
		}
	
	/**Metodo para actualizar los datos de los clientes
	 * 
	 * @param Cliente
	 * @return success retorna un booleano
	 */
	public boolean updateCliente(Clientes Cliente) {
		Connection conn = this.getConnection();
		String query = "update cliente set Identificacion=?, Nombre=?, Apellido=?, FechaRegistro=?, Direccion=?, Telefono=?";
		boolean success = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, Cliente.getIdentificacion());
			st.setString(2, Cliente.getNombre());
			st.setString(3, Cliente.getApellido());
			st.setString(4, Cliente.getFechaRegistro());
			st.setString(5, Cliente.getDireccion());
			st.setString(6, Cliente.getTelefono());
			st.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
		}
    
	/**Metodo para crear nuevos vendedores
	 * 
	 * @param vendedor
	 * @return successAñadirVendedor
	 */
	public boolean createVendedor (Vendedores vendedor) {
		Connection conn = this.getConnection();
		String query = "INSERT INTO vendedor VALUES(?,?,?,?,?,?)";
		boolean successAñadirVendedor = false;
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, vendedor.getCredencial());
			st.setString(2, vendedor.getIdentificacion());
			st.setString(3, vendedor.getNombre());
			st.setString(4, vendedor.getApellido());
			st.setString(5, vendedor.getFechaIngreso());
			st.setString(6, vendedor.getContrasena());
			st.executeUpdate();
			successAñadirVendedor = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

		return successAñadirVendedor;
	}
	
	/**Medodo para mostrar los datos de los vendedores
	 * 
	 * @return data
	 */
	public LinkedList<Vendedores> getDatosVendedor(){
		LinkedList<Vendedores> data = new LinkedList<Vendedores>();
		Connection conn = this.getConnection();
		Statement st;
		try {
			st = conn.createStatement();
			String query = "select * from vendedor";
			ResultSet result = st.executeQuery(query);
			while(result.next()) {
				data.add(new Vendedores(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

}
	
	/**Metodo para eliminar vendedores con la credencial
	 * 
	 * @param Vendedor
	 * @return success retorna un booleano
	 */
	public boolean deleteVendedor(Vendedores Vendedor) {
		Connection conn = this.getConnection();
		String query = "DELETE FROM vendedor WHERE credencial=?";
		boolean success = false;
		
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, Vendedor.getCredencial());
			st.executeUpdate();
			success = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	
	public boolean deleteCliente(Clientes cliente) {
		Connection conn = this.getConnection();
		String query = "DELETE FROM cliente WHERE identificacion =?";
		boolean success = false;
		
		
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, cliente.getIdentificacion());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		success = true;
		
		return success;
	}
 }
