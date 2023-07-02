//- passageiro: String
//- cpfPassageiro: String
//- dataDaReserva: Date
//- informacoesAdicionais: String


//+ getPassageiro() : String
//+ setPassageiro(String Passageiros) : void
//+ getCpfPassageiro() : String
//+ setCpfPassageiro(String cpfPassageiro) : void
//+ getDataDaReserva(): Date
//+ setDataDaReserva(Date dataDaReserva) : void
//+ getInformacoesAdicionais() : String informacoesAdicionais
//+ setInformacoesAdicionais(String informacoes) : void
//+ calcularPreco(): double
//+ reservar(): void
//+ cancelarReserva(): void


package home.classes;
import home.controllers.*;

import java.util.Date;

public class Reserva extends Passagem{
        private String passageiro, cpfPassageiro, informarcoesAdicionais;
        private Date dataDaReserva;

        public Reserva(int id, String horario, int vagas, double preco, String dataIda, String dataRetorno, String destino, int poltrona, String oferta) {
                super(id, horario, vagas, preco, dataIda, dataRetorno, destino, poltrona, oferta);
        }

        public String getPassageiro()
        {
                return passageiro;
        }

        public void setPassageiro(String passageiro)
        {
                this.passageiro = passageiro;
        }

        public String getCpfPassageiro()
        {
                return cpfPassageiro;
        }

        public void setCpfPassageiro(String cpfPassageiro)
        {
                this.cpfPassageiro = cpfPassageiro;
        }

        public String getInformarcoesAdicionais()
        {
                return informarcoesAdicionais;
        }

        public void setInformarcoesAdicionais(String informarcoesAdicionais)
        {
                this.informarcoesAdicionais = informarcoesAdicionais;
        }

        public Date getDataDaReserva()
        {
                return dataDaReserva;
        }

        public void setDataDaReserva(Date dataDaReserva)
        {
                this.dataDaReserva = dataDaReserva;
        }

        public double calcularPreco()
        {
                return 0;
        }

        public void reservar()
        {

        }

        public void cancelarReserva()
        {

        }
}
