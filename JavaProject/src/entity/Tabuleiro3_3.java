package entity;

public class Tabuleiro3_3 {

    public static final int N = 3;

    int[][] lampadas;

    public Tabuleiro3_3(int[][] aLampadas) {
        this.lampadas = aLampadas;
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
