package javaDesignPatterns.adapter;

public class OldImpl implements OldInterface {

    @Override
    public void foo(String s) {
        System.out.println("old foo");
    }

    @Override
    public void bar() {
        System.out.println("old bar");
    }
    
}
