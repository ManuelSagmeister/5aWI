package Car;

public class Truck extends Car {
    private String trailer;

    public Truck(Engine engine, int fuelConsumption, Tank fuelAmount, String brand, String serialNumber, Wheels wheels, Mirror mirror, String trailer) {
        super(engine, fuelConsumption, fuelAmount.getFuelAmount());
        this.trailer = trailer;
    }

    public Truck(Engine e1, int fuelConsumption, int fuelAmount) {
        super(e1, fuelConsumption, fuelAmount);
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
