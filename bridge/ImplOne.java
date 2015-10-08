package javaDesignPatterns.bridge;

public class ImplOne implements Interf {
    @Override
    public void action(int id) {
        System.out.println("impl one action by " + id);
    }
}
