package entity.estruturas;

import entity.Estado;

public interface EstadosAbertos {

    public void push(Estado estado);
    public Estado pop();
    public int size();
    public void add(int index,Estado estado);
}

