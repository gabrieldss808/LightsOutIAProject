package entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import entity.estruturas.EstadosAbertos;

public class EspacoDeEstados {
	
	 public static final Estado OBJETIVO = new Estado(
			 new Tabuleiro3_3(
					 new int[][]{
						 {0,0,0},
						 {0,0,0},
						 {0,0,0}
						 }
					 ));
	 
	 Estado inicial;
	 EstadosAbertos estadosAbertos;
	 Set<Estado> estadosFechados;

	 public EspacoDeEstados(Estado aInicial, EstadosAbertos aEstruturaAbertos) {
		 this.inicial = aInicial;
		 this.estadosAbertos = aEstruturaAbertos;
		 estadosAbertos.push(this.inicial);
		 estadosFechados = new HashSet<>();
		 
	}
	 
	 public Estado solve() {
		 
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
//			 Collection<Estado> filhos = e.geraFilhos();
//			 for(Estado filho: filhos) {
//				 if(!estadosFechados.contains(filho))
//					 estadosAbertos.push(filho);
//			 }
		 }
		 
		 System.out.println("nao encontrou solucao");
		 
		 return null;
	 }

}
