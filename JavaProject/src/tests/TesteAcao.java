package tests;

import DAO.InputInstance;
import entity.Acao;
import entity.Estado;
import entity.Tabuleiro;

public class TesteAcao {
    public static void main(String[] args) {
        Tabuleiro t = InputInstance.getInstance("files/inst_4_0173.in");
        Estado e = new Estado(t);
        System.out.println("estado inst01 eh objetivo?");
        System.out.println(e);
        t.fazerAcao(Acao.Tab4CLICAR_0_2);
        System.out.println(t);
        /*t.fazerAcao(Acao.CLICAR_2_2);
        System.out.println(t);
        t.fazerAcao(Acao.CLICAR_1_1);
        System.out.println(t);
        t.fazerAcao(Acao.CLICAR_2_0);
        System.out.println(t);*/
    }
}
