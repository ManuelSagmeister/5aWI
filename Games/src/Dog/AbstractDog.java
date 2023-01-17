package Dog;
import java.util.Date;

public abstract class AbstractDog implements Dog {
    protected String name;
    protected Date birthday;
    public WuffStrategy wuffStrategy;

    public AbstractDog(String name, Date birthday, WuffStrategy wuffStrategy) {
        this.name = name;
        this.birthday = birthday;
        this.wuffStrategy = wuffStrategy;
    }

    public abstract void run();
}