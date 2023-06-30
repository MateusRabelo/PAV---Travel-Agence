//- nomeDestino: String
//- localizacao: String
//- descricao: String


//+ getNomeDestino(): String
//+ setNomeDestino(String nomeDestino): void
//+ getLocalização(): String
//+ setLocalização(String localizacao): void
//+ getDescrição(): String
//+ setDescrição(String descricao): void


package home.classes;
import home.controllers.*;

public class Destino {
        private String nomeDestino, localizacao, descricao;

        public String getNomeDestino()
        {
                return nomeDestino;
        }

        public void setNomeDestino(String nomeDestino)
        {
                this.nomeDestino = nomeDestino;
        }

        public String getLocalizacao()
        {
                return localizacao;
        }

        public void serLocalizacao(String localizacao)
        {
                this.localizacao = localizacao;
        }

        public String getDescricao()
        {
                return descricao;
        }

        public void setDescricao(String descricao)
        {
                this.descricao = descricao;
        }
}
