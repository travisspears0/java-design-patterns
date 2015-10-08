package javaDesignPatterns.chain_of_responsibility;

public class Task {
    
    private static int CURRENT_ID=0;
    private final int id = CURRENT_ID++;
    private final int value;
    
    public Task(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "task #"+id;
    }
    
}
