package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

 public class Datos {

	private String conectionstr = "jdbc:oracle:thin:@192.168.1.6:1521";
	private String username = "wow";
	private String password = "wowgames";
	
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
	
	
	public Facturas consultarId (Facturas factura) {
		Facturas consultarId = null;
		Connection conn = this.getConnection();
		String query = "SELECT id FROM factura WHERE id = (SELECT MAX(id) FROM factura)(?)";
		return consultarId;
	}
	
	
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
	
	
	public LinkedList<Productos> getDatos(){
		LinkedList<Productos> data = new LinkedList<Productos>();
		Connection conn = this.getConnection();
		Statement st;
		try {
			st = conn.createStatement();
			String query = "select * from producto where referencia=?";
			PreparedStatement st1 = conn.prepareStatement(query);
			String referencia = null;
			st1.setString(1, referencia);
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
	
	public Productos consulta(String referencia) {
		Productos producto = null;
		Connection conn = this.getConnection();
		try {
			String query = "select * from producto where referencia=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, referencia);
			ResultSet result = st.executeQuery();
			while(result.next()) {
				producto=new Productos(result.getString(1), result.getFloat(2), result.getString(3), result.getString(4), result.getString(5), result.getFloat(6), result.getFloat(7), result.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return producto;
		
	}
}
