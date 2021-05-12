package entity;

public class Tabuleiro {

    int N;

    int[][] lampadas;

    public Tabuleiro(int[][] aLampadas, int N) {
        this.lampadas = aLampadas;
        this.N = N;
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
        if (!(o instanceof Tabuleiro)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Tabuleiro c = (Tabuleiro) o;

        // Compare the data members and return accordingly
        for(int i = 0; i< this.N; i++) {
            for(int j = 0; j< this.N; j++) {
                if (lampadas[i][j]==1){return false;}
            }
        }
        return true;
    }

    public void fazerAcao(Acao acao){

        if(this.N == 3){

            int lampada_0_0 = this.lampadas[0][0];
            int lampada_0_1 = this.lampadas[0][1];
            int lampada_0_2 = this.lampadas[0][2];
            int lampada_1_0 = this.lampadas[1][0];
            int lampada_1_1 = this.lampadas[1][1];
            int lampada_1_2 = this.lampadas[1][2];
            int lampada_2_0 = this.lampadas[2][0];
            int lampada_2_1 = this.lampadas[2][1];
            int lampada_2_2 = this.lampadas[2][2];
            switch (acao) {
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
            }
        }else{
            int lampada_0_0 = this.lampadas[0][0];
            int lampada_0_1 = this.lampadas[0][1];
            int lampada_0_2 = this.lampadas[0][2];
            int lampada_0_3 = this.lampadas[0][3];
            int lampada_1_0 = this.lampadas[1][0];
            int lampada_1_1 = this.lampadas[1][1];
            int lampada_1_2 = this.lampadas[1][2];
            int lampada_1_3 = this.lampadas[1][3];
            int lampada_2_0 = this.lampadas[2][0];
            int lampada_2_1 = this.lampadas[2][1];
            int lampada_2_2 = this.lampadas[2][2];
            int lampada_2_3 = this.lampadas[2][3];
            int lampada_3_0 = this.lampadas[3][0];
            int lampada_3_1 = this.lampadas[3][1];
            int lampada_3_2 = this.lampadas[3][2];
            int lampada_3_3 = this.lampadas[3][3];

            switch (acao) {
                case Tab4CLICAR_0_0:
                    this.lampadas[0][0] = inverteEstado(lampada_0_0);
                    this.lampadas[1][0] = inverteEstado(lampada_1_0);
                    this.lampadas[0][1] = inverteEstado(lampada_0_1);
                    break;
                case Tab4CLICAR_0_1:
                    this.lampadas[0][1] = inverteEstado(lampada_0_1);
                    this.lampadas[0][0] = inverteEstado(lampada_0_0);
                    this.lampadas[0][2] = inverteEstado(lampada_0_2);
                    this.lampadas[1][1] = inverteEstado(lampada_1_1);
                    break;
                case Tab4CLICAR_0_2:
                    this.lampadas[0][2] = inverteEstado(lampada_0_2);
                    this.lampadas[0][3] = inverteEstado(lampada_0_3);
                    this.lampadas[1][2] = inverteEstado(lampada_1_2);
                    this.lampadas[0][1] = inverteEstado(lampada_0_1);
                    break;
                case Tab4CLICAR_0_3:
                    this.lampadas[0][3] = inverteEstado(lampada_0_3);
                    this.lampadas[1][3] = inverteEstado(lampada_1_3);
                    this.lampadas[0][2] = inverteEstado(lampada_0_2);
                    break;
                case Tab4CLICAR_1_0:
                    this.lampadas[1][0] = inverteEstado(lampada_1_0);
                    this.lampadas[0][0] = inverteEstado(lampada_0_0);
                    this.lampadas[1][1] = inverteEstado(lampada_1_1);
                    this.lampadas[2][0] = inverteEstado(lampada_2_0);
                    break;
                /*case Tab4CLICAR_1_1:
                    this.lampadas[1][1] = inverteEstado(lampada_1_1);
                    this.lampadas[0][1] = inverteEstado(lampada_0_1);
                    this.lampadas[1][2] = inverteEstado(lampada_1_2);
                    this.lampadas[2][1] = inverteEstado(lampada_2_1);
                    this.lampadas[1][0] = inverteEstado(lampada_1_0);
                    break;
                case Tab4CLICAR_1_2:
                    this.lampadas[1][2] = inverteEstado(lampada_1_2);
                    this.lampadas[0][2] = inverteEstado(lampada_0_2);
                    this.lampadas[1][3] = inverteEstado(lampada_1_3);
                    this.lampadas[2][2] = inverteEstado(lampada_2_2);
                    this.lampadas[1][1] = inverteEstado(lampada_1_1);
                    break;*/
                case Tab4CLICAR_1_3:
                    this.lampadas[1][3] = inverteEstado(lampada_1_3);
                    this.lampadas[0][3] = inverteEstado(lampada_0_3);
                    this.lampadas[2][3] = inverteEstado(lampada_2_3);
                    this.lampadas[1][2] = inverteEstado(lampada_1_2);
                    break;
                case Tab4CLICAR_2_0:
                    this.lampadas[2][0] = inverteEstado(lampada_2_0);
                    this.lampadas[1][0] = inverteEstado(lampada_1_0);
                    this.lampadas[2][1] = inverteEstado(lampada_2_1);
                    this.lampadas[3][0] = inverteEstado(lampada_3_0);
                    break;
                /*ase Tab4CLICAR_2_1:
                    this.lampadas[2][1] = inverteEstado(lampada_2_1);
                    this.lampadas[1][1] = inverteEstado(lampada_1_1);
                    this.lampadas[2][2] = inverteEstado(lampada_2_2);
                    this.lampadas[3][1] = inverteEstado(lampada_3_1);
                    this.lampadas[2][0] = inverteEstado(lampada_2_0);
                    break;
                case Tab4CLICAR_2_2:
                    this.lampadas[2][2] = inverteEstado(lampada_2_2);
                    this.lampadas[1][2] = inverteEstado(lampada_1_2);
                    this.lampadas[2][3] = inverteEstado(lampada_2_3);
                    this.lampadas[3][2] = inverteEstado(lampada_3_2);
                    this.lampadas[2][1] = inverteEstado(lampada_2_1);
                    break;*/
                case Tab4CLICAR_2_3:
                    this.lampadas[2][3] = inverteEstado(lampada_2_3);
                    this.lampadas[1][3] = inverteEstado(lampada_1_3);
                    this.lampadas[3][3] = inverteEstado(lampada_3_3);
                    this.lampadas[2][2] = inverteEstado(lampada_2_2);
                    break;
                case Tab4CLICAR_3_0:
                    this.lampadas[3][0] = inverteEstado(lampada_3_0);
                    this.lampadas[2][0] = inverteEstado(lampada_2_0);
                    this.lampadas[3][1] = inverteEstado(lampada_3_1);
                    break;
                case Tab4CLICAR_3_1:
                    this.lampadas[3][1] = inverteEstado(lampada_3_1);
                    this.lampadas[2][1] = inverteEstado(lampada_2_1);
                    this.lampadas[3][2] = inverteEstado(lampada_3_2);
                    this.lampadas[3][0] = inverteEstado(lampada_3_0);
                    break;
                case Tab4CLICAR_3_2:
                    this.lampadas[3][2] = inverteEstado(lampada_3_2);
                    this.lampadas[2][2] = inverteEstado(lampada_2_2);
                    this.lampadas[3][3] = inverteEstado(lampada_3_3);
                    this.lampadas[3][1] = inverteEstado(lampada_3_1);
                    break;
                case Tab4CLICAR_3_3:
                    this.lampadas[3][3] = inverteEstado(lampada_3_3);
                    this.lampadas[2][3] = inverteEstado(lampada_2_3);
                    this.lampadas[3][2] = inverteEstado(lampada_3_2);
                    break;
            }
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

    public Tabuleiro deepCopy() {
        int[][] novaLampada = new int[this.N][this.N];
        for(int i = 0; i< this.N; i++) {
            for(int j = 0; j< this.N; j++) {
                novaLampada[i][j] = this.lampadas[i][j];
            }
        }
        return new Tabuleiro(novaLampada,this.N);
    }

    public int NumberOfZeros(){

        int NumerOfZeros = 0;

        for(int i = 0; i< this.N; i++) {
            for(int j = 0; j< this.N; j++) {

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

        for(int i = 0; i< this.N; i++) {
            for(int j = 0; j< this.N; j++) {
                res += this.lampadas[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

}
