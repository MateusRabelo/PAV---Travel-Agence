package home.controllers;

import home.classes.*;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnBuscarHome;

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
    private TableView<Passagem> tbvPassagensHome;

    @FXML
    private TableView<Passagem> tbvPassagensPromo;

    @FXML
    private TableColumn<Passagem, Integer> colIdHome;

    @FXML
    private TableColumn<Passagem, String> colHorarioHome;

    @FXML
    private TableColumn<Passagem, Integer> colVagasHome;

    @FXML
    private TableColumn<Passagem, Double> colPrecoHome;

    @FXML
    private TableColumn<Passagem, String> colDataIdaMeu;

    @FXML
    private TableColumn<Passagem, String> colDataIdaPromo;

    @FXML
    private TableColumn<Passagem, String> colDataRetornoMeu;

    @FXML
    private TableColumn<Passagem, String> colDataRetornoPromo;

    @FXML
    private TableColumn<Passagem, String> colDestinoMeu;

    @FXML
    private TableColumn<Passagem, String> colDestinoPromo;

    @FXML
    private TableColumn<Passagem, String> colHorarioMeu;

    @FXML
    private TableColumn<Passagem, String> colHorarioPromo;

    @FXML
    private TableColumn<Passagem, Integer> colIdMeu;

    @FXML
    private TableColumn<Passagem, Integer> colIdPromo;

    @FXML
    private TableColumn<Passagem, Integer> colOfertaPromo;

    @FXML
    private TableColumn<Passagem, Integer> colPoltronaMeu;

    @FXML
    private TableColumn<Passagem, Integer> colVagasPromo;

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

    @FXML
    public void handleGerarPassagensHome()
    {
            colIdHome.setCellValueFactory(new PropertyValueFactory<>("id"));
            colHorarioHome.setCellValueFactory(new PropertyValueFactory<>("horario"));
            colVagasHome.setCellValueFactory(new PropertyValueFactory<>("vagas"));
            colPrecoHome.setCellValueFactory(new PropertyValueFactory<>("preco"));

        ObservableList<Passagem> passagens = Passagem.gerarPassagensFicticias();

        tbvPassagensHome.setItems(passagens);


        // permite selecionar na lista
//        tbvPassagensHome.setOnMouseClicked(event -> {
//            Passagem passagemSelecionada = tbvPassagensHome.getSelectionModel().getSelectedItem();
//            if (passagemSelecionada != null) {
//                // Faça algo com a passagem selecionada
//                System.out.println("Passagem selecionada: " + passagemSelecionada.getId());
//            }
//        });

        tbvPassagensHome.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tbvPassagensHome.setOnMouseClicked(event -> {
            ObservableList<Passagem> passagensSelecionadas = tbvPassagensHome.getSelectionModel().getSelectedItems();
            if (!passagensSelecionadas.isEmpty()) {
                // Faça algo com as passagens selecionadas
                for (Passagem passagem : passagensSelecionadas) {
                    System.out.println("Passagem selecionada: " + passagem.getId());
                }
            }
        });
    }

    public void handleGerarPassagensPromo()
    {
        colIdPromo.setCellValueFactory(new PropertyValueFactory<>("id"));
        colDestinoPromo.setCellValueFactory(new PropertyValueFactory<>("destino"));
        colHorarioPromo.setCellValueFactory(new PropertyValueFactory<>("horario"));
        colVagasPromo.setCellValueFactory(new PropertyValueFactory<>("vagas"));
        colOfertaPromo.setCellValueFactory(new PropertyValueFactory<>("oferta"));
        colDataIdaPromo.setCellValueFactory(new PropertyValueFactory<>("dataIda"));
        colDataRetornoPromo.setCellValueFactory(new PropertyValueFactory<>("dataRetorno"));

        ObservableList<Passagem> passagens = Passagem.gerarPassagensFicticias();

        tbvPassagensPromo.setItems(passagens);
    }

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
