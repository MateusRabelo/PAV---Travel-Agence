package home.classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Passagem {
    private int id; //
    private String horario; //
    private int vagas; //
    private double preco; //
    private String destino; //
    private String dataIda; //
    private String dataRetorno; //
    private int poltrona; //
    private String oferta; //




    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getHorario()
    {
        return horario;
    }

    public void setHorario(String horario)
    {
        this.horario = horario;
    }

    public int getVagas()
    {
        return vagas;
    }

    public void setVagas(int vagas)
    {
        this.vagas = vagas;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public String getDestino()
    {
        return destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public String getDataIda()
    {
        return dataIda;
    }

    public void setDataIda(String dataIda)
    {
        this.dataIda = dataIda;
    }

    public String getDataRetorno()
    {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno)
    {
        this.dataRetorno = dataRetorno;
    }

    public int getPoltrona()
    {
        return poltrona;
    }

    public void setPoltrona(int poltrona)
    {
        this.poltrona = poltrona;
    }

    public String getOferta()
    {
        return oferta;
    }

    public void setOferta(String oferta)
    {
        this.oferta = oferta;
    }


    // construtor para a criação da ObservableList na captura de informações
    String[] cidades = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
    public Passagem(int id, String horario, int vagas, double preco, String dataIda, String dataRetorno, String destino, int poltrona, String oferta) {
        this.id = id;
        this.horario = horario;
        this.vagas = vagas;
        this.preco = preco;
        this.dataIda = dataIda;
        this.dataRetorno = dataRetorno;
        this.destino = destino;
        this.poltrona = poltrona;
        this.oferta = oferta;
    }

        // lista criada para gerar passagens previamente prontas;
        public static ObservableList<Passagem> gerarPassagensFicticias()
    {
        ObservableList<Passagem> passagens = FXCollections.observableArrayList();

        // Gerar passagens fictícias
        passagens.add(new Passagem(1235, "09:00", 5, 494.95, "01/07/2023", "02/07/2023", "São Paulo", 1, "30% OFF"));
        passagens.add(new Passagem(2845, "11:30", 8, 798.99, "03/07/2023", "04/07/2023", "Rio de Janeiro", 2, "40% OFF"));
        passagens.add(new Passagem(8365, "14:15", 3, 1569.99, "05/07/2023", "06/07/2023", "Belo Horizonte", 3, "20% OFF"));
        passagens.add(new Passagem(2765, "16:45", 10, 1714.99, "07/07/2023", "08/07/2023", "Salvador", 4, "25% OFF"));
        passagens.add(new Passagem(6087, "19:30", 2, 1455.99, "09/07/2023", "10/07/2023", "Fortaleza", 5, "15% OFF"));
        passagens.add(new Passagem(1325, "09:00", 5, 1480.24, "11/07/2023", "12/07/2023", "Recife", 6, "35% OFF"));
        passagens.add(new Passagem(265, "11:30", 8, 768.24, "13/07/2023", "14/07/2023", "Manaus", 7, "10% OFF"));
        passagens.add(new Passagem(76, "14:15", 3, 1987.74, "15/07/2023", "16/07/2023", "Curitiba", 8, "30% OFF"));
        passagens.add(new Passagem(2436, "16:45", 10, 1999.99, "17/07/2023", "18/07/2023", "Porto Alegre", 9, "50% OFF"));
        passagens.add(new Passagem(175, "19:30", 2, 4156.69, "19/07/2023", "20/07/2023", "Brasília", 10, "25% OFF"));
        passagens.add(new Passagem(198, "09:00", 5, 1627.29, "21/07/2023", "22/07/2023", "Vitória", 11, "15% OFF"));
        passagens.add(new Passagem(1780, "11:30", 8, 1873.19, "23/07/2023", "24/07/2023", "Florianópolis", 12, "10% OFF"));
        passagens.add(new Passagem(186, "14:15", 3, 1927.59, "25/07/2023", "26/07/2023", "Porto Seguro", 13, "30% OFF"));
        passagens.add(new Passagem(1543, "16:45", 10, 1836.99, "27/07/2023", "28/07/2023", "Natal", 14, "20% OFF"));
        passagens.add(new Passagem(1765, "19:30", 2, 1623.99, "29/07/2023", "30/07/2023", "Gramado", 15, "15% OFF"));
        passagens.add(new Passagem(123, "09:00", 5, 1627.89, "31/07/2023", "01/08/2023", "Foz do Iguaçu", 16, "35% OFF"));
        passagens.add(new Passagem(1524, "11:30", 8, 1636.99, "02/08/2023", "03/08/2023", "Porto Velho", 17, "10% OFF"));
        passagens.add(new Passagem(1898, "14:15", 3, 1237.79, "04/08/2023", "05/08/2023", "Goiânia", 18, "30% OFF"));
        passagens.add(new Passagem(167, "16:45", 10, 1723.99, "06/08/2023", "07/08/2023", "Belém", 19, "25% OFF"));
        passagens.add(new Passagem(2523, "19:30", 2, 1090.89, "08/08/2023", "09/08/2023", "João Pessoa", 20, "15% OFF"));
        passagens.add(new Passagem(2796, "09:00", 5, 3627.14, "10/08/2023", "11/08/2023", "Teresina", 21, "35% OFF"));
        passagens.add(new Passagem(2253, "11:30", 8, 1738.89, "12/08/2023", "13/08/2023", "Campo Grande", 22, "10% OFF"));
        passagens.add(new Passagem(2386, "14:15", 3, 1237.79, "14/08/2023", "15/08/2023", "Aracaju", 23, "30% OFF"));
        passagens.add(new Passagem(2412, "16:45", 10, 1566.69, "16/08/2023", "17/08/2023", "Cuiabá", 24, "25% OFF"));
        passagens.add(new Passagem(2587, "19:30", 2, 1727.69, "18/08/2023", "19/08/2023", "São Luís", 25, "15% OFF"));
        passagens.add(new Passagem(2666, "09:00", 5, 1989.99, "20/08/2023", "21/08/2023", "Macapá", 26, "30% OFF"));
        passagens.add(new Passagem(2723, "11:30", 8, 2839.39, "22/08/2023", "23/08/2023", "Palmas", 27, "20% OFF"));
        passagens.add(new Passagem(2823, "14:15", 3, 1723.99, "24/08/2023", "25/08/2023", "Boa Vista", 28, "10% OFF"));
        passagens.add(new Passagem(2965, "16:45", 10, 1237.84, "26/08/2023", "27/08/2023", "Maceió", 29, "25% OFF"));
        passagens.add(new Passagem(3075, "19:30", 2, 1623.99, "28/08/2023", "29/08/2023", "Natal", 30, "15% OFF"));

        return passagens;
    }
}

