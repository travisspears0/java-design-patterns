package javaDesignPatterns.mediator;

public interface Interf extends Runnable {
    
    public void receiveData(Object o, Interf author);
    public void change(Object o);
    public Object getCurrentValue();
    
}
