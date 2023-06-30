package home.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnBuscar1;

    @FXML
    private Button btnBuscarPromo;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnMinhasPassagens;

    @FXML
    private Button btnPromocoes;

    @FXML
    private Button btnSobre;

    @FXML
    private Button btnUsuario;

    @FXML
    private Pane pnHome;

    @FXML
    private Pane pnLogado;

    @FXML
    private Pane pnMinhasPassagens;

    @FXML
    private Pane pnPagamento;

    @FXML
    private Pane pnPromocionais;

    @FXML
    private Pane pnSobre;

    @FXML
    private Pane pnUsuario;

    @FXML
    private Pane pnWelcome;

    @FXML
    private TextField txtCidadeDestino1;

    @FXML
    private TextField txtCidadeDestinoPromo;

    @FXML
    private TextField txtCidadeOrigem1;

    @FXML
    private TextField txtCidadeOrigemPromo;

    @FXML
    private DatePicker txtDiaIda1;

    @FXML
    private DatePicker txtDiaIdaPromo;

    @FXML
    private DatePicker txtDiaRetorno1;

    @FXML
    private DatePicker txtDiaRetornoPromo;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;



    @FXML
    private void handleClicks(ActionEvent event)
    {
        pnWelcome .setOpacity(0);

        if (event.getSource() == btnUsuario)
        {
            pnUsuario.toFront();

            pnUsuario.setOpacity(1);
            pnHome.setOpacity(0);
            pnSobre.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
        }
        else if (event.getSource() == btnInicio)
        {
            pnHome.toFront();

            pnHome.setOpacity(1);
            pnSobre.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnUsuario.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
        }
        else if (event.getSource() == btnSobre)
        {
            pnSobre.toFront();

            pnSobre.setOpacity(1);
            pnHome.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnUsuario.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
        }
        else if (event.getSource() == btnPromocoes)
        {
            pnPromocionais.toFront();

            pnPromocionais.setOpacity(1);
            pnSobre.setOpacity(0);
            pnHome.setOpacity(0);
            pnUsuario.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
        }
        else if (event.getSource() == btnMinhasPassagens) {
            pnMinhasPassagens.toFront();

            pnMinhasPassagens.setOpacity(1);
            pnSobre.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnHome.setOpacity(0);
            pnUsuario.setOpacity(0);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        pnWelcome.toFront();

        pnUsuario.setOpacity(0);
        pnPromocionais.setOpacity(0);
        pnSobre.setOpacity(0);
        pnHome.setOpacity(0);
    }


}
