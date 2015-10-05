package javaDesignPatterns.factory_method2;

public class Factory {

    public Product getProduct(String which) throws Exception {
        which = which.toLowerCase();
        switch(which) {
            case "car": {
                return new Car();
            }
            case "bike": {
                return new Bike();
            }
            default: {
                throw new Exception("unsupported product type");
            }
        }
    }
}
