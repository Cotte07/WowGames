package Facturas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BaseDatos.Datos;
import Cliente.Clientes;
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

/**Clase del controlador de la ventana para consultar factura
 * 
 * 
 *
 */
public class ventanaConsultaFacturaController implements Initializable{
	@FXML
	private TableView<Clientes> tableCliente;
	@FXML
	private TableColumn<Clientes, String> nombreClienteColumn;
	@FXML
    private TableColumn<Clientes, String> apellidoClienteColumn;
	@FXML
    private TableColumn<Clientes, String> fechaRegistroClienteColumn;
	@FXML
	private TableColumn<Clientes, String> direccionColumn;
	@FXML
	private TableColumn<Clientes, String> telefonoColumn;
	@FXML
	private TableView<Productos> tableProducto;
	@FXML
    private TableColumn<Productos, Integer> CantidadColumn;
	@FXML
    private TableColumn<Productos, String> nombreProductoColumn;
	@FXML
	private TableColumn<Productos, Float> ivaColumn;
	@FXML
	private TableColumn<Productos, String> plataformaColumn;
	@FXML
	private TableColumn<Productos, String> tipoColumn;
	@FXML
	private TableColumn<Productos, String> tipoProductoColumn;
	@FXML
	private TableColumn<Productos, Float> valorUnitarioColumn;
	@FXML
	private TableColumn<Productos, Float> impuestoColumn;
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
	
	
	private Datos dataProvider = new Datos();

	private ObservableList<Facturas> data = FXCollections.observableArrayList();
	private ObservableList<Clientes > data1 = FXCollections.observableArrayList();
	private ObservableList<Productos > data2 = FXCollections.observableArrayList();





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
		
		
		Clientes cliente = dataProvider.consultarClienteFactura(idFacturaTxt.getText());
		
		if(cliente.getIdentificacion() != null) {
			this.data1.add(cliente);
			this.tableCliente.setItems(data1);
		}else {
			Alert alt = new Alert(AlertType.ERROR);
			alt.setContentText("Verifica el id de la factura. ");
			alt.setHeaderText("La factura no existe");
			alt.show();
		}
		
		
		Productos productos = dataProvider.consultarProductosFactura(idFacturaTxt.getText());
				
				if(productos.getReferencia() != null) {
					this.data2.add(productos);
					
					this.tableProducto.setItems(data2);
					
				}else {
					Alert alt = new Alert(AlertType.ERROR);
					alt.setContentText("Verifica el id de la factura. ");
					alt.setHeaderText("La factura no existe");
					alt.show();
				}
		
	}




	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.nombreClienteColumn.setCellValueFactory(new PropertyValueFactory<Clientes, String>("nombre"));
		this.apellidoClienteColumn.setCellValueFactory(new PropertyValueFactory<Clientes, String>("apellido"));
		this.fechaRegistroClienteColumn.setCellValueFactory(new PropertyValueFactory<Clientes, String>("fechaRegistro"));
		this.direccionColumn.setCellValueFactory(new PropertyValueFactory<Clientes, String>("direccion"));
		this.telefonoColumn.setCellValueFactory(new PropertyValueFactory<Clientes, String>("telefono"));
		
		this.subtotalColumn.setCellValueFactory(new PropertyValueFactory<Facturas, Float>("subTotal"));
		this.fechaFacturaColumn.setCellValueFactory(new PropertyValueFactory<Facturas, String>("fecha"));
		this.descuentoColumn.setCellValueFactory(new PropertyValueFactory<Facturas, Float>("descuento"));
		this.totalColumn.setCellValueFactory(new PropertyValueFactory<Facturas, Float>("valorTotal"));
		this.vendedorColumn.setCellValueFactory(new PropertyValueFactory<Facturas, String>("credencialVendedor"));
		this.identificacionColumn.setCellValueFactory(new PropertyValueFactory<Facturas, String>("identificacionCliente"));
		
		this.CantidadColumn.setCellValueFactory(new PropertyValueFactory<Productos, Integer>("cantidad"));
		this.nombreProductoColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("nombre"));
		this.ivaColumn.setCellValueFactory(new PropertyValueFactory<Productos, Float>("iva"));
		this.plataformaColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("plataforma"));
		this.tipoColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("tipoJuego"));
		this.tipoProductoColumn.setCellValueFactory(new PropertyValueFactory<Productos, String>("tipoProducto"));
		this.valorUnitarioColumn.setCellValueFactory(new PropertyValueFactory<Productos, Float>("valorUnitario"));
		this.impuestoColumn.setCellValueFactory(new PropertyValueFactory<Productos, Float>("impuesto"));
		
	}
}
		

