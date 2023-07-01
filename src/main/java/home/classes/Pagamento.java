//- valor: double
//- metodoPagamento: String"
//- pagador: Usuario


//+ verificarPagamento(): boolean
//+ getValor(): double
//+ setValor(double Valor) : void
//+ getMetodoPagamento(): String
//+ setMetodoPagamento(String metodoPagamento) : void
//+ getPagador(): Usuario
//+ setPagador(Usuario pagador) : void"

package home.classes;
import home.controllers.*;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Pagamento {
    private double valor;
    private String metodoPagamento;
    private Usuario pagador;

    public static boolean verificarPagamento(TextField txtNumeroCartao, TextField txtCpf)
    {
        //CHECADORES DE VERDADEIRO OU FALSO
        Boolean check = false;
        Boolean check1 = false;

        //CHECAGEM CARTAO
        //CASO O CPF SEJA MENOR OU MAIOR QUE 8
      if(txtNumeroCartao.getText().length() == 8)
      {
          check = true;
      }


      //CHECAGEM DE CPF
      if (txtCpf.getText().length() == 11) {
            int soma1 = 0;
            int soma2 = 0;

            for (int i = 0; i < 9; i++) {
                int algarismo = Character.getNumericValue(txtCpf.getText().charAt(i));
                soma1 += algarismo * (10 - i);
                soma2 += algarismo * (11 - i);
            }

            int resto1 = soma1 % 11;
            int j = (resto1 < 2) ? 0 : (11 - resto1);

            soma2 += j * 2;
            int resto2 = soma2 % 11;
            int k = (resto2 < 2) ? 0 : (11 - resto2);

            int penultimoDigito = Character.getNumericValue(txtCpf.getText().charAt(9));
            int ultimoDigito = Character.getNumericValue(txtCpf.getText().charAt(10));

            check1 = (j == penultimoDigito && k == ultimoDigito);
        }

          if(!check && check1)
          {
//              Alert alert = new Alert(Alert.AlertType.INFORMATION);
//              alert.setTitle("ERRO!");
//              alert.setHeaderText(null);
//              alert.setContentText("Número do cartão inválido");
//              alert.showAndWait();
              return !check;
          }
          if (check && !check1)
          {
//              Alert alert = new Alert(Alert.AlertType.INFORMATION);
//              alert.setTitle("ERRO!");
//              alert.setHeaderText(null);
//              alert.setContentText("Número do cartão inválido");
//              alert.showAndWait();
              return !check1;
          }

        return false;
    }

    public String getMetodoPagamento()
    {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento)
    {
        this.metodoPagamento = metodoPagamento;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public Usuario getPagador()
    {
        return pagador;
    }

    public void setPagador(Usuario pagador)
    {
        this.pagador = pagador;
    }
}
