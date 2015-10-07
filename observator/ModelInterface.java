package javaDesignPatterns.observator;

public interface ModelInterface {
    
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    
}
