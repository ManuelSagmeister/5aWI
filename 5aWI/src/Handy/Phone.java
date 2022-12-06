package Handy;

import java.util.List;

public class Phone {
    private Sim sim;
    private Camera cam;
    private SDCard card;

    public Phone(Sim sim, Camera cam, SDCard card) {
        this.sim = sim;
        this.cam = cam;
        this.card = card;
    }

    public void doCall(String number){
        this.sim.doCall(number);
    }

    public void takePicture(){
       PhoneFile file = this.cam.takePicture();
       this.card.save(file);
    }

    public int getFreeSpace(){
        return this.card.getFreeSpace();
    }

    public List<PhoneFile> getAllFiles(){
        return this.card.getFiles();
    }
}
