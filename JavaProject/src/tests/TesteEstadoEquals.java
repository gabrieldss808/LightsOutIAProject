package tests;

import entity.EspacoDeEstados;
import entity.Estado;
import DAO.InputInstance;
import entity.Tabuleiro3_3;

public class TesteEstadoEquals {
	
	public static void main(String[] args) {
		Tabuleiro3_3 t = InputInstance.getInstance("C:/Users/Romano/Desktop/Trabalho/lightsout/LightsOutIAProject/JavaProject/files/inst_3_0002.in");
		Estado e = new Estado(t);
		Tabuleiro3_3 tO = InputInstance.getInstance("C:/Users/Romano/Desktop/Trabalho/lightsout/LightsOutIAProject/JavaProject/files/inst_3_0002.in");
		Estado eO = new Estado(tO);
<<<<<<< HEAD
		
		System.out.println("\nestado inst01 eh objetivo?");
=======

		System.out.println("estado inst01 eh objetivo?");
>>>>>>> e6c3ceefb02c366a5c88107b05ca85020e65a7bb
		System.out.println(e);
		System.out.println(e.isObjetivo());
		System.out.println("\nestado inst_obj eh objetivo?");
		System.out.println(eO);
		System.out.println(eO.isObjetivo());
		
		System.out.println("\nestado obj eh objetivo?");
		System.out.println(EspacoDeEstados.OBJETIVO);
		System.out.println(EspacoDeEstados.OBJETIVO.isObjetivo());

		
	}

}
