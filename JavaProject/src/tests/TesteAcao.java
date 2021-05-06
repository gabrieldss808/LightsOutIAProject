package tests;

import DAO.InputInstance;
import entity.Acao;
import entity.EspacoDeEstados;
import entity.Estado;
import entity.Tabuleiro3_3;

public class TesteAcao {
    public static void main(String[] args) {
        Tabuleiro3_3 t = InputInstance.getInstance("C:/Users/Romano/Desktop/Trabalho/lightsout/LightsOutIAProject/JavaProject/files/inst_3_0002.in");
        Estado e = new Estado(t);
        System.out.println("estado inst01 eh objetivo?");
        System.out.println(e);
        t.fazerAcao(Acao.CLICAR_2_0);
        System.out.println(t);
        t.fazerAcao(Acao.CLICAR_2_1);
        System.out.println(t);
        t.fazerAcao(Acao.CLICAR_2_2);
        System.out.println(t);
    }
}
