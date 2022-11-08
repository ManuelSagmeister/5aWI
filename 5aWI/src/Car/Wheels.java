package Car;
public class Wheels {
    private int amountWheels;
    private int pressure;
    private int size;

    public Wheels(int amountWheels, int pressure, int size) {
        this.amountWheels = amountWheels;
        this.pressure = pressure;
        this.size = size;
    }

    public int getWheels() {
        return this.size;
    }
}
