package Presentacion;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaConsultaFacturaController {
	@FXML
	private TableView<?> tablaCliente;
	@FXML
	private TableColumn<?, ?> idFacturaColumn;
	@FXML
	private TableColumn<?, ?> nombreClienteColumn;
	@FXML
	private TableColumn<?, ?> identificacionColumn;
	@FXML
	private TableColumn<?, ?> direccionColumn;
	@FXML
	private TableColumn<?, ?> telefonoColumn;
	@FXML
	private TableColumn<?, ?> vendedorColumn;
	@FXML
	private TableView<?> tablaProducto;
	@FXML
	private TableColumn<?, ?> referenciaColumn;
	@FXML
	private TableColumn<?, ?> productoColumn;
	@FXML
	private TableColumn<?, ?> plataformaColumn;
	@FXML
	private TableColumn<?, ?> tipoColumn;
	@FXML
	private TableColumn<?, ?> tipoProductoColumn;
	@FXML
	private TableColumn<?, ?> impuestoUnitarioColumn;
	@FXML
	private TableColumn<?, ?> valorUnitarioColumn;
	@FXML
	private TableView<?> tablaPago;
	@FXML
	private TableColumn<?, ?> subtotalColumn;
	@FXML
	private TableColumn<?, ?> impuestoColumn;
	@FXML
	private TableColumn<?, ?> descuentoColumn;
	@FXML
	private TableColumn<?, ?> totalColumn;
	@FXML
	private Button regresarBtn;
	@FXML
	private TextField idFacturaTxt;
	@FXML
	private Button consultarBtn;

	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#consultarBtn].onMouseClicked
	@FXML
	public void onConsultarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
}
