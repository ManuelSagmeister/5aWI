package Sonnenkollektor;

public class Main {
    public static void main(String[] args) {
        Laderegler l1 = new Laderegler();
        Geschirrspüler g1 = new Geschirrspüler();

        Sonnenkollektor s1 = new Sonnenkollektor();

        s1.add(l1);
        s1.add(g1);
        s1.voltage();
    }
}
