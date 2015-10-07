package javaDesignPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    
    private final List<Interf> users = new ArrayList<>();

    @Override
    public void addInterf(Interf interf) {
        if( this.users.contains(interf) ) {
            return;
        }
        this.users.add(interf);
    }
    
    @Override
    public void notifyAll(Object objectPassed, Interf author) {
        synchronized(this) {
            for( int i=0 ; i<this.users.size() ; ++i ) {
                this.users.get(i).receiveData(objectPassed,author);
            }
        }
    }
    
}
