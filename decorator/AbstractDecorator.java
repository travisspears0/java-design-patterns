package javaDesignPatterns.decorator;

public abstract class AbstractDecorator implements Interf {

    protected Interf interf;
    protected int value=0;
    
    public AbstractDecorator(Interf interf) {
        this.interf = interf;
    }
    
    @Override
    public abstract String getTitle();
    
    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public Interf getInterf() {
        return this.interf;
    }
    
    
    
}
