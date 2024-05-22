package MostrarVentanas;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**Clase para abrir la ventana que muestra las opciones que tiene la aplicacion
 * 
 * 
 *
 */
public class MostrarVentanaOpciones {
	/**Metodo que abre la ventana
	 * 
	 * @param st
	 */
	public MostrarVentanaOpciones(Stage st) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Presentacion/ventanaOpcionesVendedor.fxml"));
			Scene sc = new Scene(root);
			st.setScene(sc);
			st.setTitle("WowGames: VentanaOpciones");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
