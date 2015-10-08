package javaDesignPatterns.bridge;

public abstract class Abs {
    
    protected final Interf interf;
    protected final int id;
    
    public Abs(int id, Interf interf) {
        this.id = id;
        this.interf = interf;
    }
    
    public void absAction() {
        System.out.println("ABS action in " + this.id);
    }
    
    public abstract void doSth();
    
}
