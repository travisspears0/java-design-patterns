package javaDesignPatterns.strategy;

public class Player1 {
    
    private Interf interf = new ImplDefault();
    
    public void perform() {
        this.perform("default");
    }
    
    public void perform(String impl) {
        impl = impl.toLowerCase();
        switch(impl) {
            case "one": {
                if( !(this.interf instanceof ImplOne) ) {
                    this.interf = new ImplOne();
                }
                this.interf.action();
                break;
            }
            case "two": {
                if( !(this.interf instanceof ImplTwo) ) {
                    this.interf = new ImplTwo();
                }
                this.interf.action();
                break;
            }
            default: {
                if( !(this.interf instanceof ImplDefault) ) {
                    this.interf = new ImplDefault();
                }
                this.interf.action();
            }
        }
    }
    
}
