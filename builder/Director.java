package javaDesignPatterns.builder;

public class Director {
    
    Builder builder;
    
    public void prepare(Builder builder) {
        this.builder = builder;
    }
    
    public Product getProduct() {
        this.builder.setName();
        this.builder.setPrice();
        return this.builder.getProduct();
    }
    
    public void raport(Product p) {
        System.out.println(p.getName() + " costs " + p.getPrice() );
    }
    
}
