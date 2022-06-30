package obiektowe.powtorka.carWorkshop;

public class Receipt {
    private String service;
    private int count;
    private int price;

    public Receipt(String service, int count, int price) {
        this.service = service;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "service='" + service + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
