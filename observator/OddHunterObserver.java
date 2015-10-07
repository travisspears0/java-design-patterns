package javaDesignPatterns.observator;

import java.util.List;

public class OddHunterObserver implements Observer {

    @Override
    public void update(Object o) {
        List<Integer> list = (List)o;
        int oddCounter=0;
        String res = "";
        for( Integer i : list ) {
            if( i%2 != 0 ) {
                ++oddCounter;
            }
            res+= i + ",";
        }
        res = res.substring(0,res.length()-1);
        System.out.println("odd numbers hunter: " + res + " | odd numbers: " + oddCounter );
    }
    
}
