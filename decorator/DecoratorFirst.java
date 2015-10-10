package javaDesignPatterns.decorator;

public class DecoratorFirst extends AbstractDecorator {

    public DecoratorFirst(Interf interf) {
        super(interf);
        this.value=11;
    }

    @Override
    public String getTitle() {
        System.out.println("first decorator calling " + this.specialAddedMethod());
        return "first decorator";
    }
    
    @Override
    public int getValue() {
        return this.interf.getValue()+this.value;
    }
    
    public String specialAddedMethod() {
        return "something special";
    }
}
