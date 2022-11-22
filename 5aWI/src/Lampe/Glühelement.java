package Lampe;

public class Glühelement {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean status;

    public Glühelement(String name, String color) {
        this.name = name;
        this.color = color;
        this.powerConsumption = 10.0;
        this.status = false;
    }

    public String turnOn() {
        this.powerConsumption += 5.0;
        if (this.status) {
            return "My name is " + this.name + " and I'm already turned ON";
        } else {
            this.status = true;
            return "My name is " + this.name + " and I'm now ON";
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return this.powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
