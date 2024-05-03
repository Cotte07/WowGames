package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Datos {

	private String conectionstr = "jdbc:oracle:thin:@localhost:8080:orcl";
	private String username = "proyecto";
	private String password = "proyecto";
	
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
			String query = "select * from vendedor where credencial=? and contrasena=?";
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
}
