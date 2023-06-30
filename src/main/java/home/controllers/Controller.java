package home.controllers;
import home.classes.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnBuscar1;

    @FXML
    private Button btnBuscarPromo;

    @FXML
    private Button btnCartao;

    @FXML
    private Button btnConfirmar;

    @FXML
    private ImageView btnImageCartao;

    @FXML
    private ImageView btnImagePix;

    @FXML
    private ImageView btnImageTransferencia;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnMinhasPassagens;

    @FXML
    private Button btnPix;

    @FXML
    private Button btnPromocoes;

    @FXML
    private Button btnSobre;

    @FXML
    private Button btnTransferencia;

    @FXML
    private Button btnUsuario;

    @FXML
    private ImageView imgQrcode;

    @FXML
    private Label lblPixStatus;

    @FXML
    private Label lblUsuarioStatus;

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
    private TextField txtCpf;

    @FXML
    private DatePicker txtDiaIda1;

    @FXML
    private DatePicker txtDiaIdaPromo;

    @FXML
    private DatePicker txtDiaRetorno1;

    @FXML
    private DatePicker txtDiaRetornoPromo;

    @FXML
    private TextField txtEmail;

    @FXML
    private DatePicker txtNascimento;

    @FXML
    private TextField txtNomeCompleto;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;




    // method to non-specified action click

    @FXML
    private void handleClicks(ActionEvent event)
    {
        pnWelcome .setOpacity(0);

        if (event.getSource() == btnInicio)
        {
            pnHome.toFront();

            pnHome.setOpacity(1);
            pnSobre.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnUsuario.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
            pnLogado.setOpacity(0);
        }
        else if (event.getSource() == btnSobre)
        {
            pnSobre.toFront();

            pnSobre.setOpacity(1);
            pnHome.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnUsuario.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
            pnLogado.setOpacity(0);
        }
        else if (event.getSource() == btnPromocoes)
        {
            pnPromocionais.toFront();

            pnPromocionais.setOpacity(1);
            pnSobre.setOpacity(0);
            pnHome.setOpacity(0);
            pnUsuario.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
            pnLogado.setOpacity(0);
        }

    }



    // region of Pane "Logado"

    @FXML
    public void handleLogin(ActionEvent event)
    {
        pnWelcome.setOpacity(0);
        pnHome.setOpacity(0);
        pnPromocionais.setOpacity(0);
        pnSobre.setOpacity(0);
        pnPagamento.setOpacity(0);

        if(Usuario.isLogado(txtUsuario, txtSenha))
        {
            pnLogado.toFront();
            pnLogado.setOpacity(1);

            pnUsuario.setOpacity(0);

            if(event.getSource() == btnMinhasPassagens)
            {
                pnMinhasPassagens.toFront();
                pnMinhasPassagens.setOpacity(1);
                pnPromocionais.setOpacity(0);
                pnSobre.setOpacity(0);
                pnHome.setOpacity(0);
                pnUsuario.setOpacity(0);
                pnLogado.setOpacity(0);
            }
        }
        else
        {
            pnUsuario.toFront();
            pnUsuario.setOpacity(1);

            if(!txtUsuario.getText().isEmpty())
            {
                lblUsuarioStatus.setText("Usuário ou senha incorreto");
            }
        }
    }

    // region of Pane "Usuario"

    // region of Pane "Inicio"

    // region of Pane "Promocionais"

    // region of Pane "Minhas Passagens"

    // region of Pane "Sobre"






    // to certificate than all initializing correctly
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        pnWelcome.toFront();

        pnWelcome.setOpacity(1);
        pnUsuario.setOpacity(0);
        pnPromocionais.setOpacity(0);
        pnSobre.setOpacity(0);
        pnHome.setOpacity(0);
    }
}
