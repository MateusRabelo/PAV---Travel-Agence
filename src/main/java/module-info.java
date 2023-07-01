module com.example.gui4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens home to javafx.fxml;
    exports home;
    exports home.controllers;
    opens home.controllers to javafx.fxml;
    opens home.classes to javafx.base;

}