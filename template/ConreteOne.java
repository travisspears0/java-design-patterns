package javaDesignPatterns.template;

public class ConreteOne extends Abs {

    @Override
    protected void develop() {
        System.out.println("ONE: developing");
    }

    @Override
    protected void prepare() {
        System.out.println("ONE: preparing");
    }

    @Override
    protected void release() {
        System.out.println("ONE: releasing");
    }
    
}
