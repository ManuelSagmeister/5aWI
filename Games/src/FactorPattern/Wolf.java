package FactorPattern;

public class Wolf implements Actor {
    private String name;
    public Wolf(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("I am a Wolf and my name is " + name);
    }
}