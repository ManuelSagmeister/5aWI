package Handy;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public void save(PhoneFile file){
        files.add(file);
    }

    public int getFreeSpace(){
        int size = 0;
        for(PhoneFile phoneFile : files){
            size += phoneFile.getSize();
        }

        return capacity - size;
    }


}
