package javaDesignPatterns.state;

public class Human {
    
    private State state = null;
    private String name = "";
    
    public Human(String name) {
        this.name = name;
        this.state = new StateIdle();
    }
    
    public void getBusy() {
        this.state = new StateBusy();
    }
    
    public void getIdle() {
        this.state = new StateIdle();
    }
    
    public void getSleeping() {
        this.state = new StateSleeping();
    }
    
    public void speak() {
        this.state.speak(this.name);
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
