package entity;

public class Tabuleiro3_3 {

    public static final int N = 3;

    int[][] lampadas;

    public Tabuleiro3_3(int[][] aLampadas) {
        this.lampadas = aLampadas;
    }

    public boolean isAcaoValida(Acao acao) {

        return true;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Tabuleiro3_3)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Tabuleiro3_3 c = (Tabuleiro3_3) o;

        // Compare the data members and return accordingly
        for(int i = 0; i< Tabuleiro3_3.N; i++) {
            for(int j = 0; j< Tabuleiro3_3.N; j++) {
                if (lampadas[i][j]==1){return false;}
            }
        }
        return true;
    }

    public void fazerAcao(Acao acao){
        int lampada_0_0 = this.lampadas[0][0];
        int lampada_0_1 = this.lampadas[0][1];
        int lampada_0_2 = this.lampadas[0][2];
        int lampada_1_0 = this.lampadas[1][0];
        int lampada_1_1 = this.lampadas[1][1];
        int lampada_1_2 = this.lampadas[1][2];
        int lampada_2_0 = this.lampadas[2][0];
        int lampada_2_1 = this.lampadas[2][1];
        int lampada_2_2 = this.lampadas[2][2];
        switch (acao){
            case CLICAR_0_0:
                this.lampadas[0][0] = inverteEstado(lampada_0_0);
                this.lampadas[0][1] = inverteEstado(lampada_0_1);
                this.lampadas[1][0] = inverteEstado(lampada_1_0);
                break;
            case CLICAR_0_1:
                this.lampadas[0][1] = inverteEstado(lampada_0_1);
                this.lampadas[0][2] = inverteEstado(lampada_0_2);
                this.lampadas[1][1] = inverteEstado(lampada_1_1);
                this.lampadas[0][0] = inverteEstado(lampada_0_0);
                break;
            case CLICAR_0_2:
                this.lampadas[0][2] = inverteEstado(lampada_0_2);
                this.lampadas[1][2] = inverteEstado(lampada_1_2);
                this.lampadas[0][1] = inverteEstado(lampada_0_1);
                break;
            case CLICAR_1_0:
                this.lampadas[1][0] = inverteEstado(lampada_1_0);
                this.lampadas[0][0] = inverteEstado(lampada_0_0);
                this.lampadas[1][1] = inverteEstado(lampada_1_1);
                this.lampadas[2][0] = inverteEstado(lampada_2_0);
                break;
            case CLICAR_1_1:
                this.lampadas[1][1] = inverteEstado(lampada_1_1);
                this.lampadas[0][1] = inverteEstado(lampada_0_1);
                this.lampadas[1][2] = inverteEstado(lampada_1_2);
                this.lampadas[2][1] = inverteEstado(lampada_2_1);
                this.lampadas[1][0] = inverteEstado(lampada_1_0);
                break;
            case CLICAR_1_2:
                this.lampadas[1][2] = inverteEstado(lampada_1_2);
                this.lampadas[0][2] = inverteEstado(lampada_0_2);
                this.lampadas[2][2] = inverteEstado(lampada_2_2);
                this.lampadas[1][1] = inverteEstado(lampada_1_1);
                break;
            case CLICAR_2_0:
                this.lampadas[2][0] = inverteEstado(lampada_2_0);
                this.lampadas[1][0] = inverteEstado(lampada_1_0);
                this.lampadas[2][1] = inverteEstado(lampada_2_1);
                break;
            case CLICAR_2_1:
                this.lampadas[2][1] = inverteEstado(lampada_2_1);
                this.lampadas[1][1] = inverteEstado(lampada_1_1);
                this.lampadas[2][2] = inverteEstado(lampada_2_2);
                this.lampadas[2][0] = inverteEstado(lampada_2_0);
                break;
            case CLICAR_2_2:
                this.lampadas[2][2] = inverteEstado(lampada_2_2);
                this.lampadas[1][2] = inverteEstado(lampada_1_2);
                this.lampadas[2][1] = inverteEstado(lampada_2_1);
                break;

            //       0   1   2
            //  0|   0   0   0
            //  1|   0   0   0
            //  2|   0   0   0
        }
    }

    public int inverteEstado(int n){
        int valor;
        if (n==1){
            valor=0;
        }else{
            valor=1;
        }
        return valor;
    }

    public Tabuleiro3_3 deepCopy() {
<<<<<<< HEAD
        int[][] novaLampada = new int[Tabuleiro3_3.N][Tabuleiro3_3.N];
        for(int i=0; i<Tabuleiro3_3.N; i++) {
            for(int j=0; j<Tabuleiro3_3.N; j++) {
                novaLampada[i][j] = this.lampadas[i][j];
            }
        }
        return new Tabuleiro3_3(novaLampada);
=======
        int[][] novasPecas = new int[Tabuleiro3_3.N][Tabuleiro3_3.N];
        for(int i=0; i<Tabuleiro3_3.N; i++) {
            for(int j=0; j<Tabuleiro3_3.N; j++) {
                novasPecas[i][j] = this.lampadas[i][j];
            }
        }
        return new Tabuleiro3_3(novasPecas);
>>>>>>> 9897cffcf0ecc0ee53ecb1f479a41a517f9182c4
    }

    public int NumberOfZeros(){

        int NumerOfZeros = 0;

        for(int i = 0; i< Tabuleiro3_3.N; i++) {
            for(int j = 0; j< Tabuleiro3_3.N; j++) {

                if(this.lampadas[i][j] == 0){
                    NumerOfZeros++;
                }
            }
        }

        return NumerOfZeros;
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
