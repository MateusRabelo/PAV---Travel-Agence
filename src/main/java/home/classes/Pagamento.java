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

    public static boolean validarCPF(String cpf) {
        // Remova caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifique se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifique se todos os dígitos são iguais (CPF inválido)
        boolean todosDigitosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais) {
            return false;
        }

        // Verifique o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digitoVerificador1 = (resto == 10 || resto == 11) ? 0 : resto;
        if (digitoVerificador1 != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        // Verifique o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digitoVerificador2 = (resto == 10 || resto == 11) ? 0 : resto;
        if (digitoVerificador2 != Character.getNumericValue(cpf.charAt(10))) {
            return false;
        }

        // CPF válido
        return true;
    }


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
        if(validarCPF(txtCpf.getText()))
        {
            check1 = true;
        }
        else
        {
            check1 = false;
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
