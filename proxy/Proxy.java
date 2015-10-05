package javaDesignPatterns.proxy;

public class Proxy implements Interf {

    private final Action action;
    
    public Proxy() {
        this.action = new Action();
    }
    
    @Override
    public void doSth() {
        System.out.println("proxy...");
        this.action.doSth();
    }
    
}
