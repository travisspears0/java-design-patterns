package javaDesignPatterns.builder;

public class BuilderImplementationTwo implements Builder {

    Product product = new Product();
    
    @Override
    public void setName() {
        this.product.setName("two");
    }

    @Override
    public void setPrice() {
        this.product.setPrice(222);
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
    
}
