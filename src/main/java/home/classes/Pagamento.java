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

public class Pagamento {
    private double valor;
    private String metodoPagamento;
    private Usuario pagador;

    public boolean verificarPagamento()
    {
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
