package javaDesignPatterns.singleton;

public class Singleton {
    
    private static Singleton singleton = null;
    
    private Singleton() {
        System.out.println("singleton created");
    }
    
    public static Singleton getSingleton() {
        if( Singleton.singleton == null ) {
            Singleton.singleton = new Singleton();
        }
        return Singleton.singleton;
    }
    
}
