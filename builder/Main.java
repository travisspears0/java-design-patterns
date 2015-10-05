package javaDesignPatterns.builder;

public class Main {
    
    public static void main(String args[]) {
        
        Director director = new Director();
        director.prepare(new BuilderImplementationOne());
        director.raport(director.getProduct());
        
        director.prepare(new BuilderImplementationTwo());
        director.raport(director.getProduct());
        
    }
    
}
