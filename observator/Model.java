package javaDesignPatterns.observator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Model implements ModelInterface, Runnable {
    
    private List<Observer> observers = new ArrayList<>();
    private List<Integer> numbers = new ArrayList<>();
    private Random random = new Random();
    
    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = this.observers.iterator();
        while( it.hasNext() ) {
            it.next().update(this.numbers);
        }
    }

    @Override
    public void run() {
        try {
            while( !Thread.interrupted() ) {
                this.addNumber();
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch( InterruptedException e ) {
            System.out.println("Model interrupted");
        }
    }
    
    private void addNumber() {
        this.numbers.add(this.random.nextInt(10)+1);
        if( this.numbers.size() > 5 ) {
            this.numbers.remove(0);
        }
        this.notifyObservers();
    }
    
}
