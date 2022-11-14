package Cars;

public class Producer {
    private String producer;
    private String country;
    private int discount;

    public Producer(String producer, String country, int discount) {
        this.producer = producer;
        this.country = country;
        this.discount = discount;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
