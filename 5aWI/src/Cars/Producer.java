package Cars;

public class Producer {
    private String producer;
    private String country;
    private int discount;
    private int basicPrice;

    public Producer(String producer, String country, int discount, int basicPrice) {
        this.producer = producer;
        this.country = country;
        this.discount = discount;
        this.basicPrice = basicPrice;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }
}