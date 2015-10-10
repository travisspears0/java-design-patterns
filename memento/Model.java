package javaDesignPatterns.memento;

public class Model extends Memento {
    
    private final String name;
    
    public Model() {
        super();
        this.name = "default";
    }

    public Model(String name, int value) {
        super(value);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public Memento saveState() {
        return new Memento(this.value);
    }
    
}
