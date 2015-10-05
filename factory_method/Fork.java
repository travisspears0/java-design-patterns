package javaDesignPatterns.factory_method;

public class Fork implements Product {

    private Fork(){}
    
    @Override
    public void advertise() {
        System.out.println("fork");
    }
    
    public static ProductFactory factory = new ProductFactory() {
        @Override
        public Product getProduct() {
            return new Fork();
        }
    };
    
}
