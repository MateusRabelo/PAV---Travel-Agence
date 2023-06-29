package home.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnSobre;

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
    private Pane pnMain;

    @FXML
    private Pane pnHome;

    @FXML
    private Pane pnPromocoes;

    @FXML
    private Pane pnSobre;

    @FXML
    private TextField txtCidadeDestino;

    @FXML
    private TextField txtCidadeOrigem;

    @FXML
    private DatePicker txtDiaIda;

    @FXML
    private DatePicker txtDiaRetorno;

    @FXML
    private void handleClicks(ActionEvent event)
    {
        pnMain.setOpacity(0);
        if (event.getSource() == btnSobre)
        {
            pnSobre.toFront();

            pnSobre.setOpacity(1);
            pnHome.setOpacity(0);
            pnPromocoes.setOpacity(0);
        }
        else if (event.getSource() == btnBuscar)
        {

        }
        else if (event.getSource() == btnInicio)
        {
            pnHome.toFront();

            pnHome.setOpacity(1);
            pnSobre.setOpacity(0);
            pnPromocoes.setOpacity(0);
        }
        else if (event.getSource() == btnUsuario)
        {

        }
        else if (event.getSource() == btnPromocoes)
        {
            pnPromocoes.toFront();

            pnPromocoes.setOpacity(1);
            pnSobre.setOpacity(0);
            pnHome.setOpacity(0);
        }
        else if (event.getSource() == btnMinhasPassagens)
        {

        }
    }
















    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        pnMain.toFront();

        pnPromocoes.setOpacity(0);
        pnSobre.setOpacity(0);
        pnHome.setOpacity(0);
    }
}
