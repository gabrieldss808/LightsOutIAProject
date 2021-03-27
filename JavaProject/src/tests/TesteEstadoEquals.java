package tests;

import entity.EspacoDeEstados;
import entity.Estado;
import DAO.InputInstance;
import entity.Tabuleiro3_3;

public class TesteEstadoEquals {
	
	public static void main(String[] args) {
		Tabuleiro3_3 t = InputInstance.getInstance("files/inst_3_0002.in");
		Estado e = new Estado(t);
		Tabuleiro3_3 tO = InputInstance.getInstance("files/inst_3_0000.in");
		Estado eO = new Estado(tO);
		
		System.out.println("estado inst01 eh objetivo?");
		System.out.println(e);
		System.out.println(e.isObjetivo());
		System.out.println("estado inst_obj eh objetivo?");
		System.out.println(eO);
		System.out.println(eO.isObjetivo());
		
		System.out.println("estado obj eh objetivo?");
		System.out.println(EspacoDeEstados.OBJETIVO);
		System.out.println(EspacoDeEstados.OBJETIVO.isObjetivo());

		
	}

}
