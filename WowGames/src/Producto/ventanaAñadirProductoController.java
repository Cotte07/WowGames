package Producto;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import BaseDatos.Datos;
import BaseDatos.Clientes;
import BaseDatos.Productos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

/**Clase del controlador de la ventana añadir producto
 * 
 * 
 *
 */
public class ventanaAñadirProductoController implements Initializable{
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
	private ObservableList<Productos> data = FXCollections.observableArrayList();

	// Event Listener on Button[#regresarBtn].onMouseClicked
	/**Metodo para regresar a la ventana que muestra las opciones de la aplicacion
	 * 
	 * @param event
	 */
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		// TODO Autogenerated
		
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("/Presentacion/ventanaOpciones.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage st = new Stage();
		st.setScene(scene);
		st.show();
		
		
	}
	// Event Listener on Button[#añadirBtn].onMouseClicked
	/**Metodo para añadir productos
	 * 
	 * @param event
	 */
	@FXML
	public void onAñadirClicked(MouseEvent event) {
		// TODO Autogenerated
		float iva = Float.parseFloat(ivaTxt.getText());
        float valorUnitario = Float.parseFloat(valorTxt.getText());
        float impuesto = Float.parseFloat(impuestoTxt.getText());

		
		
        Productos nuevo = new Productos(referenciaTxt.getText(), iva, tipoProductoTxt.getText(), tipoJuegoTxt.getText(),nombreTxt.getText(), valorUnitario, impuesto, plataformaTxt.getText());
        boolean successAñadirProducto = this.dataProvider.createProducto(nuevo);
        if (successAñadirProducto) {
            Alert alt = new Alert(Alert.AlertType.INFORMATION);
            alt.setContentText("Producto Añadido");
            alt.setHeaderText("Creado");
            alt.show();
        } else {
			Alert alt = new Alert(Alert.AlertType.ERROR);
			alt.setContentText("Error añadiendo el producto");
			alt.setHeaderText("error");
			alt.show();
		
	}
}
	/**Metodo para mostrar los productos
	 * 
	 * @param arg0
	 * @param arg1
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.referenciaColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("referencia"));
		this.ivaColumn.setCellValueFactory(new PropertyValueFactory<Productos, Float>("iva"));
		this.tipoProductoColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("tipoProducto"));
		this.tipoJuegoColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("tipoJuego"));
		this.nombreColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("nombre"));
		this.valorColumn.setCellValueFactory(new PropertyValueFactory<Productos, Float>("valorUnitario"));
		this.impuestoColumn.setCellValueFactory(new PropertyValueFactory<Productos, Float>("impuesto"));
		this.plataformaColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("plataforma"));
		LinkedList<Productos> temp = this.dataProvider.getDatos();
		for(Productos item: temp) {
			this.data.add(item);
		}
		this.tablaAñadirProducto.setItems(data);
		
	}
}
