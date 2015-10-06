package javaDesignPatterns.prototype;

public class Main {
    
    public static void main(String args[]) {
        int id = 1;
        Prototype pr = new ConcretePrototype(id);
        for( int i=0 ; i<10 ; ++i ) {
            Prototype p = (Prototype)pr.clone();
            System.out.println(p.hashCode() + " / " + p.getId());
        }
        System.out.println("----------");
        ++id;
        Test t = Test.getInstance(id,"siema");
        for( int i=0 ; i<10 ; ++i ) {
            Test tt = (Test)t.clone();
            System.out.println(tt.hashCode() + " / " + tt.getId() + " " + tt.getName());
        }
    }
    
}
