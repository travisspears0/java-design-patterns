package javaDesignPatterns.decorator;

public class DecoratorSecond extends AbstractDecorator {
    
    public DecoratorSecond(Interf interf) {
        super(interf);
        this.value=12;
    }

    @Override
    public String getTitle() {
        return "second decorator";
    }
    
    @Override
    public int getValue() {
        return this.interf.getValue()+this.value;
    }
}
