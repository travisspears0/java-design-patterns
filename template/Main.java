package javaDesignPatterns.template;

public class Main {
    
    public static void main(String args[]) {
        Abs a = new ConreteOne();
        a.produce();
        a = new ConreteTwo();
        a.produce();
    }
    
}
