package javaDesignPatterns.state;

public class StateSleeping implements State {

    @Override
    public void speak() {
        this.speak("unknown");
    }

    @Override
    public void speak(String name) {
        System.out.println(name + ": I'm sleeping");
    }
    
}
