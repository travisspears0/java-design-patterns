package javaDesignPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {
    
    private final List<Memento> mementos = new ArrayList<>();
    
    public void addMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public List<Memento> getMementos() {
        return mementos;
    }
    
    
    
}
