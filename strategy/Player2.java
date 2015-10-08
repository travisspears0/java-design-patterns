package javaDesignPatterns.strategy;

public class Player2 {
    
    private Interf interf = new ImplDefault();
    
    public void switchToOne() {
        if( this.interf instanceof ImplOne ) {
            return;
        }
        this.interf = new ImplOne();
    }
    
    public void switchToTwo() {
        if( this.interf instanceof ImplTwo ) {
            return;
        }
        this.interf = new ImplTwo();
    }
    
    public void switchToDefault() {
        if( this.interf instanceof ImplDefault ) {
            return;
        }
        this.interf = new ImplDefault();
    }
    
    public void perform() {
        this.interf.action();
    }
    
}
