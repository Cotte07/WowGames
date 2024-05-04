package Vendedor;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import BaseDatos.Datos;

import BaseDatos.Vendedores;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class ventanaAñadirVendedorController implements Initializable{
	@FXML
	private Button regresarBtn;
	@FXML
	private TableView<Vendedores> tablaAñadirCliente;
	@FXML
	private TableColumn<Vendedores, String> credencialColumn;
	@FXML
	private TableColumn<Vendedores, String> nombreColumn;
	@FXML
	private TableColumn<Vendedores, String> apellidoColumn;
	@FXML
	private TableColumn<Vendedores, String> identificacionColumn;
	@FXML
	private TableColumn<Vendedores, String> fechaColumn;
	@FXML
	private TableColumn<Vendedores, String> contraseñaColumn;
	@FXML
	private TextField credencialTxt;
	@FXML
	private TextField nombreTxt;
	@FXML
	private TextField apellidoTxt;
	@FXML
	private TextField identificacionTxt;
	@FXML
	private TextField fechaTxt;
	@FXML
	private TextField contraseñaTxt;
	@FXML
	private Button añadirBtn;
	private Datos dataProvider = new Datos();
	private ObservableList<Vendedores> data = FXCollections.observableArrayList();

	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#añadirBtn].onMouseClicked
	@FXML
	public void onAñadirClicked(MouseEvent event) {
		// TODO Autogenerated
		Vendedores nuevo = new Vendedores(credencialTxt.getText(), identificacionTxt.getText(), nombreTxt.getText(), apellidoTxt.getText(), fechaTxt.getText(), contraseñaTxt.getText());
        boolean successAñadirVendedor = this.dataProvider.createVendedor(nuevo);
        if (successAñadirVendedor) {
            Alert alt = new Alert(Alert.AlertType.INFORMATION);
            alt.setContentText("Producto Añadido");
            alt.setHeaderText("Creado");
            alt.show();
        } else {
			Alert alt = new Alert(Alert.AlertType.ERROR);
			alt.setContentText("Error añadiendo el vendedor");
			alt.setHeaderText("error");
			alt.show();
		
	}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.credencialColumn.setCellValueFactory(new PropertyValueFactory<Vendedores, String>("credencial"));
		this.identificacionColumn.setCellValueFactory(new PropertyValueFactory<Vendedores, String>("id"));
		this.nombreColumn.setCellValueFactory(new PropertyValueFactory<Vendedores, String>("nombre"));
		this.apellidoColumn.setCellValueFactory(new PropertyValueFactory<Vendedores, String>("apellido"));
		this.fechaColumn.setCellValueFactory(new PropertyValueFactory<Vendedores, String>("fechaIngreso"));
		this.contraseñaColumn.setCellValueFactory(new PropertyValueFactory<Vendedores, String>("contrasena"));
		LinkedList<Vendedores> temp = this.dataProvider.getDatosVendedor();
		for(Vendedores item: temp) {
			this.data.add(item);
		}
		this.tablaAñadirCliente.setItems(data);
		
	}
}
