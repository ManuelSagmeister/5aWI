package Sonnenkollektor;

import java.util.ArrayList;
import java.util.List;

public class Sonnenkollektor{

    private String output;
    private List<Observer> observerList;
    public int curvoltage = 19;

    public Sonnenkollektor() {
        this.observerList = new ArrayList<>();
    }

    public void voltage(){
        if (curvoltage >= 18){
            for (Observer observer : observerList){
                observer.inform();
            }
        } else {
            System.out.println("Voltage too low");
        }
    }

    public void add(Observer observer){
        observerList.add(observer);
    }
}
