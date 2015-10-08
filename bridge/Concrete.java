package javaDesignPatterns.bridge;

public class Concrete extends Abs {

    public Concrete(int id, Interf interf) {
        super(id, interf);
    }

    @Override
    public void doSth() {
        this.interf.action(this.id);
    }
    
}
