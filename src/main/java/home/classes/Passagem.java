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
    private int oferta; //



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

    public int getOferta()
    {
        return oferta;
    }

    public void setOferta(int oferta)
    {
        this.oferta = oferta;
    }



    public Passagem(int id, String horario, int vagas, double preco, String dataIda, String dataRetorno, String destino, int poltrona, int oferta) {
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

        public static ObservableList<Passagem> gerarPassagensFicticias()
    {
        ObservableList<Passagem> passagens = FXCollections.observableArrayList();

        // Gerar passagens fictícias
        passagens.add(new Passagem(1, "09:00", 5, 100.00, "01/07/2023", "02/07/2023", "Destino A", 1, 0));
        passagens.add(new Passagem(2, "11:30", 8, 120.50, "03/07/2023", "04/07/2023", "Destino B", 2, 1));
        passagens.add(new Passagem(3, "14:15", 3, 95.75, "05/07/2023", "06/07/2023", "Destino C", 3, 0));
        passagens.add(new Passagem(4, "16:45", 10, 110.00, "07/07/2023", "08/07/2023", "Destino D", 4, 1));
        passagens.add(new Passagem(5, "19:30", 2, 150.25, "09/07/2023", "10/07/2023", "Destino E", 5, 0));
        passagens.add(new Passagem(6, "09:00", 5, 100.00, "11/07/2023", "12/07/2023", "Destino F", 6, 1));
        passagens.add(new Passagem(7, "11:30", 8, 120.50, "13/07/2023", "14/07/2023", "Destino G", 7, 0));
        passagens.add(new Passagem(8, "14:15", 3, 95.75, "15/07/2023", "16/07/2023", "Destino H", 8, 1));
        passagens.add(new Passagem(9, "16:45", 10, 110.00, "17/07/2023", "18/07/2023", "Destino I", 9, 0));
        passagens.add(new Passagem(10, "19:30", 2, 150.25, "19/07/2023", "20/07/2023", "Destino J", 10, 1));
        passagens.add(new Passagem(11, "09:00", 5, 100.00, "21/07/2023", "22/07/2023", "Destino K", 11, 0));
        passagens.add(new Passagem(12, "11:30", 8, 120.50, "23/07/2023", "24/07/2023", "Destino L", 12, 1));
        passagens.add(new Passagem(13, "14:15", 3, 95.75, "25/07/2023", "26/07/2023", "Destino M", 13, 0));
        passagens.add(new Passagem(14, "16:45", 10, 110.00, "27/07/2023", "28/07/2023", "Destino N", 14, 1));
        passagens.add(new Passagem(15, "19:30", 2, 150.25, "29/07/2023", "30/07/2023", "Destino O", 15, 0));
        passagens.add(new Passagem(16, "09:00", 5, 100.00, "31/07/2023", "01/08/2023", "Destino P", 16, 0));
        passagens.add(new Passagem(17, "11:30", 8, 120.50, "02/08/2023", "03/08/2023", "Destino Q", 17, 1));
        passagens.add(new Passagem(18, "14:15", 3, 95.75, "04/08/2023", "05/08/2023", "Destino R", 18, 0));
        passagens.add(new Passagem(19, "16:45", 10, 110.00, "06/08/2023", "07/08/2023", "Destino S", 19, 1));
        passagens.add(new Passagem(20, "19:30", 2, 150.25, "08/08/2023", "09/08/2023", "Destino T", 20, 0));
        passagens.add(new Passagem(21, "09:00", 5, 100.00, "10/08/2023", "11/08/2023", "Destino U", 21, 1));
        passagens.add(new Passagem(22, "11:30", 8, 120.50, "12/08/2023", "13/08/2023", "Destino V", 22, 0));
        passagens.add(new Passagem(23, "14:15", 3, 95.75, "14/08/2023", "15/08/2023", "Destino W", 23, 1));
        passagens.add(new Passagem(24, "16:45", 10, 110.00, "16/08/2023", "17/08/2023", "Destino X", 24, 0));
        passagens.add(new Passagem(25, "19:30", 2, 150.25, "18/08/2023", "19/08/2023", "Destino Y", 25, 1));
        passagens.add(new Passagem(26, "09:00", 5, 100.00, "20/08/2023", "21/08/2023", "Destino Z", 26, 0));
        passagens.add(new Passagem(27, "11:30", 8, 120.50, "22/08/2023", "23/08/2023", "Destino AA", 27, 1));
        passagens.add(new Passagem(28, "14:15", 3, 95.75, "24/08/2023", "25/08/2023", "Destino BB", 28, 0));
        passagens.add(new Passagem(29, "16:45", 10, 110.00, "26/08/2023", "27/08/2023", "Destino CC", 29, 1));
        passagens.add(new Passagem(30, "19:30", 2, 150.25, "28/08/2023", "29/08/2023", "Destino DD", 30, 0));

        return passagens;
    }
}

