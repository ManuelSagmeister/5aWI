package Handy;

public class Camera {
    private int fileNumber = 0;

    public PhoneFile takePicture(){
        PhoneFile file = new PhoneFile("jpeg", 1000, "pic" + fileNumber);
        fileNumber++;
        return file;
    }

}
