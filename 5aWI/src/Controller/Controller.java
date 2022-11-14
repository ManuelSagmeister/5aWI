package Controller;

public class Controller {
    int amount1;
    int amount2;
    private Battery battery1;
    private Battery battery2;


    public Controller(Battery battery, Battery battery2){
        this.battery1 = battery;
        this.battery2 = battery2;
    }

    public void getStatus(){
        amount1 = battery1.getAmount();
        amount2 = battery2.getAmount();

        int average = (amount1 + amount2)/2;

        System.out.println(average);
    }

    public void turnOn(){
        amount1 = battery1.getAmount() - 5;
        amount2 = battery2.getAmount() - 5;

        System.out.println("Batterie 1: " + amount1 + " Batterie 2: " + amount2 + " Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }



}
