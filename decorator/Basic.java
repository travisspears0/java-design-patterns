package javaDesignPatterns.decorator;

public class Basic implements Interf {

    private int value = 10;
    
    @Override
    public String getTitle() {
        return "basic";
    }

    @Override
    public Interf getInterf() {
        return this;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
