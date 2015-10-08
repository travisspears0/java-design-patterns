package javaDesignPatterns.strategy;

public class Main {
    
    public static void main(String args[]) {
        Player1 p = new Player1();
        p.perform();
        p.perform("one");
        p.perform("two");
        p.perform();
        p.perform("one");
        p.perform("one");
        
        Player2 p2 = new Player2();
        p2.perform();
        p2.switchToOne();
        p2.perform();
        p2.switchToTwo();
        p2.switchToTwo();
        p2.perform();
        p2.switchToDefault();
        p2.perform();
        p2.switchToTwo();
        p2.perform();
    }
    
}
