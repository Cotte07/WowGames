package Producto;

import BaseDatos.Datos;
import BaseDatos.Facturas;
import BaseDatos.Productos;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaModificarProductoController {
	@FXML
	private TextField referenciaTxt;
	@FXML
	private TextField nombreTxt;
	@FXML
	private TextField ivaTxt;
	@FXML
	private TextField tipoProducto;
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
	private Button modificarBtn;
	@FXML
	private TableView<?> tablaModificarProducto;
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
	// Event Listener on Button[#modificarBtn].onMouseClicked
	@FXML
	public void onModificarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#visualizarBtn].onMouseClicked
	@FXML
	public void onVisualizarClicked(MouseEvent event) {
		// TODO Autogenerated
		Datos datos = new Datos(); 
        Productos resultado = null;
        resultado = datos.up(referenciaTxt);
		
		
	}
}
