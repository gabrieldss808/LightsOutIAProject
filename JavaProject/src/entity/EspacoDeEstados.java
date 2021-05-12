package entity;

import java.util.*;

import entity.estruturas.EstadosAbertos;
import entity.estruturas.Pilha;

public class EspacoDeEstados {
	
	 public static final Estado OBJETIVO3_3 = new Estado(
			 new Tabuleiro(
					 new int[][]{
						 {0,0,0},
						 {0,0,0},
						 {0,0,0}
						 }
					 ,3));

	public static final Estado OBJETIVO4_4 = new Estado(
			new Tabuleiro(
					new int[][]{
							{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0}
					}
					,4));
	 
 	Estado inicial;
 	EstadosAbertos estadosAbertos;
 	Set<Estado> estadosFechados;
	Set<Estado> estadoTemporarios;

	 public EspacoDeEstados(Estado aInicial, EstadosAbertos aEstruturaAbertos) {
		 this.inicial = aInicial;
		 this.estadosAbertos = aEstruturaAbertos;
		 estadosAbertos.push(this.inicial);
		 estadosFechados = new HashSet<>();
		 estadoTemporarios = new HashSet<>();
		 
	}
	 
	 public Estado solve() {

	 	int numerOfTests = 0;

		 while(estadosAbertos.size()>0) {
			 Estado e = estadosAbertos.pop();
			 System.out.println("TESTANDO ESTADO");
			 System.out.println(e);
			 if(e.isObjetivo()) {
				 System.out.println("-------------ENCONTROU SOLUCAO----------");
				 System.out.println(e);
				 return e;
			 }
			 estadosFechados.add(e);
			 numerOfTests++;

			 Collection<Estado> filhos = e.geraFilhos();
			 for(Estado filho: filhos) {
				 if(!estadosFechados.contains(filho) && filho.acoes.size() <= 3){
				 	estadosAbertos.add(0,filho);
				 }
			 }

			 /*if(estadosAbertos.size() == 0){
			 	estadosAbertos.addAll(estadoTemporarios);
			 	estadoTemporarios.removeAll(estadoTemporarios);
			 }*/
		 }
		 
		 System.out.println("nao encontrou solucao");
		 System.out.println("Numero de Testes: " + numerOfTests);
		 
		 return null;
	 }

}
