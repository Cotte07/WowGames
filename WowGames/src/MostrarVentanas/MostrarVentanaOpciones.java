package MostrarVentanas;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MostrarVentanaOpciones {
	public MostrarVentanaOpciones(Stage st) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Presentacion/ventanaOpciones.fxml"));
			Scene sc = new Scene(root);
			st.setScene(sc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
