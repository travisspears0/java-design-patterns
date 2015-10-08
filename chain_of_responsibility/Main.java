package javaDesignPatterns.chain_of_responsibility;

public class Main {
    
    public static void main(String args[]) {
        
        Performer p = new PerformerTwo();
        Performer p3 = new PerformerThree();
        Performer pf = new PerformerFinal();
        p.setNextPerformer(p3);
        p3.setNextPerformer(pf);
        
        for(int i=0 ; i<10 ; ++i) {
            p.performTask(new Task(i));
        }
        
    }
    
}
