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
public class MostrarVentanaOpcionesVendedor {
	/**Metodo que abre la ventana
	 * 
	 * @param st
	 */
	public MostrarVentanaOpcionesVendedor(Stage st) {
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
