package javaDesignPatterns.factory_method;

import java.util.Random;

public class Main {
    
    public static void main(String args[]) {
        Random rand = new Random();
        for( int i=0 ; i<10 ; ++i ) {
            Product p = (rand.nextBoolean()) ? Fork.factory.getProduct() : Apple.factory.getProduct();
            p.advertise();
        }
    }
    
}
