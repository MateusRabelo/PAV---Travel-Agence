//- destino: Destino
//- dataDePartida: Date
//- dataRetorno: Date
//- acomodacao: boolean
//- reservas[]: Reserva
//- destinos[]: Destino


//+ getDestino(): Destino
//+ setDestino(Destino destino) : void
//+ getDataDePartida() : Date
//+ setDataDePartida(Date dataDePartida) : void
//+ getDataRetorno() : Date
//+ setDataRetorno(Date dataDeRetorno) : void
//+ getAcomodacao() : boolean
//+ setAcomodacao(Boolean acomodacao) : void
//+ getReservas(): Reserva[]
//+ setReservas(reservas: Reserva[]) : void
//+ getDestinos() : Destino[]
//+ setDestinos(destinos: Destino[]) : void


package classes;

import java.util.Date;

public class Viagem {
        private Destino[] destinos;
        private Reserva[] reservas;
        private Date dataDePartida, dataDeRetorno;
        private Destino destino;
        private boolean acomodacao;

        public Destino[] getDestinos()
        {
                return destinos;
        }

        public void setDestinos(Destino[] destinos)
        {
                this.destinos = destinos;
        }

        public Reserva[] getReservas()
        {
                return reservas;
        }

        public void setReservas(Reserva[] reservas)
        {
                this.reservas = reservas;
        }

        public Date getDataDePartida()
        {
                return dataDePartida;
        }

        public void setDataDePartida(Date dataDePartida)
        {
                this.dataDePartida = dataDePartida;
        }

        public Date getDataDeRetorno()
        {
                return dataDeRetorno;
        }

        public void setDataDeRetorno(Date dataDeRetorno)
        {
                this.dataDeRetorno = dataDeRetorno;
        }

        public Destino getDestino()
        {
                return destino;
        }

        public void setDestino(Destino destino)
        {
                this.destino = destino;
        }

        public boolean getAcomodacao()
        {
                return acomodacao;
        }

        public void setAcomodacao(boolean acomodacao)
        {
                this.acomodacao = acomodacao;
        }
}
