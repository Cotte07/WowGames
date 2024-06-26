package Facturas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BaseDatos.Datos;
import Cliente.Clientes;
import Producto.ProductoFacturas;
import Producto.Productos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

/**Clase del controlador de la ventana para eliminar factura
 * 
 * 
 *
 */
public class ventanaEliminarFacturaController implements Initializable {
	
	@FXML
	private TableView<Facturas> tableFactura;
	@FXML
	private TableColumn<Facturas, Float> subtotalColumn;
	@FXML
    private TableColumn<Facturas, String> fechaFacturaColumn;
	@FXML
	private TableColumn<Facturas, Float> descuentoColumn;
	@FXML
	private TableColumn<Facturas, Float> totalColumn;
	@FXML
	private TableColumn<Facturas, String> vendedorColumn;
	@FXML
	private TableColumn<Facturas, String> identificacionColumn;
	@FXML
	private Button regresarBtn;
	@FXML
	private TextField idFacturaTxt;
	@FXML
	private Button consultarBtn;
	
	@FXML
    private Button eliminarBtn;
	
	
	private Datos dataProvider = new Datos();

	private ObservableList<Facturas> data = FXCollections.observableArrayList();
	private ObservableList<Clientes > data1 = FXCollections.observableArrayList();
	private ObservableList<Productos > data2 = FXCollections.observableArrayList();
	private ObservableList<ProductoFacturas> data3 = FXCollections.observableArrayList();





	// Event Listener on Button[#regresarBtn].onMouseClicked
	@FXML
	public void onRegresarClicked(MouseEvent event) {
		
		Parent root = null;
	    try {
	        root = FXMLLoader.load(getClass().getResource("/Presentacion/VentanaOpcionesVendedor.fxml"));
	        Scene scene = new Scene(root);
	        
	        // Obtén el escenario actual usando el evento
	        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        
	        // Configura el nuevo escenario
	        Stage newStage = new Stage();
	        newStage.setScene(scene);
	        
	        //Agregar titulo a la ventana
	        newStage.setTitle("WowGames: VentanaOpciones");
	        
	        // Muestra el nuevo escenario
	        newStage.show();
	        
	        // Cierra el escenario actual
	        currentStage.close();
	        
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		// TODO Autogenerated
	}
	
	
	
	
	// Event Listener on Button[#consultarBtn].onMouseClicked
	@FXML
	public void onConsultarClicked(MouseEvent event) {
		// TODO Autogenerated
		this.data.clear();

		Facturas factura = dataProvider.consultarFactura(idFacturaTxt.getText());
	
		
		try {
			if (factura.getIdentificacionCliente() != null) {
			    this.data.add(factura);
			    this.tableFactura.setItems(data);
			    
			}
		} catch (Exception e) {
			Alert alt = new Alert(AlertType.ERROR);
			alt.setContentText("Verifica el id de la factura. ");
			alt.setHeaderText("La factura no existe");
			alt.show();
		}
		
		
	}


	
	public void onEliminarClicked(MouseEvent event) {

		
		Facturas delete = this.tableFactura.getSelectionModel().getSelectedItem();
		this.dataProvider.deleteFacturaProducto(null);
		this.dataProvider.deleteFacura(delete);
		this.data.remove(delete);

		
	    }



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		this.subtotalColumn.setCellValueFactory(new PropertyValueFactory<Facturas, Float>("subTotal"));
		this.fechaFacturaColumn.setCellValueFactory(new PropertyValueFactory<Facturas, String>("fecha"));
		this.descuentoColumn.setCellValueFactory(new PropertyValueFactory<Facturas, Float>("descuento"));
		this.totalColumn.setCellValueFactory(new PropertyValueFactory<Facturas, Float>("valorTotal"));
		this.vendedorColumn.setCellValueFactory(new PropertyValueFactory<Facturas, String>("credencialVendedor"));
		this.identificacionColumn.setCellValueFactory(new PropertyValueFactory<Facturas, String>("identificacionCliente"));
		
		
	}
}
		