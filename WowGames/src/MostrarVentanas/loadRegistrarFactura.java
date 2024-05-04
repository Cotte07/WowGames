package MostrarVentanas;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class loadRegistrarFactura {

	private Stage stage;
	public loadRegistrarFactura(Stage stage) {
		
		if(stage == null) {
			this.stage = new Stage();
		}else {
			this.stage = stage;
		}
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Facturas/VentanaRegistrarFactura.fxml"));
			Scene sc = new Scene(root);
			stage.setScene(sc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
