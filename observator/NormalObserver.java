package javaDesignPatterns.observator;

import java.util.List;

public class NormalObserver implements Observer {

    @Override
    public void update(Object o) {
        List<Integer> list = (List)o;
        String res = "";
        for( Integer i : list ) {
            res += i + ",";
        }
        res = res.substring(0,res.length()-1);
        System.out.println("normal observer: " + res);
    }
    
}
