package Dog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        WuffStrategy WuffWuff = new WuffWuff();

        Date birthdayBoxer = new Date(2004,7,12);
        AbstractDog Boxer = new Dogge("Boxer", birthdayBoxer, WuffWuff);

        Boxer.run();
    }
}
