package Producto;

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

/**Clase del controlador de la ventana ventas por producto
 * 
 * 
 *
 */
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
		Parent root = null;
	    try {
	        root = FXMLLoader.load(getClass().getResource("/Presentacion/ventanaOpciones.fxml"));
	        Scene scene = new Scene(root);
	        
	        // Obtén el escenario actual usando el evento
	        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        
	        // Configura el nuevo escenario
	        Stage newStage = new Stage();
	        newStage.setScene(scene);
	        // Titulo de la ventana
	        newStage.setTitle("WowGames: VentanaOpciones");

	        
	        // Muestra el nuevo escenario
	        newStage.show();
	        
	        // Cierra el escenario actual
	        currentStage.close();
	        
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
}
