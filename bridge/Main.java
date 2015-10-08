package javaDesignPatterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String args[]) {
        
        int id = 0;
        List<Abs> abss = new ArrayList<>();
        for( int i=0 ; i<4 ; ++i ) {
            abss.add(new Concrete(++id, new ImplOne()));
        }
        for( Abs a : abss ) {
            a.absAction();
            a.doSth();
        }
    }
    
}
