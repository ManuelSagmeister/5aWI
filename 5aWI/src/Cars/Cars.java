package Cars;


import Car.Engine;

import java.awt.*;
import java.io.PrintStream;

public class Cars {

    private Color color;
    private int maxV;
    private int basicPrice;
    private int basicUsage;
    private String producer;
    private TYPE type;

    public enum TYPE {DIESEL, GAS};

    public Cars(Color color, int maxV, int basicPrice, int basicUsage, String producer, TYPE type) {
        this.color = color;
        this.maxV = maxV;
        this.basicPrice = basicPrice;
        this.basicUsage = basicUsage;
        this.producer = producer;
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public void setBasicUsage(int basicUsage) {
        this.basicUsage = basicUsage;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void attributes() {
        PrintStream var10000 = System.out;
        var10000.println("Color: " + this.color + "\nmax Geschwindigkeit: " + this.maxV + "\nBasic Price: " + this.basicPrice + "\nBasic Usage: " + this.basicUsage + "\nProducer: " + this.producer);
    }

}
