module com.example.gui4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.gui4 to javafx.fxml;
    exports com.example.gui4;
}