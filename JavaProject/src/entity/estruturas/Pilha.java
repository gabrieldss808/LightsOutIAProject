package entity.estruturas;

import entity.Estado;

import java.util.Stack;

public class Pilha implements EstadosAbertos{
	
	private Stack<Estado> elementos = new Stack<>();

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
	
	

}
