package javaDesignPatterns.factory_method;

public class Apple implements Product {

    private Apple(){}
    
    @Override
    public void advertise() {
        System.out.println("apple");
    }
    
    public static ProductFactory factory = new ProductFactory() {
        @Override
        public Product getProduct() {
            System.out.println("---additional actions");
            return new Apple();
        }
    };
    
    @Override
    public String toString() {
        return "apple";
    }
    
}
