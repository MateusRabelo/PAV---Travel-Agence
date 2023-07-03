package home.controllers;

import home.classes.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.time.LocalDate;
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
    private Button btnComprarPassagemPromo;

    @FXML
    private Button btnComprarPassagemHome;

    @FXML
    private ImageView imgQrcode;

    @FXML
    private Label lblPixStatus;

    @FXML
    private Label lblUsuarioStatus;

    @FXML
    private  Label lblNumeroCartao;

    @FXML
    private  Label lblNomeCartao;

    @FXML
    private  Label lblCodigoSeguranca;

    @FXML
    private Label lblCpfPagamentoStatus;

    @FXML
    private Label lblNumeroCartaoStatus;

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
    private TableColumn<Passagem, String> colDestinoHome;

    @FXML
    private TableColumn<Passagem, String> colDataIdaHome;

    @FXML
    private TableColumn<Passagem, String> colDataRetornoHome;

    @FXML
    private TextField txtCidadeDestinoHome;

    @FXML
    private TextField txtCidadeDestinoPromo;

    @FXML
    private TextField txtCidadeOrigemHome;

    @FXML
    private TextField txtCidadeOrigemPromo;

    @FXML
    private TextField txtCpf;

    @FXML
    private DatePicker txtDiaIdaHome;

    @FXML
    private DatePicker txtDiaIdaPromo;

    @FXML
    private DatePicker txtDiaRetornoHome;

    @FXML
    private DatePicker txtDiaRetornoPromo;

    @FXML
    private TextField txtEmail;

    @FXML
    private DatePicker txtNascimento;

    @FXML
    private TextField txtNomeCompleto;

    @FXML
    private TextField txtNumeroCartao;

    @FXML
    private TextField txtNomeCartao;

    @FXML
    private TextField txtCodigoSeguranca;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;

    // auxiliars methods

    private void realizarBuscaHome(String Destino, LocalDate dataIda, LocalDate dataRetorno) {

        // Supondo que você tenha uma lista de todas as passagens disponíveis
        ObservableList<Passagem> todasPassagens = Passagem.gerarPassagensFicticias();

        // Crie uma lista para armazenar as passagens encontradas na busca
        ObservableList<Passagem> passagensEncontradas = FXCollections.observableArrayList();

        // Itere sobre todas as passagens e verifique se os critérios de busca são atendidos
        for (Passagem passagem : todasPassagens) {
            boolean atendeCriterios = true;

            // Verifique o critério do destino
            if (Destino != null && !Destino.isEmpty()) {
                if (!passagem.getDestino().equalsIgnoreCase(Destino)) {
                    atendeCriterios = false;
                }
            }

            // Verifique o critério da data de ida
            if (dataIda != null) {
                if (!passagem.getDataIda().equals(dataIda)) {
                    atendeCriterios = false;
                }
            }

            // Verifique o critério da data de retorno
            if (dataRetorno != null) {
                if (!passagem.getDataRetorno().equals(dataRetorno)) {
                    atendeCriterios = false;
                }
            }

            if (atendeCriterios) {
                passagensEncontradas.add(passagem);
            }
        }

        // Atualize a tabela de exibição com as passagens encontradas
        tbvPassagensHome.setItems(passagensEncontradas);

        // Imprime as informações da passagem no console
        System.out.println("Destino: " + Destino);
        System.out.println("Data de Ida: " + dataIda);
        System.out.println("Data de Retorno: " + dataRetorno);
        System.out.println("----------------------------------");
    }

    private void realizarBuscaPromo(String Destino, LocalDate dataIda, LocalDate dataRetorno) {

        // Supondo que você tenha uma lista de todas as passagens disponíveis
        ObservableList<Passagem> todasPassagens = Passagem.gerarPassagensFicticias();

        // Crie uma lista para armazenar as passagens encontradas na busca
        ObservableList<Passagem> passagensEncontradas = FXCollections.observableArrayList();

        // Itere sobre todas as passagens e verifique se os critérios de busca são atendidos
        for (Passagem passagem : todasPassagens) {
            boolean atendeCriterios = true;

            // Verifique o critério do destino
            if (Destino != null && !Destino.isEmpty()) {
                if (!passagem.getDestino().equalsIgnoreCase(Destino)) {
                    atendeCriterios = false;
                }
            }

            // Verifique o critério da data de ida
            if (dataIda != null) {
                if (!passagem.getDataIda().equals(dataIda)) {
                    atendeCriterios = false;
                }
            }

            // Verifique o critério da data de retorno
            if (dataRetorno != null) {
                if (!passagem.getDataRetorno().equals(dataRetorno)) {
                    atendeCriterios = false;
                }
            }

            if (atendeCriterios) {
                passagensEncontradas.add(passagem);
            }
        }

        // Atualize a tabela de exibição com as passagens encontradas
        tbvPassagensPromo.setItems(passagensEncontradas);


        // Imprime as informações da passagem no console
        System.out.println("Destino: " + Destino);
        System.out.println("Data de Ida: " + dataIda);
        System.out.println("Data de Retorno: " + dataRetorno);
        System.out.println("----------------------------------");
    }

    // method to non-specified action click

    // método para troca de telas no geral
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

    // método para ir para a página de pagamentos após ter selecionado alguma passagem
    @FXML
    private void handlePagamento(ActionEvent event)
    {
        if(tbvPassagensHome.getSelectionModel().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Aviso!");
            alert.setHeaderText(null);
            alert.setContentText("Nenhuma passagem selecionada");
            alert.showAndWait();
        }
        else
        {
            pnPagamento.toFront();

            pnPagamento.setOpacity(1);
            pnUsuario.setOpacity(0);
            pnPromocionais.setOpacity(0);
            pnMinhasPassagens.setOpacity(0);
            pnLogado.setOpacity(0);
            pnSobre.setOpacity(0);
            pnHome.setOpacity(0);
        }
    }

    // region of Pane "Logado"

    // método para verificar as condições de login, e se já está logado no sistema
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

    // método responsável por fazer a busca no grid de passagens da home
    @FXML
    public void handleBuscarHome()
    {
        colIdHome.setCellValueFactory(new PropertyValueFactory<>("id"));
        colDestinoHome.setCellValueFactory(new PropertyValueFactory<>("destino"));
        colHorarioHome.setCellValueFactory(new PropertyValueFactory<>("horario"));
        colVagasHome.setCellValueFactory(new PropertyValueFactory<>("vagas"));
        colPrecoHome.setCellValueFactory(new PropertyValueFactory<>("preco"));
        colDataIdaHome.setCellValueFactory(new PropertyValueFactory<>("dataIda"));
        colDataRetornoHome.setCellValueFactory(new PropertyValueFactory<>("dataRetorno"));

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

        // lambda que permite múltiplas seleções no grid da tableView (caso queira comprar mais de uma passagem)
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

        // definindo atributos para fazer a busca

        String cidadeDestino = txtCidadeDestinoHome.getText();
        LocalDate dataIda = txtDiaIdaHome.getValue();
        LocalDate dataRetorno = txtDiaRetornoHome.getValue();

        // lógica de busca (home)
        realizarBuscaHome(cidadeDestino, dataIda, dataRetorno);


    }



    // region of Pane "Promocionais"

    // método responsável por fazer a busca no grid de passagens da promo
    @FXML
    public void handleBuscarPromo()
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


        tbvPassagensPromo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tbvPassagensPromo.setOnMouseClicked(event -> {
            ObservableList<Passagem> passagensSelecionadas = tbvPassagensPromo.getSelectionModel().getSelectedItems();
            if (!passagensSelecionadas.isEmpty()) {
                // Faça algo com as passagens selecionadas
                for (Passagem passagem : passagensSelecionadas) {
                    System.out.println("Passagem selecionada: " + passagem.getId());
                }
            }
        });

        String cidadeDestino = txtCidadeDestinoPromo.getText();
        LocalDate dataIda = txtDiaIdaPromo.getValue();
        LocalDate dataRetorno = txtDiaRetornoPromo.getValue();

        realizarBuscaPromo(cidadeDestino, dataIda, dataRetorno);
    }

    // region of Pane "Minhas Passagens"

    // region of Pane "Sobre"

    // region of Pane "Pagamento"

    // método para confirmar o pagamento
    @FXML
    private void handleConfirmarClick(ActionEvent event)
    {
        if(Pagamento.verificarPagamento(txtNumeroCartao, txtCpf))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Pagamento Realizado");
            alert.setHeaderText(null);
            alert.setContentText("O pagamento foi realizado com sucesso!");

            alert.showAndWait();

            // acrescentar lógica para if verificarPagammento is true, então adicionar na seção de Minhas passagens
        }
        else
        {
            lblCpfPagamentoStatus.setText("Cpf inválido!");
            lblNumeroCartaoStatus.setText("Numero do cartão inválido!");

        }
    }

    // método para a opção de pagamento via pix
    @FXML
    public void handlePixClick(ActionEvent event)
    {
        lblPixStatus.setDisable(false);
        lblPixStatus.setOpacity(1);

        imgQrcode.setDisable(false);
        imgQrcode.setOpacity(1);

        lblCodigoSeguranca.setDisable(true);
        lblNomeCartao.setDisable(true);
        lblNumeroCartao.setDisable(true);
        lblCodigoSeguranca.setOpacity(0);
        lblNomeCartao.setOpacity(0);
        lblNumeroCartao.setOpacity(0);

        txtNumeroCartao.setDisable(true);
        txtNomeCartao.setDisable(true);
        txtCodigoSeguranca.setDisable(true);
        txtNumeroCartao.setOpacity(0);
        txtNomeCartao.setOpacity(0);
        txtCodigoSeguranca.setOpacity(0);
    }

    // método para a opção de pagamento via cartão
    @FXML
    public void handleCartaoClick(ActionEvent event)
    {
        lblPixStatus.setDisable(true);
        lblPixStatus.setOpacity(0);

        imgQrcode.setDisable(true);
        imgQrcode.setOpacity(0);

        lblCodigoSeguranca.setDisable(false);
        lblNomeCartao.setDisable(false);
        lblNumeroCartao.setDisable(false);
        lblCodigoSeguranca.setOpacity(1);
        lblNomeCartao.setOpacity(1);
        lblNumeroCartao.setOpacity(1);

        txtNumeroCartao.setDisable(false);
        txtNomeCartao.setDisable(false);
        txtCodigoSeguranca.setDisable(false);
        txtNumeroCartao.setOpacity(1);
        txtNomeCartao.setOpacity(1);
        txtCodigoSeguranca.setOpacity(1);
    }

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
