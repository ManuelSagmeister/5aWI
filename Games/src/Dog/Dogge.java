package Dog;
import java.util.Date;

public class Dogge extends AbstractDog{
    public Dogge(String name, Date birthday, WuffStrategy wuffStrategy) {
        super(name, birthday, wuffStrategy);
    }

    @Override
    public void run() {
        System.out.println("My name is "+ name);
        wuffStrategy.bark();
    }
}