package Facturas;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.CheckBox;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaRegistrarFacturaController {
	@FXML
	private TextField codigoProductoTxt;
	@FXML
	private TableView<?> registrarVentaTable;
	@FXML
	private TableColumn<?, ?> credencialColumn;
	@FXML
	private TableColumn<?, ?> codigoProductoColumn;
	@FXML
	private TableColumn<?, ?> tipoColumn;
	@FXML
	private TableColumn<?, ?> nombreProductoColumn;
	@FXML
	private TableColumn<?, ?> plataformaColumn;
	@FXML
	private TableColumn<?, ?> precioColumn;
	@FXML
	private Button ingresarBtn;
	@FXML
	private Button regresarBtn;
	@FXML
	private CheckBox descuentoBox;
	@FXML
	private Button generarFacturaBtn;

	// Event Listener on TableView[#registrarVentaTable].onMouseClicked
	@FXML
	public void onSelection(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#ingresarBtn].onMouseClicked
	@FXML
	public void onIngresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#generarFacturaBtn].onMouseClicked
	@FXML
	public void onGenerarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
}
