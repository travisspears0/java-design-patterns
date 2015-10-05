package javaDesignPatterns.proxy;

public class Main {
    
    public static void main(String args[]) {
        Interf ordinary = new Action();
        ordinary.doSth();
        Interf proxied = new Proxy();
        proxied.doSth();
    }
    
}
