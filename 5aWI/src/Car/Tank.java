package Car;
public class Tank {
    private int fuelAmount;

    public Tank(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void turboBoost() {
        if (this.fuelAmount / 10 <= this.fuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }

    }

    public int getFuelAmount() {
        return this.fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
