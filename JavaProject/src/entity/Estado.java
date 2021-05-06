package entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Estado {

    Tabuleiro3_3 Tabuleiro3_3;
    List<Acao> acoes;

    public Estado(Tabuleiro3_3 aTabuleiro3_3) {
        this.Tabuleiro3_3 = aTabuleiro3_3;
        this.acoes = new LinkedList<>();
    }

    public Estado(Tabuleiro3_3 aTabuleiro3_3, List<Acao> aAcoes) {
        this(aTabuleiro3_3);
        this.acoes = aAcoes;

    }

    public boolean isObjetivo() {

        if (this.equals(EspacoDeEstados.OBJETIVO))
            return true;
        return false;

    }

   public void fazerAcao(Acao acao) {
        this.acoes.add(acao);
        this.Tabuleiro3_3.fazerAcao(acao);
    }

    public Collection<Estado> geraFilhos(){

        Collection<Estado> filhos = new ArrayList<>();
        for(Acao acao: Acao.values()) {
			System.out.println("testado a acao " + acao);
			System.out.println("resultando em " + this.Tabuleiro3_3.isAcaoValida(acao));
            if(this.Tabuleiro3_3.isAcaoValida(acao)) {
                Estado filho = this.deepCopy();
                filho.fazerAcao(acao);
                filhos.add(filho);
            }
        }


        return filhos;
    }

    public Estado deepCopy() {
        List<Acao> novasAcoes = new LinkedList<>(this.acoes);
        return new Estado(this.Tabuleiro3_3.deepCopy(), novasAcoes);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Tabuleiro3_3 == null) ? 0 : Tabuleiro3_3.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estado other = (Estado) obj;
        if (Tabuleiro3_3 == null) {
            if (other.Tabuleiro3_3 != null)
                return false;
        } else if (!Tabuleiro3_3.toString().equals(other.Tabuleiro3_3.toString()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String res = "";
        res += "nivel: " + this.acoes.size() + "\n";
        res += this.Tabuleiro3_3 + "\n";
        for (Acao acao : this.acoes) {
            res += acao + ", ";
        }
        res += "\n";

        return res;
    }

}
