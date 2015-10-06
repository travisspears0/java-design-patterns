package javaDesignPatterns.prototype;

public class Test implements Cloneable{
    
    private final int id;
    private static Test test;
    private String name;

    private Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
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
    
    public static Test getInstance() {
        return Test.getInstance(0,null);
    }
    
    public static Test getInstance(int id, String name) {
        if( Test.test == null ) {
            Test.test = new Test(id,name);
        }
        return Test.test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
