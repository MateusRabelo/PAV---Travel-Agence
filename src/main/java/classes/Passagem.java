package classes;

public class Passagem {
    private int id;
    private String horario;
    private int vagas;
    private double preco;
    private String destino;
    private String dataIda;
    private String dataRetorno;
    private int poltrona;
    private int oferta;



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



    public Passagem(int id, String horario, int vagas, double preco) {
        this.id = id;
        this.horario = horario;
        this.vagas = vagas;
        this.preco = preco;
    }
}

