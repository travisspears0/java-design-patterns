package javaDesignPatterns.chain_of_responsibility;

public interface Performer {
    
    public void setNextPerformer(Performer performer);
    public void performTask(Task task);
    
}
