package entity;

public class Tabuleiro3_3 {

    public static final int N = 3;

    int[][] lampadas;

    public Tabuleiro3_3(int[][] aLampadas) {
        this.lampadas = aLampadas;
    }

    public void fazerAcao(Acao acao) {
        Posicao p0 = getPosicaoZero();
        Posicao posicaoPeca = null;
        switch (acao) {
            case CIMA:     posicaoPeca = new Posicao(p0.linha-1, p0.coluna  ); break;
            case DIREITA:  posicaoPeca = new Posicao(p0.linha  , p0.coluna+1); break;
            case BAIXO:    posicaoPeca = new Posicao(p0.linha+1, p0.coluna  ); break;
            case ESQUERDA: posicaoPeca = new Posicao(p0.linha  , p0.coluna-1); break;
            default:
                break;
        }
        int peca = this.pecas[posicaoPeca.linha][posicaoPeca.coluna];
        this.pecas[p0.linha][p0.coluna] = peca;
        this.pecas[posicaoPeca.linha][posicaoPeca.coluna] = 0;
    }

    public Tabuleiro deepCopy() {
        int[][] novoPecas = new int[Tabuleiro.N][Tabuleiro.N];
        for(int i=0; i<Tabuleiro.N; i++) {
            for(int j=0; j<Tabuleiro.N; j++) {
                novoPecas[i][j] = this.pecas[i][j];
            }
        }
        return new Tabuleiro(novoPecas);
    }

    @Override
    public String toString() {
        String res = "";

        for(int i = 0; i< Tabuleiro3_3.N; i++) {
            for(int j = 0; j< Tabuleiro3_3.N; j++) {
                res += this.lampadas[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

}
