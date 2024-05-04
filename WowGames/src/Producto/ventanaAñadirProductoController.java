package Producto;

import BaseDatos.Clientes;
import BaseDatos.Datos;
import BaseDatos.Productos;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaAñadirProductoController {
	@FXML
	private TextField referenciaTxt;
	@FXML
	private TextField nombreTxt;
	@FXML
	private TextField ivaTxt;
	@FXML
	private TextField tipoProductoTxt;
	@FXML
	private TextField impuestoTxt;
	@FXML
	private TextField tipoJuegoTxt;
	@FXML
	private TextField valorTxt;
	@FXML
	private TextField plataformaTxt;
	@FXML
	private Button regresarBtn;
	@FXML
	private Button añadirBtn;
	@FXML
	private TableView<Productos> tablaAñadirProducto;
	@FXML
	private TableColumn<Productos, String> referenciaColumn;
	@FXML
	private TableColumn<Productos, String> nombreColumn;
	@FXML
	private TableColumn<Productos, Float> ivaColumn;
	@FXML
	private TableColumn<Productos, String> tipoProductoColumn;
	@FXML
	private TableColumn<Productos, Float> impuestoColumn;
	@FXML
	private TableColumn<Productos, String> tipoJuegoColumn;
	@FXML
	private TableColumn<Productos, Float> valorColumn;
	@FXML
	private TableColumn<Productos, String> plataformaColumn;
	private Datos dataProvider = new Datos();

	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#añadirBtn].onMouseClicked
	@FXML
	public void onAñadirClicked(MouseEvent event) {
		// TODO Autogenerated
		Productos nuevo = new Productos(referenciaTxt.getText(), ivaTxt.getAnchor(), tipoProductoTxt.getText(), tipoJuegoTxt.getText(), nombreTxt.getText(), valorTxt.getLength(), impuestoTxt.getLength(), plataformaTxt.getText());
		boolean successAñadirProducto = this.dataProvider.createProducto(nuevo);
		if (successAñadirProducto) {
			Alert alt = new Alert(Alert.AlertType.INFORMATION);
			alt.setContentText("Producto Añadido");
			alt.setHeaderText("Creado");
			alt.show();
		}else {
			Alert alt = new Alert(Alert.AlertType.ERROR);
			alt.setContentText("Error añadiendo el producto");
			alt.setHeaderText("error");
			alt.show();
		
	}
}
}
