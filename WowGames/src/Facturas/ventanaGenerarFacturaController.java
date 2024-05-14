package Facturas;

import java.io.IOException;

import BaseDatos.Clientes;
import BaseDatos.Datos;
import BaseDatos.Facturas;
import MostrarVentanas.MostrarVentanaOpciones;
import MostrarVentanas.loadRegistrarFactura;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**Clase de la ventana para generar factura
 * 
 * 
 *
 */
public class ventanaGenerarFacturaController {
	@FXML
	private TextField credencialTxt;
	@FXML
	private TextField nombreTxt;
	@FXML
	private TextField direccionTxt;
	@FXML
	private TextField apellidoTxt;
	@FXML
	private TextField identificacionTxt;
	@FXML
	private TextField fechaTxt;
	@FXML
	private TextField telefonoTxt;
	@FXML
	private Button registrarBtn;
	@FXML
	private Button regresarBtn;

	@FXML
	private Button generarBtn;
	private Datos dataProvider = new Datos();
	private Float descuento = (float) 0.2;
	private Float subTotal = (float)0;
	private Float valorTotal = (float)0;
	private Float idFac = null;
	float id;
	int i = 1;
	private loadRegistrarFactura lnu;

	// Event Listener on Button[#registrarBtn].onMouseClicked
	/**Metodo para crear clientes 
	 * 
	 * @param event
	 */
	@FXML
	public void onRegistrarBtn(MouseEvent event) {
		// TODO Autogenerated
		Clientes nuevo = new Clientes(identificacionTxt.getText(), nombreTxt.getText(), apellidoTxt.getText(), fechaTxt.getText(), direccionTxt.getText(), telefonoTxt.getText());
		boolean success = this.dataProvider.createCliente(nuevo);
		if (success) {
			Alert alt = new Alert(Alert.AlertType.INFORMATION);
			alt.setContentText("Usuario Creado");
			alt.setHeaderText("Creado");
			alt.show();
		}else {
			Alert alt = new Alert(Alert.AlertType.ERROR);
			alt.setContentText("Error Creando el usuario");
			alt.setHeaderText("error");
			alt.show();
		}
	}
	
	/**Metodo que abre la ventana registrar factura
	 * 
	 * @param event
	 */
	@FXML
    public void onGenerarClicked(MouseEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Facturas/VentanaRegistrarFactura.fxml"));
			Scene scene = new Scene(root);
			Stage st = new Stage();
			st.setScene(scene);
			st.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	@FXML
    public void onRegresarClicked(MouseEvent event) {

    }
}
