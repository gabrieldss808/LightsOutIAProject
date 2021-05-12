package entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Estado {

    Tabuleiro Tabuleiro;
    List<Acao> acoes;

    public Estado(Tabuleiro aTabuleiro) {
        this.Tabuleiro = aTabuleiro;
        this.acoes = new LinkedList<>();
    }

    public Estado(Tabuleiro aTabuleiro, List<Acao> aAcoes) {
        this(aTabuleiro);
        this.acoes = aAcoes;

    }

    public boolean isObjetivo() {

        if(this.Tabuleiro.N == 3){
            return this.Tabuleiro.equals(EspacoDeEstados.OBJETIVO3_3.Tabuleiro);
        }else{
            return this.Tabuleiro.equals(EspacoDeEstados.OBJETIVO4_4.Tabuleiro);
        }
    }

   public void fazerAcao(Acao acao) {
        this.acoes.add(acao);
        this.Tabuleiro.fazerAcao(acao);
    }

    public Collection<Estado> geraFilhos(){

        Collection<Estado> filhos = new ArrayList<>();


        for(Acao acao: Acao.values()) {

            if(isValidaAcao(acao)){
                /*System.out.println("testado a acao " + acao);*/
                Estado filho = this.deepCopy();
                filho.fazerAcao(acao);
                filhos.add(filho);
            }

        }

        return filhos;
    }

    public boolean isValidaAcao(Acao acao){
        boolean retorno = false;

        if(acao.toString().contains("Tab4") && this.Tabuleiro.N == 4){
            if(this.acoes.size() > 0){
                if(this.acoes.get(this.acoes.size()-1) != acao){
                    retorno = true;
                }
            }else if(this.acoes.size() == 0){
                retorno = true;
            }
        }
        if(!acao.toString().contains("Tab4") && this.Tabuleiro.N == 3){
            retorno = true;
        }

        return retorno;
    }

    public Estado deepCopy() {
        List<Acao> novasAcoes = new LinkedList<>(this.acoes);
        return new Estado(this.Tabuleiro.deepCopy(), novasAcoes);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Tabuleiro == null) ? 0 : Tabuleiro.hashCode());
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
        if (Tabuleiro == null) {
            if (other.Tabuleiro != null)
                return false;
        } else if (!Tabuleiro.toString().equals(other.Tabuleiro.toString()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String res = "";
        res += "nivel: " + this.acoes.size() + "\n";
        res += this.Tabuleiro + "\n";
        for (Acao acao : this.acoes) {
            res += acao + ", ";
        }
        res += "\n";

        return res;
    }

}
