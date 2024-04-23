module WowGames {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens Presentacion to javafx.graphics, javafx.fxml, javafx.base;
}
