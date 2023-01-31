package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());
    }
}
