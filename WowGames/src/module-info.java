module WowGames {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens Presentacion to javafx.graphics, javafx.fxml, javafx.base;
	opens Facturas to javafx.graphics, javafx.fxml, javafx.base;
	opens Producto to javafx.graphics, javafx.fxml, javafx.base;
	opens Vendedor to javafx.graphics, javafx.fxml, javafx.base;
}
