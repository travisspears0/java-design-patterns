package javaDesignPatterns.singleton;

public class Main {
    
    public static void main(String args[]) {
        
        for( int i=0 ; i<5 ; ++i ) {
            Singleton singleton = Singleton.getSingleton();
        }
        
    }
    
}
