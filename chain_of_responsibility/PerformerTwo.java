package javaDesignPatterns.chain_of_responsibility;

public class PerformerTwo implements Performer {

    private Performer nextPerformer;
    
    @Override
    public void setNextPerformer(Performer performer) {
        this.nextPerformer = performer;
    }

    @Override
    public void performTask(Task task) {
        if( task.getValue()%2 == 0 ) {
            System.out.println(task + " catched because it's value can be divided by 2");
        } else {
            System.out.println(task + " passed performer two");
            if( this.nextPerformer != null ) {
                this.nextPerformer.performTask(task);
            }
        }
    }
    
}
