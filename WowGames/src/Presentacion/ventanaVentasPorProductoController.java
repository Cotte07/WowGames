package Presentacion;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaVentasPorProductoController {
	@FXML
	private TextField codigoTxt;
	@FXML
	private Button consultarBtn;
	@FXML
	private Button regresarBtn;
	@FXML
	private TableView<?> tablaProducto;
	@FXML
	private TableColumn<?, ?> codigoColumn;
	@FXML
	private TableColumn<?, ?> nombreColumn;
	@FXML
	private TableColumn<?, ?> valorColumn;
	@FXML
	private TableColumn<?, ?> ventasMesColumn;
	@FXML
	private TableColumn<?, ?> ventasTotalesColumn;

	// Event Listener on Button[#consultarBtn].onMouseClicked
	@FXML
	public void onConsultarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
}