package tests;

import DAO.InputInstance;
import entity.Estado;
import entity.Tabuleiro;

import java.util.Collection;

public class TesteGeraFilho {

    public static void main(String[] args) {
        Tabuleiro t = InputInstance.getInstance("files/inst_3_0004.in");
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