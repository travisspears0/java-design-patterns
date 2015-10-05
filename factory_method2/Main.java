package javaDesignPatterns.factory_method2;

public class Main {
    
    public static void main(String args[]) {
        try {
            Factory factory = new Factory();
            Product b = factory.getProduct("bike");
            b.represent();
            factory.getProduct("car").represent();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
