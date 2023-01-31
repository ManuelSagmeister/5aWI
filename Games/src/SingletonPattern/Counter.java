package SingletonPattern;

public class Counter {
    private static Counter instance = null;
    private int count = 0;

    private Counter() {}

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
