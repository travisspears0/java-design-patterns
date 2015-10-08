package javaDesignPatterns.template;

public abstract class Abs {
    
    public void produce() {
        this.develop();
        this.prepare();
        this.release();
    }
    
    protected abstract void develop();
    protected abstract void prepare();
    protected abstract void release();
    
}
