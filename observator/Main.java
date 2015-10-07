package javaDesignPatterns.observator;

import java.util.concurrent.TimeUnit;

public class Main {
    
    public static void main(String args[]) {
        Model m = new Model();
        m.addObserver(new NormalObserver());
        m.addObserver(new OddHunterObserver());
        Thread t = new Thread(m);
        t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    t.interrupt();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    
}
