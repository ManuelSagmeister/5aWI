package FactorPattern;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int actorType = rand.nextInt(3);
            String type;
            switch(actorType) {
                case 0:
                    type = "Bee";
                    break;
                case 1:
                    type = "Ant";
                    break;
                case 2:
                    type = "Wolf";
                    break;
                default:
                    type = "";
            }
            Actor actor = Actorfactor.createActor(type, "Actor" + i);
            actor.sayHello();
        }
    }
}