package entity.estruturas;

import entity.Estado;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public interface EstadosAbertos {

    public void push(Estado estado);
    public Estado pop();
    public int size();
    public void add(int index,Estado estado);
    public void addAll(Collection<Estado> estados);
}

