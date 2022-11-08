package Car;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Engine e1 = new Engine(600, Engine.TYPE.GAS);
        Tank t1 = new Tank(1000);
        Wheels w1 = new Wheels(4, 10, 17);
        Mirror m1 = new Mirror(20);
        Car c1 = new Car(e1, 10, t1, "Audi", "A1234", w1, m1);
        c1.drive(10);
        c1.attributes();
    }
}

