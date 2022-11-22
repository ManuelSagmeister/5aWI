package Lampe;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Glühelement le1 = new Glühelement("1", "green");
        Glühelement le2 = new Glühelement("2", "blue");
        Glühelement le3 = new Glühelement("3", "red");
        Glühelement le4 = new Glühelement("4", "purple");
        Glühelement le5 = new Glühelement("5", "yellow");


        Lampe lampe = new Lampe("Lamp1");
        lampe.addLightElements(le1);
        lampe.addLightElements(le2);
        lampe.addLightElements(le3);
        lampe.addLightElements(le4);
        lampe.addLightElements(le5);

        lampe.turnAllOn();
        lampe.turnAllOn();
        //System.out.println(lampe.getOverallPowerConsumption());
        //lampe.getNamesOfLightElements();
    }
}
