package entity.estruturas;

import entity.Estado;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Fila implements EstadosAbertos{
	
	Queue<Estado> elementos = new LinkedList<>();

	@Override
	public void add(int index, Estado estado) {
		this.elementos.add(estado);
	}

	@Override
	public void addAll(Collection<Estado> Estados) {
		this.elementos.addAll(Estados);
	}

	@Override
	public void push(Estado estado) {
		elementos.add(estado);
	}

	@Override
	public Estado pop() {
		return elementos.poll();
	}

	@Override
	public int size() {
		return elementos.size();
	}

	@Override
	public boolean conteins(Estado estado){return  this.elementos.contains(estado);}

}
