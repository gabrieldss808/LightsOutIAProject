package entity.estruturas;

import entity.Estado;

import java.util.Collection;
import java.util.Stack;

public class Pilha implements EstadosAbertos{
	
	private Stack<Estado> elementos = new Stack<>();

	@Override
	public void addAll(Collection<Estado> Estados) {
		this.elementos.addAll(Estados);
	}

	@Override
	public void add(int index, Estado estado){
		this.elementos.add(index,estado);
	}

	@Override
	public void push(Estado estado) {
		this.elementos.push(estado);
	}

	@Override
	public Estado pop() {
		return this.elementos.pop();
	}

	@Override
	public int size() {
		return this.elementos.size();
	}

	public boolean conteins(Estado estado){return  this.elementos.contains(estado);}

}
