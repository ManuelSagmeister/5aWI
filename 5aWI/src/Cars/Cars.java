package Cars;


import java.awt.*;
import java.io.PrintStream;

public class Cars {

    private final int discount;
    private Color color;
    private int maxV;
    private int basicPrice;
    private int basicUsage;
    private String producer;
    private TYPE type;
    private int price;
    private int km;
    private int usage;

    public enum TYPE {DIESEL, GAS};

    public Cars(Color color, int maxV, int basicPrice, int basicUsage, String producer, TYPE type, int discount, int price, int km) {
        this.color = color;
        this.maxV = maxV;
        this.basicPrice = basicPrice;
        this.basicUsage = basicUsage;
        this.producer = producer;
        this.type = type;
        this.discount = discount;
        this.price = basicPrice-(basicPrice/100*discount);
        this.km = km;
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

    public void setBasicUsage() {
        if (this.km<=50000){

            System.out.println(basicUsage);
        }
        else {
            this.basicUsage = (int) (this.basicUsage*1.098);
            System.out.println(basicUsage);
        }
    }

    public int getBasicUsage() {
        return basicUsage;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {

    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void attributes() {
        PrintStream var10000 = System.out;
        var10000.println("Color: " + this.color + "\nmax Geschwindigkeit: " + this.maxV + "\nBasic Price: " + this.basicPrice + "\nBasic Usage: " + this.basicUsage + "\nProducer: " + this.producer + "\nDiscount: " +  this.discount + "%" + "\nPrice: " + this.price + "\nKM: " + this.km);
    }

    public void test(){

    }


}
