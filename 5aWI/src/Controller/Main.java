package Controller;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(10);
        Battery b2 = new Battery(20);

        Controller c1 = new Controller(b1, b2);

        c1.getStatus();
        c1.turnOn();
        c1.turnOff();
    }


}
