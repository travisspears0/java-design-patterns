package javaDesignPatterns.state;

public class Main {
    
    public static void main(String args[]) {
        Human h = new Human("hehe");
        h.speak();
        h.getBusy();
        h.speak();
        h.getSleeping();
        h.speak();
        h = new Human("yala");
        h.speak();
    }
    
}
