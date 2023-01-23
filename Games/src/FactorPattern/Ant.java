package FactorPattern;

public class Ant implements Actor {
    private String name;
    public Ant(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("I am an Ant and my name is " + name);
    }
}