package Facturas;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

/**Clase del controlador de la ventana para eliminar factura
 * 
 * 
 *
 */
public class ventanaEliminarFacturaController {
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
	private Button eliminarBtn;
	@FXML
	private TextField idFacturaTxt;
	@FXML
	private Button consultarBtn;

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
	// Event Listener on Button[#eliminarBtn].onMouseClicked
	@FXML
	public void onEliminarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#consultarBtn].onMouseClicked
	@FXML
	public void onConsultarClicked(MouseEvent event) {
		// TODO Autogenerated
	}
}
