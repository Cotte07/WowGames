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
	@FXML
	public void onRegistrarBtn(MouseEvent event) {
		// TODO Autogenerated
		Clientes nuevo = new Clientes(identificacionTxt.getText(1), nombreTxt.getText(2), apellidoTxt.getText(3), fechaTxt.getText(4), direccionTxt.getText(5), telefonoTxt.getText(6));
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
	
	@FXML
    public void onGenerarClicked(MouseEvent event) {
		
		

	}
	
	@FXML
    public void onRegresarClicked(MouseEvent event) {

    }
}
