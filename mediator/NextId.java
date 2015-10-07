package javaDesignPatterns.mediator;

public abstract class NextId {
    
    private static int CURRENT_ID = 0;
    private final int id = NextId.CURRENT_ID++;
    
    public int getId() {
        return id;
    }
    
}
