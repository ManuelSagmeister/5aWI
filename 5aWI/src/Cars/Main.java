package Cars;

import Car.Car;

import java.awt.*;

public class Main {
        public static void main(String[] args) {
            Producer p1 = new Producer("Audi", "AT", 10, 10000);
            Cars c1 = new Cars(new Color(1,2,3), 100, p1.getBasicPrice(), 5, p1.getProducer(), Cars.TYPE.GAS, p1.getDiscount(), p1.getBasicPrice(), 51000);

            c1.attributes();

            c1.setBasicUsage();
        }
    }

