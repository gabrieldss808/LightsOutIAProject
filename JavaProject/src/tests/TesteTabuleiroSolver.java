package tests;

import entity.EspacoDeEstados;
import entity.Estado;
import DAO.InputInstance;
import entity.Tabuleiro3_3;
import entity.estruturas.Pilha;
import entity.estruturas.Fila;

public class TesteTabuleiroSolver {
    public static void main(String[] args) {

        Tabuleiro3_3 t = InputInstance.getInstance("files/inst_3_0003.in");
        Estado e = new Estado(t);
        System.out.println("Começando com o estado ");
        System.out.println(e);

        EspacoDeEstados ee = new EspacoDeEstados(e, new Pilha());
        Estado solucao = ee.solve();
        System.out.println(e);
    }
}
