package FactorPattern;

public class Bee implements Actor {
    private String name;
    public Bee(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("I am a Bee and my name is " + name);
    }
}
