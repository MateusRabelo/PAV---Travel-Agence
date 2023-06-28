package home.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btnAjuda;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnMinhasPassagens;

    @FXML
    private Button btnPromocoes;

    @FXML
    private Button btnUsuario;

    @FXML
    private TextField txtCidadeDestino;

    @FXML
    private TextField txtCidadeOrigem;

    @FXML
    private DatePicker txtDiaIda;

    @FXML
    private DatePicker txtDiaRetorno;

    @FXML
    void fazerBusca(ActionEvent event) {

    }

}
