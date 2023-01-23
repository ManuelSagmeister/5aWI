package Sonnenkollektor;

public class Geschirrspüler implements Observer{
    @Override
    public void inform() {
        System.out.println("Geschirrspüler");
    }
}
