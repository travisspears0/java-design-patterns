package javaDesignPatterns.adapter;

public class Adapter implements OldInterface, FreshInterface {

    FreshInterface fresh = new FreshImpl();
    
    @Override
    public void foo(String s) {
        fresh.foo(s, 0);
    }

    @Override
    public void bar() {
        fresh.far(0);
    }

    @Override
    public void foo(String s, int x) {
        fresh.foo(s, x);
    }

    @Override
    public void far(int a) {
        fresh.far(a);
    }
    
    
    
}
