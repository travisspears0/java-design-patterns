package javaDesignPatterns.builder;

public class BuilderImplementationOne implements Builder {

    private Product product = new Product();
    
    @Override
    public void setName() {
        this.product.setName("one");
    }

    @Override
    public void setPrice() {
        this.product.setPrice(111);
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
    
}
