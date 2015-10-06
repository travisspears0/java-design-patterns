package javaDesignPatterns.prototype;

public abstract class Prototype implements Cloneable {
    
    private final int id;
    
    public Prototype(int id) {
        this.id = id;
    }
    
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch( CloneNotSupportedException e ) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int getId() {
        return id;
    }
}
