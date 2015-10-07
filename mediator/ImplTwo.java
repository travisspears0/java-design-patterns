package javaDesignPatterns.mediator;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ImplTwo extends NextId implements Interf {
    
    private int currentValue = 0;
    private final Mediator mediator;
    private final int timeout;
    private Random random = new Random();
    
    public ImplTwo(Mediator mediator, int timeout) {
        this.mediator = mediator;
        mediator.addInterf(this);
        this.timeout = timeout;
    }
    
    public ImplTwo(Mediator mediator) {
        this(mediator,500);
    }

    @Override
    public void receiveData(Object o, Interf author) {
        int res = 0;
        try {
            int x = Integer.parseInt(o.toString());
            res = x;
        } catch( NumberFormatException e ) {
            String s = o.toString();
            res = s.length();
        }
        this.currentValue += res;
        System.out.println("---DATA RECEIVED " + this + " " + res + " from " + author);
    }

    @Override
    public void change(Object o) {
        this.currentValue += (int)o;
        this.mediator.notifyAll(currentValue, this);
    }

    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                this.change(this.random.nextInt(10));
                TimeUnit.MILLISECONDS.sleep(this.timeout);
            }
        } catch(InterruptedException e) {
            System.out.println(this + " interrupted, current value: " + this.currentValue);
        }
    }
    
    @Override
    public String toString() {
        return "ImplTwo #" + this.getId() + ": ";
    }

    @Override
    public Object getCurrentValue() {
        return this.currentValue;
    }
    
}
