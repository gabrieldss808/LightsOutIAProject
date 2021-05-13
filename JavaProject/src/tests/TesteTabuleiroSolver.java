package tests;

import entity.EspacoDeEstados;
import entity.Estado;
import DAO.InputInstance;
import entity.Tabuleiro;
import entity.estruturas.Pilha;

public class TesteTabuleiroSolver {
    public static void main(String[] args) {
        Tabuleiro t = null;

        t = InputInstance.getInstance("C:/Users/Romano/Desktop/Trabalho/lightsout/LightsOutIAProject/JavaProject/files/inst_4_0093.res");

        Estado e = new Estado(t);
        System.out.println("Começando com o estado ");
        System.out.println(e);

        EspacoDeEstados ee = new EspacoDeEstados(e, new Pilha());
        Estado solucao = ee.solve();
        System.out.println(e);
    }
}
