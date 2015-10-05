package javaDesignPatterns.adapter;

public class Main {
    
    public static void main(String args[]) {
        
        OldInterface old = new OldImpl();
        old.foo(null);
        old.bar();
        
        OldInterface fresh = new Adapter();
        fresh.foo(null);
        fresh.bar();
        
    }
    
}
