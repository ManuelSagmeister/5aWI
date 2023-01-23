package Sonnenkollektor;

public class Laderegler implements Observer{
    @Override
    public void inform() {
        System.out.println("Laderegler");
    }

}
