package javaDesignPatterns.mediator;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ImplOne extends NextId implements Interf {
    
    private String currentString = "";
    private final Mediator mediator;
    private final int timeout;
    private Random random = new Random();
    
    public ImplOne(Mediator mediator, int timeout) {
        this.mediator = mediator;
        mediator.addInterf(this);
        this.timeout = timeout;
    }
    
    public ImplOne(Mediator mediator) {
        this(mediator,500);
    }

    @Override
    public void receiveData(Object o, Interf author) {
        char c = o.toString().charAt(0);
        this.currentString += c;
        System.out.println("---DATA RECEIVED " + this + " " + c + " from " + author);
    }

    @Override
    public void change(Object o) {
        this.mediator.notifyAll(o, this);
    }

    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                this.change(this.random.nextInt(10));
                TimeUnit.MILLISECONDS.sleep(this.timeout);
            }
        } catch(InterruptedException e) {
            System.out.println(this + " interrupted, current value: " + this.currentString);
        }
    }
    
    @Override
    public String toString() {
        return "ImplOne #" + this.getId() + ": ";
    }

    @Override
    public Object getCurrentValue() {
        return this.currentString;
    }
    
}
