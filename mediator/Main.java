package javaDesignPatterns.mediator;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    
    public static void main(String args[]) {
        Random random = new Random();
        Mediator m = new MediatorImpl();
        ExecutorService ex = Executors.newCachedThreadPool();
        for( int i=0 ; i<2 ; ++i ) {
            Interf interf = ( random.nextBoolean() ) ?
                    new ImplOne(m,(i+1)*200) : new ImplTwo(m,(i+1)*200) ;
            ex.execute(interf);
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    ex.shutdownNow();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    
}
