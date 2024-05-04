module WowGames {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens Presentacion to javafx.graphics, javafx.fxml, javafx.base;
	opens Facturas to javafx.graphics, javafx.fxml, javafx.base;
	opens Producto to javafx.graphics, javafx.fxml, javafx.base;
	opens Vendedor to javafx.graphics, javafx.fxml, javafx.base;
	opens MostrarVentanas to javafx.graphics, javafx.fxml, javafx.base;
}
