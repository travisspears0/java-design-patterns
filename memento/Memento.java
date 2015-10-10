package javaDesignPatterns.memento;

public class Memento {
    
    private static int CURRENT_ID=0;
    private final int id = CURRENT_ID++;
    protected int value=0;
    
    public Memento() {}
    
    public Memento(int value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }
    
}
