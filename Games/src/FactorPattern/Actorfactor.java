package FactorPattern;

public class Actorfactor {
    public static Actor createActor(String type, String name) {
        switch(type) {
            case "Bee":
                return new Bee(name);
            case "Ant":
                return new Ant(name);
            case "Wolf":
                return new Wolf(name);
            default:
                return null;
        }
    }
}