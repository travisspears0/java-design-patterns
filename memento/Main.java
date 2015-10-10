package javaDesignPatterns.memento;

import java.util.Random;

public class Main {
    
    public static void main(String args[]) {
        
        Model model = new Model();
        MementoManager man = new MementoManager();
        
        Random r = new Random();
        
        for( int i=0 ; i<20 ; ++i ) {
            model.setValue(model.getValue()+r.nextInt(4)+1);
            if( i%3==0 ) {
                man.addMemento(model.saveState());
            }
        }
        
        for( Memento m : man.getMementos() ) {
            System.out.println(m.getId() + ": " + m.getValue());
        }
        
        System.out.println("over: " + model.getId() + ": " + model.getValue());
        
        /*
        Thread incrementThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random r = new Random();
                try {
                    for( ; ; ) {
                        model.setValue(model.getValue()+r.nextInt(4)+1);
                        TimeUnit.MILLISECONDS.sleep(300);
                    }
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        incrementThread.setDaemon(true);
        
        Thread savingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random r = new Random();
                try {
                    for( ; ; ) {
                        man.addMemento(model.saveState());
                        TimeUnit.MILLISECONDS.sleep(700);
                    }
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        savingThread.setDaemon(true);
        
        Thread waitingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    for( Memento m : man.getMementos() ) {
                        System.out.println(m.getId() + ": " + m.getValue());
                    }
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        incrementThread.start();
        savingThread.start();
        waitingThread.start();
        */
    }
    
}
