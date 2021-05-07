package tests;

import entity.EspacoDeEstados;
import entity.Estado;
import DAO.InputInstance;
import entity.Tabuleiro;

public class TesteEstadoEquals {
	
	public static void main(String[] args) {
		Tabuleiro t = InputInstance.getInstance("files/inst_3_0002.in");
		Estado e = new Estado(t);
		Tabuleiro tO = InputInstance.getInstance("files/inst_3_0002.in");
		Estado eO = new Estado(tO);
		
		System.out.println("\nestado inst01 eh objetivo?");
		System.out.println("estado inst01 eh objetivo?");
		System.out.println(e);
		System.out.println(e.isObjetivo());
		System.out.println("\nestado inst_obj eh objetivo?");
		System.out.println(eO);
		System.out.println(eO.isObjetivo());
		System.out.println("\nestado obj eh objetivo 3x3?");
		System.out.println(EspacoDeEstados.OBJETIVO3_3);
		System.out.println(EspacoDeEstados.OBJETIVO3_3.isObjetivo());
		System.out.println("\nestado obj eh objetivo 4x4?");
		System.out.println(EspacoDeEstados.OBJETIVO4_4);
		System.out.println(EspacoDeEstados.OBJETIVO4_4.isObjetivo());

	}

}
