package Car;

import java.io.PrintStream;

public class Car {
    private Mirror mirror;
    private Wheels wheels;
    private Engine engine;
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;

    public Car(Engine engine, int fuelConsumption, int fuelAmount) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.fuelAmount = fuelAmount;
    }

    public void attributes() {
        PrintStream var10000 = System.out;
        int var10001 = this.engine.getHorsePower();
        var10000.println("Horsepower: " + var10001 + "\nFuel Consumption: " + this.fuelConsumption + "\nFuel Amount: " + this.fuelAmount);
    }

    public void drive(int speed) {
        if (speed >= 1 && speed < 25) {
            this.fuelAmount -= this.fuelConsumption;
            System.out.println("I am driving slowly");
        } else if (speed >= 25 && speed < 50) {
            this.fuelAmount -= this.fuelConsumption;
            System.out.println("I am driving a little bit faster");
        } else if (speed >= 50 && speed < 75) {
            this.fuelAmount -= this.fuelConsumption;
            System.out.println("I am driving fast");
        } else if (speed >= 75 && speed < 100) {
            this.fuelAmount -= this.fuelConsumption;
            System.out.println("I am speed ;)");
        } else {
            System.out.println("Bitte geben Sie eine gültige Zahl ein Wertebereich 0-100");
        }

    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void honk(int amountOfRepetitions) {
        int a = amountOfRepetitions;

        for(int i = 0; i <= a; ++i) {
            System.out.println("tuut");
        }

    }

    public int getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
