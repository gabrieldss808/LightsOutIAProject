package tests;

import java.util.Collection;

import DAO.InputInstance;
import entity.Estado;
import entity.Tabuleiro;

public class TesteEstadoGeraFilhos {

    public static void main(String[] args) {
        Tabuleiro t = InputInstance.getInstance("files/inst_3_0002.in");
        Estado e = new Estado(t);
        Tabuleiro tO = InputInstance.getInstance("files/inst_3_0000.in");
        Estado eO = new Estado(tO);

        System.out.println("estado original");
        System.out.println(e);

        Collection<Estado> filhos = e.geraFilhos();

        System.out.println("filhos");
        for(Estado filho: filhos)
            System.out.println(filho);


    }
}
