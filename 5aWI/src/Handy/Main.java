package Handy;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1, "02165");
        SDCard card = new SDCard(5000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim, cam, card);
        PhoneGUI gui = new PhoneGUI(phone);
        gui.run();
    }
}
