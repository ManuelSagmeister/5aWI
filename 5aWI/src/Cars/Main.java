package Cars;

import Car.Car;

import java.awt.*;

public class Main {
        public static void main(String[] args) {
            Producer p1 = new Producer("Audi", "AT", 10);
            Cars c1 = new Cars(new Color(1,2,3), 100, 10000, 5, p1.getProducer(), Cars.TYPE.GAS);

            c1.attributes();
        }
    }

