package Vendedor;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaComisionesController {
	@FXML
	private TextField idVendedorTxt;
	@FXML
	private Button visualizarBtn;
	@FXML
	private Button regresarBtn;
	@FXML
	private TableView<?> comisionTable;
	@FXML
	private TableColumn<?, ?> idVendedorColumn;
	@FXML
	private TableColumn<?, ?> nombreColumn;
	@FXML
	private TableColumn<?, ?> comisionColumn;
	@FXML
	private TableColumn<?, ?> cantidadVentasColunmn;

	// Event Listener on Button[#visualizarBtn].onMouseClicked
	@FXML
	public void onVisualizarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
}