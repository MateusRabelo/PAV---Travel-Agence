//- nome: String
//- idade: int
//- cpf: String
//- endereco: String
//- email: String
//- reservas[]: Reserva

//+ getNome(): String
//+ setNome(String nome): void
//+ getIdade(): int
//+ setIdade(int idade): void
//+ getCpf(): String
//+ setCpf(String cpf): void
//+ getEndereço(): String
//+ setEndereço(String endereco): void
//+ getEmail(): String
//+ setEmail(String email): void
//+ getReservas(): String[] reservas
//+ setReservas(reservas: String[]): void

package home.classes;
import home.controllers.*;
import javafx.scene.control.TextField;

public class Usuario {
    private String nome, cpf, endereco, email;
    private int idade;
    Reserva reservas[];

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int idade()
    {
        return idade;
    }

    public void idade (int idade)
    {
        this.idade = idade;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public static boolean isLogado(TextField txtUsuario, TextField txtSenha)
    {
        if(txtUsuario.getText().equals("admin") && txtSenha.getText().equals("admin"))
        {
            return true;
        }
        return false;
    }
}
