package javaDesignPatterns.decorator;

public class Main {
    
    public static void main(String args[]) {
        Interf ob = new Basic();
        System.out.println(ob.getTitle() + ": " + ob.getValue());
        ob = new DecoratorFirst(ob);
        System.out.println(ob.getTitle() + ": " + ob.getValue());
        ob = new DecoratorSecond(ob);
        System.out.println(ob.getTitle() + ": " + ob.getValue());
    }
    
}
