package javaDesignPatterns.chain_of_responsibility;

public class PerformerFinal implements Performer {

    private Performer nextPerformer;
    
    @Override
    public void setNextPerformer(Performer performer) {}

    @Override
    public void performTask(Task task) {
        System.out.println("---->"+task + "got to the final performer, great!");
    }
    
}
