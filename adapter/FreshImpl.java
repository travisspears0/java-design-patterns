package javaDesignPatterns.adapter;

public class FreshImpl implements FreshInterface {
    
    @Override
    public void foo(String s, int x) {
        System.out.println("fresh foo");
    }

    @Override
    public void far(int a) {
        System.out.println("fresh far");
    }
    
}
