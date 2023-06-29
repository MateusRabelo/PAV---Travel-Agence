package classes;

public class Passagem {
    private int id;
    private String horario;
    private int vagas;
    private double preco;

    public Passagem(int id, String horario, int vagas, double preco) {
        this.id = id;
        this.horario = horario;
        this.vagas = vagas;
        this.preco = preco;
    }

    // Getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}