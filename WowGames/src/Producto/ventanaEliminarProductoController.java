package Producto;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaEliminarProductoController {
	@FXML
	private Button regresarBtn;
	@FXML
	private Button eliminarBtn;
	@FXML
	private TableView<?> tablaEliminarProducto;
	@FXML
	private TableColumn<?, ?> referenciaColumn;
	@FXML
	private TableColumn<?, ?> nombreColumn;
	@FXML
	private TableColumn<?, ?> ivaColumn;
	@FXML
	private TableColumn<?, ?> tipoProductoColumn;
	@FXML
	private TableColumn<?, ?> impuestoColumn;
	@FXML
	private TableColumn<?, ?> tipoJuegoColumn;
	@FXML
	private TableColumn<?, ?> valorColumn;
	@FXML
	private TableColumn<?, ?> plataformaColumn;
	@FXML
	private TextField referenciaBuscarTxt;
	@FXML
	private Button visualizarBtn;

	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#eliminarBtn].onMouseClicked
	@FXML
	public void onEliminarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#visualizarBtn].onMouseClicked
	@FXML
	public void onVisualizarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
}
