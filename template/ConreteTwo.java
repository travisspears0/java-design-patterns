package javaDesignPatterns.template;

public class ConreteTwo extends Abs {

    @Override
    protected void develop() {
        System.out.println("TWO: developing");
    }

    @Override
    protected void prepare() {
        System.out.println("TWO: preparing");
    }

    @Override
    protected void release() {
        System.out.println("TWO: releasing");
    }
    
}
