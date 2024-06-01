package Presentacion;

import java.io.IOException;

import BaseDatos.Administrador;
import BaseDatos.Datos;
import BaseDatos.Session;
import MostrarVentanas.MostrarVentanaOpciones;
import MostrarVentanas.MostrarVentanaOpcionesVendedor;
import Vendedor.Vendedores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**Clase del controlador de la ventana de login
 * 
 * 
 *
 */
public class ventanaLoginController {
	@FXML
	private TextField contrasenaTxt;
	@FXML
	private TextField credencialTxt;
	@FXML
	private Button entrarBtn;
	private Datos dataprovider = new Datos();
	private MostrarVentanaOpciones mvo;
	private MostrarVentanaOpcionesVendedor mvov;

	// Event Listener on Button[#entrarBtn].onMouseClicked
	/**Metodo para entrar en la aplicacion
	 * 
	 * @param event
	 */
	@FXML
	public void onEntrarClicked(MouseEvent event) {
	    // Verificar si es un administrador
	    Administrador admin = dataprovider.loginAdmin(credencialTxt.getText(), contrasenaTxt.getText());
	    
	    if(admin != null) {
	        // Es un administrador
	        Session.setAdministrador(admin);
	        mvo = new MostrarVentanaOpciones((Stage) this.credencialTxt.getScene().getWindow());
	    } else {
	        // Verificar si es un vendedor
	        Vendedores user = dataprovider.login(credencialTxt.getText(), contrasenaTxt.getText());
	        
	        if (user != null) {
	            // Es un vendedor
	            Session.setvendedor(user);
	            mvov = new MostrarVentanaOpcionesVendedor((Stage) this.credencialTxt.getScene().getWindow());
	        } else {
	            // Credencial o contraseña incorrecta
	            Alert alt = new Alert(Alert.AlertType.ERROR);
	            alt.setContentText("Credencial o contraseña errada");
	            alt.setHeaderText("Error");
	            alt.show();
	        }
	    }
	}
	
    
}

