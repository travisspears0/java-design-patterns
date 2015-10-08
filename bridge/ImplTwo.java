package javaDesignPatterns.bridge;

public class ImplTwo implements Interf {
    @Override
    public void action(int id) {
        System.out.println("impl two action by " + id);
    }
}
